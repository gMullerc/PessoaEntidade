package br.com.magnasistemas.classes.pessoaJuridica;

import java.util.ArrayList;
import java.util.List;

import br.com.magnasistemas.classes.Cidadao;

public abstract class organizacaoReligiosa extends DireitoPrivado {
	protected List<Cidadao> seguidores = new ArrayList<>();
	protected String religiao;

	public String orar() {

		return "Orando...";

	}

	public void consultarSeguidores() {
		for (Cidadao string : this.seguidores) {
			System.out.println(string);
		}

	}

	public Cidadao anotarNovoSeguidor(Cidadao s) {
		seguidores.add(s);
		return s;
	}

	@Override
	public String toString() {

		return super.toString() + "," + this.religiao + '\n';
	}
}
