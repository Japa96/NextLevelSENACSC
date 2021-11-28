
package DAO;

import Model.Pedidos;
import Model.Produtos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ProdutosPedidoDAO {
    
    java.sql.Connection con = new conecta().getConnection();
    
    public void cadastro(Pedidos pedidos, Produtos produtos) throws SQLException {

        String sql = "insert into nextlevel.tbprodutospedidos(produto, valorunitario, quantidade, idpedido) values(?,?,?,?)";

        try (PreparedStatement preparestatement = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {

            preparestatement.setInt(1, produtos.getId());
            preparestatement.setString(2, produtos.getValor());
            preparestatement.setInt(3, produtos.getQuantidade());
            preparestatement.setInt(4, pedidos.getId());

            int linhasAfetadas = preparestatement.executeUpdate();

            if (linhasAfetadas == 0) {
                throw new SQLException("Criação do endereço falhou, nenhum linha afetada.");
            }

//            try (ResultSet generatedKeys = preparestatement.getGeneratedKeys()) {
//                if (generatedKeys.next()) {
//                    pedidos.setId(generatedKeys.getInt(1));
//                } else {
//                    throw new SQLException("Criação do endereço falhou, nenhum ID obtido.");
//                }
//            }
            preparestatement.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
