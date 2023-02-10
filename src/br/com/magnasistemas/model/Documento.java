package br.com.magnasistemas.model;

public class Documento {

	private String cpf;
	private String rg;
	private String certidaDeNascimento;

	public Documento(String cpf, String rg, String certidaDeNascimento) {
		this.cpf = cpf;
		this.rg = rg;
		this.certidaDeNascimento = certidaDeNascimento;
	}

}