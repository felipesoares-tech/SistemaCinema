/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.com.iftm.pv.cinema.cine3m.view;

import br.com.iftm.pv.cinema.cine3m.config.ParametrosSistema;
import br.com.iftm.pv.cinema.cine3m.view.gerenciamento.sessao.CadastroSessao;
import java.util.ArrayList;
import java.util.List;
import br.com.iftm.pv.cinema.cine3m.controller.GerenciaCliente;
import br.com.iftm.pv.cinema.cine3m.controller.GerenciaFilme;
import br.com.iftm.pv.cinema.cine3m.controller.GerenciaFuncionario;
import br.com.iftm.pv.cinema.cine3m.controller.GerenciaIngresso;
import br.com.iftm.pv.cinema.cine3m.controller.GerenciaSala;
import br.com.iftm.pv.cinema.cine3m.controller.GerenciaSessao;
import br.com.iftm.pv.cinema.cine3m.model.Cliente;
import br.com.iftm.pv.cinema.cine3m.model.Filme;
import br.com.iftm.pv.cinema.cine3m.model.Funcionario;
import br.com.iftm.pv.cinema.cine3m.model.Ingresso;
import br.com.iftm.pv.cinema.cine3m.model.Sala;
import br.com.iftm.pv.cinema.cine3m.model.Sessao;
import br.com.iftm.pv.cinema.cine3m.view.gerenciamento.cliente.ApagarCliente;
import br.com.iftm.pv.cinema.cine3m.view.gerenciamento.cliente.AtualizaCliente;
import br.com.iftm.pv.cinema.cine3m.view.gerenciamento.cliente.CadastroCliente;
import br.com.iftm.pv.cinema.cine3m.view.gerenciamento.cliente.ConsultaCliente;
import br.com.iftm.pv.cinema.cine3m.view.gerenciamento.cliente.RelatorioCliente;
import br.com.iftm.pv.cinema.cine3m.view.gerenciamento.filme.CadastroFilme;
import br.com.iftm.pv.cinema.cine3m.view.gerenciamento.filme.ConsultaFilme;
import br.com.iftm.pv.cinema.cine3m.view.gerenciamento.funcionario.ApagaFuncionario;
import br.com.iftm.pv.cinema.cine3m.view.gerenciamento.funcionario.AtualizaFuncionario;
import br.com.iftm.pv.cinema.cine3m.view.gerenciamento.funcionario.CadastroFuncionario;
import br.com.iftm.pv.cinema.cine3m.view.gerenciamento.funcionario.ConsultaFuncionario;
import br.com.iftm.pv.cinema.cine3m.view.gerenciamento.funcionario.RelatorioFuncionario;
import br.com.iftm.pv.cinema.cine3m.view.gerenciamento.ingresso.CadastroIngresso;
import br.com.iftm.pv.cinema.cine3m.view.gerenciamento.sessao.ApagaSessao;
import br.com.iftm.pv.cinema.cine3m.view.gerenciamento.sessao.AtualizaSessao;
import br.com.iftm.pv.cinema.cine3m.view.gerenciamento.sessao.ConsultaSessao;
import br.com.iftm.pv.cinema.cine3m.view.gerenciamento.sessao.RelatorioSessao;
import br.com.iftm.pv.cinema.cine3m.view.gerenciamento.sala.*;
import java.awt.Color;

/**
 *
 * @author elisabete
 */
public class Principal extends javax.swing.JDialog {

    //Telas a serem chamadas (CRUD SESSÃO)
    CadastroSessao cadastroSessao;
    ConsultaSessao consultaSessao;
    AtualizaSessao atualizaSessao;
    ApagaSessao apagaSessao;
    RelatorioSessao relatorioSessao;
    //Telas auxiliares (CRUD SESSÃO)
//    ImprimeRelatorio imprimeRelatorio;

    //Telas a serem chamadas (CRUD CLIENTES)
    CadastroCliente cadastroCliente;
    ConsultaCliente consultaCliente;
    AtualizaCliente atualizaCliente;
    ApagarCliente apagaCliente;
    RelatorioCliente relatorioCliente;
    //Telas a serem chamadas (CRUD FUNCIONARIOS)
    CadastroFuncionario cadastroFuncionario;
    ConsultaFuncionario consultaFuncionario;
    AtualizaFuncionario atualizaFuncionario;
    ApagaFuncionario apagaFuncionario;
    RelatorioFuncionario relatorioFuncionario;
    //Telas auxiliares (CRUD SESSÃO)

    //Telas a serem chamadas (CRUD SALA)
    CadastroSala cadastroSala;
    ConsultaSala consultaSala;
    AtualizaSala atualizaSala;
    ApagaSala apagaSala;
    RelatorioSala relatorioSala;
    //Telas a serem chamadas (CRUD INGRESSO)
    CadastroIngresso cadastroIngresso;

    //Telas a serem chamadas (CRUD FILMES)
    CadastroFilme cadastroFilme;
    ConsultaFilme consultaFilme;

    List<Filme> filmes = new ArrayList<Filme>();
    List<Funcionario> funcionarios = new ArrayList<Funcionario>();
    List<Sessao> sessoes = new ArrayList<Sessao>();
    List<Ingresso> ingressos = new ArrayList<Ingresso>();
    List<Sala> salas = new ArrayList<Sala>();
    List<Cliente> clientes = new ArrayList<Cliente>();

    private GerenciaCliente gerenciaCliente = new GerenciaCliente(clientes);
    private GerenciaFilme gerenciaFilme = new GerenciaFilme(filmes);
    private GerenciaFuncionario gerenciaFuncionario = new GerenciaFuncionario(funcionarios);
    private GerenciaIngresso gerenciaIngresso = new GerenciaIngresso(ingressos);
    private GerenciaSala gerenciaSala = new GerenciaSala(salas);
    private GerenciaSessao gerenciaSessao = new GerenciaSessao(sessoes, gerenciaSala);

    public Principal(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        //Telas a serem chamadas (CRUD SESSÃO) Instanciação
        this.cadastroSessao = new CadastroSessao(null, rootPaneCheckingEnabled, gerenciaFilme, gerenciaSala, gerenciaSessao);
        this.consultaSessao = new ConsultaSessao(null, rootPaneCheckingEnabled, cadastroSessao, gerenciaSessao);
        this.atualizaSessao = new AtualizaSessao(null, rootPaneCheckingEnabled, cadastroSessao);
        this.apagaSessao = new ApagaSessao(null, rootPaneCheckingEnabled, gerenciaSessao);
        this.relatorioSessao = new RelatorioSessao(null, rootPaneCheckingEnabled, gerenciaSessao);
        //Telas a serem chamadas (CRUD CLIENTES) Instanciação
        this.cadastroCliente = new CadastroCliente(gerenciaCliente);
        this.consultaCliente = new ConsultaCliente(cadastroCliente, gerenciaCliente, jDesktopPane1);
        this.atualizaCliente = new AtualizaCliente(cadastroCliente, gerenciaCliente, jDesktopPane1);
        this.apagaCliente = new ApagarCliente(gerenciaCliente);
        this.relatorioCliente = new RelatorioCliente(gerenciaCliente);
        //Telas a serem chamadas (CRUD FUNCIONARIOS) Instanciação
        this.cadastroFuncionario = new CadastroFuncionario(null, rootPaneCheckingEnabled, gerenciaFuncionario);
        this.consultaFuncionario = new ConsultaFuncionario(null, rootPaneCheckingEnabled, cadastroFuncionario, gerenciaFuncionario);
        this.atualizaFuncionario = new AtualizaFuncionario(null, rootPaneCheckingEnabled, cadastroFuncionario, gerenciaFuncionario);
        this.apagaFuncionario = new ApagaFuncionario(null, rootPaneCheckingEnabled, gerenciaFuncionario);
        this.relatorioFuncionario = new RelatorioFuncionario(null, rootPaneCheckingEnabled, gerenciaFuncionario);

        //Telas a serem chamadas (CRUD SALA)
        this.cadastroSala = new CadastroSala(null, rootPaneCheckingEnabled, gerenciaSala);
        this.consultaSala = new ConsultaSala(null, rootPaneCheckingEnabled, cadastroSala, gerenciaSala);
        this.atualizaSala = new AtualizaSala(null, rootPaneCheckingEnabled, cadastroSala, gerenciaSala);
        this.apagaSala = new ApagaSala(null, rootPaneCheckingEnabled, gerenciaSala);
        this.relatorioSala = new RelatorioSala(null, rootPaneCheckingEnabled, gerenciaSala);

        //Telas a serem chamadas (CRUD INGRESSO)
        this.cadastroIngresso = new CadastroIngresso(null, rootPaneCheckingEnabled, gerenciaIngresso, gerenciaSessao, cadastroSessao);

        //Telas a serem chamadas (CRUD FILMES)
        this.cadastroFilme = new CadastroFilme(null, rootPaneCheckingEnabled, gerenciaFilme);
        this.consultaFilme = new ConsultaFilme(null, rootPaneCheckingEnabled, cadastroFilme, gerenciaFilme);
        //Configurações para as telas;
        Color corFundoPadrao = ParametrosSistema.getInstance().getCorDeFundo();
        this.getContentPane().setBackground(corFundoPadrao);

        //CORES PARA TELAS CLIENTE
        this.cadastroCliente.getContentPane().setBackground(corFundoPadrao);
        this.consultaCliente.getContentPane().setBackground(corFundoPadrao);
        this.atualizaCliente.getContentPane().setBackground(corFundoPadrao);
        this.apagaCliente.getContentPane().setBackground(corFundoPadrao);
        this.relatorioCliente.getContentPane().setBackground(corFundoPadrao);

        //CORES PARA TELAS FUNCIONARIO
        this.cadastroFuncionario.getContentPane().setBackground(corFundoPadrao);
        this.consultaFuncionario.getContentPane().setBackground(corFundoPadrao);
        this.apagaFuncionario.getContentPane().setBackground(corFundoPadrao);
        this.atualizaFuncionario.getContentPane().setBackground(corFundoPadrao);
        this.relatorioFuncionario.getContentPane().setBackground(corFundoPadrao);

        //CORES PARA TELAS SESSAO
        this.cadastroSessao.getContentPane().setBackground(corFundoPadrao);
        this.consultaSessao.getContentPane().setBackground(corFundoPadrao);
        this.atualizaSessao.getContentPane().setBackground(corFundoPadrao);
        this.apagaSessao.getContentPane().setBackground(corFundoPadrao);
        this.relatorioSessao.getContentPane().setBackground(corFundoPadrao);

        //CORES PARA TELAS SALA
        this.cadastroSala.getContentPane().setBackground(corFundoPadrao);
        this.consultaSala.getContentPane().setBackground(corFundoPadrao);
        this.atualizaSala.getContentPane().setBackground(corFundoPadrao);
        this.apagaSala.getContentPane().setBackground(corFundoPadrao);
        this.relatorioSala.getContentPane().setBackground(corFundoPadrao);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mSessao = new javax.swing.JMenu();
        imCadastroSessao = new javax.swing.JMenuItem();
        imConsultaSessao = new javax.swing.JMenuItem();
        imAtualizaSessao = new javax.swing.JMenuItem();
        imApagaSessao = new javax.swing.JMenuItem();
        imRelatorioSessao = new javax.swing.JMenuItem();
        mIngresso = new javax.swing.JMenu();
        imCadastroIngresso = new javax.swing.JMenuItem();
        imConsultaIngresso = new javax.swing.JMenuItem();
        imAtualizaIngresso = new javax.swing.JMenuItem();
        imApagaIngresso = new javax.swing.JMenuItem();
        imRelatorioIngresso = new javax.swing.JMenuItem();
        mFilme = new javax.swing.JMenu();
        imCadastroFilme = new javax.swing.JMenuItem();
        imConsultaFilme = new javax.swing.JMenuItem();
        imAtualizaFilme = new javax.swing.JMenuItem();
        imApagaFilme = new javax.swing.JMenuItem();
        imRelatorioFilme = new javax.swing.JMenuItem();
        mSala = new javax.swing.JMenu();
        imCadastroSala = new javax.swing.JMenuItem();
        imConsultaSala = new javax.swing.JMenuItem();
        imAtualizaSala = new javax.swing.JMenuItem();
        imApagaSala = new javax.swing.JMenuItem();
        imRelatorioSala = new javax.swing.JMenuItem();
        mFuncionario = new javax.swing.JMenu();
        imCadastroFuncionario = new javax.swing.JMenuItem();
        imConsultaFuncionario = new javax.swing.JMenuItem();
        imAtualizaFuncionario = new javax.swing.JMenuItem();
        imApagaFuncionario = new javax.swing.JMenuItem();
        imRelatorioFuncionario = new javax.swing.JMenuItem();
        mCliente = new javax.swing.JMenu();
        imCadastraCliente = new javax.swing.JMenuItem();
        imConsultaCliente = new javax.swing.JMenuItem();
        imAtualizaCliente = new javax.swing.JMenuItem();
        imApagaCliente = new javax.swing.JMenuItem();
        imRelatorioCliente = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 953, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 507, Short.MAX_VALUE)
        );

        jMenu1.setMnemonic('L');
        jMenu1.setText("Lançamentos");

        mSessao.setMnemonic('S');
        mSessao.setText("Sessão");

        imCadastroSessao.setText("Cadastrar");
        imCadastroSessao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imCadastroSessaoActionPerformed(evt);
            }
        });
        mSessao.add(imCadastroSessao);

        imConsultaSessao.setText("Consultar");
        imConsultaSessao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imConsultaSessaoActionPerformed(evt);
            }
        });
        mSessao.add(imConsultaSessao);

        imAtualizaSessao.setText("Atualizar");
        imAtualizaSessao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imAtualizaSessaoActionPerformed(evt);
            }
        });
        mSessao.add(imAtualizaSessao);

        imApagaSessao.setText("Apagar");
        imApagaSessao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imApagaSessaoActionPerformed(evt);
            }
        });
        mSessao.add(imApagaSessao);

        imRelatorioSessao.setText("Relatório");
        imRelatorioSessao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imRelatorioSessaoActionPerformed(evt);
            }
        });
        mSessao.add(imRelatorioSessao);

        jMenu1.add(mSessao);

        mIngresso.setMnemonic('I');
        mIngresso.setText("Ingresso");

        imCadastroIngresso.setText("Cadastrar");
        imCadastroIngresso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imCadastroIngressoActionPerformed(evt);
            }
        });
        mIngresso.add(imCadastroIngresso);

        imConsultaIngresso.setText("Consultar");
        imConsultaIngresso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imConsultaIngressoActionPerformed(evt);
            }
        });
        mIngresso.add(imConsultaIngresso);

        imAtualizaIngresso.setText("Atualizar");
        imAtualizaIngresso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imAtualizaIngressoActionPerformed(evt);
            }
        });
        mIngresso.add(imAtualizaIngresso);

        imApagaIngresso.setText("Apagar");
        imApagaIngresso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imApagaIngressoActionPerformed(evt);
            }
        });
        mIngresso.add(imApagaIngresso);

        imRelatorioIngresso.setText("Relatório");
        imRelatorioIngresso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imRelatorioIngressoActionPerformed(evt);
            }
        });
        mIngresso.add(imRelatorioIngresso);

        jMenu1.add(mIngresso);

        mFilme.setMnemonic('F');
        mFilme.setText("Filme");

        imCadastroFilme.setText("Cadastrar");
        imCadastroFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imCadastroFilmeActionPerformed(evt);
            }
        });
        mFilme.add(imCadastroFilme);

        imConsultaFilme.setText("Consultar");
        imConsultaFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imConsultaFilmeActionPerformed(evt);
            }
        });
        mFilme.add(imConsultaFilme);

        imAtualizaFilme.setText("Atualizar");
        mFilme.add(imAtualizaFilme);

        imApagaFilme.setText("Apagar");
        mFilme.add(imApagaFilme);

        imRelatorioFilme.setText("Relatório");
        mFilme.add(imRelatorioFilme);

        jMenu1.add(mFilme);

        mSala.setMnemonic('a');
        mSala.setText("Sala");
        mSala.setToolTipText("");

        imCadastroSala.setText("Cadastrar");
        imCadastroSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imCadastroSalaActionPerformed(evt);
            }
        });
        mSala.add(imCadastroSala);

        imConsultaSala.setText("Consultar");
        imConsultaSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imConsultaSalaActionPerformed(evt);
            }
        });
        mSala.add(imConsultaSala);

        imAtualizaSala.setText("Atualizar");
        imAtualizaSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imAtualizaSalaActionPerformed(evt);
            }
        });
        mSala.add(imAtualizaSala);

        imApagaSala.setText("Apagar");
        imApagaSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imApagaSalaActionPerformed(evt);
            }
        });
        mSala.add(imApagaSala);

        imRelatorioSala.setText("Relatório");
        imRelatorioSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imRelatorioSalaActionPerformed(evt);
            }
        });
        mSala.add(imRelatorioSala);

        jMenu1.add(mSala);

        mFuncionario.setMnemonic('F');
        mFuncionario.setText("Funcionario");

        imCadastroFuncionario.setText("Cadastrar");
        imCadastroFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imCadastroFuncionarioActionPerformed(evt);
            }
        });
        mFuncionario.add(imCadastroFuncionario);

        imConsultaFuncionario.setText("Consultar");
        imConsultaFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imConsultaFuncionarioActionPerformed(evt);
            }
        });
        mFuncionario.add(imConsultaFuncionario);

        imAtualizaFuncionario.setText("Atualizar");
        imAtualizaFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imAtualizaFuncionarioActionPerformed(evt);
            }
        });
        mFuncionario.add(imAtualizaFuncionario);

        imApagaFuncionario.setText("Apagar");
        imApagaFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imApagaFuncionarioActionPerformed(evt);
            }
        });
        mFuncionario.add(imApagaFuncionario);

        imRelatorioFuncionario.setText("Relatório");
        imRelatorioFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imRelatorioFuncionarioActionPerformed(evt);
            }
        });
        mFuncionario.add(imRelatorioFuncionario);

        jMenu1.add(mFuncionario);

        mCliente.setMnemonic('C');
        mCliente.setText("Cliente");

        imCadastraCliente.setText("Cadastrar");
        imCadastraCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imCadastraClienteActionPerformed(evt);
            }
        });
        mCliente.add(imCadastraCliente);

        imConsultaCliente.setText("Consultar");
        imConsultaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imConsultaClienteActionPerformed(evt);
            }
        });
        mCliente.add(imConsultaCliente);

        imAtualizaCliente.setText("Atualizar");
        imAtualizaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imAtualizaClienteActionPerformed(evt);
            }
        });
        mCliente.add(imAtualizaCliente);

        imApagaCliente.setText("Apagar");
        imApagaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imApagaClienteActionPerformed(evt);
            }
        });
        mCliente.add(imApagaCliente);

        imRelatorioCliente.setText("Relatório");
        imRelatorioCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imRelatorioClienteActionPerformed(evt);
            }
        });
        mCliente.add(imRelatorioCliente);

        jMenu1.add(mCliente);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imCadastroSessaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imCadastroSessaoActionPerformed
        this.cadastroSessao.setVisible(true);
    }//GEN-LAST:event_imCadastroSessaoActionPerformed

    private void imConsultaSessaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imConsultaSessaoActionPerformed
        this.consultaSessao.setVisible(true);
    }//GEN-LAST:event_imConsultaSessaoActionPerformed

    private void imAtualizaSessaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imAtualizaSessaoActionPerformed
        this.atualizaSessao.setVisible(true);
    }//GEN-LAST:event_imAtualizaSessaoActionPerformed

    private void imApagaSessaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imApagaSessaoActionPerformed
        this.apagaSessao.setVisible(true);
    }//GEN-LAST:event_imApagaSessaoActionPerformed

    private void imRelatorioSessaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imRelatorioSessaoActionPerformed
        this.relatorioSessao.setVisible(true);
    }//GEN-LAST:event_imRelatorioSessaoActionPerformed

    private void imCadastraClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imCadastraClienteActionPerformed
        this.cadastroCliente.getBtnCadastrarCliente().setVisible(true);
        this.cadastroCliente.getLbTituloTelaCliente().setText("Cadastro de Cliente");
        this.cadastroCliente.getBtnCadastrarCliente().setText("Cadastrar");
        this.cadastroCliente.getTfNomeCliente().setEditable(true);
        this.cadastroCliente.getTfCpfCliente().setEditable(true);
        jDesktopPane1.add(cadastroCliente);
        cadastroCliente.setVisible(true);
    }//GEN-LAST:event_imCadastraClienteActionPerformed

    private void imConsultaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imConsultaClienteActionPerformed
        jDesktopPane1.add(consultaCliente);
        this.consultaCliente.setVisible(true);
    }//GEN-LAST:event_imConsultaClienteActionPerformed

    private void imAtualizaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imAtualizaClienteActionPerformed
        jDesktopPane1.add(atualizaCliente);
        this.atualizaCliente.setVisible(true);
    }//GEN-LAST:event_imAtualizaClienteActionPerformed

    private void imApagaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imApagaClienteActionPerformed
        jDesktopPane1.add(apagaCliente);
        this.apagaCliente.setVisible(true);
    }//GEN-LAST:event_imApagaClienteActionPerformed

    private void imRelatorioClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imRelatorioClienteActionPerformed
        jDesktopPane1.add(relatorioCliente);
        this.relatorioCliente.setVisible(true);
    }//GEN-LAST:event_imRelatorioClienteActionPerformed

    private void imCadastroSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imCadastroSalaActionPerformed
        this.cadastroSala.getCbCapacidade().setEnabled(true);
        this.cadastroSala.getBtnCadastrarSala().setVisible(true);
        this.cadastroSala.getBtnCadastrarSala().setText("Cadastrar");
        this.cadastroSala.getTfNomeSala().setText("");
        this.cadastroSala.getCbCapacidade().setSelectedIndex(0);
        this.cadastroSala.getTfNomeSala().setEditable(true);
        this.cadastroSala.setVisible(true);

    }//GEN-LAST:event_imCadastroSalaActionPerformed

    private void imConsultaSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imConsultaSalaActionPerformed
        this.consultaSala.setVisible(true);
    }//GEN-LAST:event_imConsultaSalaActionPerformed

    private void imAtualizaSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imAtualizaSalaActionPerformed
        this.atualizaSala.setVisible(true);
    }//GEN-LAST:event_imAtualizaSalaActionPerformed

    private void imApagaSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imApagaSalaActionPerformed
        this.apagaSala.setVisible(true);
    }//GEN-LAST:event_imApagaSalaActionPerformed

    private void imRelatorioSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imRelatorioSalaActionPerformed
        this.relatorioSala.setVisible(true);
    }//GEN-LAST:event_imRelatorioSalaActionPerformed

    private void imCadastroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imCadastroFuncionarioActionPerformed
        this.cadastroFuncionario.getBtnCadastrarFuncionario().setVisible(true);
        this.cadastroFuncionario.getBtnCadastrarFuncionario().setText("Cadastrar");
        this.cadastroFuncionario.getTfNomeFuncionario().setEditable(true);
        this.cadastroFuncionario.getTfCpfFuncionario().setEditable(true);
        this.cadastroFuncionario.getTfLoginFuncionario().setEditable(true);
        this.cadastroFuncionario.getTfSenhaFuncionario().setEditable(true);
        this.cadastroFuncionario.setVisible(true);
    }//GEN-LAST:event_imCadastroFuncionarioActionPerformed

    private void imConsultaFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imConsultaFuncionarioActionPerformed
        this.consultaFuncionario.setVisible(true);
    }//GEN-LAST:event_imConsultaFuncionarioActionPerformed

    private void imAtualizaFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imAtualizaFuncionarioActionPerformed
        this.atualizaFuncionario.setVisible(true);
    }//GEN-LAST:event_imAtualizaFuncionarioActionPerformed

    private void imApagaFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imApagaFuncionarioActionPerformed
        this.apagaFuncionario.setVisible(true);
    }//GEN-LAST:event_imApagaFuncionarioActionPerformed

    private void imRelatorioFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imRelatorioFuncionarioActionPerformed
        this.relatorioFuncionario.setVisible(true);
    }//GEN-LAST:event_imRelatorioFuncionarioActionPerformed

    private void imCadastroFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imCadastroFilmeActionPerformed
        this.cadastroFilme.getBtnConfirmar().setText("Cadastrar");
        this.cadastroFilme.getBtnConfirmar().setVisible(true);
        this.cadastroFilme.getTfNome().setEditable(true);
        this.cadastroFilme.getTfDiretor().setEditable(true);
        this.cadastroFilme.getTfaDescricao().setEditable(true);
        this.cadastroFilme.getTfNome().setText("");
        this.cadastroFilme.getTfDiretor().setText("");
        this.cadastroFilme.getTfaDescricao().setText("");
        this.cadastroFilme.getCbGenero().setEnabled(true);
        this.cadastroFilme.setVisible(true);
    }//GEN-LAST:event_imCadastroFilmeActionPerformed

    private void imConsultaFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imConsultaFilmeActionPerformed
        this.consultaFilme.setVisible(true);
    }//GEN-LAST:event_imConsultaFilmeActionPerformed

    private void imCadastroIngressoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imCadastroIngressoActionPerformed
        this.cadastroIngresso.setVisible(true);
    }//GEN-LAST:event_imCadastroIngressoActionPerformed

    private void imConsultaIngressoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imConsultaIngressoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imConsultaIngressoActionPerformed

    private void imAtualizaIngressoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imAtualizaIngressoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imAtualizaIngressoActionPerformed

    private void imApagaIngressoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imApagaIngressoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imApagaIngressoActionPerformed

    private void imRelatorioIngressoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imRelatorioIngressoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imRelatorioIngressoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Principal dialog = new Principal(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem imApagaCliente;
    private javax.swing.JMenuItem imApagaFilme;
    private javax.swing.JMenuItem imApagaFuncionario;
    private javax.swing.JMenuItem imApagaIngresso;
    private javax.swing.JMenuItem imApagaSala;
    private javax.swing.JMenuItem imApagaSessao;
    private javax.swing.JMenuItem imAtualizaCliente;
    private javax.swing.JMenuItem imAtualizaFilme;
    private javax.swing.JMenuItem imAtualizaFuncionario;
    private javax.swing.JMenuItem imAtualizaIngresso;
    private javax.swing.JMenuItem imAtualizaSala;
    private javax.swing.JMenuItem imAtualizaSessao;
    private javax.swing.JMenuItem imCadastraCliente;
    private javax.swing.JMenuItem imCadastroFilme;
    private javax.swing.JMenuItem imCadastroFuncionario;
    private javax.swing.JMenuItem imCadastroIngresso;
    private javax.swing.JMenuItem imCadastroSala;
    private javax.swing.JMenuItem imCadastroSessao;
    private javax.swing.JMenuItem imConsultaCliente;
    private javax.swing.JMenuItem imConsultaFilme;
    private javax.swing.JMenuItem imConsultaFuncionario;
    private javax.swing.JMenuItem imConsultaIngresso;
    private javax.swing.JMenuItem imConsultaSala;
    private javax.swing.JMenuItem imConsultaSessao;
    private javax.swing.JMenuItem imRelatorioCliente;
    private javax.swing.JMenuItem imRelatorioFilme;
    private javax.swing.JMenuItem imRelatorioFuncionario;
    private javax.swing.JMenuItem imRelatorioIngresso;
    private javax.swing.JMenuItem imRelatorioSala;
    private javax.swing.JMenuItem imRelatorioSessao;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mCliente;
    private javax.swing.JMenu mFilme;
    private javax.swing.JMenu mFuncionario;
    private javax.swing.JMenu mIngresso;
    private javax.swing.JMenu mSala;
    private javax.swing.JMenu mSessao;
    // End of variables declaration//GEN-END:variables
}
