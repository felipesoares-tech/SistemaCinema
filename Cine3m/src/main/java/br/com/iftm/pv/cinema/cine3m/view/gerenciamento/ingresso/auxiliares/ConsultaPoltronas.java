/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.com.iftm.pv.cinema.cine3m.view.gerenciamento.ingresso.auxiliares;

import br.com.iftm.pv.cinema.cine3m.controller.GerenciaSessao;
import br.com.iftm.pv.cinema.cine3m.enums.TipoIngresso;
import br.com.iftm.pv.cinema.cine3m.model.ItemIngresso;
import br.com.iftm.pv.cinema.cine3m.model.Poltrona;
import br.com.iftm.pv.cinema.cine3m.model.Sessao;
import br.com.iftm.pv.cinema.cine3m.view.gerenciamento.ingresso.CadastroIngresso;
import br.com.iftm.pv.cinema.cine3m.view.gerenciamento.util.ListennerBtn;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Felipe Soares
 */
public class ConsultaPoltronas extends javax.swing.JInternalFrame {

    private List<JButton> listBotoes;
    private JButton btnConfirmar;
    private CadastroIngresso cadastroIngresso;
    private GerenciaSessao gerenciaSessao;

    public ConsultaPoltronas(CadastroIngresso cadastroIngresso, GerenciaSessao gerenciaSessao, Sessao sessaoSelecionada) {
        this.listBotoes = new ArrayList<JButton>();
        this.cadastroIngresso = cadastroIngresso;
        this.gerenciaSessao = gerenciaSessao;

        ListennerBtn btnListener = new ListennerBtn();
        JPanel panel = new JPanel(new GridLayout(0, 10));

        int capacidadeTotal = sessaoSelecionada.getSala().getCapacidade();

        // int rowMax = (capacidadeTotal % 10 == 0) ? (capacidadeTotal / 10) : (capacidadeTotal / 10) + 1;
        char row = 'A';
        int col = 1;

        for (int i = 1; i <= capacidadeTotal; i++) {
            String PoltronaID = Character.toString(row) + col;
            JButton button = new JButton(PoltronaID);

            int pos = sessaoSelecionada.getSala().getPoltronas().indexOf(new Poltrona(PoltronaID));
            Poltrona pol = sessaoSelecionada.getSala().getPoltronas().get(pos);

            System.out.println(pol.getId());

            if (!pol.isLivre()) {
                button.setEnabled(false);
            }

            button.addActionListener(btnListener);
            listBotoes.add(button);
            panel.add(button);

            if (col == 10) {
                row++;
                col = 1;
            } else {
                col++;
            }
        }
        btnListener.setDefaultColor(listBotoes.get(0).getBackground());

        ConsultaPoltronas.ConfirmarButtonListener confirmarListener = new ConsultaPoltronas.ConfirmarButtonListener(cadastroIngresso, this);
        this.btnConfirmar = new JButton("Confirmar");
        this.btnConfirmar.addActionListener(confirmarListener);

        JPanel mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(panel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 0;
        gbc.insets = new Insets(0, 10, 0, 0);
        mainPanel.add(btnConfirmar, gbc);
        initComponents();

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(mainPanel, BorderLayout.CENTER);
        pack();

    }

    private class ConfirmarButtonListener implements ActionListener {

        private CadastroIngresso cadastroIngresso;
        private ConsultaPoltronas consultaPoltronas;

        public ConfirmarButtonListener(CadastroIngresso cadastroIngresso, ConsultaPoltronas consultaPoltronas) {
            this.cadastroIngresso = cadastroIngresso;
            this.consultaPoltronas = consultaPoltronas;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            DefaultListModel<ItemIngresso> model = new DefaultListModel<>();

            Iterator<JButton> it = listBotoes.iterator();
            while (it.hasNext()) {
                JButton btn = it.next();
                if (btn.getBackground() == Color.GREEN) {
                    model.addElement(new ItemIngresso(new Poltrona(btn.getText())));
                }
            }
            this.cadastroIngresso.getjList1().setModel(model);
            this.consultaPoltronas.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setClosable(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 869, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 509, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
