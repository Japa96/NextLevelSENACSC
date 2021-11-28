/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Endereco;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class EnderecoDAO {

    java.sql.Connection con = new conecta().getConnection();

    public void cadastro(Endereco endereco) throws SQLException {

        String sql = "insert into nextlevel.tbenderecospedidos(rua, numero, bairro, cidade, uf) values(?,?,?,?,?)";

        try (PreparedStatement preparestatement = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {

            preparestatement.setString(1, endereco.getRua());
            preparestatement.setInt(2, endereco.getNumero());
            preparestatement.setString(3, endereco.getBairro());
            preparestatement.setString(4, endereco.getCidade());
            preparestatement.setString(5, endereco.getUf());

            int linhasAfetadas = preparestatement.executeUpdate();

            if (linhasAfetadas == 0) {
                throw new SQLException("Criação do endereço falhou, nenhum linha afetada.");
            }

            try (ResultSet generatedKeys = preparestatement.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    endereco.setId(generatedKeys.getInt(1));
                } else {
                    throw new SQLException("Criação do endereço falhou, nenhum ID obtido.");
                }
            }
            preparestatement.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
