package br.com.magnasistemas.enumerator;

public enum enumEstadoCivil {
	SOLTEIRO("Solteiro"), CASADO("Casado"), VIUVO("Víúvo"), DIVORCIADO("Divorciado");

	private String genero;

	enumEstadoCivil(String g) {
		this.genero = g;
	}

}
