package Controller;

import Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    private Connection con;
    private PreparedStatement cmd;
    
    public UsuarioDAO(){
        this.con = Conexao.conectar(); 
    }
    
    //
    //LOGIN
    //
    public boolean login (Usuario u){
        try{
            
            String SQL = "select * from tb_usuario where usuario=? and senha=md5(?)";
            cmd = con.prepareStatement(SQL);
            cmd.setString(1, u.getNome());
            cmd.setString(2, u.getSenha());
            
            ResultSet rs = cmd.executeQuery();
            if(rs.next()){ 
                return true;  
            }else {  
                return false; 
            }
            
        }catch (SQLException e){
            System.err.println("ERRO: " + e.getMessage());
            return false;
        }
    }
    
    //
    //INSERIR
    //
    public int inserir(Usuario obj){
        try { 
            String SQL = "insert into tb_usuario"
                       + "(usuario, senha, fg_ativo) values (?,md5(?),?)"; 
            cmd = con.prepareStatement(SQL); 
            cmd.setString(1, obj.getNome()); 
            cmd.setString(2, obj.getSenha()); 
            cmd.setInt(3, obj.getFg_ativo()); 
             
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
    //ATUALIZAR
    //
    public int atualizar(Usuario obj){
        try {
            String SQL = "update tb_usuario set nome=?, set senha=? where id=?";
                       
            cmd = con.prepareStatement(SQL); 
            cmd.setString(1, obj.getNome());
            cmd.setString(2, obj.getSenha());
            cmd.setInt(3,obj.getId());
            
            if (cmd.executeUpdate() > 0){
                return 1;   //OK
            }else{
                return -1;  //ERRO
            }
            
        } catch (SQLException e) { 
            System.err.println("ERRO: " + e.getMessage());
            return -1; //algo errado
        }finally{
            Conexao.desconectar(con);
        }
    }
    
    //
    // LISTAR
    //  
     public List<Usuario> listar(){
        try {
            String SQL = "select * from tb_usuario order by id";
            cmd = con.prepareStatement(SQL);
            List<Usuario> lista = new ArrayList<>();
            ResultSet rs = cmd.executeQuery();
            while (rs.next()){
                Usuario user = new Usuario();
                user.setId(rs.getInt("id"));
                user.setNome(rs.getString("nome"));
                user.setFg_ativo(rs.getInt("fg_ativo")); //indica se o usuário está efetivado na empresa
                lista.add(user);
            }
            return lista;
        } catch (SQLException e) {
            System.err.println("ERRO: " + e.getMessage());
            return null;
        }finally{
            Conexao.desconectar(con);
        }
    }
     
    //
    // PESQUISAR POR ID
    //
    public Usuario pesquisarPorId(String id){
        try {
            String SQL = "select * from tb_usuario where id = ? order by id";
            cmd = con.prepareStatement(SQL);
            cmd.setInt(1, Integer.parseInt(id));
            
            //executar a consulta
            ResultSet rs = cmd.executeQuery();
            if (rs.next()){
                Usuario usu = new Usuario();
                usu.setId(rs.getInt("id"));
                usu.setNome(rs.getString("nome"));
                usu.setSenha(rs.getString("senha"));
                usu.setFg_ativo(rs.getInt("fg_ativo"));
                return usu;
            }
            return null;
        } catch (SQLException e) {
            System.err.println("ERRO: " + e.getMessage());
            return null;
        }finally{
            Conexao.desconectar(con);
        }
    }
}
