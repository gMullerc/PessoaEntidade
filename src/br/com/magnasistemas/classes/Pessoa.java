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

	public void andar() {
		System.out.println("Andando...");
	}


	public void falar() throws IndexOutOfBoundsException {
		try {
			pensar();
			Scanner sc = new Scanner(System.in);
			int escolha = sc.nextInt();
			System.out.printf("%s: %s\n", this.nome, this.falas.get(escolha - 1));
			sc.close();
		} catch (IndexOutOfBoundsException e) {

			throw new IndexOutOfBoundsException("Voce ainda não aprendeu a falar essa frase, tente aprender antes");
		}

	}
 
	public void pegar() {
		System.out.println("Peguei..");
	}

	public void pensar() {

		System.out.println("|PENSANDO.. HMM|");
		for (int i = 0; i < falas.size(); i++) {

			System.out.printf("|%d - %23s|\n", i + 1, falas.get(i)); 
		}
	}

}
