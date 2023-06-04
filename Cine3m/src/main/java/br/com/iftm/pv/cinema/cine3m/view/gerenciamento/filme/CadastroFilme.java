package br.com.iftm.pv.cinema.cine3m.view.gerenciamento.filme;

import br.com.iftm.pv.cinema.cine3m.controller.GerenciaFilme;
import br.com.iftm.pv.cinema.cine3m.enums.Genero;
import br.com.iftm.pv.cinema.cine3m.model.Filme;
import br.com.iftm.pv.cinema.cine3m.view.util.ComboBoxUtils;
import br.com.iftm.pv.cinema.cine3m.view.util.ListUtils;
import br.com.iftm.pv.cinema.cine3m.view.util.ModalInternalFrame;
import br.com.iftm.pv.cinema.cine3m.view.util.ValidaCampo;
import java.util.Arrays;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CadastroFilme extends ModalInternalFrame {

    private final GerenciaFilme gerenciaFilme;
    private Filme filmeSelecionado;
    private final OperacoesFilme operacoesFilme;

    public CadastroFilme(GerenciaFilme gerenciaFilme, OperacoesFilme operacoesFilme) {
        initComponents();
        this.gerenciaFilme = gerenciaFilme;
        this.operacoesFilme = operacoesFilme;

    }

    public Filme getFilmeSelecionado() {
        return filmeSelecionado;
    }

    public void setFilmeSelecionado(Filme filmeSelecionado) {
        this.filmeSelecionado = filmeSelecionado;
    }

    public JButton getBtnConfirmar() {
        return btnConfirmar;
    }

    public void setBtnConfirmar(JButton btnConfirmar) {
        this.btnConfirmar = btnConfirmar;
    }

    public JComboBox<Genero> getCbGenero() {
        return cbGenero;
    }

    public void setCbGenero(JComboBox<Genero> cbGenero) {
        this.cbGenero = cbGenero;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JLabel getLbDescricao() {
        return lbDescricao;
    }

    public void setLbDescricao(JLabel lbDescricao) {
        this.lbDescricao = lbDescricao;
    }

    public JLabel getLbDiretor() {
        return lbDiretor;
    }

    public void setLbDiretor(JLabel lbDiretor) {
        this.lbDiretor = lbDiretor;
    }

    public JLabel getLbGenero() {
        return lbGenero;
    }

    public void setLbGenero(JLabel lbGenero) {
        this.lbGenero = lbGenero;
    }

    public JLabel getLbNome() {
        return lbNome;
    }

    public void setLbNome(JLabel lbNome) {
        this.lbNome = lbNome;
    }

    public JLabel getLbTituloTelaFilme() {
        return lbTituloTelaFilme;
    }

    public void setLbTituloTelaFilme(JLabel lbTituloTelaFilme) {
        this.lbTituloTelaFilme = lbTituloTelaFilme;
    }

    public JTextField getTfDiretor() {
        return tfDiretor;
    }

    public void setTfDiretor(JTextField tfDiretor) {
        this.tfDiretor = tfDiretor;
    }

    public JTextField getTfNomeFilme() {
        return tfNomeFilme;
    }

    public void setTfNomeFilme(JTextField tfNomeFilme) {
        this.tfNomeFilme = tfNomeFilme;
    }

    public JTextArea getTfaDescricao() {
        return tfaDescricao;
    }

    public void setTfaDescricao(JTextArea tfaDescricao) {
        this.tfaDescricao = tfaDescricao;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfaDescricao = new javax.swing.JTextArea();
        lbGenero = new javax.swing.JLabel();
        cbGenero = new javax.swing.JComboBox<>();
        lbDescricao = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        tfNomeFilme = new javax.swing.JTextField();
        tfDiretor = new javax.swing.JTextField();
        lbDiretor = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        lbTituloTelaFilme = new javax.swing.JLabel();

        setClosable(true);

        tfaDescricao.setColumns(20);
        tfaDescricao.setRows(5);
        jScrollPane1.setViewportView(tfaDescricao);

        lbGenero.setForeground(new java.awt.Color(51, 51, 51));
        lbGenero.setText("Genero");

        cbGenero.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                cbGeneroAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        lbDescricao.setForeground(new java.awt.Color(51, 51, 51));
        lbDescricao.setText("Descrição");

        lbNome.setForeground(new java.awt.Color(51, 51, 51));
        lbNome.setText("Nome");

        lbDiretor.setForeground(new java.awt.Color(51, 51, 51));
        lbDiretor.setText("Diretor");

        btnConfirmar.setText("CADASTRAR");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tfNomeFilme)
            .addComponent(lbNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbDiretor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tfDiretor)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lbDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(cbGenero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lbGenero)
                .addGap(0, 422, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(btnConfirmar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lbNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNomeFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbDiretor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbGenero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbDescricao)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lbTituloTelaFilme.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        lbTituloTelaFilme.setForeground(new java.awt.Color(204, 204, 204));
        lbTituloTelaFilme.setText("Cadastro de filmes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTituloTelaFilme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lbTituloTelaFilme)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbGeneroAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_cbGeneroAncestorAdded
        List<Genero> listaGeneros = Arrays.asList(Genero.values());
        ComboBoxUtils.carregarComboBox(cbGenero, listaGeneros);
        if (filmeSelecionado != null) {
            cbGenero.setSelectedItem(filmeSelecionado.getGenero());
        }
    }//GEN-LAST:event_cbGeneroAncestorAdded

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        String nome = tfNomeFilme.getText();
        String diretor = tfDiretor.getText();
        String descricao = tfaDescricao.getText();
        Genero genero = (Genero) cbGenero.getSelectedItem();

        if (ValidaCampo.validar(nome, lbNome, this)
                && ValidaCampo.validar(diretor, lbDiretor, this)
                && ValidaCampo.validar(descricao, lbDescricao, this)) {
            Filme filme = new Filme(genero, nome, descricao, diretor);
            if (btnConfirmar.getText().equals("CADASTRAR")) {
                Boolean sucesso = gerenciaFilme.cadastrar(filme);
                JOptionPane.showMessageDialog(rootPane, sucesso ? "Filme cadstrado com sucesso " : "Filme já Cadastrado!",
                        "Cadastro Filme", sucesso ? JOptionPane.INFORMATION_MESSAGE : JOptionPane.ERROR_MESSAGE);

            } else {
                gerenciaFilme.atualizar(filmeSelecionado, filme);
                JOptionPane.showMessageDialog(this, "Filme atualizado com sucesso!",
                        "Atualizar", JOptionPane.INFORMATION_MESSAGE);
                setVisible(false);
                getDesktopPane().remove(this);

            }
            ListUtils.carregarList(operacoesFilme.getLstFilmes(), gerenciaFilme.relatorio());
            if (gerenciaFilme.relatorio().isEmpty()) {
                operacoesFilme.getBtnConsultar().setEnabled(false);
                operacoesFilme.getBtnExcluir().setEnabled(false);
                operacoesFilme.getBtnEditar().setEnabled(false);
            } else {
                operacoesFilme.getBtnConsultar().setEnabled(true);
                operacoesFilme.getBtnExcluir().setEnabled(true);
                operacoesFilme.getBtnEditar().setEnabled(true);
                operacoesFilme.getLstFilmes().setSelectedIndex(0);
            }
            
            
            tfNomeFilme.setText("");
            tfDiretor.setText("");
            tfaDescricao.setText("");
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JComboBox<Genero> cbGenero;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDescricao;
    private javax.swing.JLabel lbDiretor;
    private javax.swing.JLabel lbGenero;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbTituloTelaFilme;
    private javax.swing.JTextField tfDiretor;
    private javax.swing.JTextField tfNomeFilme;
    private javax.swing.JTextArea tfaDescricao;
    // End of variables declaration//GEN-END:variables
}
