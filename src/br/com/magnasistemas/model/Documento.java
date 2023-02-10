package br.com.magnasistemas.model;

public class Documento {

	private String cpf;
	private String rg;
	private String certidaoDeNascimento;

	public Documento(String cpf, String rg, String certidaoDeNascimento) {
		this.cpf = cpf;
		this.rg = rg;
		this.certidaoDeNascimento = certidaoDeNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public String getCertidaoDeNascimento() {
		return certidaoDeNascimento;
	}

	public String getRg() {
		return rg;
	}

}