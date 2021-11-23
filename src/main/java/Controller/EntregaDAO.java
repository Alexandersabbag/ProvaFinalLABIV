package Controller;

import Model.Entrega;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EntregaDAO {    
    private Connection con;
    private PreparedStatement cmd;
    
    public EntregaDAO(Connection con, PreparedStatement cmd) {
        this.con = Conexao.conectar();
    }
    
}
