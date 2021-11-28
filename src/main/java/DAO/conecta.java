
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Luis Gustavo
 */
public class conecta {
    public Connection getConnection() {
        try {
            return DriverManager.getConnection(
          "jdbc:mysql://localhost/nextlevel", "root", "");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
