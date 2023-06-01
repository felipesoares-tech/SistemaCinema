package br.com.iftm.pv.cinema.cine3m.view.gerenciamento.venda;

import br.com.iftm.pv.cinema.cine3m.controller.GerenciaCliente;
import br.com.iftm.pv.cinema.cine3m.controller.GerenciaVenda;
import br.com.iftm.pv.cinema.cine3m.model.ItemVenda;
import br.com.iftm.pv.cinema.cine3m.controller.GerenciaSessao;
import br.com.iftm.pv.cinema.cine3m.model.Sessao;
import br.com.iftm.pv.cinema.cine3m.view.gerenciamento.venda.auxiliares.ConfirmaCompra;
import br.com.iftm.pv.cinema.cine3m.view.gerenciamento.venda.auxiliares.ConsultaPoltronas;
import br.com.iftm.pv.cinema.cine3m.view.gerenciamento.sessao.CadastroSessao;
import br.com.iftm.pv.cinema.cine3m.view.util.ComboBoxUtils;
import br.com.iftm.pv.cinema.cine3m.view.gerenciamento.cliente.CadastroCliente;
import br.com.iftm.pv.cinema.cine3m.view.gerenciamento.venda.auxiliares.VincularCliente;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class CadastroVenda extends javax.swing.JInternalFrame {

    private ConsultaPoltronas consultaPoltronas;
    private ConfirmaCompra confirmaCompra;
    private final GerenciaVenda gerenciaIngresso;
    private final GerenciaSessao gerenciaSessao;
    private CadastroSessao cadastroSessao;
    private final CadastroCliente cadastroCliente;
    private final VincularCliente vincularCliente;

    public JTextField getTfClienteSelecionado() {
        return tfClienteSelecionado;
    }

    public void setTfClienteSelecionado(JTextField tfClienteSelecionado) {
        this.tfClienteSelecionado = tfClienteSelecionado;
    }

    public CadastroVenda(GerenciaVenda gerenciaIngresso, GerenciaSessao gerenciaSessao, GerenciaCliente gerenciaCliente, CadastroSessao cadastroSessao, CadastroCliente cadastroCliente) {
        initComponents();
        this.btnContinuarCompra.setEnabled(false);
        this.gerenciaIngresso = gerenciaIngresso;
        this.gerenciaSessao = gerenciaSessao;
        this.cadastroSessao = cadastroSessao;
        this.cadastroCliente = cadastroCliente;
        this.vincularCliente = new VincularCliente(gerenciaCliente, this);
    }

    public ConsultaPoltronas getConsultaPoltronas() {
        return consultaPoltronas;
    }

    public void setConsultaPoltronas(ConsultaPoltronas consultaPoltronas) {
        this.consultaPoltronas = consultaPoltronas;
    }

    public ConfirmaCompra getConfirmaCompra() {
        return confirmaCompra;
    }

    public void setConfirmaCompra(ConfirmaCompra confirmaCompra) {
        this.confirmaCompra = confirmaCompra;
    }

    public CadastroSessao getCadastroSessao() {
        return cadastroSessao;
    }

    public void setCadastroSessao(CadastroSessao cadastroSessao) {
        this.cadastroSessao = cadastroSessao;
    }

    public JButton getBtnConsultarPoltrona() {
        return btnSelecionarPoltrona;
    }

    public void setBtnConsultarPoltrona(JButton btnConsultarPoltrona) {
        this.btnSelecionarPoltrona = btnConsultarPoltrona;
    }

    public JButton getBtnContinuarCompra() {
        return btnContinuarCompra;
    }

    public void setBtnContinuarCompra(JButton btnContinuarCompra) {
        this.btnContinuarCompra = btnContinuarCompra;
    }

    public JComboBox<Sessao> getCbSessaoVenda() {
        return cbSessaoVenda;
    }

    public void setCbSessaoVenda(JComboBox<Sessao> cbSessaoVenda) {
        this.cbSessaoVenda = cbSessaoVenda;
    }

    public JButton getjButton1() {
        return jButton1;
    }

    public void setjButton1(JButton jButton1) {
        this.jButton1 = jButton1;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JList<ItemVenda> getjList1() {
        return listItensIngresso;
    }

    public void setjList1(JList<ItemVenda> jList1) {
        this.listItensIngresso = jList1;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnVincularCliente = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnSelecionarPoltrona = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfClienteSelecionado = new javax.swing.JTextField();
        cbSessaoVenda = new javax.swing.JComboBox<>();
        lbTituloTelaCliente = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listItensIngresso = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        btnContinuarCompra = new javax.swing.JButton();

        setClosable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        btnVincularCliente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnVincularCliente.setText("Vincular Cliente");
        btnVincularCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVincularClienteActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setText("Cadastrar Cliente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnSelecionarPoltrona.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSelecionarPoltrona.setText("Selecionar Poltrona");
        btnSelecionarPoltrona.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                btnSelecionarPoltronaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        btnSelecionarPoltrona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarPoltronaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSelecionarPoltrona, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVincularCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSelecionarPoltrona)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(btnVincularCliente)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Sessão");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Cliente");

        tfClienteSelecionado.setEditable(false);

        cbSessaoVenda.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                cbSessaoVendaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        cbSessaoVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSessaoVendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
            .addComponent(cbSessaoVenda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
            .addComponent(tfClienteSelecionado, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbSessaoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(tfClienteSelecionado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(606, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(217, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(24, Short.MAX_VALUE)))
        );

        lbTituloTelaCliente.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        lbTituloTelaCliente.setText("Cadastro de Vendas");

        jScrollPane1.setViewportView(listItensIngresso);

        jLabel3.setText("Ingresso :");

        btnContinuarCompra.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnContinuarCompra.setText("CONTINUAR");
        btnContinuarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarCompraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 542, Short.MAX_VALUE)
                        .addComponent(btnContinuarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(btnContinuarCompra))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(lbTituloTelaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lbTituloTelaCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbSessaoVendaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_cbSessaoVendaAncestorAdded
        ComboBoxUtils.carregarComboBox(cbSessaoVenda, gerenciaSessao.relatorio());
    }//GEN-LAST:event_cbSessaoVendaAncestorAdded

    private void cbSessaoVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSessaoVendaActionPerformed
        DefaultListModel<ItemVenda> model = new DefaultListModel<>();
        this.listItensIngresso.setModel(model);
        this.consultaPoltronas = null;


    }//GEN-LAST:event_cbSessaoVendaActionPerformed

    private void btnSelecionarPoltronaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_btnSelecionarPoltronaAncestorAdded
        if (gerenciaSessao.relatorio().isEmpty()) {
            btnSelecionarPoltrona.setEnabled(false);
        } else {
            btnSelecionarPoltrona.setEnabled(true);
        }
    }//GEN-LAST:event_btnSelecionarPoltronaAncestorAdded

    private void btnSelecionarPoltronaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarPoltronaActionPerformed
        Sessao sessaoSelecionada = (Sessao) cbSessaoVenda.getSelectedItem();
        if (this.consultaPoltronas == null) {
            this.consultaPoltronas = new ConsultaPoltronas(this, gerenciaSessao, sessaoSelecionada);
        }
        getDesktopPane().add(consultaPoltronas);
        consultaPoltronas.setVisible(true);
    }//GEN-LAST:event_btnSelecionarPoltronaActionPerformed

    private void btnContinuarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarCompraActionPerformed
        Sessao sessaoSelecionada = (Sessao) cbSessaoVenda.getSelectedItem();
        this.confirmaCompra = new ConfirmaCompra(listItensIngresso, sessaoSelecionada, vincularCliente, gerenciaSessao, consultaPoltronas, this, gerenciaIngresso);
        getDesktopPane().add(confirmaCompra);
        this.confirmaCompra.setVisible(true);
    }//GEN-LAST:event_btnContinuarCompraActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        getDesktopPane().add(cadastroCliente);
        this.cadastroCliente.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnVincularClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVincularClienteActionPerformed
        getDesktopPane().add(vincularCliente);
        vincularCliente.setVisible(true);
    }//GEN-LAST:event_btnVincularClienteActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        getTfClienteSelecionado().setText("");
        vincularCliente.setClienteSelecionado(null);
    }//GEN-LAST:event_formInternalFrameClosed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuarCompra;
    private javax.swing.JButton btnSelecionarPoltrona;
    private javax.swing.JButton btnVincularCliente;
    private javax.swing.JComboBox<Sessao> cbSessaoVenda;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbTituloTelaCliente;
    private javax.swing.JList<br.com.iftm.pv.cinema.cine3m.model.ItemVenda> listItensIngresso;
    private javax.swing.JTextField tfClienteSelecionado;
    // End of variables declaration//GEN-END:variables
}
