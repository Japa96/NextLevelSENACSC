package DAO;

import Model.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ClientesDAO {

    java.sql.Connection con = new conecta().getConnection();

    public void cadastro(Cliente clientes) throws Exception {

        String sql = "insert into nextlevel.tbclientes(nome, datadenascimento, email, cpf, senha) values(?,?,?,?,?)";

        try (PreparedStatement preparestatement = con.prepareStatement(sql)) {
            preparestatement.setString(1, clientes.getNome());
            preparestatement.setString(2, clientes.getDataNascimento());
            preparestatement.setString(3, clientes.getEmail());
            preparestatement.setString(4, clientes.getCpf());
            preparestatement.setString(5, clientes.getSenha());

            preparestatement.execute();
            preparestatement.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao realizar cadastro de cliente.");
        }
    }

    // Metodo para checar e-Mail já cadastrado no banco de dados.
    public boolean checaCliente(Cliente clientes) throws Exception {

        String sql = "select * from nextlevel.tbclientes where email = ?";

        boolean retornoClientes = false;

        try (PreparedStatement preparestatement = con.prepareStatement(sql)) {
            preparestatement.setString(1, clientes.getEmail());
            ResultSet resultadoCheca = preparestatement.executeQuery();
            retornoClientes = resultadoCheca.next();
            preparestatement.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return retornoClientes;
    }

    // Metodo para checar CPF já cadastrado no banco de dados.
    public boolean checaCpfCliente(Cliente clientes) throws Exception {
        String sql = "select * from nextlevel.tbclientes where cpf = ?";

        boolean retornaCpfClientes = false;

        try (PreparedStatement preparestatement = con.prepareStatement(sql)) {
            preparestatement.setString(1, clientes.getCpf());
            ResultSet resultadoCpf = preparestatement.executeQuery();
            retornaCpfClientes = resultadoCpf.next();
            preparestatement.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return retornaCpfClientes;
    }

    public List<Cliente> buscarTodosClientes() throws Exception {
        List<Cliente> listarClientes = new ArrayList<>();

        String sql = "Select * from nextlevel.tbclientes where email != 'admin@admin.com.br'";
        Cliente clientes = null;

        try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {

            ResultSet resultado = preparedStatement.executeQuery();

            /*
			 * Dentro do while estou verificando se tem registro no banco de dados, enquanto tiver registro vai 
			 * adcionando um a um na lista e no final fora do while retorna todos os registro encontrados. 
             */
            while (resultado.next()) {
                clientes = new Cliente();
                clientes.setId(resultado.getInt("id"));
                clientes.setNome(resultado.getString("nome"));
                clientes.setDataNascimento(resultado.getString("datadenascimento"));
                clientes.setEmail(resultado.getString("email"));
                clientes.setCpf(resultado.getString("cpf"));

                // Adcionando cada registro encontro, na lista .
                listarClientes.add(clientes);
            }

        } catch (SQLException e) {
            throw new Exception("Não foi possível listar os ajudantes.");
        }
        return listarClientes;

    }
}
