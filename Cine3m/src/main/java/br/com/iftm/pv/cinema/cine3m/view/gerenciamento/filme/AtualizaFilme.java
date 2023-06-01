package br.com.iftm.pv.cinema.cine3m.view.gerenciamento.filme;

import br.com.iftm.pv.cinema.cine3m.controller.GerenciaFilme;
import br.com.iftm.pv.cinema.cine3m.model.Filme;
import br.com.iftm.pv.cinema.cine3m.view.util.ListUtils;
import javax.swing.JList;

public class AtualizaFilme extends javax.swing.JInternalFrame {

    CadastroFilme cadastroFilme;
    GerenciaFilme gerenciaFilme;

    public AtualizaFilme(CadastroFilme cadastroFilme, GerenciaFilme gerenciaFilme) {
        this.cadastroFilme = cadastroFilme;
        this.gerenciaFilme = gerenciaFilme;
        initComponents();
    }

    public JList<Filme> getLstFilmes() {
        return lstFilmes;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAtualizarFilme = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstFilmes = new javax.swing.JList<>();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnAtualizarFilme.setText("CONFIRMAR");
        btnAtualizarFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarFilmeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Atualizar Filme");

        lstFilmes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstFilmes.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lstFilmesAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        lstFilmes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lstFilmesFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(lstFilmes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAtualizarFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(208, 208, 208))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtualizarFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtualizarFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarFilmeActionPerformed
        Filme filmeSelecionado = (Filme) this.lstFilmes.getSelectedValue();
        this.cadastroFilme.getTfNomeFilme().setText(filmeSelecionado.getNome());
        this.cadastroFilme.getTfDiretor().setText(filmeSelecionado.getDiretor());
        this.cadastroFilme.getCbGenero().setSelectedItem(filmeSelecionado.getGenero());
        this.cadastroFilme.getTfaDescricao().setText(filmeSelecionado.getDescricao());
        this.cadastroFilme.getLbTituloTelaFilme().setText("Atualização de Filme");
        this.cadastroFilme.getBtnConfirmar().setText("ATUALIZAR");
        this.cadastroFilme.getBtnConfirmar().setVisible(true);
        this.cadastroFilme.getTfNomeFilme().setEditable(true);
        this.cadastroFilme.getTfDiretor().setEditable(true);
        this.cadastroFilme.getCbGenero().setEnabled(true);
        this.cadastroFilme.getTfaDescricao().setEditable(true);
        this.cadastroFilme.setFilmeSelecionado(filmeSelecionado);
        getDesktopPane().add(cadastroFilme);
        this.cadastroFilme.setVisible(true);
    }//GEN-LAST:event_btnAtualizarFilmeActionPerformed

    private void lstFilmesAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lstFilmesAncestorAdded
        ListUtils.carregarList(lstFilmes, gerenciaFilme.relatorio());
        if (!gerenciaFilme.relatorio().isEmpty()) {
            btnAtualizarFilme.setEnabled(true);
            lstFilmes.setSelectedIndex(0);
        } else {
            btnAtualizarFilme.setEnabled(false);
        }
    }//GEN-LAST:event_lstFilmesAncestorAdded

    private void lstFilmesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lstFilmesFocusGained
        lstFilmesAncestorAdded(null);
    }//GEN-LAST:event_lstFilmesFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizarFilme;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Filme> lstFilmes;
    // End of variables declaration//GEN-END:variables
}
