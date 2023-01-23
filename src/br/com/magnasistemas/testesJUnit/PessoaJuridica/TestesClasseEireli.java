package br.com.magnasistemas.testesJUnit.PessoaJuridica;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.magnasistemas.classes.Cidadao;
import br.com.magnasistemas.classes.Endereco;
import br.com.magnasistemas.classes.pessoaJuridica.EIRELI;
import br.com.magnasistemas.classes.pessoaJuridica.Sociedade;
import br.com.magnasistemas.enumerator.enumEscolaridade;
import br.com.magnasistemas.enumerator.enumEstadoCivil;
import br.com.magnasistemas.enumerator.enumEtnia;
import br.com.magnasistemas.enumerator.enumGenero;
import br.com.magnasistemas.enumerator.enumNatureza;
import br.com.magnasistemas.enumerator.enumSituacaoEscolar;

class TestesClasseEireli {
	@Test()
	@DisplayName("Verfica se o objeto foi populado corretamente")
	void verificarSeFoiCriadoCorretamente() {

		EIRELI i = new EIRELI.Builder().nome("Guilherme").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184")
				.cpf("324234234").contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.estadoCivil(enumEstadoCivil.SOLTEIRO).escolaridade(enumEscolaridade.SUPERIOR)
				.situacaoEscolar(enumSituacaoEscolar.CURSANDO).cargo("Dev").remuneracao(2200.00).cnpj("2323")
				.razaoSocial("Grande").nomeFantasia("")
				.enderecoProfissional(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.Sigla("Sociedade").build();

		assertNotEquals(null, i);

	}

	@Test()
	@DisplayName("Verifica se o metodo de criar filiais esta crescendo conforme adiciona filiais a lista")
	void verificarQuantidadeDeFiliais() {

		EIRELI i = new EIRELI.Builder().nome("Guilherme").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184")
				.cpf("324234234").contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.estadoCivil(enumEstadoCivil.SOLTEIRO).escolaridade(enumEscolaridade.SUPERIOR)
				.situacaoEscolar(enumSituacaoEscolar.CURSANDO).cargo("Dev").remuneracao(2200.00).cnpj("2323")
				.razaoSocial("Grande").nomeFantasia("")
				.enderecoProfissional(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.Sigla("Sociedade").build();

		Cidadao t = new Cidadao.Builder().nome("Guilherme").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184")
				.cpf("324234234").contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.estadoCivil(enumEstadoCivil.SOLTEIRO).escolaridade(enumEscolaridade.SUPERIOR)
				.situacaoEscolar(enumSituacaoEscolar.INCOMPLETO).build();

		i.abrirFilial(new Endereco("maragua", 02330100, 32, "Sao roque", "SP", "Brasil"));
		int qntd = i.quantidadeDeFiliais();

		assertEquals(qntd, i.quantidadeDeFiliais());

	}

	@Test()
	@DisplayName("Verifica se as filiais esta sendo criada corretamente")
	void VerificaAsFiliaisContidasNoArray() {

		EIRELI i = new EIRELI.Builder().nome("Guilherme").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184")
				.cpf("324234234").contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.estadoCivil(enumEstadoCivil.SOLTEIRO).escolaridade(enumEscolaridade.SUPERIOR)
				.situacaoEscolar(enumSituacaoEscolar.CURSANDO).cargo("Dev").remuneracao(2200.00).cnpj("2323")
				.razaoSocial("Grande").nomeFantasia("")
				.enderecoProfissional(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.Sigla("Sociedade").build();

		int contador = 0;
		
		i.abrirFilial(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"));
		contador++;
		i.abrirFilial(new Endereco("chinaigua", 05730100, 3, "SaoPaulo", "SP", "Brail"));
		contador++;
		assertEquals(contador, i.quantidadeDeFiliais());
	}
	
	@Test()
	@DisplayName("Verifica se as filiais esta sendo criada corretamente")
	void VerificaAsFiliaisContidasNoArrayComValorIncorreto() {

		EIRELI i = new EIRELI.Builder().nome("Guilherme").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184")
				.cpf("324234234").contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.estadoCivil(enumEstadoCivil.SOLTEIRO).escolaridade(enumEscolaridade.SUPERIOR)
				.situacaoEscolar(enumSituacaoEscolar.CURSANDO).cargo("Dev").remuneracao(2200.00).cnpj("2323")
				.razaoSocial("Grande").nomeFantasia("")
				.enderecoProfissional(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.Sigla("Sociedade").build();

		int contador = 0;
		
		i.abrirFilial(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"));
		contador++;
		i.abrirFilial(new Endereco("chinaigua", 05730100, 3, "SaoPaulo", "SP", "Brail"));
		
		assertNotEquals(contador, i.quantidadeDeFiliais());
	}
	
	@Test()
	@DisplayName("Testa o retorno do metodo dos tipos de dados")
	void TestaTiposDeDadosCSV() {

		EIRELI i = new EIRELI.Builder().nome("Guilherme").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184")
				.cpf("324234234").contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.estadoCivil(enumEstadoCivil.SOLTEIRO).escolaridade(enumEscolaridade.SUPERIOR)
				.situacaoEscolar(enumSituacaoEscolar.CURSANDO).cargo("Dev").remuneracao(2200.00).cnpj("2323")
				.razaoSocial("Grande").nomeFantasia("")
				.enderecoProfissional(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.Sigla("Sociedade").build();

		 String val = i.tiposDeDadosCSV();
		
		assertEquals(val, i.tiposDeDadosCSV());
	}
	
	@Test()
	@DisplayName("Testa o retorno do metodo dos tipos de dados")
	void TestaTiposDeDadosCSVComRetornoErrado() {

		EIRELI i = new EIRELI.Builder().nome("Guilherme").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184")
				.cpf("324234234").contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.estadoCivil(enumEstadoCivil.SOLTEIRO).escolaridade(enumEscolaridade.SUPERIOR)
				.situacaoEscolar(enumSituacaoEscolar.CURSANDO).cargo("Dev").remuneracao(2200.00).cnpj("2323")
				.razaoSocial("Grande").nomeFantasia("")
				.enderecoProfissional(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.Sigla("Sociedade").build();

		
		
		assertNotEquals("A", i.tiposDeDadosCSV());
	}
	@Test()
	@DisplayName("retorna os valores que serao colocados no csv, nao pode ser vazio")
	void TestaAdicionarValores() {

		EIRELI i = new EIRELI.Builder().nome("Guilherme").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184")
				.cpf("324234234").contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.estadoCivil(enumEstadoCivil.SOLTEIRO).escolaridade(enumEscolaridade.SUPERIOR)
				.situacaoEscolar(enumSituacaoEscolar.CURSANDO).cargo("Dev").remuneracao(2200.00).cnpj("2323")
				.razaoSocial("Grande").nomeFantasia("")
				.enderecoProfissional(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.Sigla("Sociedade").build();

		String val = i.AdicionarValores();
		
		assertEquals(val, i.AdicionarValores());
	}
	
	@Test()
	@DisplayName("retorna os valores que serao colocados no csv, nao pode ser vazio")
	void TestaAdicionarValoresComRetornoVazio() {

		EIRELI i = new EIRELI.Builder().nome("Guilherme").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184")
				.cpf("324234234").contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.estadoCivil(enumEstadoCivil.SOLTEIRO).escolaridade(enumEscolaridade.SUPERIOR)
				.situacaoEscolar(enumSituacaoEscolar.CURSANDO).cargo("Dev").remuneracao(2200.00).cnpj("2323")
				.razaoSocial("Grande").nomeFantasia("")
				.enderecoProfissional(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.Sigla("Sociedade").build();

		
		
		assertNotEquals("", i.AdicionarValores());
	}
	
	@Test()
	@DisplayName("testa o metodo ToString, nao deve retornar vazio")
	void testaToString() {

		EIRELI i = new EIRELI.Builder().nome("Guilherme").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184")
				.cpf("324234234").contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.estadoCivil(enumEstadoCivil.SOLTEIRO).escolaridade(enumEscolaridade.SUPERIOR)
				.situacaoEscolar(enumSituacaoEscolar.CURSANDO).cargo("Dev").remuneracao(2200.00).cnpj("2323")
				.razaoSocial("Grande").nomeFantasia("")
				.enderecoProfissional(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.Sigla("Sociedade").build();

		String val = i.toString(); 
		
		
		assertEquals(val, i.toString());
	}
	@Test()
	@DisplayName("testa o metodo ToString, nao deve retornar vazio")
	void testaToStringComValorVazio() {

		EIRELI i = new EIRELI.Builder().nome("Guilherme").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184")
				.cpf("324234234").contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.estadoCivil(enumEstadoCivil.SOLTEIRO).escolaridade(enumEscolaridade.SUPERIOR)
				.situacaoEscolar(enumSituacaoEscolar.CURSANDO).cargo("Dev").remuneracao(2200.00).cnpj("2323")
				.razaoSocial("Grande").nomeFantasia("")
				.enderecoProfissional(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.Sigla("Sociedade").build();

		String val = i.toString(); 
		 
		
		assertNotEquals("", val);
	}

	@Test()
	@DisplayName("testa o metodo mostrarFiliais, deve retornar vazio")
	void testaOsValoresContidosDentrodaListaDeveRetornarVazio() {

		EIRELI i = new EIRELI.Builder().nome("Guilherme").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184")
				.cpf("324234234").contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.estadoCivil(enumEstadoCivil.SOLTEIRO).escolaridade(enumEscolaridade.SUPERIOR)
				.situacaoEscolar(enumSituacaoEscolar.CURSANDO).cargo("Dev").remuneracao(2200.00).cnpj("2323")
				.razaoSocial("Grande").nomeFantasia("")
				.enderecoProfissional(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.Sigla("Sociedade").build();

		String val = i.mostrarFiliais(); 
		System.out.println(val);
		
		assertEquals("", val);
	}
	
	
	@Test()
	@DisplayName("testa o metodo mostrarFiliais, nao deve retornar vazio")
	void testaOsValoresContidosDentrodaListaNaoDeveRetornarVazio() {

		EIRELI i = new EIRELI.Builder().nome("Guilherme").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184")
				.cpf("324234234").contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.estadoCivil(enumEstadoCivil.SOLTEIRO).escolaridade(enumEscolaridade.SUPERIOR)
				.situacaoEscolar(enumSituacaoEscolar.CURSANDO).cargo("Dev").remuneracao(2200.00).cnpj("2323")
				.razaoSocial("Grande").nomeFantasia("")
				.enderecoProfissional(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.Sigla("Sociedade").build();

		i.abrirFilial(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"));
		String val = i.mostrarFiliais(); 
		System.out.println(val);
		
		assertNotEquals("", val);
	}



}
