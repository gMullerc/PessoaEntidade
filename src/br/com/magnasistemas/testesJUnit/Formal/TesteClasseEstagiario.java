package br.com.magnasistemas.testesJUnit.Formal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.magnasistemas.classes.Endereco;
import br.com.magnasistemas.classes.formal.Empregado;
import br.com.magnasistemas.classes.formal.Estagiario;
import br.com.magnasistemas.classes.formal.JovemAprendiz;
import br.com.magnasistemas.classes.formal.Trainee;
import br.com.magnasistemas.enumerator.enumEscolaridade;
import br.com.magnasistemas.enumerator.enumEstadoCivil;
import br.com.magnasistemas.enumerator.enumEtnia;
import br.com.magnasistemas.enumerator.enumGenero;
import br.com.magnasistemas.enumerator.enumSituacaoEscolar;

class TesteClasseEstagiario {

	@Test()
	@DisplayName("Verifica se o objeto foi construido corretamente")
	void testaSeFoiCorretamentePopulado() {

		Estagiario t = new Estagiario.Builder().nome("Guilherme").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184")
				.cpf("324234234").contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail")).estadoCivil(enumEstadoCivil.VIUVO)
				.escolaridade(enumEscolaridade.SUPERIOR).situacaoEscolar(enumSituacaoEscolar.CURSANDO).cargo("Dev")
				.remuneracao(2200.00).nomeDaEmpresa("MagnaSitemas")
				.diaDeInicio(LocalDate.of(2020, Month.JULY, 05)).build();

		
		assertNotEquals(null, t);
	}
	@Test()
	@DisplayName("Verifica se esta apto para ser Estagiario")
	void testaSeEleEstaApto() {

		Estagiario t = new Estagiario.Builder().nome("Guilherme").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184")
				.cpf("324234234").contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail")).estadoCivil(enumEstadoCivil.VIUVO)
				.escolaridade(enumEscolaridade.SUPERIOR).situacaoEscolar(enumSituacaoEscolar.CURSANDO).cargo("Dev")
				.remuneracao(2200.00).nomeDaEmpresa("MagnaSitemas")
				.diaDeInicio(LocalDate.of(2020, Month.JULY, 05)).build();

		 String valor = t.verificar();
		assertEquals("Estah apto...", valor);
	}
	@Test()
	@DisplayName("Verifica se esta apto para ser Estagiario")
	void testaSeEleNaoEstaApto() {

		Estagiario t = new Estagiario.Builder().nome("Guilherme").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184")
				.cpf("324234234").contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail")).estadoCivil(enumEstadoCivil.VIUVO)
				.escolaridade(enumEscolaridade.SUPERIOR).situacaoEscolar(enumSituacaoEscolar.INCOMPLETO).cargo("Dev")
				.remuneracao(2200.00).nomeDaEmpresa("MagnaSitemas")
				.diaDeInicio(LocalDate.of(2020, Month.JULY, 05)).build();

		 String valor = t.verificar();
		assertEquals("Para ser um Estagiario é necessário estar cursando o ensino medio ou superior", valor);
	}
	
	@Test()
	@DisplayName("Verifica se está retornando uma string nao vazia")
	void testeMetodoAdicionarValoresVazio() {

		Estagiario i = new Estagiario.Builder().nome("Guilherme").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184")
				.cpf("324234234").contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail")).estadoCivil(enumEstadoCivil.VIUVO)
				.escolaridade(enumEscolaridade.SUPERIOR).situacaoEscolar(enumSituacaoEscolar.INCOMPLETO).cargo("Dev")
				.remuneracao(2200.00).nomeDaEmpresa("MagnaSitemas")
				.diaDeInicio(LocalDate.of(2020, Month.JULY, 05)).build();

		assertNotEquals("", i.AdicionarValores());

	}

	@Test()
	@DisplayName("Verifica o metodo tipo de dados se esta vindo diferente de vazio")
	void testeMetodoTipoDeDados() {

		Estagiario i = new Estagiario.Builder().nome("Guilherme").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184")
				.cpf("324234234").contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail")).estadoCivil(enumEstadoCivil.VIUVO)
				.escolaridade(enumEscolaridade.SUPERIOR).situacaoEscolar(enumSituacaoEscolar.INCOMPLETO).cargo("Dev")
				.remuneracao(2200.00).nomeDaEmpresa("MagnaSitemas")
				.diaDeInicio(LocalDate.of(2020, Month.JULY, 05)).build();

		assertNotEquals("", i.tiposDeDadosCSV());

	}

	@Test()
	@DisplayName("Verifica o metodo to String")
	void testeMetodoToString() {

		Estagiario i = new Estagiario.Builder().nome("Guilherme").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184")
				.cpf("324234234").contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail")).estadoCivil(enumEstadoCivil.VIUVO)
				.escolaridade(enumEscolaridade.SUPERIOR).situacaoEscolar(enumSituacaoEscolar.INCOMPLETO).cargo("Dev")
				.remuneracao(2200.00).nomeDaEmpresa("MagnaSitemas")
				.diaDeInicio(LocalDate.of(2020, Month.JULY, 05)).build();

		assertNotEquals("", i.toString());

	}
	
}
	
