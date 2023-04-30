
package br.com.iftm.pv.cinema.sistemacinema.gerenciamento;

import br.com.iftm.pv.cinema.sistemacinema.interfaces.IGerencia;
import br.com.iftm.pv.cinema.sistemacinema.model.Funcionario;
import java.util.ArrayList;


public class GerenciaFuncionario implements IGerencia<Funcionario>{
    private ArrayList<Funcionario> funcionarios;

     public Boolean cadastrar(Funcionario funcionario) {
        if (!funcionarios.contains(funcionario)) {
            return funcionarios.add(funcionario);
        }
        return false;
    }

    public Funcionario remover(Funcionario funcionario) {
        return funcionarios.remove(funcionarios.indexOf(funcionario));
    }

    public Funcionario atualizar(Funcionario funcionario, Funcionario funcionarioAtualizado) {
        return funcionarios.set(funcionarios.indexOf(funcionario), funcionarioAtualizado);
    }

    public Funcionario consultar(Funcionario funcionario) {
        return funcionarios.get(funcionarios.indexOf(funcionario));
    }

    public ArrayList<Funcionario> relatorio() {
        return this.funcionarios;
    }
}
