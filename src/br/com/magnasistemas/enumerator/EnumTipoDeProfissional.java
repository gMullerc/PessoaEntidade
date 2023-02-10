package br.com.magnasistemas.enumerator;

public enum EnumTipoDeProfissional {
	CLT("Clt"), AUTONOMO("Cursando");

	private final String tipoDeProfissional;

	EnumTipoDeProfissional(String i) {
		tipoDeProfissional = i;
	}
}
