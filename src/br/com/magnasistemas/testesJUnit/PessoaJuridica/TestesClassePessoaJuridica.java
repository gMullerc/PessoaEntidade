package br.com.magnasistemas.testesJUnit.PessoaJuridica;

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
import br.com.magnasistemas.enumerator.enumEtnia;
import br.com.magnasistemas.enumerator.enumGenero;
import br.com.magnasistemas.enumerator.enumSituacaoEscolar;

class TestesClassePessoaJuridica {

	@Test()
	@DisplayName("Verifica a quantidade de notas criadas e se não ouve repeticao de notas, deve retornar um contador com o tamanho da Hashset para validar se não entrou notas repetidas")
	void testeMetodoGerarNotasJuridicas() {

		Igreja i = new Igreja.Builder().nome("Guilherme").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184")
				.cpf("324234234").contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail")).estadoCivil("Solteiro")
				.escolaridade(enumEscolaridade.SUPERIOR).situacaoEscolar(enumSituacaoEscolar.CURSANDO).cargo("Dev")
				.remuneracao(2200.00).cnpj("2323").razaoSocial("Grande").nomeFantasia("")
				.enderecoProfissional(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail")).Sigla("EIRELI")
				.religiao("CATOLICA").build();
		int contador = 0;

		for (int j = 0; j < 1000; j++) {
			i.notaFiscalPessoa("2", LocalDate.now());
			contador++;
		}
		assertEquals(contador, i.getQuantidadeNotasGeradas());

	}

}
