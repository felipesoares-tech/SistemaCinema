package br.com.iftm.pv.cinema.sistemacinema.gerenciamento;

import br.com.iftm.pv.cinema.sistemacinema.interfaces.IGerencia;
import br.com.iftm.pv.cinema.sistemacinema.model.Cliente;
import java.util.List;
import lombok.Data;

@Data
public class GerenciaCliente implements IGerencia<Cliente> {

    private List<Cliente> clientes;

    public GerenciaCliente(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    public Boolean cadastrar(Cliente cliente) {
        if (!clientes.contains(cliente)) {
            return clientes.add(cliente);
        }
        return false;
    }

    public Cliente remover(Cliente cliente) {
        return clientes.remove(clientes.indexOf(cliente));
    }

    public Cliente atualizar(Cliente cliente, Cliente clienteAtualizado) {
        return clientes.set(clientes.indexOf(cliente), clienteAtualizado);
    }
    
    public Cliente consultar(Cliente cliente) {
        return clientes.get(clientes.indexOf(cliente));
    }

    public List<Cliente> relatorio(){
        return this.clientes;
    }

}
