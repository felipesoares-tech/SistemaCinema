/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.com.iftm.pv.cinema.cine3m.view.gerenciamento.sala;

import br.com.iftm.pv.cinema.cine3m.controller.GerenciaSala;
import br.com.iftm.pv.cinema.cine3m.model.Sala;
import br.com.iftm.pv.cinema.cine3m.view.gerenciamento.util.ValidaCampo;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Felipe Soares
 */
public class CadastroSala extends javax.swing.JInternalFrame {

    private GerenciaSala gerenciaSala;
    private Sala salaSelecionada;

    public CadastroSala(GerenciaSala gerenciaSala) {
        initComponents();
        this.gerenciaSala = gerenciaSala;
    }

    public Sala getSalaSelecionada() {
        return salaSelecionada;
    }

    public void setSalaSelecionada(Sala salaSelecionada) {
        this.salaSelecionada = salaSelecionada;
    }

    public JButton getBtnCadastrarSala() {
        return btnCadastrarSala;
    }

    public void setBtnCadastrarSala(JButton btnCadastrarSala) {
        this.btnCadastrarSala = btnCadastrarSala;
    }

    public JComboBox<String> getCbCapacidade() {
        return cbCapacidade;
    }

    public void setCbCapacidade(JComboBox<String> cbCapacidade) {
        this.cbCapacidade = cbCapacidade;
    }

    public JLabel getLbSalaCapacidade() {
        return lbSalaCapacidade;
    }

    public void setLbSalaCapacidade(JLabel lbSalaCapacidade) {
        this.lbSalaCapacidade = lbSalaCapacidade;
    }

    public JLabel getLbSalaNome() {
        return lbSalaNome;
    }

    public void setLbSalaNome(JLabel lbSalaNome) {
        this.lbSalaNome = lbSalaNome;
    }

    public JLabel getLbTituloTelaCliente() {
        return lbTituloTelaCliente;
    }

    public void setLbTituloTelaCliente(JLabel lbTituloTelaCliente) {
        this.lbTituloTelaCliente = lbTituloTelaCliente;
    }

    public JTextField getTfNomeSala() {
        return tfNomeSala;
    }

    public void setTfNomeSala(JTextField tfNomeSala) {
        this.tfNomeSala = tfNomeSala;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTituloTelaCliente = new javax.swing.JLabel();
        lbSalaCapacidade = new javax.swing.JLabel();
        cbCapacidade = new javax.swing.JComboBox<>();
        lbSalaNome = new javax.swing.JLabel();
        btnCadastrarSala = new javax.swing.JButton();
        tfNomeSala = new javax.swing.JTextField();

        setClosable(true);

        lbTituloTelaCliente.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        lbTituloTelaCliente.setText("Cadastro de salas");

        lbSalaCapacidade.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbSalaCapacidade.setText("Capacidade");

        cbCapacidade.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cbCapacidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "30", "40", "50" }));

        lbSalaNome.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbSalaNome.setText("Nome");

        btnCadastrarSala.setText("Cadastrar");
        btnCadastrarSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarSalaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addComponent(lbTituloTelaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(114, 114, 114)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbSalaCapacidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbCapacidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbSalaNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                            .addComponent(btnCadastrarSala)
                            .addGap(100, 100, 100))
                        .addComponent(tfNomeSala))
                    .addGap(115, 115, 115)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbTituloTelaCliente)
                .addGap(0, 369, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(89, 89, 89)
                    .addComponent(lbSalaCapacidade)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(cbCapacidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(lbSalaNome)
                    .addGap(18, 18, 18)
                    .addComponent(tfNomeSala, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(53, 53, 53)
                    .addComponent(btnCadastrarSala, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(90, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarSalaActionPerformed

        Integer capacidade = Integer.parseInt(cbCapacidade.getSelectedItem().toString().trim());
        String nome = tfNomeSala.getText();
        Sala sala = new Sala(nome, capacidade);
        if (ValidaCampo.validar(nome, lbSalaNome)) {
            if (btnCadastrarSala.getText().equals("Cadastrar")) {
                System.out.println(nome + capacidade);
                Boolean salaRecuperada = gerenciaSala.cadastrar(sala);
                JOptionPane.showMessageDialog(this, "Sala cadastrada com sucesso!", "Cadastro", JOptionPane.PLAIN_MESSAGE);

            } else {
                gerenciaSala.atualizar(salaSelecionada, sala);
                JOptionPane.showMessageDialog(this, "Sala atualizada com sucesso!", "Atualizar", JOptionPane.PLAIN_MESSAGE);
                this.setVisible(false);
            }
            tfNomeSala.setText("");
            cbCapacidade.setSelectedIndex(0);
        }

    }//GEN-LAST:event_btnCadastrarSalaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarSala;
    private javax.swing.JComboBox<String> cbCapacidade;
    private javax.swing.JLabel lbSalaCapacidade;
    private javax.swing.JLabel lbSalaNome;
    private javax.swing.JLabel lbTituloTelaCliente;
    private javax.swing.JTextField tfNomeSala;
    // End of variables declaration//GEN-END:variables
}
