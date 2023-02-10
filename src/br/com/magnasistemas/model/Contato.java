package br.com.magnasistemas.model;

public class Contato {

	private Integer telefone;
	private Integer celular;
	private String email;

	public Contato(Integer telefone, Integer celular, String email) {
		this.telefone = telefone;
		this.celular = celular;
		this.email = email;
	}


	@Override
	public String toString() {
		return "Contato \n[telefone: " + telefone + ", celular: " + celular + ", email: " + email + "]";
	}

}