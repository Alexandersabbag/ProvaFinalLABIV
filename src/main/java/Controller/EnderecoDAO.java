package Controller;

import Model.Endereco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EnderecoDAO {    
    private Connection con;
    private PreparedStatement cmd;

    public EnderecoDAO(Connection con, PreparedStatement cmd) {
        this.con = Conexao.conectar();
    }
        
}
