package Controller;

//Bibliotecas
import Model.Entrega;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EntregaDAO 
{    
    private Connection con;
    private PreparedStatement cmd;
    
    public EntregaDAO() 
    {
        this.con = Conexao.conectar();
    }
    
    //INSERIR ENTREGA
    public int inserir(Entrega obj)
    {
        try
        {
            //Enviar comando para o banco de dados
            String SQL = "Insert into tb_entrega "
                    + "(nf, placa, id_remetente, id_destinatario, status_entrega, dta_saida, dta_entrega) "
                    + "values (?,?,?,?,?,?,?)";
            
            cmd = con.prepareStatement(SQL);
            cmd.setString(1, obj.getNf());
            cmd.setString(2, obj.getPlaca());
            cmd.setString(3, obj.getId_remetente());
            cmd.setString(4, obj.getId_destinatario());
            cmd.setString(5, obj.getStatus_entrega());
            cmd.setString(6, obj.getDta_saida());
            cmd.setString(7, obj.getDta_entrega());
            
            
            if (cmd.executeUpdate() > 0)
            {
                return 1;   //OK
            }
            else
            {
                return -1;  // ERRO
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
    
    //PESQUISAR POR NF
    public Entrega pesquisarPorNf(String nf)
    {
        try
        {
            //Enviar comando para o banco de dados
            String SQL = "select * from tb_entrega where nf = ? order by nf asc";
            cmd = con.prepareStatement(SQL);
            cmd.setInt(1, Integer.parseInt(nf));
            
            //Execução da consulta
            ResultSet rs = cmd.executeQuery();
            
            if(rs.next())
            {
                Entrega ent = new Entrega();
                ent.setNf(rs.getString("nf"));
                ent.setPlaca(rs.getString("placa"));
                ent.setId_remetente(rs.getString("id_remetente"));
                ent.setId_destinatario(rs.getString("id_destinatario"));
                ent.setStatus_entrega(rs.getString("status_entrega"));
                ent.setDta_saida(rs.getString("dta_saida"));
                ent.setDta_entrega(rs.getString("dta_entrega"));
                
                return ent;
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
    
    //LISTAR TODAS ENTREGAS CADASTRADAS
    public List<Entrega> listar()
    {
        try
        {
            //Enviar comando para o banco de dados
            String SQL = "select * from tb_entrega order by nf";
            cmd = con.prepareStatement(SQL);
            
            //Execução da consulta
            List<Entrega> lista = new ArrayList<>();
            ResultSet rs = cmd.executeQuery();
            
            //Laço de repetição para listar
            while(rs.next())
            {
                Entrega ent = new Entrega();
                ent.setNf(rs.getString("nf"));
                ent.setPlaca(rs.getString("placa"));
                ent.setId_remetente(rs.getString("id_remetente"));
                ent.setId_destinatario(rs.getString("id_destinatario"));
                ent.setStatus_entrega(rs.getString("status_entrega"));
                ent.setDta_saida(rs.getString("dta_saida"));
                ent.setDta_entrega(rs.getString("dta_entrega"));
                lista.add(ent);
            }
            return lista;
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
    
    //PESQUISAR PELO NOTA FISCAL DIGITADA
    public List<Entrega> pesquisarPorNota(String nf)
    {
        try
        {
            //Enviar comando para o banco de dados
            String SQL = "select * from tb_entrega where nf ilike ? order by nf asc";
            cmd = con.prepareStatement(SQL);
            
            //Pesquisar as palavras em qualquer lugar do texto(sendo inicio, meio ou fim)
            cmd.setString(1, "%"+nf+"%");
            
            //Execução da consulta
            List<Entrega> lista = new ArrayList<>();
            ResultSet rs = cmd.executeQuery();
            
            //Laço de repetição para listar
            while(rs.next())
            {
                Entrega ent = new Entrega();
                ent.setNf(rs.getString("nf"));
                ent.setPlaca(rs.getString("placa"));
                ent.setId_remetente(rs.getString("id_remetente"));
                ent.setId_destinatario(rs.getString("id_destinatario"));
                ent.setStatus_entrega(rs.getString("status_entrega"));
                ent.setDta_saida(rs.getString("dta_saida"));
                ent.setDta_entrega(rs.getString("dta_entrega"));
                lista.add(ent); 
            }
            return lista;
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