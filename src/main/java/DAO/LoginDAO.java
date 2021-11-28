
package DAO;

import Model.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Optional;

public class LoginDAO {
    
    java.sql.Connection con = new conecta().getConnection();
    
    public Optional<Cliente> validaLogin(Cliente clientes) throws Exception {

        Cliente clientesRetorno = null;

        try {
            PreparedStatement stmt = this.con.
                    prepareStatement("select * from nextlevel.tbclientes where email=? and senha=? LIMIT 1");

            stmt.setString(1, clientes.getEmail());
            stmt.setString(2, clientes.getSenha());

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                // criando o objeto Contato

                clientesRetorno = new Cliente();
                clientesRetorno.setUltimoLogin(LocalDateTime.now());
                clientesRetorno.setId(rs.getInt("id"));
                clientesRetorno.setNome(rs.getString("nome"));
            }
            rs.close();
            stmt.close();
            return Optional.of(clientesRetorno);
        } catch (SQLException e) {
            throw new Exception(e.getMessage());
        }

    }
    
}
