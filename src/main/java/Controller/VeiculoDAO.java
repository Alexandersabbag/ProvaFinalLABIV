package Controller;

import Model.Veiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class VeiculoDAO {    
    private Connection con;
    private PreparedStatement cmd;
   
    public VeiculoDAO(Connection con, PreparedStatement cmd) {
        this.con = Conexao.conectar();
    }
    
}
