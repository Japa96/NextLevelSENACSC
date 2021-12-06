package DAO;

import Model.Produtos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProdutosDAO {

    java.sql.Connection con = new conecta().getConnection();

    public void cadastroProduto(Produtos produtos) throws Exception {

        String sql = "insert into nextlevel.tbprodutos(nome, valor, descricao, peso, quantidade, categoria) values(?,?,?,?,?,?)";

        try (PreparedStatement preparestatement = con.prepareStatement(sql)) {
            preparestatement.setString(1, produtos.getNome());
            preparestatement.setString(2, produtos.getValor());
            preparestatement.setString(3, produtos.getDescricao());
            preparestatement.setString(4, produtos.getPeso());
            preparestatement.setFloat(5, produtos.getQuantidade());
            preparestatement.setString(6, produtos.getCategoria());

            preparestatement.execute();
            preparestatement.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao realizar cadastro do produto.");
        }
    }

    public List<Produtos> buscarTodosProdutos() throws Exception {
        List<Produtos> listarProdutos = new ArrayList<>();

        String sql = "SELECT * FROM nextlevel.tbprodutos;";
        Produtos produtos = null;

        try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {

            ResultSet resultado = preparedStatement.executeQuery();

            /*
			 * Dentro do while estou verificando se tem registro no banco de dados, enquanto tiver registro vai 
			 * adcionando um a um na lista e no final fora do while retorna todos os registro encontrados. 
             */
            while (resultado.next()) {
                produtos = new Produtos();
                produtos.setId(resultado.getInt("idprodutos"));
                produtos.setNome(resultado.getString("nome"));
                produtos.setValor(resultado.getString("valor"));
                produtos.setDescricao(resultado.getString("descricao"));
                produtos.setPeso(resultado.getString("peso"));
                produtos.setQuantidade(resultado.getInt("quantidade"));
                produtos.setCategoria(resultado.getString("categoria"));

                // Adcionando cada registro encontro, na lista .
                listarProdutos.add(produtos);
            }

        } catch (SQLException e) {
            throw new Exception("Não foi possível listar os produtos.");
        }
        return listarProdutos;

    }

    public List<Produtos> buscarProdutosCategoria(String categoria) throws Exception {
        List<Produtos> listarProdutosCategoria = new ArrayList<>();

        String sql = "SELECT * FROM nextlevel.tbprodutos where categoria=?;";
        Produtos produtos = null;

        try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
            preparedStatement.setString(1, categoria);
            ResultSet resultado = preparedStatement.executeQuery();

            /*
			 * Dentro do while estou verificando se tem registro no banco de dados, enquanto tiver registro vai 
			 * adcionando um a um na lista e no final fora do while retorna todos os registro encontrados. 
             */
            while (resultado.next()) {
                produtos = new Produtos();
                produtos.setId(resultado.getInt("idprodutos"));
                produtos.setNome(resultado.getString("nome"));
                produtos.setValor(resultado.getString("valor"));
                produtos.setDescricao(resultado.getString("descricao"));
                produtos.setPeso(resultado.getString("peso"));
                produtos.setQuantidade(resultado.getInt("quantidade"));
                produtos.setCategoria(resultado.getString("categoria"));

                // Adcionando cada registro encontro, na lista .
                listarProdutosCategoria.add(produtos);
            }

        } catch (SQLException e) {
            throw new Exception("Não foi possível listar os produtos.");
        }
        return listarProdutosCategoria;

    }

    public Produtos buscarProdutosId(int id) throws Exception {
        Produtos produto = null;

        String sql = "SELECT * FROM nextlevel.tbprodutos where idprodutos=?;";

        try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
            preparedStatement.setInt(1, id);
            ResultSet resultado = preparedStatement.executeQuery();

            while (resultado.next()) {
                produto = new Produtos();
                produto.setId(resultado.getInt("idprodutos"));
                produto.setNome(resultado.getString("nome"));
                produto.setValor(resultado.getString("valor"));
                produto.setDescricao(resultado.getString("descricao"));
                produto.setPeso(resultado.getString("peso"));
                produto.setQuantidade(resultado.getInt("quantidade"));
                produto.setCategoria(resultado.getString("categoria"));
            }

            return produto;

        } catch (SQLException e) {
            throw new Exception("Não foi possível listar os produtos.");
        }

    }

    public void alteraQuantidadeProduto(Produtos produtos, int novaQuantidade) throws SQLException, Exception {

        String sql = "UPDATE nextlevel.tbprodutos SET quantidade=? WHERE idprodutos=?";

        try (PreparedStatement preparestatement = con.prepareStatement(sql)) {

            preparestatement.setInt(1, novaQuantidade);
            preparestatement.setInt(2, produtos.getId());

            preparestatement.executeUpdate();
            preparestatement.close();
        } catch (SQLException e) {
            throw new Exception("Não foi possível alterar o produto.");
        }
    }

    public void editarProduto(Produtos produtos) throws SQLException, Exception {

        String sql = "UPDATE nextlevel.tbprodutos SET nome=?, valor=?, descricao=?, peso=?, quantidade=?, categoria=? WHERE idprodutos=?";

        try (PreparedStatement preparestatement = con.prepareStatement(sql)) {

            preparestatement.setString(1, produtos.getNome());
            preparestatement.setString(2, produtos.getValor());
            preparestatement.setString(3, produtos.getDescricao());
            preparestatement.setString(4, produtos.getPeso());
            preparestatement.setFloat(5, produtos.getQuantidade());
            preparestatement.setString(6, produtos.getCategoria());
            preparestatement.setInt(7, produtos.getId());

            preparestatement.execute();
            preparestatement.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao realizar a edição do produto.");
        }
    }

    public Produtos checaProdutoPedidos(int id) throws SQLException, Exception {

        Produtos produto = null;

        String sql = "SELECT * FROM nextlevel.tbprodutospedidos where produto = ?;";

        try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
            preparedStatement.setInt(1, id);
            ResultSet resultado = preparedStatement.executeQuery();

            while (resultado.next()) {
                produto = new Produtos();
                produto.setId(resultado.getInt("produto"));
                produto.setValor(resultado.getString("valorunitario"));
                produto.setQuantidade(resultado.getInt("quantidade"));

            }

            return produto;

        } catch (SQLException e) {
            throw new Exception("Não foi possível listar os produtos.");
        }

    }
    
    public void deletarProdutos(int id) throws Exception {

        String sql = "delete FROM nextlevel.tbprodutos where idprodutos = ?";

        try (PreparedStatement preparestatement = con.prepareStatement(sql)) {
            preparestatement.setInt(1, id);
            preparestatement.execute();
            preparestatement.close();
        } catch (SQLException e) {
            throw new Exception("Não foi possível excluir o produto selecionado.");
        }
    }

}
