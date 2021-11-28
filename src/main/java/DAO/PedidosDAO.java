package DAO;

import Model.Endereco;
import Model.Pedidos;
import Model.Produtos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PedidosDAO {

    java.sql.Connection con = new conecta().getConnection();

    public void cadastro(Pedidos pedidos, Endereco endereco) throws Exception {
                
        String sql = "insert into nextlevel.tbpedidos(valortotal, formapagamento, enderecopedido) values(?,?,?)";

        try (PreparedStatement preparedStatement = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
            
            preparedStatement.setFloat(1, pedidos.getValorTotal());
            preparedStatement.setString(2, pedidos.getFormaPagamento());
            preparedStatement.setInt(3, endereco.getId());

            preparedStatement.execute();
            
            try (ResultSet generatedKeys = preparedStatement.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    pedidos.setId(generatedKeys.getInt(1));
                } else {
                    throw new SQLException("Criação do pedido falhou, nenhum ID obtido.");
                }
            }
            preparedStatement.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public List<Pedidos> buscaId(int id) throws Exception {
        
        List<Pedidos> listarPedidos = new ArrayList<>();
        
        Pedidos pedidos = null;

        String sql = "SELECT tbpedidos.id, tbprodutos.nome, tbprodutospedidos.quantidade, tbprodutospedidos.valorunitario, tbenderecospedidos.rua, tbenderecospedidos.numero, tbenderecospedidos.bairro, tbenderecospedidos.cidade, tbenderecospedidos.uf,tbpedidos.formapagamento, tbpedidos.valortotal FROM tbpedidos\n" +
"INNER JOIN tbenderecospedidos ON tbpedidos.enderecopedido = tbenderecospedidos.id\n" +
"INNER JOIN tbprodutospedidos ON tbpedidos.id = tbprodutospedidos.idpedido\n" +
"INNER JOIN tbprodutos ON tbprodutos.idprodutos = tbprodutospedidos.produto\n" +
"WHERE tbpedidos.id =?";

        try (PreparedStatement preparestatement = con.prepareStatement(sql)) {
            preparestatement.setInt(1, id);
            ResultSet resultado = preparestatement.executeQuery();

            while (resultado.next()) {
                pedidos = new Pedidos();                
                Produtos produto = new Produtos();
                
                pedidos.setId(resultado.getInt("id"));
                produto.setNome(resultado.getString("nome"));
                produto.setQuantidade(resultado.getInt("quantidade"));
                produto.setValor(resultado.getString("valorunitario"));
                pedidos.getEndereco().setRua(resultado.getString("rua"));
                pedidos.getEndereco().setNumero(resultado.getInt("numero"));
                pedidos.getEndereco().setBairro(resultado.getString("bairro"));
                pedidos.getEndereco().setCidade(resultado.getString("cidade"));
                pedidos.getEndereco().setUf(resultado.getString("uf"));
                pedidos.setFormaPagamento(resultado.getString("formapagamento"));
                pedidos.setValorTotal(resultado.getFloat("valortotal"));
                
                pedidos.getProdutos().add(produto);
                // Adcionando cada registro encontro, na lista .
                listarPedidos.add(pedidos);
            }

            preparestatement.close();
        } catch (SQLException e) {
            throw new Exception("Não foi possível buscar o ID.");
        }
        return listarPedidos;
    }
}
