package br.com.magnasistemas.view;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import br.com.magnasistemas.enumerator.enumEscolaridade;
import br.com.magnasistemas.enumerator.enumEstadoCivil;
import br.com.magnasistemas.enumerator.enumEtnia;
import br.com.magnasistemas.enumerator.enumGenero;
import br.com.magnasistemas.enumerator.enumSituacaoEscolar;
import br.com.magnasistemas.model.Cidadao;
import br.com.magnasistemas.model.Contato;
import br.com.magnasistemas.model.Endereco;

public class CidadaoCSV {
	public static void main(String[] args) throws Exception {

		String path = "src\\CSVs\\CidadaoCSV.csv";

		List<Cidadao> list = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String linhas = br.readLine();

			while ((linhas = br.readLine()) != null) {

				String[] campo = linhas.split(",");

				String nome = campo[0];
				enumGenero genero = enumGenero.valueOf(campo[1].toUpperCase());
				enumEtnia etnia = enumEtnia.valueOf(campo[2].toUpperCase());
				Integer diaDeNasc = Integer.parseInt(campo[3]);
				Month mesDeNasc = Month.valueOf(campo[4]);
				Integer anoDeNasc = Integer.parseInt(campo[5]);
				String certidaoDeNascimento = campo[6];
				String rg = campo[7];
				String cpf = campo[8];
				Integer celular = Integer.parseInt(campo[9]);
				Integer telefone = Integer.parseInt(campo[10]);
				String email = campo[11];
				String rua = campo[12];
				Integer cep = Integer.parseInt(campo[13]);
				Integer numero = Integer.parseInt(campo[14]);
				String cidade = campo[15];
				String uf = campo[16];
				String pais = campo[17];
				enumEstadoCivil estadoCivil = enumEstadoCivil.valueOf(campo[18].toUpperCase());
				enumEscolaridade escolaridade = enumEscolaridade.valueOf(campo[19].toUpperCase());
				enumSituacaoEscolar situacaoEscolar = enumSituacaoEscolar.valueOf(campo[20].toUpperCase());

				Cidadao cidadao = new Cidadao.Builder().nome(nome).genero(genero).etnia(etnia)
						.dataDeNascimento(LocalDate.of(anoDeNasc, mesDeNasc, diaDeNasc))
						.certidaoDeNascimento(certidaoDeNascimento).rg(rg).cpf(cpf)
						.contato(new Contato(celular, telefone, email))
						.endereco(new Endereco(rua, cep, numero, cidade, uf, pais)).estadoCivil(estadoCivil)
						.escolaridade(escolaridade).situacaoEscolar(situacaoEscolar).build();

				list.add(cidadao);

			}

		} catch (FileNotFoundException e) {
			throw new FileNotFoundException();
		}
		gerarCSV(list);
		gerarDadosGlobais(list);

	}

	private static void gerarDadosGlobais(List<Cidadao> list) {
		try (FileWriter t = new FileWriter("src\\CSVSaida\\DadosGlobais.txt", true);
				BufferedWriter bw = new BufferedWriter(t);
				PrintWriter out = new PrintWriter(bw);) {
			for (int i = 0; i < list.size(); i++) {
				out.println(list.get(0).adicionarValores());
			}
		} catch (Exception e) {
			throw new IndexOutOfBoundsException();
		}

	}

	private static void gerarCSV(List<Cidadao> list) {

		try (FileWriter file = new FileWriter("src\\CSVSaida\\CidadaoCSV.csv")) {

			try (BufferedWriter output = new BufferedWriter(file)) {
				output.write(list.get(0).tiposDeDadosCSV());
				for (int i = 0; i < list.size(); i++) {
					output.write(list.get(i).toString());
				}
			}
		} catch (IOException e) {
			throw new IndexOutOfBoundsException();
		}

	}
}
