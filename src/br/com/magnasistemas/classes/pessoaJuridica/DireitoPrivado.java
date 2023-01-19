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
	public boolean demitirFuncionario(ProfissionalFormal f) {
		boolean val = false;
		for (int i = 0; i < this.funcionarios.size(); i++) {
			if(this.funcionarios.get(i).equals(f)) {
				this.funcionarios.remove(i);
				val = true;
			}else {
				System.out.println("Funcionario Inexistente");
				val = false;
			}
			
		}return val;
	}

	public void ListarFuncionario() {
		for (Cidadao string : this.funcionarios) {
			System.out.println(string);
		}
		
		
	}
	@Override
	public String toString() {
		/*return "{" + "nome: " + this.nome + '\n' + "genero: " + this.genero + '\n' + "etnia: " + this.etnia + '\n'
				+ "data de nascimento: " + this.dataDeNascimento + '\n' + "certidao de nascimento:  "
				+ this.certidaoDeNascimento + '\n' + "rg: " + this.rg + '\n' + "cpf: " + this.cpf + '\n' + "contato: "
				+ contato + '\n' + "endereco: " + this.endereco + '\n' + "estado civil: " + this.estadoCivil + '\n'
				+ "escolaridade: " + this.escolaridade + '\n' + "situacao escolar: " + this.situacaoEscolar + '\n'
				+ "cargo: " + this.cargo + '\n' + "Remuneracao: " + this.remuneracao + '\n' + "CNPJ: " + this.cnpj
				+ '\n' + "Razao Social: " + this.razaoSocial + '\n' + "Nome Fantasia: " + this.nomeFantasia
				+ "Endereco da Empresa: " + this.enderecoEmpresarial + '\n' + "Sigla: " + this.sigla;*/
		
		return this.nome + "," + this.genero + "," + this.dataDeNascimento.getDayOfMonth() + ","
		+ this.dataDeNascimento.getMonth() + "," + this.dataDeNascimento.getYear() + ","
		+ this.certidaoDeNascimento + "," + this.rg + "," + this.cpf + "," + this.contato + "," + this.endereco
		+ "," + this.escolaridade + "," + this.situacaoEscolar  + "," + this.cargo  + "," + this.remuneracao  + "," + this.cnpj  + "," + this.razaoSocial  + "," + this.nomeFantasia
		 + "," + this.enderecoEmpresarial;

	}
}
