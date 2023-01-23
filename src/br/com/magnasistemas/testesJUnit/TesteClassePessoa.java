package br.com.magnasistemas.testesJUnit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.magnasistemas.classes.Endereco;
import br.com.magnasistemas.classes.formal.Trainee;
import br.com.magnasistemas.enumerator.enumEscolaridade;
import br.com.magnasistemas.enumerator.enumEstadoCivil;
import br.com.magnasistemas.enumerator.enumEtnia;
import br.com.magnasistemas.enumerator.enumGenero;
import br.com.magnasistemas.enumerator.enumSituacaoEscolar;

class TesteClassePessoa {

	@Test()
	@DisplayName("Esse metodo fará o teste sobre o retorno do metodo Andar, se esta retornando corretamente uma String")
	void testaMetodoAndar() {

		Trainee t = new Trainee.Builder().nome("Guilherme").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184")
				.cpf("324234234").contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.estadoCivil(enumEstadoCivil.CASADO).escolaridade(enumEscolaridade.SUPERIOR)
				.situacaoEscolar(enumSituacaoEscolar.CURSANDO).cargo("Dev").remuneracao(2200.00)
				.carteiraDeTrabalho(23232323).nomeDaEmpresa("MagnaSitemas")
				.diaDeInicio(LocalDate.of(2020, Month.JULY, 05)).pis(23123123).build();

		assertEquals("Andando...", t.andar());

	}

	@Test()
	@DisplayName("Esse metodo fará o teste sobre o retorno do metodo aprender novas falas, se estiver correto vai retornar o mesmo valor de frases "
			+ "e o mesmo numero do contador")
	void testaMetodoAprender() {

		Trainee t = new Trainee.Builder().nome("Guilherme").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184")
				.cpf("324234234").contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.estadoCivil(enumEstadoCivil.CASADO).escolaridade(enumEscolaridade.SUPERIOR)
				.situacaoEscolar(enumSituacaoEscolar.CURSANDO).cargo("Dev").remuneracao(2200.00)
				.carteiraDeTrabalho(23232323).nomeDaEmpresa("MagnaSitemas")
				.diaDeInicio(LocalDate.of(2020, Month.JULY, 05)).pis(23123123).build();
		int contador = 0;
		t.aprenderNovasFalas("oioioi");
		contador++;
		assertEquals(contador, t.getFrasesAprendidas());

	}

	@Test()
	@DisplayName("Esse metodo fará o teste sobre o retorno do metodo aprender novas falas, se estiver correto vai retornar um valor de frases "
			+ "e de numero diferentes do contador")
	void testaMetodoNaodeveRetornarOvalorDocontador() {

		Trainee t = new Trainee.Builder().nome("Guilherme").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184")
				.cpf("324234234").contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.estadoCivil(enumEstadoCivil.CASADO).escolaridade(enumEscolaridade.SUPERIOR)
				.situacaoEscolar(enumSituacaoEscolar.CURSANDO).cargo("Dev").remuneracao(2200.00)
				.carteiraDeTrabalho(23232323).nomeDaEmpresa("MagnaSitemas")
				.diaDeInicio(LocalDate.of(2020, Month.JULY, 05)).pis(23123123).build();
		int contador = 0;
		t.aprenderNovasFalas("oioioi");
		contador += 2;
		assertNotEquals(contador, t.getFrasesAprendidas());

	}

	@Test()
	@DisplayName("Esse metodo fará o teste sobre o retorno do metodo aprender novas falas, se estiver correto vai retornar um valor de frases "
			+ "e de numero diferentes do contador")
	void testaMetodoPensar() {

		Trainee t = new Trainee.Builder().nome("Guilherme").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184")
				.cpf("324234234").contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.estadoCivil(enumEstadoCivil.CASADO).escolaridade(enumEscolaridade.SUPERIOR)
				.situacaoEscolar(enumSituacaoEscolar.CURSANDO).cargo("Dev").remuneracao(2200.00)
				.carteiraDeTrabalho(23232323).nomeDaEmpresa("MagnaSitemas")
				.diaDeInicio(LocalDate.of(2020, Month.JULY, 05)).pis(23123123).build();

		assertEquals(true, t.pensar());

	}

	@Test()
	@DisplayName("Testa metodo HashCode para ver se dois objetos sao iguais")
	void testaMetodoHashCode() {

		Trainee t = new Trainee.Builder().nome("Guilherme").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184")
				.cpf("324234234").contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.estadoCivil(enumEstadoCivil.CASADO).escolaridade(enumEscolaridade.SUPERIOR)
				.situacaoEscolar(enumSituacaoEscolar.CURSANDO).cargo("Dev").remuneracao(2200.00)
				.carteiraDeTrabalho(23232323).nomeDaEmpresa("MagnaSitemas")
				.diaDeInicio(LocalDate.of(2020, Month.JULY, 05)).pis(23123123).build();

		Trainee j = new Trainee.Builder().nome("Guilherme").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184")
				.cpf("324234234").contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.estadoCivil(enumEstadoCivil.CASADO).escolaridade(enumEscolaridade.SUPERIOR)
				.situacaoEscolar(enumSituacaoEscolar.CURSANDO).cargo("Dev").remuneracao(2200.00)
				.carteiraDeTrabalho(23232323).nomeDaEmpresa("MagnaSitemas")
				.diaDeInicio(LocalDate.of(2020, Month.JULY, 05)).pis(23123123).build();

		assertTrue(t.hashCode() == j.hashCode());

	}

	@Test()
	@DisplayName("Testa metodo Equals para saber se os objetos sao identicos")
	void testaMetodoEquals() {

		Trainee t = new Trainee.Builder().nome("Guilherme").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184")
				.cpf("324234234").contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.estadoCivil(enumEstadoCivil.CASADO).escolaridade(enumEscolaridade.SUPERIOR)
				.situacaoEscolar(enumSituacaoEscolar.CURSANDO).cargo("Dev").remuneracao(2200.00)
				.carteiraDeTrabalho(23232323).nomeDaEmpresa("MagnaSitemas")
				.diaDeInicio(LocalDate.of(2020, Month.JULY, 05)).pis(23123123).build();

		Trainee j = new Trainee.Builder().nome("Guilherme").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184")
				.cpf("324234234").contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.estadoCivil(enumEstadoCivil.CASADO).escolaridade(enumEscolaridade.SUPERIOR)
				.situacaoEscolar(enumSituacaoEscolar.CURSANDO).cargo("Dev").remuneracao(2200.00)
				.carteiraDeTrabalho(23232323).nomeDaEmpresa("MagnaSitemas")
				.diaDeInicio(LocalDate.of(2020, Month.JULY, 05)).pis(23123123).build();

		assertFalse(t.equals(j));

	}

	@Test()
	@DisplayName("Testar GETNOME")
	void TesteGetNomeDeveRetornarUmaString() {

		Trainee t = new Trainee.Builder().nome("Guilherme").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184")
				.cpf("324234234").contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.estadoCivil(enumEstadoCivil.CASADO).escolaridade(enumEscolaridade.SUPERIOR)
				.situacaoEscolar(enumSituacaoEscolar.CURSANDO).cargo("Dev").remuneracao(2200.00)
				.carteiraDeTrabalho(23232323).nomeDaEmpresa("MagnaSitemas")
				.diaDeInicio(LocalDate.of(2020, Month.JULY, 05)).pis(23123123).build();

		String val = t.getNome();
		assertEquals("Guilherme", val);

	}

}
