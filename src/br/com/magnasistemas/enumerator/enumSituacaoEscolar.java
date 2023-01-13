package br.com.magnasistemas.enumerator;

public enum enumSituacaoEscolar {
	Completo(1), Cursando(2), Incompleto(3);

	private final int escolaridade;

	enumSituacaoEscolar(int i) {
		escolaridade = i;
	}
}