package br.com.iftm.pv.cinema.cine3m.view.gerenciamento.sala;

import br.com.iftm.pv.cinema.cine3m.controller.GerenciaSala;
import br.com.iftm.pv.cinema.cine3m.model.Sala;
import br.com.iftm.pv.cinema.cine3m.view.util.ListUtils;
import javax.swing.JList;

public class AtualizaSala extends javax.swing.JInternalFrame {

    private CadastroSala cadastroSala;
    private GerenciaSala gerenciaSala;

    public AtualizaSala(CadastroSala cadastroSala, GerenciaSala gerenciaSala) {
        initComponents();
        this.cadastroSala = cadastroSala;
        this.gerenciaSala = gerenciaSala;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTituloTelaCliente = new javax.swing.JLabel();
        btnAtualizarSala = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstSalas = new javax.swing.JList<>();

        setClosable(true);

        lbTituloTelaCliente.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        lbTituloTelaCliente.setForeground(new java.awt.Color(204, 204, 204));
        lbTituloTelaCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTituloTelaCliente.setText("Atualizar Sala");

        btnAtualizarSala.setText("CONFIRMAR");
        btnAtualizarSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarSalaActionPerformed(evt);
            }
        });

        lstSalas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstSalas.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lstSalasAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(lstSalas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTituloTelaCliente)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(btnAtualizarSala, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(lbTituloTelaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAtualizarSala, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JList<Sala> getLstSalas() {
        return lstSalas;
    }

    private void btnAtualizarSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarSalaActionPerformed
        Sala salaSelecionada = (Sala) this.lstSalas.getSelectedValue();
        this.cadastroSala.getTfNomeSala().setText(salaSelecionada.getNome());
        this.cadastroSala.getJsCapacidade().setValue(salaSelecionada.getCapacidade());
        this.cadastroSala.getBtnCadastrarSala().setText("ATUALIZAR");
        this.cadastroSala.getLbTituloTelaSala().setText("Atualização de Sala");
        this.cadastroSala.getJsCapacidade().setEnabled(true);
        this.cadastroSala.getBtnCadastrarSala().setVisible(true);
        this.cadastroSala.getTfNomeSala().setEditable(true);
        this.cadastroSala.setSalaSelecionada(salaSelecionada);
        getDesktopPane().add(cadastroSala);
        this.cadastroSala.setVisible(true);
    }//GEN-LAST:event_btnAtualizarSalaActionPerformed

    private void lstSalasAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lstSalasAncestorAdded
        ListUtils.carregarList(lstSalas, gerenciaSala.relatorio());

        if (!gerenciaSala.relatorio().isEmpty()) {
            btnAtualizarSala.setEnabled(true);
            lstSalas.setSelectedIndex(0);
        } else {
            btnAtualizarSala.setEnabled(false);
        }
    }//GEN-LAST:event_lstSalasAncestorAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizarSala;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTituloTelaCliente;
    private javax.swing.JList<Sala> lstSalas;
    // End of variables declaration//GEN-END:variables
}
