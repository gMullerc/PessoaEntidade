package br.com.magnasistemas.classes;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

import br.com.magnasistemas.enumerator.enumEscolaridade;
import br.com.magnasistemas.enumerator.enumEstadoCivil;
import br.com.magnasistemas.enumerator.enumEtnia;
import br.com.magnasistemas.enumerator.enumGenero;
import br.com.magnasistemas.enumerator.enumSituacaoEscolar;
import br.com.magnasistemas.interfaces.geradorDeNota;

public class Autonomo extends Cidadao implements geradorDeNota {

	private HashSet<Integer> notasGeradas = new HashSet();

	public Autonomo(Builder builder) {
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
		private int contato;
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

		public Builder contato(final int contato) {
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

		public Autonomo build() {
			return new Autonomo(this);
		}

	}

	@Override
	public String toString() {

		return this.nome + "," + this.genero + "," + this.dataDeNascimento.getDayOfMonth() + ","
				+ this.dataDeNascimento.getMonth() + "," + this.dataDeNascimento.getYear() + ","
				+ this.certidaoDeNascimento + "," + this.rg + "," + this.cpf + "," + this.contato + "," + this.endereco
				+ "," + this.escolaridade + "," + this.situacaoEscolar;
	}

	@Override
	public int notaFiscalPessoa(String c, LocalDate dataDeEmissao) {
		Random aleatorio = new Random();
		Integer valor = aleatorio.nextInt(30000) + 10000;
		boolean verifica = true;
		if (notasGeradas.size() > 0) {
			while (verifica == true) {

				for (int i = 0; i < this.notasGeradas.size(); i++) {
					if (notasGeradas.contains(valor)) {
						verifica = true;
						valor = aleatorio.nextInt(30000) + 10000;
					} else {
						verifica = false;

					}
				}
			}
		}
		this.notasGeradas.add(valor);
		return valor;
	}

	public String AdicionarValores() {
		return "Autonomo: \n\n" + super.AdicionarValores();
	}

	public String tiposDeDadosCSV() {
		return "Nome, Genero, Etnia, Dia, Mes, Ano, Certidao de nascimento, RG, CPF, Contato, Logradouro, Numero, Cep, Cidade, UF, Pais, Estado civil, Escolaridade, Situacao escolar\n";

	}


	public Integer getQuantidadeNotasGeradas() {
		return notasGeradas.size();
	}
	
	public void getNotasFiscais() {
		
		for (Integer i : notasGeradas) {
			System.out.println(i);
		}

	}

}