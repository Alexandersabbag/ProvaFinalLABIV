package Controller;

import Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsuarioDAO {
    private Connection con;
    private PreparedStatement cmd;
    
    public UsuarioDAO(){
        this.con = Conexao.conectar(); //automaticamente cria a conexao quando obj UsuarioDAO for chamado
    }
    
    public boolean login (Usuario u){
        try{
            
            String SQL = "select * from tb_usuario where usuario=? and senha=md5(?)";
            cmd = con.prepareStatement(SQL);
            cmd.setString(1, u.getNome());
            cmd.setString(2, u.getSenha());
            
            ResultSet rs = cmd.executeQuery();
            if(rs.next()){ //se recuperar os dados
                return true; //retorna true 
            }else { //senão 
                return false;//não 
            }
            
        }catch (Exception e){
            System.err.println("ERRO: " + e.getMessage());
            return false;
        }
    }
}
