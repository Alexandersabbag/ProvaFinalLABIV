package Controller;

import Model.Endereco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EnderecoDAO {    
    private Connection con;
    private PreparedStatement cmd;

    public EnderecoDAO() {
        this.con = Conexao.conectar();
    }
    
    //INSERIR
    public int inserir(Endereco obj)
    {
        try
        {
            String SQL = "Insert into tb_endereco "
                    + "(nome,identificacao, endereco, cidade, uf, cep) values (?,?,?,?,?,?)";
            
            cmd = con.prepareStatement(SQL);
            cmd.setString(1, obj.getNome());
            cmd.setString(2, obj.getIdentificacao());
            cmd.setString(3, obj.getEndereco());
            cmd.setString(4, obj.getCidade());
            cmd.setString(5, obj.getUf());
            cmd.setString(6, obj.getCep());
            
            if (cmd.executeUpdate() > 0){
                //operação realizada com sucesso
                return 1;   //OK
            }else{
                return -1;  // ERRO
            }
            
        } catch (SQLException e) {
            System.err.println("ERRO: " + e.getMessage());
            return -1;
        }finally{
            Conexao.desconectar(con);
        }
    }
    
    //Função de atualizar os dados
    public int atualizarDados(Endereco obj)
    {
        try
        {
            //Enviar comando para o banco de dados
            String SQL = "update tb_endereco set nome=?, identificacao=?, endereco=?,"
                    + " cidade=?, uf=?, cep=? where identificacao=?";
            cmd.setString(1, obj.getNome());
            cmd.setString(2, obj.getIdentificacao());
            cmd.setString(3, obj.getEndereco());
            cmd.setString(4, obj.getCidade());
            cmd.setString(5, obj.getUf());
            cmd.setString(6, obj.getCep());
            
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
               return -1;
        }
        
        //Desconectar
        finally
        {
           Conexao.desconectar(con);
        }
    }
    
    //Função de pesquisar por ID - Utilizado para atualizar os dados
    public Endereco pesquisarPorId(String identificacao)
    {
        try
        {
            //Enviar comando para o banco de dados
            String SQL = "select * from tb_endereco where identificacao = ? order by id asc";
            cmd = con.prepareStatement(SQL);
            cmd.setInt(1, Integer.parseInt(identificacao));
            
            //Execução da consulta
            ResultSet rs = cmd.executeQuery();
            
            if(rs.next())
            {
                Endereco end = new Endereco();
                end.setNome(rs.getString("nome"));
                end.setIdentificacao(rs.getString("identificacao"));
                end.setEndereco(rs.getString("endereco"));
                end.setCidade(rs.getString("cidade"));
                end.setUf(rs.getString("uf"));
                end.setCep(rs.getString("cep"));
                
                return end;
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
