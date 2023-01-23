package br.com.magnasistemas.testesJUnit.PessoaJuridica;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AssertionsKt;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.magnasistemas.classes.Cidadao;
import br.com.magnasistemas.classes.Endereco;
import br.com.magnasistemas.classes.formal.Trainee;
import br.com.magnasistemas.classes.pessoaJuridica.Igreja;
import br.com.magnasistemas.classes.pessoaJuridica.Seitas;
import br.com.magnasistemas.enumerator.enumEscolaridade;
import br.com.magnasistemas.enumerator.enumEstadoCivil;
import br.com.magnasistemas.enumerator.enumEtnia;
import br.com.magnasistemas.enumerator.enumGenero;
import br.com.magnasistemas.enumerator.enumSituacaoEscolar;

class TestesClasseOrganizacaoReligiosa {

	@Test()
	@DisplayName("Verifica se o metodo anotar novo seguidor está realmente anotando um novo seguidor")
	void TesteNoMetodoAnotarNovoSeguidor() {

		Igreja i = new Igreja.Builder().nome("Guilherme").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184")
				.cpf("324234234").contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.estadoCivil(enumEstadoCivil.SOLTEIRO).escolaridade(enumEscolaridade.SUPERIOR)
				.situacaoEscolar(enumSituacaoEscolar.CURSANDO).cargo("Dev").remuneracao(2200.00).cnpj("2323")
				.razaoSocial("Grande").nomeFantasia("")
				.enderecoProfissional(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail")).Sigla("EIRELI")
				.religiao("CATOLICA").build();

		Cidadao t = new Cidadao.Builder().nome("Guilherme").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184")
				.cpf("324234234").contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.estadoCivil(enumEstadoCivil.SOLTEIRO).escolaridade(enumEscolaridade.SUPERIOR)
				.situacaoEscolar(enumSituacaoEscolar.INCOMPLETO).build();

		assertEquals(t, i.anotarNovoSeguidor(t));

	}

	@Test()
	@DisplayName("Verifica se está retornando uma string")
	void testeMetodoOrar() {

		Igreja i = new Igreja.Builder().nome("Guilherme").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184")
				.cpf("324234234").contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.estadoCivil(enumEstadoCivil.SOLTEIRO).escolaridade(enumEscolaridade.SUPERIOR)
				.situacaoEscolar(enumSituacaoEscolar.CURSANDO).cargo("Dev").remuneracao(2200.00).cnpj("2323")
				.razaoSocial("Grande").nomeFantasia("")
				.enderecoProfissional(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail")).Sigla("EIRELI")
				.religiao("CATOLICA").build();

		assertEquals("Orando...", i.orar());

	}

	@Test()
	@DisplayName("Verifica se está retornando uma string")
	void testeMetodoAdicionarValores() {

		Igreja i = new Igreja.Builder().nome("Guilherme").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184")
				.cpf("324234234").contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.estadoCivil(enumEstadoCivil.SOLTEIRO).escolaridade(enumEscolaridade.SUPERIOR)
				.situacaoEscolar(enumSituacaoEscolar.CURSANDO).cargo("Dev").remuneracao(2200.00).cnpj("2323")
				.razaoSocial("Grande").nomeFantasia("")
				.enderecoProfissional(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail")).Sigla("EIRELI")
				.religiao("CATOLICA").build();

		String val = i.AdicionarValores();
		assertEquals(val, i.AdicionarValores());

	}

	@Test()
	@DisplayName("Verifica se está retornando uma string nao vazia")
	void testeMetodoAdicionarValoresVazio() {

		Igreja i = new Igreja.Builder().nome("Guilherme").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184")
				.cpf("324234234").contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.estadoCivil(enumEstadoCivil.SOLTEIRO).escolaridade(enumEscolaridade.SUPERIOR)
				.situacaoEscolar(enumSituacaoEscolar.CURSANDO).cargo("Dev").remuneracao(2200.00).cnpj("2323")
				.razaoSocial("Grande").nomeFantasia("")
				.enderecoProfissional(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail")).Sigla("EIRELI")
				.religiao("CATOLICA").build();

		assertNotEquals("", i.AdicionarValores());

	}

	@Test()
	@DisplayName("Verifica o metodo tipo de dados se esta vindo diferente de vazio")
	void testeMetodoTipoDeDados() {

		Igreja i = new Igreja.Builder().nome("Guilherme").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184")
				.cpf("324234234").contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.estadoCivil(enumEstadoCivil.SOLTEIRO).escolaridade(enumEscolaridade.SUPERIOR)
				.situacaoEscolar(enumSituacaoEscolar.CURSANDO).cargo("Dev").remuneracao(2200.00).cnpj("2323")
				.razaoSocial("Grande").nomeFantasia("")
				.enderecoProfissional(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail")).Sigla("EIRELI")
				.religiao("CATOLICA").build();

		assertNotEquals("", i.tiposDeDadosCSV());

	}

	@Test()
	@DisplayName("Verifica o metodo to String")
	void testeMetodoToString() {

		Igreja i = new Igreja.Builder().nome("Guilherme").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184")
				.cpf("324234234").contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.estadoCivil(enumEstadoCivil.SOLTEIRO).escolaridade(enumEscolaridade.SUPERIOR)
				.situacaoEscolar(enumSituacaoEscolar.CURSANDO).cargo("Dev").remuneracao(2200.00).cnpj("2323")
				.razaoSocial("Grande").nomeFantasia("")
				.enderecoProfissional(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail")).Sigla("EIRELI")
				.religiao("CATOLICA").build();

		assertNotEquals("", i.toString());

	}



	@Test()
	@DisplayName("Consulta se os seguidores estao sendo pesquisados corretamente")
	void testeMetodoConsultaSeguidores() {

		Igreja i = new Igreja.Builder().nome("Guilherme").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184")
				.cpf("324234234").contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.estadoCivil(enumEstadoCivil.SOLTEIRO).escolaridade(enumEscolaridade.SUPERIOR)
				.situacaoEscolar(enumSituacaoEscolar.CURSANDO).cargo("Dev").remuneracao(2200.00).cnpj("2323")
				.razaoSocial("Grande").nomeFantasia("")
				.enderecoProfissional(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail")).Sigla("EIRELI")
				.religiao("CATOLICA").build();

		Cidadao t = new Cidadao.Builder().nome("Guilherme").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184")
				.cpf("324234234").contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.estadoCivil(enumEstadoCivil.SOLTEIRO).escolaridade(enumEscolaridade.SUPERIOR)
				.situacaoEscolar(enumSituacaoEscolar.INCOMPLETO).build();

		i.anotarNovoSeguidor(t);
		System.out.println(t);
		assertNotEquals("", i.consultarSeguidores());

	}

	@Test()
	@DisplayName("Consulta se os seguidores estao sendo pesquisados corretamente, caso nao tenha adicionado nenhum")
	void testeMetodoConsultaSeguidoresSemADicionar() {

		Igreja i = new Igreja.Builder().nome("Guilherme").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184")
				.cpf("324234234").contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.estadoCivil(enumEstadoCivil.SOLTEIRO).escolaridade(enumEscolaridade.SUPERIOR)
				.situacaoEscolar(enumSituacaoEscolar.CURSANDO).cargo("Dev").remuneracao(2200.00).cnpj("2323")
				.razaoSocial("Grande").nomeFantasia("")
				.enderecoProfissional(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail")).Sigla("EIRELI")
				.religiao("CATOLICA").build();

		Cidadao t = new Cidadao.Builder().nome("Guilherme").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184")
				.cpf("324234234").contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.estadoCivil(enumEstadoCivil.SOLTEIRO).escolaridade(enumEscolaridade.SUPERIOR)
				.situacaoEscolar(enumSituacaoEscolar.INCOMPLETO).build();


		assertEquals("", i.consultarSeguidores());

	}
}
