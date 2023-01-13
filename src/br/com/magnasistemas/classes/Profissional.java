package br.com.magnasistemas.classes;

public abstract class Profissional extends Cidadao {

	protected String cargo;
	protected double remuneracao;


	public void trabalhar() {

		System.out.println("indo trabalhar...");
	}

}
