package br.com.magnasistemas.model;

import java.time.LocalDate;

import br.com.magnasistemas.enumerator.EnumTipoDeProfissional;
import br.com.magnasistemas.enumerator.enumEscolaridade;
import br.com.magnasistemas.enumerator.enumEstadoCivil;
import br.com.magnasistemas.enumerator.enumEtnia;
import br.com.magnasistemas.enumerator.enumGenero;
import br.com.magnasistemas.enumerator.enumSituacaoEscolar;

public class Profissional extends Cidadao {

	protected String cargo;
	protected EnumTipoDeProfissional enumTipoDeProfissional;
	protected Double remuneracao;
	
	private  static final String TRABALHAR = "indo trabalhar...";

	public Profissional(Builder builder) {
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
		this.enumTipoDeProfissional = builder.enumTipoDeProfissional;
		this.remuneracao = builder.remuneracao;
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
		private String cargo;
		private EnumTipoDeProfissional enumTipoDeProfissional;
		private Double remuneracao;

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

		public Builder cargo(final String cargo) {
			this.cargo = cargo;
			return this;
		}

		public Builder enumTipoDeProfissional(final EnumTipoDeProfissional enumTipoDeProfissional) {
			this.enumTipoDeProfissional = enumTipoDeProfissional;
			return this;
		}

		public Builder remuneracao(final Double remuneracao) {
			this.remuneracao = remuneracao;
			return this;
		}

		public Profissional build() {
			return new Profissional(this);
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
	public String tiposDeDadosCSV() {
		return super.tiposDeDadosCSV()+ ",cargo,enumTipoDeProfissional,remuneracao";
	}
	@Override
	public String toString() {
		return super.toString() + this.cargo + "," + this.enumTipoDeProfissional + ","+  this.remuneracao;
	}
	
	@Override
	public String adicionarValores() {
		return super.adicionarValores() + "cargo: " + this.cargo + '\n' + "Tipo De Profissional: " + this.enumTipoDeProfissional + '\n'
				+ "Remuneracao: " + this.remuneracao + '\n';
	}
	public String trabalhar() {
		return TRABALHAR;
	}

}
