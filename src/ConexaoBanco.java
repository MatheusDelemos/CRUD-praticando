import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConexaoBanco {

    public void conectBanco() {
        Connection conect = null;
        String driverName = "com.mysql.jdbc.Driver";

        try {

            String url = "jdbc:mysql://localhost:3306/Crud?user=root&password=Aa010203123";
            conect = DriverManager.getConnection(url);
            Statement statement = conect.createStatement();
            ResultSet result = statement.executeQuery("select * from pessoa");
            while(result.next()){
                System.out.println(result.getString(1)+ " " +result.getString(2) + " " +result.getString(3)+ " " +result.getString(4)+ " " +result.getDate(5)+ " " +result.getInt(6));

            }
            conect.close();
        } catch (Exception erro) {
            System.out.println( " conexão" + erro.getMessage());

        }

    }
}
