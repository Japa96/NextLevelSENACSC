package Services;

import DAO.ClientesDAO;
import Model.Cliente;
import Services.Interface.ClienteService;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteServiceImplements implements ClienteService {

    private ClientesDAO clienteDAO = new ClientesDAO();

    @Override
    public void cadastroCliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cliente> listarCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Optional<Cliente> validaLogin(Cliente cliente) {

        try {
            Optional<Cliente> validaCliente = clienteDAO.validaLogin(cliente);
            if(validaCliente.isPresent()){
                return validaCliente;
            }else{
                throw new Exception ("Usuário ou senha incorreto ou não cadastrados.");
            }
        } catch (Exception ex) {
            Logger.getLogger(ClienteServiceImplements.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
