/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.com.iftm.pv.cinema.cine3m.view.gerenciamento.cliente;

import br.com.iftm.pv.cinema.cine3m.controller.GerenciaCliente;
import br.com.iftm.pv.cinema.cine3m.model.Cliente;
import br.com.iftm.pv.cinema.cine3m.view.util.TableModelGenerico;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Felipe Soares
 */
public class RelatorioCliente extends javax.swing.JInternalFrame {

    private GerenciaCliente gerenciaCliente;
    private TableModelGenerico modelo;

    public RelatorioCliente(GerenciaCliente gerenciaCliente) {
        this.gerenciaCliente = gerenciaCliente;
        this.modelo = new TableModelGenerico(Cliente.class);
        initComponents();
        tbRelClientes.setModel(modelo);

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
        tbRelClientes = new javax.swing.JTable();
        lbCliente2 = new javax.swing.JLabel();

        setClosable(true);

        tbRelClientes.setModel(modelo);
        tbRelClientes.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tbRelClientesAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(tbRelClientes);

        lbCliente2.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        lbCliente2.setForeground(new java.awt.Color(255, 255, 255));
        lbCliente2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCliente2.setText("Relatório de Clientes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lbCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbRelClientesAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tbRelClientesAncestorAdded
        modelo.setData(gerenciaCliente.relatorio());
    }//GEN-LAST:event_tbRelClientesAncestorAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCliente2;
    private javax.swing.JTable tbRelClientes;
    // End of variables declaration//GEN-END:variables
}
