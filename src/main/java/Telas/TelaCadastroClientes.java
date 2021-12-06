package Telas;

import DAO.ClientesDAO;
import Model.Cliente;
import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaCadastroClientes extends javax.swing.JFrame {

    private Cliente cliente;

    private Cliente cadastroCliente;

    public TelaCadastroClientes() {
        initComponents();
    }

    public TelaCadastroClientes(Cliente cliente) {
        this.cliente = cliente;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        entraNomeCadastroCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        entraDataNascimentoCadastroCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        entraEmailCadastroCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        entraCpfCadastroCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        entraSenhaCadastroCliente = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        entraSenhaConfirmacaoCadastroCliente = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        botaoCadastroCliente = new javax.swing.JButton();
        botaoCancelarCadastroCliente = new javax.swing.JButton();
        botaoLimparCadastroCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setBackground(new java.awt.Color(250, 250, 250));
        jInternalFrame1.setTitle("Next Level - Cadastro de Clientes");
        jInternalFrame1.setVisible(true);

        jLabel1.setText("Nome");

        jLabel2.setText("Data de Nascimento");

        entraDataNascimentoCadastroCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entraDataNascimentoCadastroClienteMouseClicked(evt);
            }
        });

        jLabel3.setText("e-Mail");

        jLabel4.setText("CPF");

        jLabel5.setText("Senha");

        jLabel6.setText("Confirme a Senha");

        botaoCadastroCliente.setText("Cadastrar");
        botaoCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastroClienteActionPerformed(evt);
            }
        });

        botaoCancelarCadastroCliente.setText("Cancelar");
        botaoCancelarCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarCadastroClienteActionPerformed(evt);
            }
        });

        botaoLimparCadastroCliente.setText("Limpar");
        botaoLimparCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparCadastroClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(120, 120, 120)
                                .addComponent(jLabel6))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(entraSenhaCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(entraSenhaConfirmacaoCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1)
                                    .addComponent(entraNomeCadastroCliente)
                                    .addComponent(entraEmailCadastroCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(entraDataNascimentoCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(entraCpfCadastroCliente))))
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botaoLimparCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoCancelarCadastroCliente)
                        .addGap(18, 18, 18)
                        .addComponent(botaoCadastroCliente)))
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entraNomeCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entraDataNascimentoCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entraEmailCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entraCpfCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entraSenhaCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entraSenhaConfirmacaoCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCadastroCliente)
                    .addComponent(botaoCancelarCadastroCliente)
                    .addComponent(botaoLimparCadastroCliente))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void limparCampos() {
        entraNomeCadastroCliente.setText("");
        entraDataNascimentoCadastroCliente.setText("");
        entraEmailCadastroCliente.setText("");
        entraEmailCadastroCliente.setBackground(Color.white);

        entraCpfCadastroCliente.setText("");
        entraSenhaCadastroCliente.setText("");
        entraSenhaConfirmacaoCadastroCliente.setText("");
        entraCpfCadastroCliente.setBackground(Color.white);
        entraSenhaCadastroCliente.setBackground(Color.white);
        entraSenhaConfirmacaoCadastroCliente.setBackground(Color.white);
    }

    private void botaoCancelarCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarCadastroClienteActionPerformed

        if (cliente != null) {
            this.dispose();
            TelaMenuPrincipal telaMenuPrincipal = new TelaMenuPrincipal(cliente);
            telaMenuPrincipal.setVisible(true);
        } else {
            this.dispose();
            TelaLogin telaLogin = new TelaLogin();
            telaLogin.setVisible(true);
        }
    }//GEN-LAST:event_botaoCancelarCadastroClienteActionPerformed

    private void botaoLimparCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparCadastroClienteActionPerformed
        limparCampos();
    }//GEN-LAST:event_botaoLimparCadastroClienteActionPerformed

    private void botaoCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastroClienteActionPerformed

        this.cadastroCliente = new Cliente();

        cadastroCliente.setNome(entraNomeCadastroCliente.getText());
        cadastroCliente.setDataNascimento(entraDataNascimentoCadastroCliente.getText());
        cadastroCliente.setEmail(entraEmailCadastroCliente.getText());
        cadastroCliente.setCpf(entraCpfCadastroCliente.getText());
        cadastroCliente.setSenha(entraSenhaCadastroCliente.getText());
        cadastroCliente.setConfirmaSenha(entraSenhaConfirmacaoCadastroCliente.getText());

        if (cadastroCliente.validaEmail() == true && cadastroCliente.validaSenha() == true && cadastroCliente.validaCPF() == true) {
            ClientesDAO clientesDao = new ClientesDAO();

            try {
                boolean retornaChecaCliente = clientesDao.checaCliente(cadastroCliente);
                boolean retornaChecaCpf = clientesDao.checaCpfCliente(cadastroCliente);

                if (retornaChecaCliente == true) {
                    JOptionPane.showMessageDialog(null, "O e-Mail informado já está cadastrado.");
                    entraEmailCadastroCliente.setText("");
                    entraEmailCadastroCliente.setBackground(Color.red);
                }
                if (retornaChecaCpf == true) {
                    JOptionPane.showMessageDialog(null, "O CPF informado já está cadastrado.");
                    entraCpfCadastroCliente.setText("");
                    entraCpfCadastroCliente.setBackground(Color.red);
                } else {
                    clientesDao.cadastro(cadastroCliente);
                    JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso.");

                    limparCampos();

                    int desejoCadastro = JOptionPane.showConfirmDialog(null, "Deseja cadastrar mais algum cliente?");
                    
                    if (desejoCadastro == 1) {
                        
                        if (cliente != null) {
                            this.dispose();
                            TelaMenuPrincipal telaMenuPrincipal = new TelaMenuPrincipal(cliente);
                            System.out.println(cliente.getNome());
                            telaMenuPrincipal.setVisible(true);
                        } else{
                            this.dispose();
                            TelaLogin telaLogin = new TelaLogin();
                            telaLogin.setVisible(true);
                        }

                    }
                }
            } catch (Exception ex) {
                Logger.getLogger(TelaCadastroClientes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (cadastroCliente.validaEmail() == false) {
            JOptionPane.showMessageDialog(null, "O e-Mail informado é inválido.");
            entraEmailCadastroCliente.setText("");
            entraEmailCadastroCliente.setBackground(Color.red);
        }
        if (cadastroCliente.validaSenha() == false) {
            JOptionPane.showMessageDialog(null, "A senhas não são iguais.");
            entraSenhaCadastroCliente.setText("");
            entraSenhaConfirmacaoCadastroCliente.setText("");
            entraSenhaCadastroCliente.setBackground(Color.red);
            entraSenhaConfirmacaoCadastroCliente.setBackground(Color.red);
        }
        if (cadastroCliente.validaCPF() == false) {
            JOptionPane.showMessageDialog(null, "O CPF informado é inválido");
            entraCpfCadastroCliente.setText("");
            entraCpfCadastroCliente.setBackground(Color.red);
        }


    }//GEN-LAST:event_botaoCadastroClienteActionPerformed

    private void entraDataNascimentoCadastroClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entraDataNascimentoCadastroClienteMouseClicked
        DateFormat onlyDate = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        entraDataNascimentoCadastroCliente.setText(onlyDate.format(date));
    }//GEN-LAST:event_entraDataNascimentoCadastroClienteMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastroCliente;
    private javax.swing.JButton botaoCancelarCadastroCliente;
    private javax.swing.JButton botaoLimparCadastroCliente;
    private javax.swing.JTextField entraCpfCadastroCliente;
    private javax.swing.JTextField entraDataNascimentoCadastroCliente;
    private javax.swing.JTextField entraEmailCadastroCliente;
    private javax.swing.JTextField entraNomeCadastroCliente;
    private javax.swing.JPasswordField entraSenhaCadastroCliente;
    private javax.swing.JPasswordField entraSenhaConfirmacaoCadastroCliente;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
