/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.iftm.pv.cinema.cine3m.view.gerenciamento.filme;

import br.com.iftm.pv.cinema.cine3m.controller.GerenciaFilme;
import br.com.iftm.pv.cinema.cine3m.model.Filme;
import br.com.iftm.pv.cinema.cine3m.view.gerenciamento.util.ListUtils;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author hyanl
 */
public class ApagaFilme extends javax.swing.JInternalFrame {

    private GerenciaFilme gerenciaFilme;

    public ApagaFilme(GerenciaFilme gerenciaFilme) {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        lstFilmes = new javax.swing.JList<>();
        btnConfirmarApagaFilme = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        btnConfirmarApagaFilme.setText("Apagar");
        btnConfirmarApagaFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarApagaFilmeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(btnConfirmarApagaFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnConfirmarApagaFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lstFilmesAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lstFilmesAncestorAdded
        ListUtils.carregarList(lstFilmes, gerenciaFilme.relatorio());
    }//GEN-LAST:event_lstFilmesAncestorAdded

    private void btnConfirmarApagaFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarApagaFilmeActionPerformed
        List<Filme> filmesSelecionados = lstFilmes.getSelectedValuesList();
        Iterator<Filme> iterator = filmesSelecionados.iterator();

        int cont = 0;

        Integer resp = JOptionPane.showConfirmDialog(rootPane, "Tem certeza que deseja apagar ??",
                "Apagar Filme", WIDTH, JOptionPane.WARNING_MESSAGE);

        if (resp.equals(JOptionPane.OK_OPTION)) {
            while (iterator.hasNext()) {
                gerenciaFilme.remover((Filme) iterator.next());
                cont++;
            }
            lstFilmesAncestorAdded(null);
            JOptionPane.showMessageDialog(this, String.format("Filmes removidos: %d", cont), "Remover", JOptionPane.PLAIN_MESSAGE);
        }

    }//GEN-LAST:event_btnConfirmarApagaFilmeActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmarApagaFilme;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Filme> lstFilmes;
    // End of variables declaration//GEN-END:variables
}
