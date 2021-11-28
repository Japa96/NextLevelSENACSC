/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import DAO.EnderecoDAO;
import DAO.PedidosDAO;
import DAO.ProdutosDAO;
import DAO.ProdutosPedidoDAO;
import Model.Cliente;
import Model.Endereco;
import Model.Pedidos;
import Model.Produtos;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luis Gustavo
 */
public class TelaCadastroPedido extends javax.swing.JFrame {

    private DefaultTableModel model;
    private ProdutosDAO produtosDAO = new ProdutosDAO();
    private Produtos produtos = new Produtos();
    private Cliente cliente;
    private Pedidos pedidos = new Pedidos();
    private Endereco endereco = new Endereco();
    private List<Produtos> list = new ArrayList<>();
    private List<Produtos> listaCompra = new ArrayList<>();
    private float valorTotalPedido;

    public TelaCadastroPedido(Cliente cliente) {
        this.cliente = cliente;
        initComponents();
    }

    public void listarVenda(JTable tabela, List<Produtos> listaProdutos) {
        model = (DefaultTableModel) tabela.getModel();
        model.setRowCount(0);

        for (Produtos produtos : listaProdutos) {
            model.insertRow(model.getRowCount(), new Object[]{produtos.getId(), produtos.getNome(), produtos.getDescricao(), produtos.getValor(), produtos.getPeso(), produtos.getQuantidade(), produtos.getCategoria()});
        }
    }

    public void listarProdutos() {
        model = (DefaultTableModel) tabelaListagemProdutos.getModel();
        model.setRowCount(0);

        try {
            this.list = produtosDAO.buscarTodosProdutos();
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

        try {
            this.list = produtosDAO.buscarProdutosCategoria((String) comboSelecionaCategoria.getSelectedItem());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        for (Produtos produtos : list) {
            model.insertRow(model.getRowCount(), new Object[]{produtos.getId(), produtos.getNome(), produtos.getDescricao(), produtos.getValor(), produtos.getPeso(), produtos.getQuantidade(), produtos.getCategoria()});
        }
    }

    public void calculaValorTotal() {
        valorTotalPedido = 0;
        for (Produtos produtosCarrinho : listaCompra) {
            valorTotalPedido += (produtosCarrinho.getQuantidade()) * Float.parseFloat(produtosCarrinho.getValor());
        }
        valorFinalPedido.setText("R$ " + valorTotalPedido);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jSeparator1 = new javax.swing.JSeparator();
        entraQuantidadePedido = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        entraRuaPedido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        entraNumeroResidenciaPedido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        entraBairroPedido = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        entraCidadePedido = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        comboUFPedido = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        comboFormaPagamentoPedido = new javax.swing.JComboBox<>();
        jSeparator4 = new javax.swing.JSeparator();
        botaoGravarPedido = new javax.swing.JButton();
        botaoCancelarPedido = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaListagemProdutos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        botaoListarProdutosPedidos = new javax.swing.JButton();
        comboSelecionaCategoria = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        botaoInsereCarrinho = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaListagemCarrinho = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        botaoExcluirItemCarrinho = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        valorFinalPedido = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setBackground(new java.awt.Color(250, 250, 250));
        jInternalFrame1.setTitle("Next Level - Cadastro de Pedido");
        jInternalFrame1.setVisible(true);

        jLabel2.setText("Quantidade");

        jLabel4.setText("Rua");

        jLabel5.setText("Número");

        jLabel6.setText("Bairro");

        jLabel7.setText("Cidade");

        jLabel8.setText("UF");

        comboUFPedido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AM", "RR", "PA", "AP", "TO", "MA", "PI", "CE", "RN", "RO", "PB", "PE", "AL", "SE", "BA", "MG", "ES", "RJ", "SP", "PR", "SC", "RS", "MS", "MT", "GO", "DF" }));

        jLabel9.setText("Forma de Pagamento");

        comboFormaPagamentoPedido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cartão de Crédito", "Cartão de Débito", "PIX", "Boleto" }));

        botaoGravarPedido.setText("Gravar");
        botaoGravarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoGravarPedidoActionPerformed(evt);
            }
        });

        botaoCancelarPedido.setText("Cancelar");
        botaoCancelarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarPedidoActionPerformed(evt);
            }
        });

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Endereço para entrega");

        botaoListarProdutosPedidos.setText("Listar");
        botaoListarProdutosPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoListarProdutosPedidosActionPerformed(evt);
            }
        });

        comboSelecionaCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Hardware", "Periféricos", "Computadores", "Monitores", "Cadeiras e Mesas", "Eletrônicos", "Notebooks e Portáteis", "Redes e Wireless" }));

        jLabel10.setText("Categoria");

        botaoInsereCarrinho.setText("Insere Carrinho");
        botaoInsereCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInsereCarrinhoActionPerformed(evt);
            }
        });

        tabelaListagemCarrinho.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tabelaListagemCarrinho);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Carrinho");

        botaoExcluirItemCarrinho.setText("Excluir");
        botaoExcluirItemCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirItemCarrinhoActionPerformed(evt);
            }
        });

        jLabel11.setText("Valor total do pedido");

        valorFinalPedido.setText("R$");

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoCancelarPedido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoGravarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(comboFormaPagamentoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel11))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(valorFinalPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jInternalFrame1Layout.createSequentialGroup()
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addGap(552, 552, 552)
                                        .addComponent(botaoExcluirItemCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSeparator1)
                                        .addComponent(jScrollPane1)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(jLabel10)
                                            .addGap(18, 18, 18)
                                            .addComponent(comboSelecionaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(botaoListarProdutosPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(entraQuantidadePedido, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(botaoInsereCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                                                .addGap(11, 11, 11)
                                                                .addComponent(jLabel6))
                                                            .addComponent(entraBairroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(21, 21, 21)
                                                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel7)
                                                            .addComponent(entraCidadePedido, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addComponent(entraRuaPedido))
                                                .addComponent(jLabel4))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(entraNumeroResidenciaPedido)
                                                .addComponent(comboUFPedido, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                                    .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel8)
                                                        .addComponent(jLabel5))
                                                    .addGap(0, 0, Short.MAX_VALUE)))))
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel3)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jSeparator5))
                        .addContainerGap())))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoListarProdutosPedidos)
                    .addComponent(comboSelecionaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(entraQuantidadePedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(botaoInsereCarrinho))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoExcluirItemCarrinho)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(entraRuaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(entraNumeroResidenciaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(entraCidadePedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(entraBairroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(56, 56, 56)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboUFPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboFormaPagamentoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorFinalPedido))
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoGravarPedido)
                    .addComponent(botaoCancelarPedido))
                .addContainerGap(23, Short.MAX_VALUE))
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

    private void botaoCancelarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarPedidoActionPerformed
        this.dispose();
        TelaMenuPrincipal telaMenuPrincipal = new TelaMenuPrincipal(cliente);
        telaMenuPrincipal.setVisible(true);
    }//GEN-LAST:event_botaoCancelarPedidoActionPerformed

    private void botaoListarProdutosPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoListarProdutosPedidosActionPerformed
        String tipoSelecionaCategoria = (String) comboSelecionaCategoria.getSelectedItem();
        boolean categoriaSelecionada = tipoSelecionaCategoria.equals("Todos");
        if (categoriaSelecionada == true) {
            listarProdutos();
        } else {
            listarProdutosCategoria();
        }
    }//GEN-LAST:event_botaoListarProdutosPedidosActionPerformed

    private void botaoInsereCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInsereCarrinhoActionPerformed
        try {
            int SelecionaProdutoEstoque = (int) tabelaListagemProdutos.getModel().getValueAt(tabelaListagemProdutos.getSelectedRow(), 0);
            Produtos ProdutoSelecionado = this.list.stream().filter(x -> x.getId() == SelecionaProdutoEstoque).findFirst().get();

            int ChecaQuantidadeEstoque = ProdutoSelecionado.getQuantidade();

            if (Integer.parseInt(entraQuantidadePedido.getValue().toString()) > ChecaQuantidadeEstoque || Integer.parseInt(entraQuantidadePedido.getValue().toString()) < 1) {
                JOptionPane.showMessageDialog(null, "Quantidade deste produto deve ser menor ou igual a " + ProdutoSelecionado.getQuantidade());
                return;
            }

            ProdutoSelecionado.setQuantidade(Integer.parseInt(entraQuantidadePedido.getValue().toString()));
            listaCompra.add(ProdutoSelecionado);
            listarVenda(tabelaListagemCarrinho, listaCompra);
            calculaValorTotal();

        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Selecione um produto.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_botaoInsereCarrinhoActionPerformed

    private void botaoExcluirItemCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirItemCarrinhoActionPerformed
        try {

            int SelecionaProdutoEstoque = (int) tabelaListagemCarrinho.getModel().getValueAt(tabelaListagemCarrinho.getSelectedRow(), 0);
            Produtos ProdutoSelecionado = this.listaCompra.stream().filter(x -> x.getId() == SelecionaProdutoEstoque).findFirst().get();
            Predicate<Produtos> isQualified = item -> item == ProdutoSelecionado;
            this.listaCompra.removeIf(isQualified);
            listarVenda(tabelaListagemCarrinho, listaCompra);
            calculaValorTotal();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_botaoExcluirItemCarrinhoActionPerformed

    private void botaoGravarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoGravarPedidoActionPerformed
                
        endereco.setRua(entraRuaPedido.getText());
        endereco.setNumero(Integer.parseInt(entraNumeroResidenciaPedido.getText()));
        endereco.setBairro(entraBairroPedido.getText());
        endereco.setCidade(entraCidadePedido.getText());
        endereco.setUf((String)comboUFPedido.getSelectedItem());
        
        try {
            EnderecoDAO enderecoDAO = new EnderecoDAO();
            
            enderecoDAO.cadastro(endereco);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao cadastrar endereço.");
        }
        
        pedidos.setFormaPagamento((String) comboFormaPagamentoPedido.getSelectedItem());
        pedidos.setValorTotal(valorTotalPedido);
        endereco.getId();
        
        try {
            PedidosDAO pedidosDAO = new PedidosDAO();
            
            pedidosDAO.cadastro(pedidos, endereco);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao cadastrar forma de pagamento.");
        }
        
        for (Produtos produtosCarrinho : listaCompra) {
            
            ProdutosPedidoDAO produtosPedidoDAO = new ProdutosPedidoDAO();
            ProdutosDAO produtosDAO = new ProdutosDAO();
            
            try {
                produtosPedidoDAO.cadastro(pedidos, produtosCarrinho);
                Produtos produtoEstoque = produtosDAO.buscarProdutosId(produtosCarrinho.getId());
                
                int atualizaQuantidade = produtoEstoque.getQuantidade() - produtosCarrinho.getQuantidade();
                produtosDAO.alteraQuantidadeProduto(produtoEstoque, atualizaQuantidade);
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Falha ao finalizar pedido.");
            }
            
        }
        
//        for (int i = 0; i < listaCompra.size(); i++) {
//            
//            ProdutosPedidoDAO produtosPedidoDAO = new ProdutosPedidoDAO();
//            
//            try {
//                produtosPedidoDAO.cadastro(pedidos, listaCompra.get(i));
//            } catch (Exception e) {
//                JOptionPane.showMessageDialog(null, "Falha ao finalizar pedido.");
//            }
//        }
        
        JOptionPane.showMessageDialog(null, "Pedido feito com sucesso - ID do Pedido: " + pedidos.getId());
        
        this.dispose();
        TelaMenuPrincipal telaMenuPrincipal = new TelaMenuPrincipal(cliente);
        telaMenuPrincipal.setVisible(true);
        
    }//GEN-LAST:event_botaoGravarPedidoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelarPedido;
    private javax.swing.JButton botaoExcluirItemCarrinho;
    private javax.swing.JButton botaoGravarPedido;
    private javax.swing.JButton botaoInsereCarrinho;
    private javax.swing.JButton botaoListarProdutosPedidos;
    private javax.swing.JComboBox<String> comboFormaPagamentoPedido;
    private javax.swing.JComboBox<String> comboSelecionaCategoria;
    private javax.swing.JComboBox<String> comboUFPedido;
    private javax.swing.JTextField entraBairroPedido;
    private javax.swing.JTextField entraCidadePedido;
    private javax.swing.JTextField entraNumeroResidenciaPedido;
    private javax.swing.JSpinner entraQuantidadePedido;
    private javax.swing.JTextField entraRuaPedido;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable tabelaListagemCarrinho;
    private javax.swing.JTable tabelaListagemProdutos;
    private javax.swing.JLabel valorFinalPedido;
    // End of variables declaration//GEN-END:variables
}
