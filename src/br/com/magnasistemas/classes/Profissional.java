package br.com.magnasistemas.classes;

public abstract class Profissional extends Cidadao {

	protected String cargo;
	protected double remuneracao;


	public String trabalhar() {

		return "indo trabalhar...";
	}
	public double getRemuneracao() {
		return remuneracao;
	}

}
