package br.com.magnasistemas.testesJUnit.PessoaJuridica;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.magnasistemas.classes.Cidadao;
import br.com.magnasistemas.classes.Endereco;
import br.com.magnasistemas.classes.formal.Trainee;
import br.com.magnasistemas.classes.pessoaJuridica.EIRELI;
import br.com.magnasistemas.classes.pessoaJuridica.Igreja;
import br.com.magnasistemas.classes.pessoaJuridica.Sociedade;
import br.com.magnasistemas.enumerator.enumEscolaridade;
import br.com.magnasistemas.enumerator.enumEstadoCivil;
import br.com.magnasistemas.enumerator.enumEtnia;
import br.com.magnasistemas.enumerator.enumGenero;
import br.com.magnasistemas.enumerator.enumNatureza;
import br.com.magnasistemas.enumerator.enumSituacaoEscolar;

class TestesClasseSociedade {
	@Test()
	@DisplayName("Verfica se o objeto foi populado corretamente")
	void verificarSeFoiCriadoCorretamente() {

		Sociedade i = new Sociedade.Builder().nome("Guilherme").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184")
				.cpf("324234234").contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail")).estadoCivil(enumEstadoCivil.SOLTEIRO)
				.escolaridade(enumEscolaridade.SUPERIOR).situacaoEscolar(enumSituacaoEscolar.CURSANDO).cargo("Dev")
				.remuneracao(2200.00).cnpj("2323").razaoSocial("Grande").nomeFantasia("")
				.enderecoProfissional(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.Sigla("Sociedade").natureza(enumNatureza.SIMPLES).build();

		assertNotEquals(null, i);

	}

	@Test()
	@DisplayName("Verfica se ao adicionar um socio o tamanho da lista de socios cresceram")
	void adicaoDeSocios() {

		Sociedade i = new Sociedade.Builder().nome("Guilherme").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184")
				.cpf("324234234").contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail")).estadoCivil(enumEstadoCivil.SOLTEIRO)
				.escolaridade(enumEscolaridade.SUPERIOR).situacaoEscolar(enumSituacaoEscolar.CURSANDO).cargo("Dev")
				.remuneracao(2200.00).cnpj("2323").razaoSocial("Grande").nomeFantasia("")
				.enderecoProfissional(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.Sigla("Sociedade").natureza(enumNatureza.SIMPLES).build();

		Cidadao t = new Cidadao.Builder().nome("Guilherme").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184")
				.cpf("324234234").contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail")).estadoCivil(enumEstadoCivil.SOLTEIRO)
				.escolaridade(enumEscolaridade.SUPERIOR).situacaoEscolar(enumSituacaoEscolar.INCOMPLETO).build();

		int qntd = i.quantidadadeDeSocios();

		assertNotEquals(qntd, i.addNovosSocios(t));

	}

	@Test()
	@DisplayName("Teste no metodo de remocao de socios, verifica se ele foi removido.")
	void verificarSeFoiDemitido() {

		Sociedade i = new Sociedade.Builder().nome("Guilherme").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184")
				.cpf("324234234").contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail")).estadoCivil(enumEstadoCivil.SOLTEIRO)
				.escolaridade(enumEscolaridade.SUPERIOR).situacaoEscolar(enumSituacaoEscolar.CURSANDO).cargo("Dev")
				.remuneracao(2200.00).cnpj("2323").razaoSocial("Grande").nomeFantasia("")
				.enderecoProfissional(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.Sigla("Sociedade").natureza(enumNatureza.SIMPLES).build();

		Cidadao t = new Cidadao.Builder().nome("Guilherme").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184")
				.cpf("324234234").contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail")).estadoCivil(enumEstadoCivil.SOLTEIRO)
				.escolaridade(enumEscolaridade.SUPERIOR).situacaoEscolar(enumSituacaoEscolar.INCOMPLETO).build();

		Cidadao j = new Cidadao.Builder().nome("Guilherme").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184")
				.cpf("324234234").contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail")).estadoCivil(enumEstadoCivil.SOLTEIRO)
				.escolaridade(enumEscolaridade.SUPERIOR).situacaoEscolar(enumSituacaoEscolar.INCOMPLETO).build();

		i.addNovosSocios(j);
		i.ListarFuncionario();

		assertEquals(true, i.removerSocios(j));

	}

	@Test()
	@DisplayName("Teste no metodo de remocao de socios, verifica se ele foi removido sem ser um socio")
	void verificarSeFoiRemovidoSeNaoEraSocio() {

		Sociedade i = new Sociedade.Builder().nome("Guilherme").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184")
				.cpf("324234234").contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail")).estadoCivil(enumEstadoCivil.SOLTEIRO)
				.escolaridade(enumEscolaridade.SUPERIOR).situacaoEscolar(enumSituacaoEscolar.CURSANDO).cargo("Dev")
				.remuneracao(2200.00).cnpj("2323").razaoSocial("Grande").nomeFantasia("")
				.enderecoProfissional(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.Sigla("Sociedade").natureza(enumNatureza.SIMPLES).build();

		Cidadao t = new Cidadao.Builder().nome("Guilherme").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184")
				.cpf("324234234").contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail")).estadoCivil(enumEstadoCivil.SOLTEIRO)
				.escolaridade(enumEscolaridade.SUPERIOR).situacaoEscolar(enumSituacaoEscolar.INCOMPLETO).build();

		Cidadao j = new Cidadao.Builder().nome("Guilherme").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184")
				.cpf("324234234").contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail")).estadoCivil(enumEstadoCivil.SOLTEIRO)
				.escolaridade(enumEscolaridade.SUPERIOR).situacaoEscolar(enumSituacaoEscolar.INCOMPLETO).build();

		i.addNovosSocios(t);
		i.ListarFuncionario();

		assertNotEquals(false, i.removerSocios(j));

	}

	@Test()
	@DisplayName("Testa se retorna a quantidade de socios")
	void retornoDeSocios() {

		Sociedade i = new Sociedade.Builder().nome("Guilherme").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184")
				.cpf("324234234").contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail")).estadoCivil(enumEstadoCivil.SOLTEIRO)
				.escolaridade(enumEscolaridade.SUPERIOR).situacaoEscolar(enumSituacaoEscolar.CURSANDO).cargo("Dev")
				.remuneracao(2200.00).cnpj("2323").razaoSocial("Grande").nomeFantasia("")
				.enderecoProfissional(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.Sigla("Sociedade").natureza(enumNatureza.SIMPLES).build();

		Cidadao t = new Cidadao.Builder().nome("Guilherme").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184")
				.cpf("324234234").contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail")).estadoCivil(enumEstadoCivil.SOLTEIRO)
				.escolaridade(enumEscolaridade.SUPERIOR).situacaoEscolar(enumSituacaoEscolar.INCOMPLETO).build();
		i.addNovosSocios(t);
		int qntd = i.quantidadadeDeSocios();

		assertEquals(qntd, 1);

	}

}
