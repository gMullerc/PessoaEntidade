package br.com.magnasistemas.classes;

public class Endereco {
	private String rua;
	private int numero;
	private String cidade;
	private String uf;
	private String pais;
	private int cep;

	public Endereco(String rua, int cep, int numero, String cidade, String uf, String pais) {

		this.rua = rua;
		this.numero = numero;
		this.cidade = cidade;
		this.uf = uf;
		this.pais = pais;
		this.cep = cep;
	}

	@Override
	public String toString() {
		return this.rua + "," + this.numero + "," + this.cep + "," + this.cidade + "," + this.uf + "," + this.pais;
	}

}