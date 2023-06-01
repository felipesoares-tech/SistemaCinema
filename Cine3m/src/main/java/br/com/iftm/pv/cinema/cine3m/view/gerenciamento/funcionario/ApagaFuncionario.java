package br.com.iftm.pv.cinema.cine3m.view.gerenciamento.funcionario;

import br.com.iftm.pv.cinema.cine3m.controller.GerenciaFuncionario;
import br.com.iftm.pv.cinema.cine3m.model.Funcionario;
import br.com.iftm.pv.cinema.cine3m.model.Pessoa;
import br.com.iftm.pv.cinema.cine3m.view.util.ListUtils;
import java.util.List;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class ApagaFuncionario extends javax.swing.JInternalFrame {

    private GerenciaFuncionario gerenciaFuncionario;
    private List<Funcionario> funcionarios;
    private Funcionario admin;
    private Funcionario funcionarioLogado;

    public ApagaFuncionario(GerenciaFuncionario gerenciaFuncionario, Funcionario admin) {
        initComponents();
        this.admin = admin;
        this.gerenciaFuncionario = gerenciaFuncionario;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstFuncionarios = new javax.swing.JList<>();
        btnConfirmarApagaFuncionario = new javax.swing.JButton();
        lbTituloTelaCliente = new javax.swing.JLabel();

        setClosable(true);

        lstFuncionarios.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstFuncionarios.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lstFuncionariosAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(lstFuncionarios);

        btnConfirmarApagaFuncionario.setText("APAGAR");
        btnConfirmarApagaFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarApagaFuncionarioActionPerformed(evt);
            }
        });

        lbTituloTelaCliente.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        lbTituloTelaCliente.setForeground(new java.awt.Color(204, 204, 204));
        lbTituloTelaCliente.setText("Apagar Funcionário");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(btnConfirmarApagaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTituloTelaCliente)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(lbTituloTelaCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConfirmarApagaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JList<Pessoa> getLstFuncionarios() {
        return lstFuncionarios;
    }

    private void lstFuncionariosAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lstFuncionariosAncestorAdded
        funcionarios = gerenciaFuncionario.relatorio();
        ListUtils.carregarList(lstFuncionarios, funcionarios);

        if (!funcionarios.isEmpty()) {
            btnConfirmarApagaFuncionario.setEnabled(true);
            lstFuncionarios.setSelectedIndex(0);
        } else {
            btnConfirmarApagaFuncionario.setEnabled(false);
        }
    }//GEN-LAST:event_lstFuncionariosAncestorAdded

    private void btnConfirmarApagaFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarApagaFuncionarioActionPerformed
        Funcionario funcionarioSelecionado = (Funcionario) lstFuncionarios.getSelectedValue();
        if (funcionarioSelecionado.equals(admin)) {
            JOptionPane.showMessageDialog(this, "Não é possível remover admin! ",
                    "Admin", JOptionPane.ERROR_MESSAGE);
        } else if (funcionarioSelecionado.equals(funcionarioLogado)) {
            JOptionPane.showMessageDialog(this, "Não é possível remover o usuário logado! ",
                    "Usuário", JOptionPane.ERROR_MESSAGE);
        } else {
            Integer resp = JOptionPane.showConfirmDialog(rootPane, "Tem certeza que deseja apagar ??",
                    "Apagar Funcionário", WIDTH, JOptionPane.WARNING_MESSAGE);

            if (resp.equals(JOptionPane.OK_OPTION)) {
                gerenciaFuncionario.remover(funcionarioSelecionado);
                lstFuncionariosAncestorAdded(null);
                JOptionPane.showMessageDialog(this, "Funcionário removido", "Remover", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnConfirmarApagaFuncionarioActionPerformed

    public void setFuncionarioLogado(Funcionario funcionarioLogado) {
        this.funcionarioLogado = funcionarioLogado;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmarApagaFuncionario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTituloTelaCliente;
    private javax.swing.JList<Pessoa> lstFuncionarios;
    // End of variables declaration//GEN-END:variables
}
