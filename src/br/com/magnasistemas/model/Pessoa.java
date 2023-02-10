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

	protected List<String> falas = new ArrayList<>();
	private int hashcode;

	public String getNome() {
		return nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public Contato getContato() {
		return contato;
	}

	public enumGenero getGenero() {
		return genero;
	}

	public enumEtnia getEtnia() {
		return etnia;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public int getHashcode() {
		return hashcode;
	}

	public void aprenderNovasFalas(String frase) {
		this.falas.add(frase);
	}

	public String andar() {
		return "Andando...";
	}

	public String falar(int i) {
		String val = this.falas.get(i - 1);
		return val;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, genero, etnia, dataDeNascimento);
	}

	public boolean pensar() {

		System.out.println("|PENSANDO.. HMM|");
		for (int i = 0; i < falas.size(); i++) {

			System.out.printf("|%d - %23s|\n", i + 1, falas.get(i));

		}
		return true;
	}

}
