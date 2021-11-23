package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class VeiculoDAO {
    
    private Connection con;
    private PreparedStatement cmd;
    
    public VeiculoDAO(){
        this.con = Conexao.conectar();
    }
    
    
}
