package br.com.magnasistemas.enumerator;

public enum enumSituacaoEscolar {
	COMPLETO("Completo"), CURSANDO("Cursando"), INCOMPLETO("Incompleto");

	private final String escolaridade;

	enumSituacaoEscolar(String i) {
		escolaridade = i;
	}
}