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

		return this.nome + "," + this.genero + ","
				+ this.dataDeNascimento.getDayOfMonth() + "," + this.dataDeNascimento.getMonth() + ","
				+ this.dataDeNascimento.getYear() + "," + this.certidaoDeNascimento + "," + this.rg + "," + this.cpf
				+ "," + this.contato + "," + this.endereco + "," + this.escolaridade + "," + this.situacaoEscolar + ","
				+ this.cargo + "," + this.remuneracao + "," + this.carteiraDeTrabalho + "," + this.nomeDaEmpresa + ","
				+ this.diaDeInicio.getDayOfMonth() + "," + this.diaDeInicio.getMonth() + ","
				+ this.diaDeInicio.getYear() + "," + this.pis + '\n';
	}
	
	public String tiposDeDadosCSV() {
		return "nome, genero,etnia,dia, mes, ano, certidao de nascimento,rg, cpf, contato, Logradouro, numero, cep, cidade, UF, Pais, estado civil, escolaridade, situacao escolar, cargo, remuneracao, carteira de trabalho, nome da empresa, diaDeInicio, mesDeInicio, anoDeInicio, pis \n";
	}
}
