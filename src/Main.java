import java.sql.Date;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws SQLException {

    CadastroCliente cadastro = new CadastroCliente("joao", "Carlos", "joao123@hotmail.com",
            new Date(2000, 5, 24), "021024587");

    CadastroClienteBD cadastroBD = new CadastroClienteBD();
    cadastroBD.saveBD(cadastro);

  }
}
