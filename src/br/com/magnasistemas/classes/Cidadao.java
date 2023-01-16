package br.com.magnasistemas.classes;

import java.time.LocalDate;

import br.com.magnasistemas.enumerator.enumEscolaridade;
import br.com.magnasistemas.enumerator.enumEtnia;
import br.com.magnasistemas.enumerator.enumGenero;
import br.com.magnasistemas.enumerator.enumSituacaoEscolar;

public class Cidadao extends Pessoa {

	protected String certidaoDeNascimento;
	protected String rg;
	protected String cpf;
	protected int contato;
	protected Endereco endereco;
	protected String estadoCivil;
	protected enumEscolaridade escolaridade;
	protected enumSituacaoEscolar situacaoEscolar;



	public String matricularEmUmaInstituicao(enumEscolaridade i) {

		if (this.situacaoEscolar == enumSituacaoEscolar.CURSANDO) {
			this.escolaridade = i;
			return "Matriculado em: " + this.escolaridade;

		} else {
			return "Voce ja esta matriculado";
		}
	}
}