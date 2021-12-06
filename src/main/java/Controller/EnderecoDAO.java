package Controller;

//Bibliotecas
import Model.Endereco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EnderecoDAO 
{    
    private Connection con;
    private PreparedStatement cmd;

    public EnderecoDAO() 
    {
        this.con = Conexao.conectar();
    }
    
    //INSERIR ENDEREÇO
    public int inserir(Endereco obj)
    {
        try
        {
            //Enviar comando para o banco de dados
            String SQL = "Insert into tb_endereco "
                    + "(nome,identificacao, endereco, cidade, uf, cep) values (?,?,?,?,?,?)";
            
            cmd = con.prepareStatement(SQL);
            cmd.setString(1, obj.getNome());
            cmd.setString(2, obj.getIdentificacao());
            cmd.setString(3, obj.getEndereco());
            cmd.setString(4, obj.getCidade());
            cmd.setString(5, obj.getUf());
            cmd.setString(6, obj.getCep());
            
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
    
    //PESQUISA POR CPF/CNPJ = Identificação
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
    
    //LISTAR TODOS ENDEREÇOS CADASTRADOS
    public List<Endereco> listar()
    {
        try
        {
            //Enviar comando para o banco de dados
            String SQL = "select * from tb_endereco order by identificacao";
            cmd = con.prepareStatement(SQL);
            
            //Execução da consulta
            List<Endereco> lista = new ArrayList<>();
            ResultSet rs = cmd.executeQuery();
            
            //Laço de repetição para listar
            while(rs.next())
            {
                Endereco end = new Endereco();
                end.setNome(rs.getString("nome"));
                end.setIdentificacao(rs.getString("identificacao"));
                end.setEndereco(rs.getString("endereco"));
                end.setCidade(rs.getString("cidade"));
                end.setUf(rs.getString("uf"));
                end.setCep(rs.getString("cep"));
                lista.add(end);
                
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
    
    //PESQUISAR PELO CPF/CNPJ DIGITADO
    public List<Endereco> pesquisarPorCpfCnpj(String identificacao)
    {
        try
        {
            //Enviar comando para o banco de dados
            String SQL = "select * from tb_endereco where identificacao ilike ?";
            cmd = con.prepareStatement(SQL);
            
            //Pesquisar as palavras em qualquer lugar do texto(sendo inicio, meio ou fim)
            cmd.setString(1, "%"+identificacao+"%");
            
            //Execução da consulta
            List<Endereco> lista = new ArrayList<>();
            ResultSet rs = cmd.executeQuery();
            
            //Laço de repetição para listar
            while(rs.next())
            {
                Endereco end = new Endereco();
                end.setNome(rs.getString("nome"));
                end.setIdentificacao(rs.getString("identificacao"));
                end.setEndereco(rs.getString("endereco"));
                end.setCidade(rs.getString("cidade"));
                end.setUf(rs.getString("uf"));
                end.setCep(rs.getString("cep"));
                lista.add(end);
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