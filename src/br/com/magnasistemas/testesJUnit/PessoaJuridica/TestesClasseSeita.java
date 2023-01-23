package br.com.magnasistemas.testesJUnit.PessoaJuridica;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.magnasistemas.classes.Cidadao;
import br.com.magnasistemas.classes.Endereco;
import br.com.magnasistemas.classes.pessoaJuridica.Igreja;
import br.com.magnasistemas.classes.pessoaJuridica.Seitas;
import br.com.magnasistemas.enumerator.enumEscolaridade;
import br.com.magnasistemas.enumerator.enumEstadoCivil;
import br.com.magnasistemas.enumerator.enumEtnia;
import br.com.magnasistemas.enumerator.enumGenero;
import br.com.magnasistemas.enumerator.enumSituacaoEscolar;

class TestesClasseSeita {
	@Test()
	@DisplayName("Verfica se o objeto foi populado corretamente")
	void verificarSeFoiCriadoCorretamente() {

		Seitas i = new Seitas.Builder().nome("Guilherme").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184")
				.cpf("324234234").contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.estadoCivil(enumEstadoCivil.SOLTEIRO).escolaridade(enumEscolaridade.SUPERIOR)
				.situacaoEscolar(enumSituacaoEscolar.CURSANDO).cargo("Dev").remuneracao(2200.00).cnpj("2323")
				.razaoSocial("Grande").nomeFantasia("")
				.enderecoProfissional(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.Sigla("Sociedade").religiao("catolica").build();

		
		Seitas t = new Seitas.Builder().nome("Joao").genero(enumGenero.FEMININO).etnia(enumEtnia.BRANCO)
				.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184")
				.cpf("324234234").contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.estadoCivil(enumEstadoCivil.SOLTEIRO).escolaridade(enumEscolaridade.SUPERIOR)
				.situacaoEscolar(enumSituacaoEscolar.CURSANDO).cargo("Dev").remuneracao(2200.00).cnpj("2323")
				.razaoSocial("Grande").nomeFantasia("")
				.enderecoProfissional(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.Sigla("Sociedade").religiao("catolica").build();

		
	
		
		assertFalse(i.equals(t));
		
	}

	@Test()
	@DisplayName("Verifica o metodo tipo de dados se esta vindo diferente de vazio")
	void testeMetodoTipoDeDados() {

		Seitas i = new Seitas.Builder().nome("Guilherme").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184")
				.cpf("324234234").contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.estadoCivil(enumEstadoCivil.SOLTEIRO).escolaridade(enumEscolaridade.SUPERIOR)
				.situacaoEscolar(enumSituacaoEscolar.CURSANDO).cargo("Dev").remuneracao(2200.00).cnpj("2323")
				.razaoSocial("Grande").nomeFantasia("")
				.enderecoProfissional(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.Sigla("Sociedade").religiao("catolica").build();

		String val = i.tiposDeDadosCSV();
		System.out.println(i.tiposDeDadosCSV());
		assertNotEquals("", i.tiposDeDadosCSV());
	}
 
	@Test()
	@DisplayName("Verifica o metodo to String")
	void testeMetodoToString() {

		Seitas i = new Seitas.Builder().nome("Guilherme").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184")
				.cpf("324234234").contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.estadoCivil(enumEstadoCivil.SOLTEIRO).escolaridade(enumEscolaridade.SUPERIOR)
				.situacaoEscolar(enumSituacaoEscolar.CURSANDO).cargo("Dev").remuneracao(2200.00).cnpj("2323")
				.razaoSocial("Grande").nomeFantasia("")
				.enderecoProfissional(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.Sigla("Sociedade").religiao("catolica").build();

		String val = i.toString();
		assertEquals(val, i.toString());

	}

}
