/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import DAO.ProdutosDAO;
import Model.Cliente;
import Model.Produtos;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Gustavo
 */
public class TelaCadastroProdutos extends javax.swing.JFrame {

    private Produtos produtos = new Produtos();
    private Cliente cliente;

    public TelaCadastroProdutos(Cliente cliente) {
        this.cliente = cliente;
        initComponents();
    }

    public TelaCadastroProdutos(Cliente cliente, Produtos prod) {
        this.cliente = cliente;
        this.produtos = prod;
        initComponents();

        entraNomeCadastroProduto.setText(prod.getNome());
        entraValorCadastroProduto.setText(prod.getValor());
        entraDescricaoCadastroProduto.setText(prod.getDescricao());
        entraPesoCadastroProduto.setText(prod.getPeso());
        entraQuantidadeCadastroProduto.setText(String.valueOf(prod.getQuantidade()));
        comboCategoriaCadastroProduto.setSelectedItem(prod.getCategoria());

        botaoCadastroProduto.setText("Gravar");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        entraNomeCadastroProduto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        entraValorCadastroProduto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        entraDescricaoCadastroProduto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        entraPesoCadastroProduto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        entraQuantidadeCadastroProduto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        comboCategoriaCadastroProduto = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        botaoCadastroProduto = new javax.swing.JButton();
        botaoCancelarCadastroProduto = new javax.swing.JButton();
        botaoLimparCadastroProduto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setBackground(new java.awt.Color(250, 250, 250));
        jInternalFrame1.setTitle("Next Level - Cadastro de Produtos");
        jInternalFrame1.setVisible(true);

        jLabel1.setText("Nome");

        jLabel2.setText("Valor");

        jLabel3.setText("Descri????o");

        jLabel4.setText("Peso (Kg)");

        jLabel5.setText("Quantidade (Un)");

        jLabel6.setText("Categoria");

        comboCategoriaCadastroProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Hardware", "Perif??ricos", "Computadores", "Monitores", "Cadeiras e Mesas", "Eletr??nicos", "Notebooks e Port??teis", "Redes e Wireless" }));

        botaoCadastroProduto.setText("Cadastrar");
        botaoCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastroProdutoActionPerformed(evt);
            }
        });

        botaoCancelarCadastroProduto.setText("Cancelar");
        botaoCancelarCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarCadastroProdutoActionPerformed(evt);
            }
        });

        botaoLimparCadastroProduto.setText("Limpar");
        botaoLimparCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparCadastroProdutoActionPerformed(evt);
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
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(entraPesoCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(entraQuantidadeCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(comboCategoriaCadastroProduto, 0, 1, Short.MAX_VALUE)))
                            .addComponent(entraDescricaoCadastroProduto, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(entraNomeCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(entraValorCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(11, 11, 11))
                    .addComponent(jSeparator2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botaoLimparCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoCancelarCadastroProduto)
                        .addGap(18, 18, 18)
                        .addComponent(botaoCadastroProduto)))
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
                    .addComponent(entraNomeCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entraValorCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(entraDescricaoCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entraPesoCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entraQuantidadeCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboCategoriaCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCadastroProduto)
                    .addComponent(botaoCancelarCadastroProduto)
                    .addComponent(botaoLimparCadastroProduto))
                .addContainerGap(15, Short.MAX_VALUE))
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

    private void botaoLimparCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparCadastroProdutoActionPerformed
        entraNomeCadastroProduto.setText("");
        entraValorCadastroProduto.setText("");
        entraDescricaoCadastroProduto.setText("");
        entraPesoCadastroProduto.setText("");
        entraQuantidadeCadastroProduto.setText("");

    }//GEN-LAST:event_botaoLimparCadastroProdutoActionPerformed

    private void botaoCancelarCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarCadastroProdutoActionPerformed
        this.dispose();
        TelaMenuPrincipal telaMenuPrincipal = new TelaMenuPrincipal(cliente);
        telaMenuPrincipal.setVisible(true);
    }//GEN-LAST:event_botaoCancelarCadastroProdutoActionPerformed

    void limparTela() {
        entraNomeCadastroProduto.setText("");
        entraNomeCadastroProduto.setBackground(Color.white);
        entraValorCadastroProduto.setText("");
        entraDescricaoCadastroProduto.setText("");
        entraDescricaoCadastroProduto.setBackground(Color.white);
        entraPesoCadastroProduto.setText("");
        entraQuantidadeCadastroProduto.setText("");
        comboCategoriaCadastroProduto.setSelectedIndex(0);
    }

    private void botaoCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastroProdutoActionPerformed
        
        produtos.setNome(entraNomeCadastroProduto.getText());
        produtos.setValor(entraValorCadastroProduto.getText());
        produtos.setDescricao(entraDescricaoCadastroProduto.getText());
        produtos.setPeso(entraPesoCadastroProduto.getText());
        produtos.setQuantidade(Integer.parseInt(entraQuantidadeCadastroProduto.getText()));
        produtos.setCategoria((String) comboCategoriaCadastroProduto.getSelectedItem());

        if (entraNomeCadastroProduto.getText().length() < 255 && entraDescricaoCadastroProduto.getText().length() < 255) {
            try {
                ProdutosDAO produtosDAO = new ProdutosDAO();

                if (produtos.getId() == 0) {
                    produtosDAO.cadastroProduto(produtos);
                    JOptionPane.showMessageDialog(null, "O produto foi cadastrado com sucesso.");

                    int desejoCadastro = JOptionPane.showConfirmDialog(null, "Deseja cadastrar mais algum produto?");

                    if (desejoCadastro == 1) {
                        this.dispose();
                        TelaMenuPrincipal telaMenuPrincipal = new TelaMenuPrincipal(cliente);
                        telaMenuPrincipal.setVisible(true);
                    }
                } else {
                    produtosDAO.editarProduto(produtos);
                    limparTela();
                    JOptionPane.showMessageDialog(null, "O produto foi alterado com sucesso.");                    
                    
                    this.dispose();
                    TelaListarProdutos telaListarProdutos = new TelaListarProdutos(cliente);
                    telaListarProdutos.setVisible(true);
                }

                limparTela();

            } catch (Exception ex) {
                Logger.getLogger(TelaCadastroProdutos.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            if (entraNomeCadastroProduto.getText().length() > 255) {
                JOptionPane.showMessageDialog(null, "O nome do produto ultrapassa os 255 caracteres.");
                entraNomeCadastroProduto.setText("");
                entraNomeCadastroProduto.setBackground(Color.red);
            }
            if (entraDescricaoCadastroProduto.getText().length() > 255) {
                JOptionPane.showMessageDialog(null, "A descri????o do produto ultrapassa os 255 caracteres.");
                entraDescricaoCadastroProduto.setText("");
                entraDescricaoCadastroProduto.setBackground(Color.red);
            }
        }
    }//GEN-LAST:event_botaoCadastroProdutoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastroProduto;
    private javax.swing.JButton botaoCancelarCadastroProduto;
    private javax.swing.JButton botaoLimparCadastroProduto;
    private javax.swing.JComboBox<String> comboCategoriaCadastroProduto;
    private javax.swing.JTextField entraDescricaoCadastroProduto;
    private javax.swing.JTextField entraNomeCadastroProduto;
    private javax.swing.JTextField entraPesoCadastroProduto;
    private javax.swing.JTextField entraQuantidadeCadastroProduto;
    private javax.swing.JTextField entraValorCadastroProduto;
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
