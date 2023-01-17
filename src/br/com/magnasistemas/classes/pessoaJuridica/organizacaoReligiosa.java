package br.com.magnasistemas.classes.pessoaJuridica;

import java.util.ArrayList;
import java.util.List;

import br.com.magnasistemas.classes.Cidadao;

public abstract class organizacaoReligiosa extends DireitoPrivado {
	protected List<Cidadao> seguidores = new ArrayList<>();
	protected String religiao;

	public void orar() {

		System.out.println("Orando...");

	}

	public void consultarSeguidores() {
		for (Cidadao string : this.seguidores) {
			System.out.println(string);
		}

	}

	public void anotarNovoSeguidor(Cidadao s) {
		seguidores.add(s);
	}

}
