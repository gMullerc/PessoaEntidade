package br.com.magnasistemas.classes.pessoaJuridica;

import java.util.ArrayList;
import java.util.List;

import br.com.magnasistemas.classes.Cidadao;
import br.com.magnasistemas.classes.formal.Clt;
import br.com.magnasistemas.classes.formal.Estagiario;
import br.com.magnasistemas.classes.formal.ProfissionalFormal;

public abstract class DireitoPrivado extends PessoaJuridica {
	protected String sigla;
	protected List<ProfissionalFormal> funcionarios = new ArrayList<>();

	public ProfissionalFormal contratarFuncionario(ProfissionalFormal c) {

		
		this.funcionarios.add(c);
		return c;
	}


	public boolean realizarPagamento(double valor, Clt p){
		
		if(valor != p.getRemuneracao()) {
			return false;
		}else {
			p.setSaldoFgts(valor * 0.06);
			System.out.printf("Um valor de: %.2f foi depositado", valor);
			return true;
		}
		
	}

	public void ListarFuncionario() {
		for (Cidadao string : this.funcionarios) {
			System.out.println(string);
		}
	}
}
