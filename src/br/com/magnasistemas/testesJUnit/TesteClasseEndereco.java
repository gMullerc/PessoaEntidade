package br.com.magnasistemas.testesJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.magnasistemas.classes.Endereco;

class TesteClasseEndereco {

	@Test()
	@DisplayName("Esse teste valida se o objeto foi criado com as informacoes passadas")
	void testeMetodoMatricularEmInstituicaoPOSITIVO() {

		Endereco end = new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brasil");
	
		
		assertNotEquals(null, end);
	}
}
	
