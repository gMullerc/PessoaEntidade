package br.com.magnasistemas.enumerator;

public enum enumGenero {
	feminino(1), masculino(2), naoBinario(3);

	private final int genero;

	enumGenero(int i) {
		genero = i;
	}
}
