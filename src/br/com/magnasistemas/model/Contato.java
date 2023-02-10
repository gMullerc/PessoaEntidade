package br.com.magnasistemas.model;

public class Contato {

	private Long telefone;
	private Long celular;
	private String email;

	public Contato(Long telefone, Long celular, String email) {
		this.telefone = telefone;
		this.celular = celular;
		this.email = email;
	}

	public Long getTelefone() {
		return telefone;
	}

	public Long getCelular() {
		return celular;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "Contato \n[telefone: " + telefone + ", celular: " + celular + ", email: " + email + "]";
	}

}