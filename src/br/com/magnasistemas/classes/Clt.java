package br.com.magnasistemas.classes;

public abstract class Clt extends ProfissionalFormal {
	protected double saldoFgts;
	protected int pis;
	protected int carteiraDeTrabalho;
	public double consultarFgts() {
		return this.saldoFgts;
	}

}
