package Controller;

//Bibliotecas
import Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO 
{
    private Connection con;
    private PreparedStatement cmd;
    
    public UsuarioDAO()
    {
        this.con = Conexao.conectar(); 
    }
    
    //LOGIN
    public boolean login (Usuario u)
    {
        try
        {
            //Enviar comando para o banco de dados
            String SQL = "select * from tb_usuario where nome=? and senha=md5(?)";
            
            cmd = con.prepareStatement(SQL);
            cmd.setString(1, u.getNome());
            cmd.setString(2, u.getSenha());
            
            ResultSet rst = cmd.executeQuery();
            
            if (rst.next())
            {
                if(rst.getInt("fg_ativo")==0)
                {
                    return false;
                }
                else
                {
                    ResultSet rs = cmd.executeQuery();
                    
                    if(rs.next())
                    { 
                        return true;  
                    }
                    else 
                    {  
                        return false; 
                    }
                }
            }
            return false;
        }
        
        //Tratar os erros
        catch (SQLException e)
        {
            System.err.println("ERRO: " + e.getMessage());
            return false;
        }
    }
    
    //RETORNAR ID
    public int retornarID (Usuario u)
    {
        try
        {
            //Enviar comando para o banco de dados
            String SQL = "select * from tb_usuario where nome=? and senha=md5(?)";
            
            cmd = con.prepareStatement(SQL);
            cmd.setString(1, u.getNome());
            cmd.setString(2, u.getSenha());
            
            ResultSet rs = cmd.executeQuery();
            
            if(rs.next())
                return rs.getInt("id");
            else
                return -1;
        }
        
        //Tratar os erros
        catch (SQLException e)
        {
            System.err.println("ERRO: " + e.getMessage());
            return -1;
        }
    }
    
    //INSERIR NOVO USUÁRIO
    public int inserir(Usuario obj)
    {
        try 
        { 
            //Enviar comando para o banco de dados
            String SQL = "insert into tb_usuario"
                       + "(nome, senha, fg_ativo) values (?,md5(?),?)"; 
            
            cmd = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS); 
            cmd.setString(1, obj.getNome()); 
            cmd.setString(2, obj.getSenha()); 
            cmd.setInt(3, obj.getFg_ativo()); 
             
            if (cmd.executeUpdate() > 0)
            {
                //Sucesso, retornar o ID
                ResultSet rs = cmd.getGeneratedKeys();
                return rs.next()? rs.getInt(1) : 1;
            }
            else
                return -1;//Erro
        } 
        
        //Tratar os erros
        catch (SQLException e) 
        { 
            System.err.println("ERRO: " + e.getMessage());
            return -2; //algo errado
        }
        
        //Desonectar
        finally
        {
            Conexao.desconectar(con);
        }
    }
    
    //ATUALIZAR USUÁRIO
    public int atualizar(Usuario obj)
    {
        try 
        {
            String SQL = "update tb_usuario set nome=?, senha=md5(?), fg_ativo=? where id=?";
                       
            cmd = con.prepareStatement(SQL); 
            cmd.setString(1, obj.getNome());
            cmd.setString(2,obj.getSenha());
            cmd.setInt(3, obj.getFg_ativo());
            cmd.setInt(4, obj.getId());
            
            if(cmd.executeUpdate() > 0)
            {
                return 1;   //OK
            }
            else
            {
                return -1;  //ERRO
            }
        } 
        
        //Tratar os erros
        catch (SQLException e) 
        {
            System.err.println("ERRO: " + e.getMessage());
            return -1; //algo errado
        }
        
        //Desconectar
        finally
        {
            Conexao.desconectar(con);
        }
    }
    
    // LISTAR TODOS USUÁRIOS
    public List<Usuario> listar()
    {
        try 
        {
            //Enviar comando para o banco de dados
            String SQL = "select * from tb_usuario order by id";
            cmd = con.prepareStatement(SQL);
            
            //Execução da consulta
            List<Usuario> lista = new ArrayList<>();
            ResultSet rs = cmd.executeQuery();
            
            //Laço de repetição para listar
            while (rs.next())
            {
                Usuario user = new Usuario();
                user.setId(rs.getInt("id"));
                user.setNome(rs.getString("nome"));
                user.setFg_ativo(rs.getInt("fg_ativo")); //indica se o usuário está efetivado na empresa
                lista.add(user);
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
     
    // PESQUISAR POR ID
    public Usuario pesquisarPorId(String id)
    {
        try 
        {
            //Enviar comando para o banco de dados
            String SQL = "select * from tb_usuario where id = ? order by id";
            cmd = con.prepareStatement(SQL);
            cmd.setInt(1, Integer.parseInt(id));
            
            //Executar a consulta
            ResultSet rs = cmd.executeQuery();
            
            if (rs.next())
            {
                Usuario usu = new Usuario();
                usu.setId(rs.getInt("id"));
                usu.setNome(rs.getString("nome"));
                usu.setSenha(rs.getString("senha"));
                usu.setFg_ativo(rs.getInt("fg_ativo"));
                return usu;
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