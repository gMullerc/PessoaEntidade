package br.com.magnasistemas.classes.formal;

import java.time.LocalDate;

import br.com.magnasistemas.classes.Endereco;
import br.com.magnasistemas.enumerator.enumEscolaridade;
import br.com.magnasistemas.enumerator.enumEtnia;
import br.com.magnasistemas.enumerator.enumGenero;
import br.com.magnasistemas.enumerator.enumSituacaoEscolar;
import br.com.magnasistemas.interfaces.VinculoEsudantil;

public class Estagiario extends ProfissionalFormal implements VinculoEsudantil {

	public Estagiario(Builder builder) {
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
		this.cargo = builder.cargo;
		this.remuneracao = builder.remuneracao;

		this.nomeDaEmpresa = builder.nomeDaEmpresa;
		this.diaDeInicio = builder.diaDeInicio;

	}

	public static class Builder {

		private String nome;
		private enumGenero genero;
		private enumEtnia etnia;
		private LocalDate dataDeNascimento;
		private String certidaoDeNascimento;
		private String rg;
		private String cpf;
		private int contato;
		private Endereco endereco;
		private String estadoCivil;
		private enumEscolaridade escolaridade;
		private enumSituacaoEscolar situacaoEscolar;
		private String cargo;
		private double remuneracao;
		private String nomeDaEmpresa;
		private LocalDate diaDeInicio;

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

		public Builder contato(final int contato) {
			this.contato = contato;
			return this;
		}

		public Builder endereco(final Endereco endereco) {
			this.endereco = endereco;
			return this;
		}

		public Builder estadoCivil(final String estadoCivil) {
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

		public Builder cargo(final String cargo) {
			this.cargo = cargo;
			return this;
		}

		public Builder remuneracao(final double remuneracao) {
			this.remuneracao = remuneracao;
			return this;
		}

		public Builder nomeDaEmpresa(final String nomeDaEmpresa) {
			this.nomeDaEmpresa = nomeDaEmpresa;
			return this;
		}

		public Builder diaDeInicio(final LocalDate diaDeInicio) {
			this.diaDeInicio = diaDeInicio;
			return this;
		}

		public Estagiario build() {
			return new Estagiario(this);
		}

	}

	@Override
	public String toString() {
		return "nome: " + this.nome + '\n' + "genero: " + this.genero + '\n' + "etnia: " + this.etnia + '\n'
				+ "data de nascimento: " + this.dataDeNascimento + '\n' + "certidao de nascimento:  "
				+ this.certidaoDeNascimento + '\n' + "rg: " + this.rg + '\n' + "cpf: " + this.cpf + '\n' + "contato: " + contato
				+ '\n' + "endereco: " + this.endereco + '\n' + "estado civil: " + this.estadoCivil + '\n'
				+ "escolaridade: " + this.escolaridade + '\n' + "situacao escolar: " + this.situacaoEscolar + '\n'
				+ "cargo: " + this.cargo + '\n' + "remuneracao: " + this.remuneracao + '\n'
				+ "nome da empresa: " + this.nomeDaEmpresa + '\n' + "dia de inicio: "
				+ this.diaDeInicio + '\n';
	}

	@Override
	public void verificar() {
		if (this.escolaridade == enumEscolaridade.SUPERIOR && this.situacaoEscolar == enumSituacaoEscolar.CURSANDO
				|| this.escolaridade == enumEscolaridade.MEDIO
						&& this.situacaoEscolar == enumSituacaoEscolar.CURSANDO) {

		} else {
			throw new RuntimeException("Para ser um estagiário é necessário estar cursando o ensino medio ou superior");
		}

	}

}