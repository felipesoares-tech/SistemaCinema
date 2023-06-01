package br.com.iftm.pv.cinema.cine3m.view.gerenciamento.funcionario;

import br.com.iftm.pv.cinema.cine3m.controller.GerenciaFuncionario;
import br.com.iftm.pv.cinema.cine3m.model.Funcionario;
import br.com.iftm.pv.cinema.cine3m.view.util.ListUtils;
import javax.swing.JList;

public class AtualizaFuncionario extends javax.swing.JInternalFrame {

    private CadastroFuncionario cadastroFuncionario;
    private GerenciaFuncionario gerenciaFuncionario;

    public AtualizaFuncionario(CadastroFuncionario cadastroFuncionario, GerenciaFuncionario gerenciaFuncionario) {
        initComponents();
        this.cadastroFuncionario = cadastroFuncionario;
        this.gerenciaFuncionario = gerenciaFuncionario;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAtualizarFuncionario = new javax.swing.JButton();
        lbTituloTelaCliente = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstFuncionarios = new javax.swing.JList<>();

        setClosable(true);

        btnAtualizarFuncionario.setText("Confirmar");
        btnAtualizarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarFuncionarioActionPerformed(evt);
            }
        });

        lbTituloTelaCliente.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        lbTituloTelaCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTituloTelaCliente.setText("Atualizar Funcionário");

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
        lstFuncionarios.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lstFuncionariosFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(lstFuncionarios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(btnAtualizarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTituloTelaCliente)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(lbTituloTelaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtualizarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JList<Funcionario> getLstFuncionarios() {
        return lstFuncionarios;
    }
    
    private void btnAtualizarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarFuncionarioActionPerformed
        Funcionario funcionarioSelecionado = (Funcionario) this.lstFuncionarios.getSelectedValue();
        this.cadastroFuncionario.getTfNomeFuncionario().setText(funcionarioSelecionado.getNome());
        this.cadastroFuncionario.getTfCpfFuncionario().setText(funcionarioSelecionado.getCpf());
        this.cadastroFuncionario.getTfLoginFuncionario().setText(funcionarioSelecionado.getLogin());
        this.cadastroFuncionario.getTfSenhaFuncionario().setText(funcionarioSelecionado.getSenha());
        this.cadastroFuncionario.getBtnCadastrarFuncionario().setText("Atualizar");
        this.cadastroFuncionario.getLbTituloTelaFuncionario().setText("Atualizar Funcionário");
        this.cadastroFuncionario.getBtnCadastrarFuncionario().setVisible(true);
        this.cadastroFuncionario.getTfNomeFuncionario().setEditable(true);
        this.cadastroFuncionario.getTfCpfFuncionario().setEditable(true);
        this.cadastroFuncionario.getTfLoginFuncionario().setEditable(true);
        this.cadastroFuncionario.getTfSenhaFuncionario().setEditable(true);
        this.cadastroFuncionario.setFuncionarioSelecionado(funcionarioSelecionado);
        getDesktopPane().add(cadastroFuncionario);
        this.cadastroFuncionario.setVisible(true);
    }//GEN-LAST:event_btnAtualizarFuncionarioActionPerformed

    private void lstFuncionariosAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lstFuncionariosAncestorAdded
        ListUtils.carregarList(lstFuncionarios, gerenciaFuncionario.relatorio());

        if (!gerenciaFuncionario.relatorio().isEmpty()) {
            btnAtualizarFuncionario.setEnabled(true);
            lstFuncionarios.setSelectedIndex(0);
        } else {
            btnAtualizarFuncionario.setEnabled(false);
        }
    }//GEN-LAST:event_lstFuncionariosAncestorAdded

    private void lstFuncionariosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lstFuncionariosFocusGained
        lstFuncionariosAncestorAdded(null);
    }//GEN-LAST:event_lstFuncionariosFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizarFuncionario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTituloTelaCliente;
    private javax.swing.JList<Funcionario> lstFuncionarios;
    // End of variables declaration//GEN-END:variables
}
