package br.com.iftm.pv.cinema.cine3m.view.gerenciamento.funcionario;

import br.com.iftm.pv.cinema.cine3m.controller.GerenciaFuncionario;
import br.com.iftm.pv.cinema.cine3m.model.Funcionario;
import br.com.iftm.pv.cinema.cine3m.view.util.ListUtils;
import javax.swing.JList;

public class ConsultaFuncionario extends javax.swing.JInternalFrame {

    CadastroFuncionario cadastroFuncionario;
    GerenciaFuncionario gerenciaFuncionario;

    public ConsultaFuncionario(CadastroFuncionario cadastroFuncionario, GerenciaFuncionario gerenciaFuncionario) {
        initComponents();
        this.cadastroFuncionario = cadastroFuncionario;
        this.gerenciaFuncionario = gerenciaFuncionario;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnConsultarFuncionario = new javax.swing.JButton();
        lbTituloTelaCliente = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstFuncionarios = new javax.swing.JList<>();

        setClosable(true);

        btnConsultarFuncionario.setText("CONFIRMAR");
        btnConsultarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarFuncionarioActionPerformed(evt);
            }
        });

        lbTituloTelaCliente.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        lbTituloTelaCliente.setForeground(new java.awt.Color(204, 204, 204));
        lbTituloTelaCliente.setText("Consultar Funcionário");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(btnConsultarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTituloTelaCliente)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lbTituloTelaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConsultarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JList<Funcionario> getLstFuncionarios() {
        return lstFuncionarios;
    }

    private void btnConsultarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarFuncionarioActionPerformed
        Funcionario funcionarioSelecionado = (Funcionario) this.lstFuncionarios.getSelectedValue();
        cadastroFuncionario.getTfNomeFuncionario().setText(funcionarioSelecionado.getNome());
        cadastroFuncionario.getTfCpfFuncionario().setText(funcionarioSelecionado.getCpf());
        cadastroFuncionario.getTfLoginFuncionario().setText(funcionarioSelecionado.getLogin());
        cadastroFuncionario.getTfSenhaFuncionario().setText(funcionarioSelecionado.getSenha());

        cadastroFuncionario.getBtnCadastrarFuncionario().setVisible(false);
        cadastroFuncionario.getTfNomeFuncionario().setEditable(false);
        cadastroFuncionario.getTfCpfFuncionario().setEditable(false);
        cadastroFuncionario.getTfLoginFuncionario().setEditable(false);
        cadastroFuncionario.getTfSenhaFuncionario().setEditable(false);
        cadastroFuncionario.getLbTituloTelaFuncionario().setText("Consulta de Funcionário");
        getDesktopPane().add(cadastroFuncionario);
        cadastroFuncionario.setVisible(true);
    }//GEN-LAST:event_btnConsultarFuncionarioActionPerformed

    private void lstFuncionariosAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lstFuncionariosAncestorAdded
        ListUtils.carregarList(lstFuncionarios, gerenciaFuncionario.relatorio());
        if (!gerenciaFuncionario.relatorio().isEmpty()) {
            btnConsultarFuncionario.setEnabled(true);
            lstFuncionarios.setSelectedIndex(0);
        } else {
            btnConsultarFuncionario.setEnabled(false);
        }
    }//GEN-LAST:event_lstFuncionariosAncestorAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultarFuncionario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTituloTelaCliente;
    private javax.swing.JList<Funcionario> lstFuncionarios;
    // End of variables declaration//GEN-END:variables
}
