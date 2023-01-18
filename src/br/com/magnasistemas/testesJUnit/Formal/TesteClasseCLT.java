package br.com.magnasistemas.testesJUnit.Formal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.magnasistemas.classes.Endereco;
import br.com.magnasistemas.classes.formal.Trainee;
import br.com.magnasistemas.enumerator.enumEscolaridade;
import br.com.magnasistemas.enumerator.enumEtnia;
import br.com.magnasistemas.enumerator.enumGenero;
import br.com.magnasistemas.enumerator.enumSituacaoEscolar;

class TesteClasseCLT {

	@Test()
	@DisplayName("Esse teste valida se o metodo consulta do FGTS esta correto")
	void testaMetodoConsultaDoFGTS() {

		Trainee t = new Trainee.Builder().nome("Guilherme").genero(enumGenero.MASCULINO).etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now()).certidaoDeNascimento("324234234234").rg("53123972184")
				.cpf("324234234").contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail")).estadoCivil("Solteiro")
				.escolaridade(enumEscolaridade.SUPERIOR).situacaoEscolar(enumSituacaoEscolar.CURSANDO).cargo("Dev")
				.remuneracao(2200.00).carteiraDeTrabalho(23232323).nomeDaEmpresa("MagnaSitemas")
				.diaDeInicio(LocalDate.of(2020, Month.JULY, 05)).pis(23123123).build();

		
		assertEquals(0.0, t.consultarFgts());
	}
}
	
