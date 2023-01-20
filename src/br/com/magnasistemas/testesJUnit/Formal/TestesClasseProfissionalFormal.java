package br.com.magnasistemas.testesJUnit.Formal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.magnasistemas.classes.Endereco;
import br.com.magnasistemas.classes.formal.Trainee;
import br.com.magnasistemas.enumerator.enumEscolaridade;
import br.com.magnasistemas.enumerator.enumEstadoCivil;
import br.com.magnasistemas.enumerator.enumEtnia;
import br.com.magnasistemas.enumerator.enumGenero;
import br.com.magnasistemas.enumerator.enumSituacaoEscolar;


class TestesClasseProfissionalFormal {


	@Test
	@DisplayName("Esse teste deveria retornar um valor falso caso as horas trabalhadas sejam menores que 40")
	void testeMetodoHorasTrabalhadasMenoresQueQuarenta() {

		Trainee t = new Trainee.Builder()
				.nome("Guilherme")
				.genero(enumGenero.MASCULINO)
				.etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now())
				.certidaoDeNascimento("324234234234")
				.rg("53123972184")
				.cpf("324234234")
				.contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.estadoCivil(enumEstadoCivil.SOLTEIRO)
				.escolaridade(enumEscolaridade.SUPERIOR)
				.situacaoEscolar(enumSituacaoEscolar.CURSANDO)
				.cargo("Dev")
				.remuneracao(2200.00)
				.carteiraDeTrabalho(23232323)
				.nomeDaEmpresa("MagnaSitemas")
				.diaDeInicio(LocalDate.of(2022, Month.DECEMBER, 05))
				.pis(23123123)
				.build();
		
		t.setHorasTrabalhadas(10);
		assertEquals(false, t.descancoSemanal());
	}

	@Test
	@DisplayName("Esse teste deveria retornar um valor true caso as horas trabalhadas sejam maiores que 40")
	void testeMetodoHorasTrabalhadasMaioresQueQuarenta() {

		Trainee t = new Trainee.Builder()
				.nome("Guilherme")
				.genero(enumGenero.MASCULINO)
				.etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now())
				.certidaoDeNascimento("324234234234")
				.rg("53123972184")
				.cpf("324234234")
				.contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.estadoCivil(enumEstadoCivil.SOLTEIRO)
				.escolaridade(enumEscolaridade.SUPERIOR)
				.situacaoEscolar(enumSituacaoEscolar.CURSANDO)
				.cargo("Dev")
				.remuneracao(2200.00)
				.carteiraDeTrabalho(23232323)
				.nomeDaEmpresa("MagnaSitemas")
				.diaDeInicio(LocalDate.of(2022, Month.DECEMBER, 05))
				.pis(23123123)
				.build();
		
		t.setHorasTrabalhadas(40);
		assertEquals(true, t.descancoSemanal());
	}
	
	@Test
	@DisplayName("Esse teste deveria retornar um valor FALSE caso o tempo de empresa seja menor que um ano")
	void testeMetodoTirarFeriasCasoFacaMenosDeUmAnoNaEmpresa() {

		Trainee t = new Trainee.Builder()
				.nome("Guilherme")
				.genero(enumGenero.MASCULINO)
				.etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now())
				.certidaoDeNascimento("324234234234")
				.rg("53123972184")
				.cpf("324234234")
				.contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.estadoCivil(enumEstadoCivil.SOLTEIRO)
				.escolaridade(enumEscolaridade.SUPERIOR)
				.situacaoEscolar(enumSituacaoEscolar.CURSANDO)
				.cargo("Dev")
				.remuneracao(2200.00)
				.carteiraDeTrabalho(23232323)
				.nomeDaEmpresa("MagnaSitemas")
				.diaDeInicio(LocalDate.of(2023, Month.JANUARY, 05))
				.pis(23123123)
				.build();
		
		
		assertEquals(false, t.tirarFerias());
	}
	@Test
	@DisplayName("Esse teste deveria retornar um valor TRUE caso o tempo de empresa seja maior que um ano")
	void testeMetodoTirarFeriasCasoFacaMaisDeUmAnoNaEmpresa() {
 
		Trainee t = new Trainee.Builder()
				.nome("Guilherme")
				.genero(enumGenero.MASCULINO)
				.etnia(enumEtnia.PARDO)
				.dataDeNascimento(LocalDate.now())
				.certidaoDeNascimento("324234234234")
				.rg("53123972184")
				.cpf("324234234")
				.contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.estadoCivil(enumEstadoCivil.SOLTEIRO)
				.escolaridade(enumEscolaridade.SUPERIOR)
				.situacaoEscolar(enumSituacaoEscolar.CURSANDO)
				.cargo("Dev")
				.remuneracao(2200.00)
				.carteiraDeTrabalho(23232323)
				.nomeDaEmpresa("MagnaSitemas")
				.diaDeInicio(LocalDate.of(2020, Month.JULY, 05))
				.pis(23123123)
				.build();
		
		
		assertEquals(true, t.tirarFerias());
	}
	

}
