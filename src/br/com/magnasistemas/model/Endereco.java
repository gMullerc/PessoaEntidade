package br.com.magnasistemas.model;

public class Endereco {
	private String logradouro;
	private int numero;
	private String cidade;
	private String uf;
	private String pais;
	private int cep;

	public Endereco(String logradouro, int cep, int numero, String cidade, String uf, String pais) {

		this.logradouro = logradouro;
		this.numero = numero;
		this.cep = cep;
		this.cidade = cidade;
		this.uf = uf;
		this.pais = pais;

	}


	@Override
	public String toString() {
		return logradouro + "," + numero + "," + cidade + "," + uf + "," + pais + "," + cep;
	}


	

}