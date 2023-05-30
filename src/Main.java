import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      new ConexaoBanco().conectBanco();
    }

    cadastroCliente nome = RequisiçãoDados();






private static cadastroCliente RequisiçãoDados(){
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite seu login: ");
    String nome = teclado.nextLine();
    return RequisiçãoDados();
    }
}