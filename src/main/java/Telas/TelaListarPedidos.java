/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import DAO.PedidosDAO;
import Model.Cliente;
import Model.Email;
import Model.Pedidos;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luis Gustavo
 */
public class TelaListarPedidos extends javax.swing.JFrame {

    DefaultTableModel model;
    private Cliente cliente;
    
    PedidosDAO pedidosDAO = new PedidosDAO();
    Email email = new Email(); 
    
    public TelaListarPedidos(Cliente cliente) {
        this.cliente = cliente;
        initComponents();
    }

    public void listar(int idPedido) {
        model = (DefaultTableModel) tabelaListagemPedidos.getModel();
        model.setRowCount(0);
        List<Pedidos> list = null;

        try {
            list = pedidosDAO.buscaId(idPedido);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        for (Pedidos pedidos : list)
            model.insertRow(model.getRowCount(), new Object[]{pedidos.getId(), pedidos.getProdutos().get(0).getNome(), pedidos.getProdutos().get(0).getQuantidade(), 
                pedidos.getProdutos().get(0).getValor(), pedidos.getEndereco().getRua(), pedidos.getEndereco().getNumero(), pedidos.getEndereco().getBairro(), 
                pedidos.getEndereco().getCidade(), pedidos.getEndereco().getUf(), pedidos.getFormaPagamento()});
        
    }
    
    public void sendMailProcess() {
        // Recipient's email ID needs to be mentioned.        
        String to = email.getEndereco();

        // Sender's email ID needs to be mentioned
        String from = "nextlevelsenac@gmail.com";

        // Setup mail server
        Properties properties = new Properties();
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.socketFactory.port", "465");
        properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.port", "465");

        // Get the Session object.// and pass 
        javax.mail.Session session = javax.mail.Session.getInstance(properties, new javax.mail.Authenticator() {

            protected PasswordAuthentication getPasswordAuthentication() {
                //e-Mail: testesautomatizadosndd@gmail.com
                //Senha: AutomaticNDDNFCe
                //Senha de APP: ncwrzmozfacjfiro

                return new PasswordAuthentication("nextlevelsenac@gmail.com", "ncwrzmozfacjfiro");

            }

        });
        //session.setDebug(true);

        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            // Set Subject: header field
            message.setSubject("Next Level Store - Seu pedido realizado com sucesso!");

            Multipart multipart = new MimeMultipart();

            MimeBodyPart attachmentPart = new MimeBodyPart();

            MimeBodyPart textPart = new MimeBodyPart();

//            try {

//                File f = new File(diretorioSelecionadoEntrada + "Massa_Gerada\\" + "Relatorio\\" + "Relatorio.txt");
//
//                attachmentPart.attachFile(f);
                textPart.setText("Obrigado por comprar conosco. Acompanhe nossas promoções nas redes sociais.");
                multipart.addBodyPart(textPart);
                multipart.addBodyPart(attachmentPart);

//            } catch (IOException e) {
//
//                e.printStackTrace();
//
//            }

            message.setContent(multipart);

            System.out.println("Enviando e-Mail...");
            // Send message
            Transport.send(message);
            System.out.println("e-Mail enviado com sucesso....");
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaListagemPedidos = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        botaoVoltarListagemPedidos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        entraIdPedido = new javax.swing.JTextField();
        botaoListarPedido = new javax.swing.JButton();
        botaoEnviarEmail = new javax.swing.JButton();
        entraEmailPedido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setBackground(new java.awt.Color(250, 250, 250));
        jInternalFrame1.setTitle("Next Level - Listagem Pedidos");
        jInternalFrame1.setVisible(true);

        tabelaListagemPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Produto", "Quantidade", "Valor Unitário", "Rua", "Número", "Bairro", "Cidade", "UF", "Forma de Pagamento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaListagemPedidos);

        botaoVoltarListagemPedidos.setText("Voltar");
        botaoVoltarListagemPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarListagemPedidosActionPerformed(evt);
            }
        });

        jLabel1.setText("ID do Pedido");

        botaoListarPedido.setText("Listar");
        botaoListarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoListarPedidoActionPerformed(evt);
            }
        });

        botaoEnviarEmail.setText("Enviar por e-Mail");
        botaoEnviarEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEnviarEmailActionPerformed(evt);
            }
        });

        jLabel2.setText("e-Mail");

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 858, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(entraIdPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoListarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(entraEmailPedido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoEnviarEmail)
                        .addGap(208, 208, 208)
                        .addComponent(botaoVoltarListagemPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoVoltarListagemPedidos)
                    .addComponent(jLabel1)
                    .addComponent(entraIdPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoListarPedido)
                    .addComponent(botaoEnviarEmail)
                    .addComponent(entraEmailPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(24, Short.MAX_VALUE))
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

    private void botaoVoltarListagemPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarListagemPedidosActionPerformed
        this.dispose();
        TelaMenuPrincipal telaMenuPrincipal = new TelaMenuPrincipal(cliente);
        telaMenuPrincipal.setVisible(true);
    }//GEN-LAST:event_botaoVoltarListagemPedidosActionPerformed

    private void botaoListarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoListarPedidoActionPerformed
        Pedidos pedidos = new Pedidos();
        
        String idPedido = (entraIdPedido.getText());
        
        if (idPedido.isEmpty() || idPedido.isBlank()) {
            JOptionPane.showMessageDialog(null, "É necessário informar o IP do Pedido.");
            return;
        }        
        
        listar(Integer.parseInt(idPedido));
        
    }//GEN-LAST:event_botaoListarPedidoActionPerformed

    private void botaoEnviarEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEnviarEmailActionPerformed
        email.setEndereco(entraEmailPedido.getText());
        sendMailProcess();
    }//GEN-LAST:event_botaoEnviarEmailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEnviarEmail;
    private javax.swing.JButton botaoListarPedido;
    private javax.swing.JButton botaoVoltarListagemPedidos;
    private javax.swing.JTextField entraEmailPedido;
    private javax.swing.JTextField entraIdPedido;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tabelaListagemPedidos;
    // End of variables declaration//GEN-END:variables
}
