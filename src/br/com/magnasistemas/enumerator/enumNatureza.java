package br.com.magnasistemas.enumerator;

public enum enumNatureza {
	ANONIMA("Anonima"), LIMITADA("Limitada"), SIMPLES("Simples");

	private final String natureza;

	enumNatureza(String i) {
		natureza = i;
	}
}
