package br.com.magnasistemas.enumerator;

public enum enumEscolaridade {
	FUNDAMENTAL("Fundamental"), MEDIO("Medio"), SUPERIOR("Superior");

	private final String escolaridade;

	enumEscolaridade(String i) {
		this.escolaridade = i;
	}

}