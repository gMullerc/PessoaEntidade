package br.com.magnasistemas.classes.formal;

public abstract class Clt extends ProfissionalFormal {
	protected double saldoFgts;
	protected int pis;
	protected int carteiraDeTrabalho;

	public double consultarFgts() {
		return this.saldoFgts;
	}

	public void setSaldoFgts(double saldoFgts) {
		this.saldoFgts = saldoFgts;
	}

	@Override
	public String toString() {

		/*
		 * return "{" + "nome: " + this.nome + '\n' + "genero: " + this.genero + '\n' +
		 * "etnia: " + this.etnia + '\n' + "data de nascimento: " +
		 * this.dataDeNascimento + '\n' + "certidao de nascimento:  " +
		 * this.certidaoDeNascimento + '\n' + "rg: " + this.rg + '\n' + "cpf: " +
		 * this.cpf + '\n' + "contato: " + contato + '\n' + "endereco: " + this.endereco
		 * + '\n' + "estado civil: " + this.estadoCivil + '\n' + "escolaridade: " +
		 * this.escolaridade + '\n' + "situacao escolar: " + this.situacaoEscolar + '\n'
		 * + "cargo: " + this.cargo + '\n' + "remuneracao: " + this.remuneracao + '\n' +
		 * "carteira de trabalho: " + this.carteiraDeTrabalho + '\n' +
		 * "nome da empresa: " + this.nomeDaEmpresa + '\n' + "dia de inicio: " +
		 * this.diaDeInicio + '\n' + "pis: " + this.pis+'}' +'\n'+'\n'+'\n'+'\n';
		 */
		return "nome, genero,etnia,dia, mes, ano, certidao de nascimento, "
				+ "rg, cpf, contato, Logradouro, numero, cep, cidade, UF, Pais, estado civil, escolaridade, situacao escolar, cargo, remuneracao, carteira de trabalho, "
				+ "nome da empresa, diaDeInicio, mesDeInicio, anoDeInicio, pis\n" + this.nome + "," + this.genero + ","
				+ this.dataDeNascimento.getDayOfMonth() + "," + this.dataDeNascimento.getMonth() + ","
				+ this.dataDeNascimento.getYear() + "," + this.certidaoDeNascimento + "," + this.rg + "," + this.cpf
				+ "," + this.contato + "," + this.endereco + "," + this.escolaridade + "," + this.situacaoEscolar + ","
				+ this.cargo + "," + this.remuneracao + "," + this.carteiraDeTrabalho + "," + this.nomeDaEmpresa + ","
				+ this.diaDeInicio.getDayOfMonth() + "," + this.diaDeInicio.getMonth() + ","
				+ this.diaDeInicio.getYear() + "," + this.pis;
	}
}
