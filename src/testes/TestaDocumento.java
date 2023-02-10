package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import br.com.magnasistemas.model.Documento;

public class TestaDocumento {

	
	Documento doc = new Documento("32423", "2323", "33324");
	@Test
	@DisplayName("Deve retornar um objeto preenchido sem valores null")
	public void testaCriacaoDoObjetoDocumento() {

		assertNotEquals(null, doc);
		assertEquals(doc, doc);

	}

	@Test
	@DisplayName("Verifica o retorno do metodo toString")
	public void testaOretornoMetodoToString() {

		String to = doc.toString();
		assertNotEquals(null, doc.toString());

		assertEquals(doc.toString(), to);

	}
	
	@Test
	@DisplayName("Verifica o retorno do metodo toString")
	public void testaGettersDocumentos() {

		String cpf = doc.getCpf();
		String certidao = doc.getCertidaoDeNascimento();
		String rg = doc.getRg();
		
		
		assertEquals(cpf, doc.getCpf());
		assertEquals(rg, doc.getRg());
		assertEquals(certidao, doc.getCertidaoDeNascimento());

	}
	

}
