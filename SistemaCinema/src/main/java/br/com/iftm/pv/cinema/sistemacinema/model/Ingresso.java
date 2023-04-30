
package br.com.iftm.pv.cinema.sistemacinema.model;

import br.com.iftm.pv.cinema.sistemacinema.enums.TipoIngresso;

public class Ingresso {
    private Integer id;
    private Sessao sessao;
    private Cliente cliente;
    private TipoIngresso tipoIngresso;
    private Double valor;

    public Ingresso(Sessao sessao, Cliente cliente, TipoIngresso tipoIngresso, Double valor) {
        this.sessao = sessao;
        this.cliente = cliente;
        this.tipoIngresso = tipoIngresso;
        this.valor = valor;
    }
    
    
    
}
