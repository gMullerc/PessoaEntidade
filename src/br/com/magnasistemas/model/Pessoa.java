package br.com.magnasistemas.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import br.com.magnasistemas.enumerator.enumEtnia;
import br.com.magnasistemas.enumerator.enumGenero;

public abstract class Pessoa {
	protected String nome;
	protected Endereco endereco;
	protected Contato contato;
	protected enumGenero genero;
	protected enumEtnia etnia;
	protected LocalDate dataDeNascimento;
	private static final String ANDAR = "Andando...";

	protected List<String> falas = new ArrayList<>();

	public void aprenderNovasFalas(String frase) {
		this.falas.add(frase);
	}

	public String andar() {
		return ANDAR;
	}

	public String falar(int i) {
		return this.falas.get(i - 1);
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, genero, etnia, dataDeNascimento);
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

}
