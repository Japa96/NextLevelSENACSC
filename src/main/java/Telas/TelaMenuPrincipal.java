package Telas;

import Model.Cliente;
import java.time.format.DateTimeFormatter;

public class TelaMenuPrincipal extends javax.swing.JFrame {

    private Cliente cliente = new Cliente();

    public TelaMenuPrincipal(Cliente cliente) {
        this.cliente = cliente;
        initComponents();
        try {
            listaNomeUsuarioMenu.setText(cliente.getNome());
            
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            listaDataEhoraLogin.setText(dtf.format(cliente.getUltimoLogin()));
        } catch (Exception ex) {
            System.out.println("Falha ao listar usuário.");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jSeparator1 = new javax.swing.JSeparator();
        botaoListarClientesMenuPrincipal = new javax.swing.JButton();
        botaoListarProdutosMenuPrincipal = new javax.swing.JButton();
        botaoListarPedidosMenuPrincipal = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        botaoSairMenuPrincipal = new javax.swing.JButton();
        botaoCadastrarPedidoMenuPrincipal = new javax.swing.JButton();
        botaoCadastrarProdutosMenuPrincipal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        listaNomeUsuarioMenu = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        listaDataEhoraLogin = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botaoCadastrarClienteMenuPrincipal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setBackground(new java.awt.Color(250, 250, 250));
        jInternalFrame1.setTitle("Next Level - Menu Principal");
        jInternalFrame1.setVisible(true);

        botaoListarClientesMenuPrincipal.setText("Listar Clientes");
        botaoListarClientesMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoListarClientesMenuPrincipalActionPerformed(evt);
            }
        });

        botaoListarProdutosMenuPrincipal.setText("Listar Produtos");
        botaoListarProdutosMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoListarProdutosMenuPrincipalActionPerformed(evt);
            }
        });

        botaoListarPedidosMenuPrincipal.setText("Listar Pedidos");
        botaoListarPedidosMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoListarPedidosMenuPrincipalActionPerformed(evt);
            }
        });

        botaoSairMenuPrincipal.setText("Sair");
        botaoSairMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairMenuPrincipalActionPerformed(evt);
            }
        });

        botaoCadastrarPedidoMenuPrincipal.setText("Cadastrar Pedido");
        botaoCadastrarPedidoMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarPedidoMenuPrincipalActionPerformed(evt);
            }
        });

        botaoCadastrarProdutosMenuPrincipal.setText("Cadastrar Produtos");
        botaoCadastrarProdutosMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarProdutosMenuPrincipalActionPerformed(evt);
            }
        });

        jLabel1.setText("Usuário");

        listaNomeUsuarioMenu.setText("NOME DO USUÁRIO");

        jLabel2.setText("|||");

        listaDataEhoraLogin.setText("DATA LOGIN");

        jLabel3.setText("Último Login");

        botaoCadastrarClienteMenuPrincipal.setText("Cadastrar Cliente");
        botaoCadastrarClienteMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarClienteMenuPrincipalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addComponent(listaNomeUsuarioMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2))
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(listaDataEhoraLogin))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                                .addComponent(botaoSairMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jInternalFrame1Layout.createSequentialGroup()
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addComponent(botaoCadastrarClienteMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(botaoListarPedidosMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(botaoCadastrarPedidoMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(botaoCadastrarProdutosMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(botaoListarClientesMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(botaoListarProdutosMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))))
                                .addGap(0, 12, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoListarClientesMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoCadastrarProdutosMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoListarProdutosMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoCadastrarPedidoMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoListarPedidosMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoCadastrarClienteMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoSairMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(listaNomeUsuarioMenu)
                            .addComponent(jLabel2)
                            .addComponent(listaDataEhoraLogin))))
                .addContainerGap(35, Short.MAX_VALUE))
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

    private void botaoCadastrarProdutosMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarProdutosMenuPrincipalActionPerformed
        this.dispose();
        TelaCadastroProdutos telaCadastroProdutos = new TelaCadastroProdutos(cliente);
        telaCadastroProdutos.setVisible(true);
    }//GEN-LAST:event_botaoCadastrarProdutosMenuPrincipalActionPerformed

    private void botaoCadastrarPedidoMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarPedidoMenuPrincipalActionPerformed
        this.dispose();
        TelaCadastroPedido telaCadastroPedido = new TelaCadastroPedido(cliente);
        telaCadastroPedido.setVisible(true);
    }//GEN-LAST:event_botaoCadastrarPedidoMenuPrincipalActionPerformed

    private void botaoListarClientesMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoListarClientesMenuPrincipalActionPerformed
        this.dispose();
        TelaListarClientes telaListarClientes = new TelaListarClientes(cliente);
        telaListarClientes.setVisible(true);
    }//GEN-LAST:event_botaoListarClientesMenuPrincipalActionPerformed

    private void botaoListarProdutosMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoListarProdutosMenuPrincipalActionPerformed
        this.dispose();
        TelaListarProdutos telaListarProdutos = new TelaListarProdutos(cliente);
        telaListarProdutos.setVisible(true);
    }//GEN-LAST:event_botaoListarProdutosMenuPrincipalActionPerformed

    private void botaoListarPedidosMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoListarPedidosMenuPrincipalActionPerformed
        this.dispose();
        TelaListarPedidos telaListarPedidos = new TelaListarPedidos(cliente);
        telaListarPedidos.setVisible(true);
    }//GEN-LAST:event_botaoListarPedidosMenuPrincipalActionPerformed

    private void botaoSairMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairMenuPrincipalActionPerformed
        this.dispose();
        TelaLogin telaLogin = new TelaLogin();
        telaLogin.setVisible(true);
    }//GEN-LAST:event_botaoSairMenuPrincipalActionPerformed

    private void botaoCadastrarClienteMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarClienteMenuPrincipalActionPerformed
        this.dispose();
        TelaCadastroClientes telaCadastrarClientes = new TelaCadastroClientes(cliente);
        telaCadastrarClientes.setVisible(true);
    }//GEN-LAST:event_botaoCadastrarClienteMenuPrincipalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrarClienteMenuPrincipal;
    private javax.swing.JButton botaoCadastrarPedidoMenuPrincipal;
    private javax.swing.JButton botaoCadastrarProdutosMenuPrincipal;
    private javax.swing.JButton botaoListarClientesMenuPrincipal;
    private javax.swing.JButton botaoListarPedidosMenuPrincipal;
    private javax.swing.JButton botaoListarProdutosMenuPrincipal;
    private javax.swing.JButton botaoSairMenuPrincipal;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel listaDataEhoraLogin;
    private javax.swing.JLabel listaNomeUsuarioMenu;
    // End of variables declaration//GEN-END:variables
}
