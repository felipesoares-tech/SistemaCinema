package br.com.iftm.pv.cinema.cine3m.controller;

import br.com.iftm.pv.cinema.cine3m.dao.SessaoDAO;
import br.com.iftm.pv.cinema.cine3m.enums.EnumValidacoes;
import br.com.iftm.pv.cinema.cine3m.interfaces.IGerencia;
import br.com.iftm.pv.cinema.cine3m.model.Poltrona;
import br.com.iftm.pv.cinema.cine3m.model.Sessao;
import java.util.Iterator;
import java.util.List;

public class GerenciaSessao implements IGerencia<Sessao> {

    private final SessaoDAO sessaoDAO;
    private final GerenciaSala gerenciaSala;

    public GerenciaSessao(GerenciaSala gerenciaSala) {
        this.sessaoDAO = new SessaoDAO();
        this.gerenciaSala = gerenciaSala;    
    }

    private EnumValidacoes validarSessao(Sessao sessao) {
        EnumValidacoes retornoValidacao;
        if (sessaoDAO.consultarSessaoDataHoraSala(sessao) != null) { //O Contains, verifica somente oq está no Equals!
            retornoValidacao = EnumValidacoes.SESSAO_JA_CADASTRADA;
        } else if (existeSessaoComHORARIO(sessao)) {
            retornoValidacao = EnumValidacoes.SESSAO_HORARIO_JA_UTILIZADO;
        } else {
            retornoValidacao = EnumValidacoes.SESSAO_SUCESSO;
        }

        //TODO: adicionar outras condicoes a serem validadas
        return retornoValidacao;
    }

    private EnumValidacoes validarSessao(Sessao sessao, Sessao sessaoAtualizada) {
        EnumValidacoes retornoValidacao;
        if (existeSessaoComHORARIO(sessao, sessaoAtualizada)) {
            retornoValidacao = EnumValidacoes.SESSAO_HORARIO_JA_UTILIZADO;
        } else {
            retornoValidacao = EnumValidacoes.SESSAO_SUCESSO;
        }
        return retornoValidacao;
    }

    private boolean existeSessaoComHORARIO(Sessao sessao, Sessao sessaoAtualizada) {
        Iterator<Sessao> it = sessaoDAO.listar().iterator();
        while (it.hasNext()) {
            Sessao s = (Sessao) it.next();
            if (!sessao.equals(s)) {
                if (sessaoAtualizada.getSala().equals(s.getSala()) && sessaoAtualizada.getData().equals(s.getData())) {
                    if (sessaoAtualizada.getHora().equals(s.getHora())) {
                        return true;
                    } else if (sessaoAtualizada.getHora().isBefore(s.getHora()) && sessaoAtualizada.getHoraFinal().isAfter(s.getHora())) {
                        return true;

                    } else if (sessaoAtualizada.getHora().isAfter(s.getHora()) && sessaoAtualizada.getHora().isBefore(s.getHoraFinal())) {
                        return true;
                    }
                }
            }

        }

        return false; //TODO: implementar, provavelmente igual a login em validacao de funcionario
    }

    private boolean existeSessaoComHORARIO(Sessao sessao) {
        Iterator<Sessao> it = sessaoDAO.listar().iterator();
        while (it.hasNext()) {
            Sessao s = (Sessao) it.next();

            if (sessao.getSala().equals(s.getSala()) && sessao.getData().equals(s.getData())) {
                if (sessao.getHora().equals(s.getHora())) {
                    return true;
                } else if (sessao.getHora().isBefore(s.getHora()) && sessao.getHoraFinal().isAfter(s.getHora())) {
                    return true;

                } else if (sessao.getHora().isAfter(s.getHora()) && sessao.getHora().isBefore(s.getHoraFinal())) {
                    return true;
                }

            }

        }
        return false; //TODO: implementar, provavelmente igual a login em validacao de funcionario
    }

    @Override
    public EnumValidacoes cadastrar(Sessao sessao) {
        EnumValidacoes retornoValidacao = validarSessao(sessao);
        if (retornoValidacao.equals(EnumValidacoes.SESSAO_SUCESSO)) {
            sessaoDAO.incluir(sessao);
        }
        return retornoValidacao;
    }

    @Override
    public Sessao remover(Sessao sessao) {
        return null;
        //return sessoes.remove(sessoes.indexOf(sessao));
    }

    @Override
    public EnumValidacoes atualizar(Sessao sessao, Sessao sessaoAtualizada) {
        EnumValidacoes retornoValidacao = validarSessao(sessao, sessaoAtualizada);
        if (retornoValidacao.equals(EnumValidacoes.SESSAO_SUCESSO)) {
            //sessoes.set(sessoes.indexOf(sessao), sessaoAtualizada);
            return null;
        }
        return retornoValidacao;
    }

    @Override
    public Sessao consultar(Sessao sessao) {
        return sessaoDAO.consultarSessaoID(sessao.getId());                
    }

    public Boolean poltronaDisponivel(Sessao sessao, Poltrona poltrona) {
        return gerenciaSala.ConsultaPoltronaDisponivel(sessao.getSala(), poltrona);
    }

    public void atualizaPoltronaSessao(Sessao sessao, Poltrona poltrona) {
        gerenciaSala.atualizaPoltrona(sessao.getSala(), poltrona);
    }

    @Override
    public List<Sessao> relatorio() {
        return sessaoDAO.listar();
    }
}
