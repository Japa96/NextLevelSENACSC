package Model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;

public class Cliente {

    private int Id;
    private String nome;
    private String dataNascimento;
    private String email;
    private String cpf;
    private String senha;
    private String confirmaSenha;
    private LocalDateTime ultimoLogin;

    public int getId() {
        return Id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public String getConfirmaSenha() {
        return confirmaSenha;
    }

    public LocalDateTime getUltimoLogin() {
        return ultimoLogin;
    }

    public void setUltimoLogin(LocalDateTime ultimoLogin) {
        this.ultimoLogin = ultimoLogin;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setConfirmaSenha(String confirmaSenha) {
        this.confirmaSenha = confirmaSenha;
    }

    public boolean validaEmail() {
        if (this.email.contains("@")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validaSenha() {
        if (this.senha.equals(confirmaSenha)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validaCPF() {
        // considera-se erro CPF's formados por uma sequencia de numeros iguais
        if (this.cpf.equals("00000000000")
                || this.cpf.equals("11111111111")
                || this.cpf.equals("22222222222") || this.cpf.equals("33333333333")
                || this.cpf.equals("44444444444") || this.cpf.equals("55555555555")
                || this.cpf.equals("66666666666") || this.cpf.equals("77777777777")
                || this.cpf.equals("88888888888") || this.cpf.equals("99999999999")
                || (this.cpf.length() != 11)) {
            return (false);
        }

        char dig10, dig11;
        int sm, i, r, num, peso;

        // "try" - protege o codigo para eventuais erros de conversao de tipo (int)
        try {
            // Calculo do 1o. Digito Verificador
            sm = 0;
            peso = 10;
            for (i = 0; i < 9; i++) {
                // converte o i-esimo caractere do CPF em um numero:
                // por exemplo, transforma o caractere '0' no inteiro 0
                // (48 eh a posicao de '0' na tabela ASCII)
                num = (int) (this.cpf.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11)) {
                dig10 = '0';
            } else {
                dig10 = (char) (r + 48); // converte no respectivo caractere numerico
            }
            // Calculo do 2o. Digito Verificador
            sm = 0;
            peso = 11;
            for (i = 0; i < 10; i++) {
                num = (int) (this.cpf.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11)) {
                dig11 = '0';
            } else {
                dig11 = (char) (r + 48);
            }

            // Verifica se os digitos calculados conferem com os digitos informados.
            if ((dig10 == this.cpf.charAt(9)) && (dig11 == this.cpf.charAt(10))) {
                return (true);
            } else {
                return (false);
            }
        } catch (InputMismatchException erro) {
            return (false);
        }
    }

    public boolean validaLogin() {
        if (this.email.equals("admin@admin.com.br")) {
            return true;
        } else {
            return false;
        }
    }

}
