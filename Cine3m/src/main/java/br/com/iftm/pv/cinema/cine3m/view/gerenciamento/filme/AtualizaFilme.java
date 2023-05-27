/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.iftm.pv.cinema.cine3m.view.gerenciamento.filme;

import br.com.iftm.pv.cinema.cine3m.controller.GerenciaFilme;
import br.com.iftm.pv.cinema.cine3m.model.Filme;
import br.com.iftm.pv.cinema.cine3m.view.gerenciamento.util.ComboBoxUtils;

/**
 *
 * @author hyanl
 */
public class AtualizaFilme extends javax.swing.JInternalFrame {

    CadastroFilme cadastroFilme;
    GerenciaFilme gerenciaFilme;

    public AtualizaFilme(CadastroFilme cadastroFilme, GerenciaFilme gerenciaFilme) {
        this.cadastroFilme = cadastroFilme;
        this.gerenciaFilme = gerenciaFilme;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAtualizarFilme = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbFilme = new javax.swing.JComboBox<>();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnAtualizarFilme.setText("Confirmar");
        btnAtualizarFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarFilmeActionPerformed(evt);
            }
        });

        jLabel1.setText("Filmes:");

        cbFilme.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                cbFilmeAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        cbFilme.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cbFilmeFocusGained(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addComponent(btnAtualizarFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbFilme, 0, 287, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(btnAtualizarFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtualizarFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarFilmeActionPerformed
        Filme filmeSelecionado = (Filme) this.cbFilme.getSelectedItem();
        this.cadastroFilme.getTfNomeFilme().setText(filmeSelecionado.getNome());
        this.cadastroFilme.getTfDiretor().setText(filmeSelecionado.getDiretor());
        this.cadastroFilme.getCbGenero().setSelectedItem(filmeSelecionado.getGenero());
        this.cadastroFilme.getTfaDescricao().setText(filmeSelecionado.getDescricao());
        this.cadastroFilme.getLbTituloTelaFilme().setText("Atualização de Filme");
        this.cadastroFilme.getBtnConfirmar().setText("Atualizar");
        this.cadastroFilme.getBtnConfirmar().setVisible(true);
        this.cadastroFilme.getTfNomeFilme().setEditable(true);
        this.cadastroFilme.getTfDiretor().setEditable(true);
        this.cadastroFilme.getCbGenero().setEnabled(true);
        this.cadastroFilme.getTfaDescricao().setEditable(true);
        this.cadastroFilme.setFilmeSelecionado(filmeSelecionado);
        getDesktopPane().add(cadastroFilme);
        this.cadastroFilme.setVisible(true);
    }//GEN-LAST:event_btnAtualizarFilmeActionPerformed

    private void cbFilmeAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_cbFilmeAncestorAdded
        ComboBoxUtils.carregarComboBox(cbFilme, gerenciaFilme.relatorio());
    }//GEN-LAST:event_cbFilmeAncestorAdded

    private void cbFilmeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbFilmeFocusGained
        cbFilmeAncestorAdded(null);
    }//GEN-LAST:event_cbFilmeFocusGained

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizarFilme;
    private javax.swing.JComboBox<Filme> cbFilme;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
