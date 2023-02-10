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

	public String getLogradouro() {
		return logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public String getCidade() {
		return cidade;
	}

	public String getUf() {
		return uf;
	}

	public String getPais() {
		return pais;
	}

	public int getCep() {
		return cep;
	}

	@Override
	public String toString() {
		return logradouro + "," + numero + "," + cidade + "," + uf + "," + pais + "," + cep;
	}


	

}