import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoBanco {

    public static Connection conectBanco() throws SQLException {
        Connection conect = null;
        String driverName = "com.mysql.cj.jdbc.Driver";

        try {
            String url = "jdbc:mysql://localhost:3306/Crud?user=root&password=Aa010203123";
            conect = DriverManager.getConnection(url);
        } catch (SQLException erro) {
            throw new SQLException("Erro ao conectar ao banco de dados: " + erro.getMessage());
        }

        return conect;
    }
}
