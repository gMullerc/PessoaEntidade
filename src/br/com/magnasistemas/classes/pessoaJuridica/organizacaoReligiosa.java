package br.com.magnasistemas.classes.pessoaJuridica;

import java.util.List;

import br.com.magnasistemas.classes.Cidadao;

public abstract class organizacaoReligiosa extends DireitoPrivado {
	protected List<Cidadao> seguidores;
	protected String religiao;
	
	private void orar() {
	
		System.out.println("Orando...");

	}
}
