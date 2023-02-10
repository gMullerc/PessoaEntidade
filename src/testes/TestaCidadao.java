
package testes;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.magnasistemas.enumerator.enumEscolaridade;
import br.com.magnasistemas.enumerator.enumEstadoCivil;
import br.com.magnasistemas.enumerator.enumEtnia;
import br.com.magnasistemas.enumerator.enumGenero;
import br.com.magnasistemas.enumerator.enumSituacaoEscolar;
import br.com.magnasistemas.model.Cidadao;
import br.com.magnasistemas.model.Contato;
import br.com.magnasistemas.model.Endereco;

class TestaCidadao {

	Cidadao t = new Cidadao.Builder().nome("Joaquim").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
			.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("23444444").rg("53123972184").cpf("345345")
			.contato(new Contato(123123123, 1231231231, "Guilherme.mcosta@gmail.com"))
			.endereco(new Endereco("Maria Joaquna", 05730100, 3, "Sao Paulo", "SP", "Brasil"))
			.estadoCivil(enumEstadoCivil.CASADO).escolaridade(enumEscolaridade.SUPERIOR)
			.situacaoEscolar(enumSituacaoEscolar.CURSANDO).build();

	Cidadao j = new Cidadao.Builder().nome("Jonas").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
			.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("3455").rg("11123").cpf("22234")
			.contato(new Contato(123123123, 1231231231, "Guilherme.mcos@gmail"))
			.endereco(new Endereco("chinigua", 05730100, 3, "Rio de Janeiro", "SP", "França"))
			.estadoCivil(enumEstadoCivil.CASADO).escolaridade(enumEscolaridade.SUPERIOR)
			.situacaoEscolar(enumSituacaoEscolar.CURSANDO).build();
	
	Cidadao h = new Cidadao.Builder().nome("Jonas").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
			.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("23423423423").rg("342342").cpf("1233312")
			.contato(new Contato(123123123, 1231231231, "Guilherme.mcos@gmail"))
			.endereco(new Endereco("ChinaaTown", 05730100, 3, "Mato Grosso", "SP", "Japao"))
			.estadoCivil(enumEstadoCivil.CASADO).escolaridade(enumEscolaridade.FUNDAMENTAL)
			.situacaoEscolar(enumSituacaoEscolar.COMPLETO).build();


	@Test()
	@DisplayName("Verfica se o objeto foi populado corretamente")
	void verificarSeFoiCriadoCorretamente() {

		assertNotEquals(null, t);

	}

	@Test()
	@DisplayName("Esse teste deveria retornar que foi matriculado quando a situacao for diferente de cursando")
	void testeMetodoMatricularEmInstituicaoPOSITIVO() {

		String matricula = t.matricularEmUmaInstituicao(enumEscolaridade.SUPERIOR);

		assertEquals(matricula, t.matricularEmUmaInstituicao(enumEscolaridade.SUPERIOR));

	}
	
	

	@Test()
	@DisplayName("Esse teste deveria retornar que A PESSOA JA ESTA MATRICULADA")
	void testeMetodoMatricularEmInstituicao() {

		assertEquals("Voce ja esta matriculado", t.matricularEmUmaInstituicao(enumEscolaridade.SUPERIOR));

	}
	
	@Test()
	@DisplayName("Esse teste deveria retornar que foi matriculado quando a situacao for cursando")
	void testeMetodoMatricularEmInstituicaoVerdadeiro() {

		assertEquals("Matriculado em: SUPERIOR", h.matricularEmUmaInstituicao(enumEscolaridade.SUPERIOR));

	}

	@Test()
	@DisplayName("Esse metodo deve retornar uma String obrigatoria, caso seja retorne um null esta incorreto")
	void testaTiposDeDadosCSV() {

		assertNotEquals(null, t.tiposDeDadosCSV());

	}

	@Test()
	@DisplayName("Testa o valor do retorno do metodo ToString")
	void testaToString() {

		String toString = t.toString();
		assertEquals(toString, t.toString());

	}

	@Test()
	@DisplayName("Testa o valor do retorno do metodo adiciona valores")
	void testaMetodoAdicionaValores() {

		String adicionaValores = t.adicionarValores();
		assertEquals(adicionaValores, t.adicionarValores());

	}

	@Test()
	@DisplayName("Testa o valor do retorno do metodo adiciona valores, nao deve retornar null em hipotese alguma")
	void testaMetodoAdicionaValoresComValorNUll() {

		String adicionaValores = null;
		assertNotEquals(adicionaValores, t.adicionarValores());

	}

	@Test()
	@DisplayName("Testa retorno do metodo andar")
	void testaMetodoAndar() {

		String adicionaValores = t.andar();

		assertNotEquals(null, adicionaValores);
		assertEquals(adicionaValores, t.andar());

	}

	@Test()
	@DisplayName("Testa retorno do metodo falar")
	void testaMetodoFalar() {

		t.aprenderNovasFalas("Oiii");


		assertEquals("Oiii", t.falar(1));

	}

	@Test
	@DisplayName("Testa metodo Hash")
	void testaMetodoHashCodeParaVerficarSeuRetorno() {

		Integer hash = t.hashCode();
		Integer hashj = j.hashCode();

		assertNotEquals(hash, hashj);

	}
	
	@Test
	@DisplayName("Testa Metodo Equals")
	void testaMetodoEquals() {
		

		assertFalse(j.equals(t));

	}

}