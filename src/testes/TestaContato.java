package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import br.com.magnasistemas.model.Contato;

public class TestaContato {

	
	@Test
	@DisplayName("Deve retornar um objeto preenchido sem valores null")
	public void testaCriacaoDoObjetoDocumento() {
	
		Contato contato = new Contato(123123, 12312312, "Guilherme.mcosta15@gmail.com");
		assertNotEquals(null, contato);
		assertEquals(contato, contato);
		
	}
	
	@Test
	@DisplayName("Deve retornar um os valores do contato")
	public void testaMetodoToStringContato() {
	
		Contato contato = new Contato(123123, 12312312, "Guilherme.mcosta15@gmail.com");

		String valor = contato.toString();
		
		assertEquals(valor, contato.toString());
		assertNotEquals(null, contato.toString());
	}
	
}
