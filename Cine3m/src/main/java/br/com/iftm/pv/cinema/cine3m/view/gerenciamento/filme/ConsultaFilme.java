package br.com.iftm.pv.cinema.cine3m.view.gerenciamento.filme;

import br.com.iftm.pv.cinema.cine3m.controller.GerenciaFilme;
import br.com.iftm.pv.cinema.cine3m.model.Filme;
import br.com.iftm.pv.cinema.cine3m.view.util.ListUtils;
import javax.swing.JList;

public class ConsultaFilme extends javax.swing.JInternalFrame {

    private GerenciaFilme gerenciaFilme;
    private CadastroFilme cadastroFilme;

    public ConsultaFilme(CadastroFilme cadastroFilme, GerenciaFilme gerenciaFilme) {
        initComponents();
        this.cadastroFilme = cadastroFilme;
        this.gerenciaFilme = gerenciaFilme;
    }

    public JList<Filme> getLstFilmes() {
        return lstFilmes;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTituloTelaCliente = new javax.swing.JLabel();
        btnConsultarFilme = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstFilmes = new javax.swing.JList<>();

        setClosable(true);

        lbTituloTelaCliente.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        lbTituloTelaCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTituloTelaCliente.setText("Consultar Filmes");

        btnConsultarFilme.setText("Confirmar");
        btnConsultarFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarFilmeActionPerformed(evt);
            }
        });

        lstFilmes.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lstFilmesAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(lstFilmes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(btnConsultarFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTituloTelaCliente)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(lbTituloTelaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConsultarFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarFilmeActionPerformed
        Filme filmeSelecionado = (Filme) lstFilmes.getSelectedValue();
        this.cadastroFilme.setFilmeSelecionado(filmeSelecionado);
        this.cadastroFilme.getTfNomeFilme().setText(filmeSelecionado.getNome());
        this.cadastroFilme.getTfDiretor().setText(filmeSelecionado.getDiretor());
        this.cadastroFilme.getTfaDescricao().setText(filmeSelecionado.getDescricao());
        this.cadastroFilme.getLbTituloTelaFilme().setText("Consulta de Filme");
        this.cadastroFilme.getBtnConfirmar().setVisible(false);
        this.cadastroFilme.getTfNomeFilme().setEditable(false);
        this.cadastroFilme.getTfDiretor().setEditable(false);
        this.cadastroFilme.getTfaDescricao().setEditable(false);
        this.cadastroFilme.getCbGenero().setSelectedItem(filmeSelecionado.getGenero());
        this.cadastroFilme.getCbGenero().setEnabled(false);
        getDesktopPane().add(cadastroFilme);
        this.cadastroFilme.setVisible(true);
    }//GEN-LAST:event_btnConsultarFilmeActionPerformed

    private void lstFilmesAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lstFilmesAncestorAdded
        ListUtils.carregarList(lstFilmes, gerenciaFilme.relatorio());
        if (!gerenciaFilme.relatorio().isEmpty()) {
            btnConsultarFilme.setEnabled(true);
            lstFilmes.setSelectedIndex(0);
        } else {
            btnConsultarFilme.setEnabled(false);
        }
    }//GEN-LAST:event_lstFilmesAncestorAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultarFilme;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTituloTelaCliente;
    private javax.swing.JList<Filme> lstFilmes;
    // End of variables declaration//GEN-END:variables
}
