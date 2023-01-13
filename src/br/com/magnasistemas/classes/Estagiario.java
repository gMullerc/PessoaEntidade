package br.com.magnasistemas.classes;

import java.time.LocalDate;

import br.com.magnasistemas.enumerator.enumEscolaridade;
import br.com.magnasistemas.enumerator.enumEtnia;
import br.com.magnasistemas.enumerator.enumGenero;
import br.com.magnasistemas.enumerator.enumSituacaoEscolar;
import br.com.magnasistemas.interfaces.VinculoEsudantil;

public class Estagiario extends ProfissionalFormal implements VinculoEsudantil {

	public Estagiario(String nome, enumGenero genero, enumEtnia etnia, LocalDate dataDeNascimento,
			String certidaoDeNascimento, String rg, String cpf, int contato, Endereco endereco, String estadoCivil,
			enumEscolaridade escolaridade, enumSituacaoEscolar situacaoEscolar, String cargo, double remuneracao, String nomeDaEmpresa, LocalDate diaDeInicio) {
		

	}

	@Override
	public void verificar() {
		if (this.escolaridade == enumEscolaridade.ensinoSuperior && this.situacaoEscolar == enumSituacaoEscolar.Cursando
				|| this.escolaridade == enumEscolaridade.ensinoMedio
						&& this.situacaoEscolar == enumSituacaoEscolar.Cursando) {

		} else {
			throw new RuntimeException("Para ser um estagiário é necessário estar cursando o ensino medio ou superior");
		}

	}

}
