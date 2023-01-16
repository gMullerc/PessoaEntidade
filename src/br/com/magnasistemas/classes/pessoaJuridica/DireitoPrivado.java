package br.com.magnasistemas.classes.pessoaJuridica;

import java.util.List;

import br.com.magnasistemas.classes.Cidadao;
import br.com.magnasistemas.classes.formal.Clt;
import br.com.magnasistemas.classes.formal.Estagiario;
import br.com.magnasistemas.classes.formal.ProfissionalFormal;

public abstract class DireitoPrivado extends PessoaJuridica {
	protected String sigla;
	protected List<ProfissionalFormal> funcionarios;

	private void contratarFuncionarioCLT(Clt c) {

		
		this.funcionarios.add(c);
	}

	private void contratarFuncionarioCLT(Estagiario c) {

		this.funcionarios.add(c);
	}

	private void ListarFuncionario() {
		for (Cidadao string : this.funcionarios) {
			System.out.println(string);
		}
	}
}
