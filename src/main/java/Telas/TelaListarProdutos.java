/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import DAO.ProdutosDAO;
import Model.Cliente;
import Model.Produtos;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luis Gustavo
 */
public class TelaListarProdutos extends javax.swing.JFrame {

    private DefaultTableModel model;
    private ProdutosDAO produtosDAO = new ProdutosDAO();
    private Produtos produtos = new Produtos();
    private Cliente cliente;

    public TelaListarProdutos(Cliente cliente) {
        this.cliente = cliente;
        initComponents();
    }

    public void listarProdutos() {
        model = (DefaultTableModel) tabelaListagemProdutos.getModel();
        model.setRowCount(0);
        List<Produtos> list = null;

        try {
            list = produtosDAO.buscarTodosProdutos();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        for (Produtos produtos : list) {
            model.insertRow(model.getRowCount(), new Object[]{produtos.getId(), produtos.getNome(), produtos.getDescricao(), produtos.getValor(), produtos.getPeso(), produtos.getQuantidade(), produtos.getCategoria()});
        }
    }

    public void listarProdutosCategoria() {
        model = (DefaultTableModel) tabelaListagemProdutos.getModel();
        model.setRowCount(0);
        List<Produtos> list = null;

        try {
            list = produtosDAO.buscarProdutosCategoria((String) comboSelecionaCategoria.getSelectedItem());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        for (Produtos produtos : list) {
            model.insertRow(model.getRowCount(), new Object[]{produtos.getId(), produtos.getNome(), produtos.getDescricao(), produtos.getValor(), produtos.getPeso(), produtos.getQuantidade(), produtos.getCategoria()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaListagemProdutos = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        botaoEditarListagemProdutos = new javax.swing.JButton();
        botaoVoltarListagemProdutos = new javax.swing.JButton();
        comboSelecionaCategoria = new javax.swing.JComboBox<>();
        botaoListarCategoria = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        botaoLDeletarProduto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setBackground(new java.awt.Color(250, 250, 250));
        jInternalFrame1.setTitle("Next Level - Listagem de Produtos");
        jInternalFrame1.setVisible(true);

        tabelaListagemProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Descricao", "Valor", "Peso (Kg)", "Quantidade (Un)", "Categoria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaListagemProdutos);

        botaoEditarListagemProdutos.setText("Editar");
        botaoEditarListagemProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarListagemProdutosActionPerformed(evt);
            }
        });

        botaoVoltarListagemProdutos.setText("Voltar");
        botaoVoltarListagemProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarListagemProdutosActionPerformed(evt);
            }
        });

        comboSelecionaCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Hardware", "Periféricos", "Computadores", "Monitores", "Cadeiras e Mesas", "Eletrônicos", "Notebooks e Portáteis", "Redes e Wireless" }));

        botaoListarCategoria.setText("Listar");
        botaoListarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoListarCategoriaActionPerformed(evt);
            }
        });

        jLabel1.setText("Categoria");

        botaoLDeletarProduto.setText("Deletar");
        botaoLDeletarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLDeletarProdutoActionPerformed(evt);
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboSelecionaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoListarCategoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoLDeletarProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoVoltarListagemProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoEditarListagemProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoEditarListagemProdutos)
                    .addComponent(botaoVoltarListagemProdutos)
                    .addComponent(comboSelecionaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoListarCategoria)
                    .addComponent(jLabel1)
                    .addComponent(botaoLDeletarProduto))
                .addContainerGap(29, Short.MAX_VALUE))
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

    private void botaoVoltarListagemProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarListagemProdutosActionPerformed
        this.dispose();
        TelaMenuPrincipal telaMenuPrincipal = new TelaMenuPrincipal(cliente);
        telaMenuPrincipal.setVisible(true);
    }//GEN-LAST:event_botaoVoltarListagemProdutosActionPerformed

    private void botaoListarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoListarCategoriaActionPerformed
        String tipoSelecionaCategoria = (String) comboSelecionaCategoria.getSelectedItem();
        boolean categoriaSelecionada = tipoSelecionaCategoria.equals("Todos");
        if (categoriaSelecionada == true) {
            listarProdutos();
        } else {
            listarProdutosCategoria();
        }
    }//GEN-LAST:event_botaoListarCategoriaActionPerformed

    private void botaoEditarListagemProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarListagemProdutosActionPerformed
        try {
            int SelecionaId = (int) tabelaListagemProdutos.getModel().getValueAt(tabelaListagemProdutos.getSelectedRow(), 0);
            Produtos produto = produtosDAO.buscarProdutosId(SelecionaId);

            this.dispose();
            TelaCadastroProdutos telaCadastroProduto = new TelaCadastroProdutos(cliente, produto);
            telaCadastroProduto.setVisible(true);
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Selecione um produto a ser editado.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_botaoEditarListagemProdutosActionPerformed

    private void botaoLDeletarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLDeletarProdutoActionPerformed

        int SelecionaId = (int) tabelaListagemProdutos.getModel().getValueAt(tabelaListagemProdutos.getSelectedRow(), 0);
        try {
            Produtos produto = produtosDAO.checaProdutoPedidos(SelecionaId);

            if (produto != null) {
                JOptionPane.showMessageDialog(null, "Não é possível excluir o produto: ID " + produto.getId() + " pois o mesmo está vinculado a um pedido!");
            } else {
                produtosDAO.deletarProdutos(SelecionaId);
                JOptionPane.showMessageDialog(null, "Produto excluido com sucesso.");

                String tipoSelecionaCategoria = (String) comboSelecionaCategoria.getSelectedItem();
                boolean categoriaSelecionada = tipoSelecionaCategoria.equals("Todos");
                if (categoriaSelecionada == true) {
                    listarProdutos();
                } else {
                    listarProdutosCategoria();
                }
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Selecione um produto a ser deletado.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_botaoLDeletarProdutoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEditarListagemProdutos;
    private javax.swing.JButton botaoLDeletarProduto;
    private javax.swing.JButton botaoListarCategoria;
    private javax.swing.JButton botaoVoltarListagemProdutos;
    private javax.swing.JComboBox<String> comboSelecionaCategoria;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tabelaListagemProdutos;
    // End of variables declaration//GEN-END:variables
}
