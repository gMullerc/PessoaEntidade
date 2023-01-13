package br.com.magnasistemas.enumerator;

public enum enumEscolaridade {
	ensinoFundamental(1), ensinoMedio(2), ensinoSuperior(3);

	private final int escolaridade;

	enumEscolaridade(int i) {
		escolaridade = i;
	}

}