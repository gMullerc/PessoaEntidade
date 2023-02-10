
package testes;


import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.magnasistemas.enumerator.EnumTipoDeProfissional;
import br.com.magnasistemas.enumerator.enumEscolaridade;
import br.com.magnasistemas.enumerator.enumEstadoCivil;
import br.com.magnasistemas.enumerator.enumEtnia;
import br.com.magnasistemas.enumerator.enumGenero;
import br.com.magnasistemas.enumerator.enumSituacaoEscolar;
import br.com.magnasistemas.model.Contato;
import br.com.magnasistemas.model.Endereco;
import br.com.magnasistemas.model.Profissional;

public class TestaProfissional {

	Profissional t = new Profissional.Builder().nome("Guilherme").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
			.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184").cpf("324234234")
			.contato(new Contato(123123123, 1231231231, "Guilherme.mcos@gmail")).endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
			.estadoCivil(enumEstadoCivil.CASADO).escolaridade(enumEscolaridade.SUPERIOR)
			.situacaoEscolar(enumSituacaoEscolar.COMPLETO).cargo("Dev")
			.enumTipoDeProfissional(EnumTipoDeProfissional.AUTONOMO).remuneracao(2200.00).build();
	
	Profissional j = new Profissional.Builder().nome("Joao").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
			.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123973184").cpf("324234234")
			.contato(new Contato(123123123, 1231231231, "Guilherme.mcos@gmail")).endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
			.estadoCivil(enumEstadoCivil.CASADO).escolaridade(enumEscolaridade.SUPERIOR)
			.situacaoEscolar(enumSituacaoEscolar.COMPLETO).cargo("Dev")
			.enumTipoDeProfissional(EnumTipoDeProfissional.AUTONOMO).remuneracao(2200.00).build();

	@Test()
	@DisplayName("Verfica se o objeto foi populado corretamente")
	void verificarSeFoiCriadoCorretamente() {

		assertNotEquals(null, t);

	}

	@Test()
	@DisplayName("Esse teste deveria retornar que foi matriculado quando a situacao for diferente de cursando")
	void testeMetodoMatricularEmInstituicaoPOSITIVO() {

		assertEquals("Matriculado em: SUPERIOR", t.matricularEmUmaInstituicao(enumEscolaridade.SUPERIOR));

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
	@DisplayName("Testa o retorno do metodo trabalhar")
	void testaMetodoTrabalhar() {

		String trabalhar = null;
		String trabalharComValor = t.trabalhar();
		assertNotEquals(trabalhar, t.adicionarValores());
		assertEquals(trabalharComValor, t.trabalhar());

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