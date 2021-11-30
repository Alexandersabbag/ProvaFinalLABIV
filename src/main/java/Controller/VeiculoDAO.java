package Controller;

import Model.Veiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VeiculoDAO 
{
    
    private Connection con;
    private PreparedStatement cmd;
    
    public VeiculoDAO(){
        this.con = Conexao.conectar();
    }
    
    //
    //INSERIR
    //
    public int inserir(Veiculo obj){
        try { 
            String SQL = "insert into tb_veiculo"
                        + "(placa, cor, modelo, marca, motorista, fg_ativo) values (?,?,?,?,?,?)"; 
            cmd = con.prepareStatement(SQL);
            cmd.setString(1, obj.getPlaca());
            cmd.setString(2, obj.getCor());
            cmd.setString(3, obj.getModelo());
            cmd.setString(4, obj.getMarca());
            cmd.setString(5, obj.getMotorista());
            cmd.setInt(6, obj.getFg_ativo());
            
             
            //envia a instrução SQL para o banco
            if (cmd.executeUpdate() > 0){
                return 1;   //OK
            }else{
                return -1;  //ERRO
            }
            
        } catch (SQLException e) { 
            System.err.println("ERRO: " + e.getMessage());
            return -2; //algo errado
        }finally{
            Conexao.desconectar(con);
        }
    }
    
    //
    //ATUALIZAR OS DADOS
    //
    public int atualizarDados(Veiculo obj)
    {
        try
        {
            //Enviar comando para o banco de dados
            String SQL = "update tb_veiculo set cor=?, modelo=?,"
                    + " marca=?, motorista=?, fg_ativo=? where placa=?";
            
            cmd.setString(1, obj.getCor());
            cmd.setString(2, obj.getModelo());
            cmd.setString(3, obj.getMarca());
            cmd.setString(4, obj.getMotorista());
            cmd.setInt(5, obj.getFg_ativo());
            cmd.setString(6, obj.getPlaca());
            
            //Caso o update seja concluido com sucesso
            if(cmd.executeUpdate() > 0)
            {
                return 1;
            }
            
            //Caso ocorra algum erro
            else
            {
                return -1;
            }
        }
        
        //Tratar os erros
        catch (SQLException e)
        {
               System.err.println("ERRO: " + e.getMessage());
               return -2;
        }
        
        //Desconectar
        finally
        {
           Conexao.desconectar(con);
        }
    }
    
    //
    //PESQUISAR POR PLACA
    //
    public Veiculo pesquisarPorPlaca(String placa)
    {
        try
        {
            //Enviar comando para o banco de dados
            String SQL = "select * from tb_veiculo where placa = ? order by id asc";
            cmd = con.prepareStatement(SQL);
            cmd.setString(1, placa);
            
            //Execução da consulta
            ResultSet rs = cmd.executeQuery();
            
            if(rs.next())
            {
                Veiculo veic = new Veiculo();
                veic.setPlaca(rs.getString("placa"));
                veic.setCor(rs.getString("cor"));
                veic.setModelo(rs.getString("modelo"));
                veic.setMarca(rs.getString("marca"));
                veic.setMotorista(rs.getString("motorista"));
                veic.setFg_ativo(rs.getInt("fg_ativo"));
                
                return veic;
            }
            return null;
        }
        
        //Tratar os erros
        catch (SQLException e)
        {
               System.err.println("ERRO: " + e.getMessage());
               return null;
        }
        
        //Desconectar
        finally
        {
           Conexao.desconectar(con);
        }
    }
    
    
}
