import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CadastroClienteBD {

    public void saveBD(CadastroCliente cadastroCliente) throws SQLException {
        String sql = "INSERT INTO cadastro (nome, sobrenome, email, datanascimento, senha) VALUES (?,?,?,?,?)";

        try (Connection conn = ConexaoBanco.conectBanco();
             PreparedStatement pstm = conn.prepareStatement(sql)) {

            pstm.setString(1, cadastroCliente.getNome());
            pstm.setString(2, cadastroCliente.getSobrenome());
            pstm.setString(3, cadastroCliente.getEmail());
            pstm.setDate(4, (Date) cadastroCliente.getDataNascimento());
            pstm.setString(5, cadastroCliente.getSenha());

            pstm.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
