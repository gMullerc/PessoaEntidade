package br.com.magnasistemas.classes.pessoaJuridica;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.magnasistemas.classes.Cidadao;
import br.com.magnasistemas.classes.Endereco;
import br.com.magnasistemas.classes.formal.ProfissionalFormal;
import br.com.magnasistemas.enumerator.enumEscolaridade;
import br.com.magnasistemas.enumerator.enumEtnia;
import br.com.magnasistemas.enumerator.enumGenero;
import br.com.magnasistemas.enumerator.enumNatureza;
import br.com.magnasistemas.enumerator.enumSituacaoEscolar;

public class Sociedade extends DireitoPrivado {
	protected List<Cidadao> socios = new ArrayList<>();
	protected enumNatureza natureza;

	public Sociedade(Builder builder) {
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
		this.cnpj = builder.cnpj;
		this.razaoSocial = builder.razaoSocial;
		this.nomeFantasia = builder.nomeFantasia;
		this.enderecoEmpresarial = builder.enderecoEmpresarial;
		this.sigla = builder.sigla;
		this.natureza = builder.natureza;
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
		private String cnpj;
		private String razaoSocial;
		private String nomeFantasia;
		private Endereco enderecoEmpresarial;
		private String sigla;
		private enumNatureza natureza;

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

		public Builder cnpj(final String cnpj) {
			this.cnpj = cnpj;
			return this;
		}

		public Builder razaoSocial(final String razaoSocial) {
			this.razaoSocial = razaoSocial;
			return this;
		}

		public Builder nomeFantasia(final String nomeFantasia) {
			this.nomeFantasia = nomeFantasia;
			return this;
		}

		public Builder enderecoProfissional(final Endereco enderecoProfissional) {
			this.enderecoEmpresarial = enderecoProfissional;
			return this;
		}

		public Builder Sigla(final String Sigla) {
			this.sigla = Sigla;
			return this;
		}

		public Builder natureza(final enumNatureza natureza) {
			this.natureza = natureza;
			return this;
		}

		public Sociedade build() {
			return new Sociedade(this);
		}

	}

	public void fundarSociedade(enumNatureza e) {
		this.natureza = e;
		System.out.println("Sociedade Criada");
	}

	public int quantidadadeDeSocios() {
		return this.socios.size();
	}

	public int addNovosSocios(Cidadao p) {
		this.socios.add(p);
		return quantidadadeDeSocios();
	}

	public void listarSocios() {
		for (int i = 0; i < socios.size(); i++) {
			System.out.println(i + " " + socios.get(i));
		}
	}

	public boolean removerSocios(Cidadao f) {
		boolean val = false;
		for (int i = 0; i < this.socios.size(); i++) {
			if (this.socios.get(i).equals(f)) {
				this.socios.remove(i);
				val = true;
			} else {
				System.out.println("Socio Inexistente");
				val = false;
			}

		}
		return val;
	}

	@Override
	public String toString() {

		return super.toString() + "," + this.natureza + '\n';
	}

	public String tiposDeDadosCSV() {

		return "nome, genero,etnia,dia, mes, ano, certidao de nascimento,rg, cpf, contato, Logradouro, numero, cep, cidade, UF, Pais, estado civil, escolaridade, situacao escolar, cargo, remuneracao, CNPJ, razao social, nome fantasia, Logradouro da empresa, numero Da empresa, CEP da empresa, Cidade, UF, Pais, Sigla,natureza \n";

	}

}
