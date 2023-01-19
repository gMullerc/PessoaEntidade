package br.com.magnasistemas.classes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.magnasistemas.enumerator.enumEtnia;
import br.com.magnasistemas.enumerator.enumGenero;

public abstract class Pessoa {
	protected String nome;
	protected enumGenero genero;
	protected enumEtnia etnia;
	protected LocalDate dataDeNascimento;
	protected List<String> falas = new ArrayList<>();

	public void aprenderNovasFalas(String frase) {
		this.falas.add(frase);
	}

	public String andar() {
		return "Andando...";
	}

	
	public Integer getFrasesAprendidas() {
		return this.falas.size();

	}

	public boolean pensar() {

		System.out.println("|PENSANDO.. HMM|");
		for (int i = 0; i < falas.size(); i++) {

			System.out.printf("|%d - %23s|\n", i + 1, falas.get(i));

		}
		return true;
	}

}
