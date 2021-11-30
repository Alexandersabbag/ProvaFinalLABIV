package Controller;

import Model.Veiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class VeiculoDAO {
    
    private Connection con;
    private PreparedStatement cmd;
    
    public VeiculoDAO(){
        this.con = Conexao.conectar();
    }
    
    public int cadastrar(Veiculo obj){
        try{
            //Comando SQL
            String SQL = "insert into tb_veiculo "
                + "(placa,cor,modelo,marca,motorista,fg_ativo) values (?,?)";
            
            //Conectar e selecionar as variáveis
            cmd = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            cmd.setString(1,obj.getPlaca());
            cmd.setString(2,obj.getCor());
            cmd.setString(3,obj.getModelo());
            cmd.setString(4,obj.getMarca());
            cmd.setString(5,obj.getMotorista());
            cmd.setInt(6,obj.getFg_ativo());
            
            //Enviar comando ao banco
            if(cmd.executeUpdate() > 0){
                //Sucesso -> retornar o ID
                ResultSet rs = cmd.getGeneratedKeys();
                return rs.next()? rs.getInt(1) : 1;
            }else
                return -1;//Falha
        } catch(SQLException erro){
            //Mensagem de erro
            System.err.println(erro.getMessage());
            return -2;
        } finally{
            //Desconectar
            Conexao.desconectar(con);
        }
    }
}
