
package Model;

import com.mysql.cj.Session;
import java.io.File;
import java.io.IOException;
import java.util.Properties;

public class Email {
    
    private String nome;
    private String endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
}
