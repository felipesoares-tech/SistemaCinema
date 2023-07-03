package br.com.iftm.pv.cinema.cine3m.view.gerenciamento.funcionario;

import br.com.iftm.pv.cinema.cine3m.controller.GerenciaFuncionario;
import br.com.iftm.pv.cinema.cine3m.enums.EnumValidacoes;
import static br.com.iftm.pv.cinema.cine3m.enums.EnumValidacoes.FUNCIONARIO_CPF_INVALIDO;
import static br.com.iftm.pv.cinema.cine3m.enums.EnumValidacoes.FUNCIONARIO_CPF_JA_CADASTRADO;
import static br.com.iftm.pv.cinema.cine3m.enums.EnumValidacoes.FUNCIONARIO_LOGIN_JA_CADASTRADO;
import static br.com.iftm.pv.cinema.cine3m.enums.EnumValidacoes.FUNCIONARIO_SUCESSO;
import br.com.iftm.pv.cinema.cine3m.enums.EstadoAtual;
import br.com.iftm.pv.cinema.cine3m.model.Funcionario;
import br.com.iftm.pv.cinema.cine3m.view.util.ListUtils;
import br.com.iftm.pv.cinema.cine3m.view.util.ModalInternalFrame;
import br.com.iftm.pv.cinema.cine3m.view.util.ValidaCampo;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class CadastroFuncionario extends ModalInternalFrame {

    private GerenciaFuncionario gerenciaFuncionario;
    private Funcionario funcionarioSelecionado;
    private OperacoesFuncionario operacoesFuncionario;
    private EstadoAtual estadoAtual;

    public CadastroFuncionario(GerenciaFuncionario gerenciaFuncionario, OperacoesFuncionario operacoesFuncionario) {
        initComponents();
        this.operacoesFuncionario = operacoesFuncionario;
        this.gerenciaFuncionario = gerenciaFuncionario;
    }

    public void setFuncionarioSelecionado(Funcionario funcionarioSelecionado) {
        this.funcionarioSelecionado = funcionarioSelecionado;
    }

    public JButton getBtnCadastrarFuncionario() {
        return btnCadastrarFuncionario;
    }

    public EstadoAtual getEstadoAtual() {
        return estadoAtual;
    }

    public void setEstadoAtual(EstadoAtual estadoAtual) {
        this.estadoAtual = estadoAtual;
    }

    public void setBtnCadastrarFuncionario(JButton btnCadastrarFuncionario) {
        this.btnCadastrarFuncionario = btnCadastrarFuncionario;
    }

    public JLabel getLbCpfFuncionario() {
        return lbCpfFuncionario;
    }

    public void setLbCpfFuncionario(JLabel lbCpfFuncionario) {
        this.lbCpfFuncionario = lbCpfFuncionario;
    }

    public JLabel getLbLoginFuncionario() {
        return lbLoginFuncionario;
    }

    public void setLbLoginFuncionario(JLabel lbLoginFuncionario) {
        this.lbLoginFuncionario = lbLoginFuncionario;
    }

    public JLabel getLbNomeFuncionario() {
        return lbNomeFuncionario;
    }

    public void setLbNomeFuncionario(JLabel lbNomeFuncionario) {
        this.lbNomeFuncionario = lbNomeFuncionario;
    }

    public JLabel getLbSenhaFuncionario() {
        return lbSenhaFuncionario;
    }

    public void setLbSenhaFuncionario(JLabel lbSenhaFuncionario) {
        this.lbSenhaFuncionario = lbSenhaFuncionario;
    }

    public JLabel getLbTituloTelaFuncionario() {
        return lbTituloTelaFuncionario;
    }

    public void setLbTituloTelaFuncionario(JLabel lbTituloTelaFuncionario) {
        this.lbTituloTelaFuncionario = lbTituloTelaFuncionario;
    }

    public JFormattedTextField getTfCpfFuncionario() {
        return tfCpfFuncionario;
    }

    public void setTfCpfFuncionario(JFormattedTextField tfCpfFuncionario) {
        this.tfCpfFuncionario = tfCpfFuncionario;
    }

    public JTextField getTfLoginFuncionario() {
        return tfLoginFuncionario;
    }

    public void setTfLoginFuncionario(JTextField tfLoginFuncionario) {
        this.tfLoginFuncionario = tfLoginFuncionario;
    }

    public JTextField getTfNomeFuncionario() {
        return tfNomeFuncionario;
    }

    public void setTfNomeFuncionario(JTextField tfNomeFuncionario) {
        this.tfNomeFuncionario = tfNomeFuncionario;
    }

    public JPasswordField getTfSenhaFuncionario() {
        return tfSenhaFuncionario;
    }

    public void setTfSenhaFuncionario(JPasswordField tfSenhaFuncionario) {
        this.tfSenhaFuncionario = tfSenhaFuncionario;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }
    
    

    private void limpaCampos() {
        tfNomeFuncionario.setText("");
        tfCpfFuncionario.setValue(null);
        tfLoginFuncionario.setText("");
        tfSenhaFuncionario.setText("");
    }

    private void exibeMensagemValidacao(EnumValidacoes tipoRetorno) {
        String titulo = estadoAtual.equals(EstadoAtual.CADASTRANDO) ? "Cadastro Funcionario" : "Atualização Funcionario";
        String mensagemSucesso = estadoAtual.equals(EstadoAtual.CADASTRANDO) ? "Funcionario cadastrado com sucesso" : "Funcionario atualizado com sucesso";
        switch (tipoRetorno) {
            case FUNCIONARIO_SUCESSO:
                JOptionPane.showMessageDialog(this, mensagemSucesso, titulo,
                        JOptionPane.INFORMATION_MESSAGE);
                limpaCampos();
                break;
            case FUNCIONARIO_CPF_INVALIDO:
                JOptionPane.showMessageDialog(this, "CPF Inválido ", titulo,
                        JOptionPane.ERROR_MESSAGE);
                break;
            case FUNCIONARIO_CPF_JA_CADASTRADO:
                JOptionPane.showMessageDialog(this, "CPF já cadastrado ", titulo,
                        JOptionPane.ERROR_MESSAGE);

                break;
            case FUNCIONARIO_LOGIN_JA_CADASTRADO:
                JOptionPane.showMessageDialog(this, "Login já cadastrado", titulo,
                        JOptionPane.ERROR_MESSAGE);
                break;
            default:
                throw new AssertionError();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTituloTelaFuncionario = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbNomeFuncionario = new javax.swing.JLabel();
        tfNomeFuncionario = new javax.swing.JTextField();
        lbCpfFuncionario = new javax.swing.JLabel();
        tfCpfFuncionario = new javax.swing.JFormattedTextField();
        lbLoginFuncionario = new javax.swing.JLabel();
        lbSenhaFuncionario = new javax.swing.JLabel();
        tfSenhaFuncionario = new javax.swing.JPasswordField();
        btnCadastrarFuncionario = new javax.swing.JButton();
        tfLoginFuncionario = new javax.swing.JTextField();

        setClosable(true);

        lbTituloTelaFuncionario.setBackground(new java.awt.Color(102, 102, 102));
        lbTituloTelaFuncionario.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        lbTituloTelaFuncionario.setForeground(new java.awt.Color(102, 102, 102));
        lbTituloTelaFuncionario.setText("Cadastro de Funcionários");

        jPanel1.setBackground(java.awt.Color.gray);

        lbNomeFuncionario.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbNomeFuncionario.setForeground(new java.awt.Color(51, 51, 51));
        lbNomeFuncionario.setText("Nome:");

        lbCpfFuncionario.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbCpfFuncionario.setForeground(new java.awt.Color(51, 51, 51));
        lbCpfFuncionario.setText("CPF:");

        try {
            tfCpfFuncionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lbLoginFuncionario.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbLoginFuncionario.setForeground(new java.awt.Color(51, 51, 51));
        lbLoginFuncionario.setText("Login:");

        lbSenhaFuncionario.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbSenhaFuncionario.setForeground(new java.awt.Color(51, 51, 51));
        lbSenhaFuncionario.setText("Senha:");

        btnCadastrarFuncionario.setForeground(new java.awt.Color(51, 51, 51));
        btnCadastrarFuncionario.setText("CADASTRAR");
        btnCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(151, Short.MAX_VALUE)
                .addComponent(btnCadastrarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbNomeFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(123, 123, 123))
                    .addComponent(lbCpfFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfCpfFuncionario)
                    .addComponent(lbLoginFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbSenhaFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfSenhaFuncionario)
                    .addComponent(tfNomeFuncionario)
                    .addComponent(tfLoginFuncionario)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lbNomeFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbCpfFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfCpfFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbLoginFuncionario)
                .addGap(14, 14, 14)
                .addComponent(tfLoginFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbSenhaFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSenhaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btnCadastrarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTituloTelaFuncionario)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lbTituloTelaFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarFuncionarioActionPerformed
        String nome = tfNomeFuncionario.getText().toUpperCase();
        String cpf = tfCpfFuncionario.getText().replaceAll("[-.]", "");
        String login = tfLoginFuncionario.getText();
        String senha = String.valueOf(tfSenhaFuncionario.getPassword());

        if (ValidaCampo.validar(nome, lbNomeFuncionario, this)
                && ValidaCampo.validar(cpf, lbCpfFuncionario, this)
                && ValidaCampo.validar(login, lbLoginFuncionario, this)
                && ValidaCampo.validar(senha, lbSenhaFuncionario, this)) {
            Funcionario funcionario = new Funcionario(nome, cpf, login, senha);

            if (estadoAtual.equals(EstadoAtual.CADASTRANDO)) {
                exibeMensagemValidacao(gerenciaFuncionario.cadastrar(funcionario));
            } else {
                EnumValidacoes retornoValidacao = gerenciaFuncionario.atualizar(funcionarioSelecionado, funcionario);
                exibeMensagemValidacao(retornoValidacao);
                if (retornoValidacao.equals(EnumValidacoes.FUNCIONARIO_SUCESSO)) {
                    limpaCampos();
                    setVisible(false);
                    getDesktopPane().remove(this);
                    
                }
            }
            
            ListUtils.carregarList(operacoesFuncionario.getLstFuncionarios(), gerenciaFuncionario.relatorio());
            if (gerenciaFuncionario.relatorio().isEmpty()) {
                operacoesFuncionario.getBtnConsultar().setEnabled(false);
                operacoesFuncionario.getBtnExcluir().setEnabled(false);
                operacoesFuncionario.getBtnEditar().setEnabled(false);
            } else {
                operacoesFuncionario.getBtnConsultar().setEnabled(true);
                operacoesFuncionario.getBtnExcluir().setEnabled(true);
                operacoesFuncionario.getBtnEditar().setEnabled(true);
                operacoesFuncionario.getLstFuncionarios().setSelectedIndex(0);
            }

        }
    }//GEN-LAST:event_btnCadastrarFuncionarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarFuncionario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbCpfFuncionario;
    private javax.swing.JLabel lbLoginFuncionario;
    private javax.swing.JLabel lbNomeFuncionario;
    private javax.swing.JLabel lbSenhaFuncionario;
    private javax.swing.JLabel lbTituloTelaFuncionario;
    private javax.swing.JFormattedTextField tfCpfFuncionario;
    private javax.swing.JTextField tfLoginFuncionario;
    private javax.swing.JTextField tfNomeFuncionario;
    private javax.swing.JPasswordField tfSenhaFuncionario;
    // End of variables declaration//GEN-END:variables
}
