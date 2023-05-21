/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.com.iftm.pv.cinema.cine3m.view.gerenciamento.funcionario;

import br.com.iftm.pv.cinema.cine3m.controller.GerenciaFuncionario;
import br.com.iftm.pv.cinema.cine3m.model.Funcionario;
import br.com.iftm.pv.cinema.cine3m.view.gerenciamento.util.ComboBoxUtils;
import br.com.iftm.pv.cinema.cine3m.model.Pessoa;
import javax.swing.JDesktopPane;

/**
 *
 * @author Felipe Soares
 */
public class AtualizaFuncionario extends javax.swing.JInternalFrame {

    private CadastroFuncionario cadastroFuncionario;
    private GerenciaFuncionario gerenciaFuncionario;
    private JDesktopPane jdp;

    public AtualizaFuncionario(CadastroFuncionario cadastroFuncionario, GerenciaFuncionario gerenciaFuncionario, JDesktopPane jdp) {
        initComponents();
        this.cadastroFuncionario = cadastroFuncionario;
        this.gerenciaFuncionario = gerenciaFuncionario;
        this.jdp = jdp;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbFuncionario2 = new javax.swing.JLabel();
        cbFuncionario2 = new javax.swing.JComboBox<>();
        btnAtualizarFuncionario = new javax.swing.JButton();
        lbTituloTelaCliente = new javax.swing.JLabel();

        setClosable(true);

        lbFuncionario2.setForeground(new java.awt.Color(255, 255, 255));
        lbFuncionario2.setText("Funcionarios:");

        cbFuncionario2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                cbFuncionario2AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        cbFuncionario2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cbFuncionario2FocusGained(evt);
            }
        });

        btnAtualizarFuncionario.setText("Confirmar");
        btnAtualizarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarFuncionarioActionPerformed(evt);
            }
        });

        lbTituloTelaCliente.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        lbTituloTelaCliente.setText("Atualiza Funcionarios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(lbTituloTelaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbFuncionario2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbFuncionario2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(btnAtualizarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTituloTelaCliente)
                .addGap(27, 27, 27)
                .addComponent(lbFuncionario2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbFuncionario2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnAtualizarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbFuncionario2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_cbFuncionario2AncestorAdded
        ComboBoxUtils.carregarComboBox(cbFuncionario2, gerenciaFuncionario.relatorio());
    }//GEN-LAST:event_cbFuncionario2AncestorAdded

    private void btnAtualizarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarFuncionarioActionPerformed
        Funcionario funcionarioSelecionado = (Funcionario) this.cbFuncionario2.getSelectedItem();
        this.cadastroFuncionario.getTfNomeFuncionario().setText(funcionarioSelecionado.getNome());
        this.cadastroFuncionario.getTfCpfFuncionario().setText(funcionarioSelecionado.getCpf());
        this.cadastroFuncionario.getTfLoginFuncionario().setText(funcionarioSelecionado.getLogin());
        this.cadastroFuncionario.getTfSenhaFuncionario().setText(funcionarioSelecionado.getSenha());
        this.cadastroFuncionario.getBtnCadastrarFuncionario().setText("Atualizar");
        this.cadastroFuncionario.getBtnCadastrarFuncionario().setVisible(true);
        this.cadastroFuncionario.getTfNomeFuncionario().setEditable(true);
        this.cadastroFuncionario.getTfCpfFuncionario().setEditable(true);
        this.cadastroFuncionario.getTfLoginFuncionario().setEditable(true);
        this.cadastroFuncionario.getTfSenhaFuncionario().setEditable(true);
        this.cadastroFuncionario.setFuncionarioSelecionado(funcionarioSelecionado);
        this.jdp.add(cadastroFuncionario);
        this.cadastroFuncionario.setVisible(true);
    }//GEN-LAST:event_btnAtualizarFuncionarioActionPerformed

    private void cbFuncionario2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbFuncionario2FocusGained
        cbFuncionario2AncestorAdded(null);
    }//GEN-LAST:event_cbFuncionario2FocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizarFuncionario;
    private javax.swing.JComboBox<Pessoa> cbFuncionario2;
    private javax.swing.JLabel lbFuncionario2;
    private javax.swing.JLabel lbTituloTelaCliente;
    // End of variables declaration//GEN-END:variables
}
