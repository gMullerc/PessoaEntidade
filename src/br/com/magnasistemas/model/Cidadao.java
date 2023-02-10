package br.com.magnasistemas.model;

import java.time.LocalDate;

import br.com.magnasistemas.enumerator.enumEscolaridade;
import br.com.magnasistemas.enumerator.enumEstadoCivil;
import br.com.magnasistemas.enumerator.enumEtnia;
import br.com.magnasistemas.enumerator.enumGenero;
import br.com.magnasistemas.enumerator.enumSituacaoEscolar;

public class Cidadao extends Pessoa {

	protected String certidaoDeNascimento;
	protected String rg;
	protected String cpf;
	protected enumEstadoCivil estadoCivil;
	protected enumEscolaridade escolaridade;
	protected enumSituacaoEscolar situacaoEscolar;

	private static final String TIPOSDEDADOS = "nome, genero,etnia,dia, mes, ano, certidao de nascimento,rg, cpf, contato, Logradouro, numero, cep, cidade, UF, Pais, estado civil, escolaridade, situacao escolar";

	public Cidadao() {
	}

	public Cidadao(Builder builder) {
		this.nome = builder.nome;
		this.genero = builder.genero;
		this.etnia = builder.etnia;
		this.dataDeNascimento = builder.dataDeNascimento;
		this.certidaoDeNascimento = builder.certidaoDeNascimento;
		this.rg = builder.rg;
		this.cpf = builder.cpf;
		this.contato = builder.contato;
		this.endereco = builder.endereco;
		this.estadoCivil = builder.estadoCivil;
		this.situacaoEscolar = builder.situacaoEscolar;
		this.escolaridade = builder.escolaridade;

	}

	public static class Builder {

		private String nome;
		private enumGenero genero;
		private enumEtnia etnia;
		private LocalDate dataDeNascimento;
		private String certidaoDeNascimento;
		private String rg;
		private String cpf;
		private Contato contato;
		private Endereco endereco;
		private enumEstadoCivil estadoCivil;
		private enumEscolaridade escolaridade;
		private enumSituacaoEscolar situacaoEscolar;

		public Builder nome(final String nome) {
			this.nome = nome;
			return this;
		}

		public Builder genero(final enumGenero genero) {
			this.genero = genero;
			return this;
		}

		public Builder etnia(final enumEtnia etnia) {
			this.etnia = etnia;
			return this;
		}

		public Builder dataDeNascimento(final LocalDate dataDeNascimento) {
			this.dataDeNascimento = dataDeNascimento;
			return this;
		}

		public Builder certidaoDeNascimento(final String certidaoDeNascimento) {
			this.certidaoDeNascimento = certidaoDeNascimento;
			return this;
		}

		public Builder rg(final String rg) {
			this.rg = rg;
			return this;
		}

		public Builder cpf(final String cpf) {
			this.cpf = cpf;
			return this;
		}

		public Builder contato(final Contato contato) {
			this.contato = contato;
			return this;
		}

		public Builder endereco(final Endereco endereco) {
			this.endereco = endereco;
			return this;
		}

		public Builder estadoCivil(final enumEstadoCivil estadoCivil) {
			this.estadoCivil = estadoCivil;
			return this;
		}

		public Builder escolaridade(final enumEscolaridade enumEscolaridade) {
			this.escolaridade = enumEscolaridade;
			return this;
		}

		public Builder situacaoEscolar(final enumSituacaoEscolar situacaoEscolar) {
			this.situacaoEscolar = situacaoEscolar;
			return this;
		}

		public Cidadao build() {
			return new Cidadao(this);
		}

	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public String toString() {

		return "\n" + this.nome + "," + this.genero + "," + this.dataDeNascimento.getDayOfMonth() + ","
				+ this.dataDeNascimento.getMonth() + "," + this.dataDeNascimento.getYear() + ","
				+ this.certidaoDeNascimento + "," + this.rg + "," + this.cpf + "," + this.contato + "," + this.endereco
				+ "," + this.escolaridade + "," + this.situacaoEscolar + ",";
	}

	public String matricularEmUmaInstituicao(enumEscolaridade i) {

		if (this.situacaoEscolar == enumSituacaoEscolar.CURSANDO) {
			return "Voce ja esta matriculado";

		} else {

			this.escolaridade = i;
			return "Matriculado em: " + this.escolaridade;
		}
	}

	public String adicionarValores() {

		return "================================\n" + "Cidadao: \n\n" + "Nome: " + this.nome + '\n' + "Genero: "
				+ this.genero + '\n' + "Etnia: " + this.etnia + '\n' + "Data De Nascimento: "
				+ this.dataDeNascimento.getDayOfMonth() + "/" + this.dataDeNascimento.getMonth() + "/"
				+ this.dataDeNascimento.getYear() + '\n' + "Certidao de nascimento: " + this.certidaoDeNascimento + '\n'
				+ "RG: " + this.rg + '\n' + "CPF: " + this.cpf + '\n' + "Endereco: " + this.endereco + '\n'
				+ "Estado Civil: " + this.estadoCivil + '\n' + "Escolaridade: " + this.escolaridade + '\n'
				+ "Situacao Escolar: " + this.situacaoEscolar + '\n';
	}

	public String tiposDeDadosCSV() {
		return TIPOSDEDADOS;

	}
}