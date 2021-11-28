
package Services.Interface;

import Model.Cliente;
import java.util.List;
import java.util.Optional;


public interface ClienteService {
    
    void cadastroCliente(Cliente cliente);
    List<Cliente> listarCliente();
    Optional<Cliente> validaLogin(Cliente cliente);
    
}
