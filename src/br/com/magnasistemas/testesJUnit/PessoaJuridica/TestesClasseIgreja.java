package br.com.magnasistemas.testesJUnit.PessoaJuridica;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.magnasistemas.classes.Cidadao;
import br.com.magnasistemas.classes.Endereco;
import br.com.magnasistemas.classes.pessoaJuridica.EIRELI;
import br.com.magnasistemas.classes.pessoaJuridica.Igreja;
import br.com.magnasistemas.classes.pessoaJuridica.Sociedade;
import br.com.magnasistemas.enumerator.enumEscolaridade;
import br.com.magnasistemas.enumerator.enumEtnia;
import br.com.magnasistemas.enumerator.enumGenero;
import br.com.magnasistemas.enumerator.enumNatureza;
import br.com.magnasistemas.enumerator.enumSituacaoEscolar;

class TestesClasseIgreja {
	@Test()
	@DisplayName("Verfica se o objeto foi populado corretamente")
	void verificarSeFoiCriadoCorretamente() {

		Igreja i = new Igreja.Builder().nome("Guilherme").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184")
				.cpf("324234234").contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail")).estadoCivil("Solteiro")
				.escolaridade(enumEscolaridade.SUPERIOR).situacaoEscolar(enumSituacaoEscolar.CURSANDO).cargo("Dev")
				.remuneracao(2200.00).cnpj("2323").razaoSocial("Grande").nomeFantasia("")
				.enderecoProfissional(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.Sigla("Sociedade").build();

		assertNotEquals(null, i);

	}


}
