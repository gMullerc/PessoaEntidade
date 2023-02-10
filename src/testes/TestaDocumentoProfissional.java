package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import br.com.magnasistemas.model.DocumentosProfissionais;

public class TestaDocumentoProfissional {

	
	@Test
	@DisplayName("Deve retornar um objeto preenchido sem valores null")
	public void testaCriacaoDoObjetoDocumento() {
	
		DocumentosProfissionais doc = new DocumentosProfissionais(2342342l, 333242323l);
		assertNotEquals(null, doc);
		assertEquals(doc, doc);
		
	}
	
	@Test
	@DisplayName("Verifica o retorno do metodo toString")
	public void testaOretornoMetodoToString() {
	
		DocumentosProfissionais doc = new DocumentosProfissionais(2342342l, 333242323l);
		String to = doc.toString();
		assertNotEquals(null, doc.toString());
		
		assertEquals(doc.toString(), to);
		
	}
}
