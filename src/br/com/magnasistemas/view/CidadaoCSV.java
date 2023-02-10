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
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import br.com.magnasistemas.enumerator.enumEscolaridade;
import br.com.magnasistemas.enumerator.enumEstadoCivil;
import br.com.magnasistemas.enumerator.enumEtnia;
import br.com.magnasistemas.enumerator.enumGenero;
import br.com.magnasistemas.enumerator.enumSituacaoEscolar;
import br.com.magnasistemas.model.Cidadao;
import br.com.magnasistemas.model.Endereco;
import br.com.magnasistemas.model.Profissional;

public class CidadaoCSV {
	public static void main(String[] args) throws Exception {

		String path = "src\\CSVs\\CidadaoCSV.csv";

		List<Cidadao> list = new ArrayList<Cidadao>();

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
				Integer contato = Integer.parseInt(campo[9]);
				String rua = campo[10];
				Integer cep = Integer.parseInt(campo[11]);
				Integer numero = Integer.parseInt(campo[12]);
				String cidade = campo[13];
				String uf = campo[14];
				String pais = campo[15];
				enumEstadoCivil estadoCivil = enumEstadoCivil.valueOf(campo[16].toUpperCase());
				enumEscolaridade escolaridade = enumEscolaridade.valueOf(campo[17].toUpperCase());
				enumSituacaoEscolar situacaoEscolar = enumSituacaoEscolar.valueOf(campo[18].toUpperCase());

				Cidadao cidadao = new Cidadao.Builder().nome(nome).genero(genero).etnia(etnia)
						.dataDeNascimento(LocalDate.of(anoDeNasc, mesDeNasc, diaDeNasc))
						.certidaoDeNascimento(certidaoDeNascimento).rg(rg).cpf(cpf).contato(contato)
						.endereco(new Endereco(rua, cep, numero, cidade, uf, pais)).estadoCivil(estadoCivil)
						.escolaridade(escolaridade).situacaoEscolar(situacaoEscolar).build();

				list.add(cidadao);

			}

		} catch (FileNotFoundException e) {
			throw new FileNotFoundException();
		}
		GerarCSV(list);
		GerarDadosGlobais(list);



	}

	private static void GerarDadosGlobais(List<Cidadao> list) {
		try (FileWriter t = new FileWriter("src\\CSVSaida\\DadosGlobais.txt", true);
				BufferedWriter bw = new BufferedWriter(t);
				PrintWriter out = new PrintWriter(bw);) {
			for (int i = 0; i < list.size(); i++) {
				out.println(list.get(0).AdicionarValores());
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

	private static void GerarCSV(List<Cidadao> list) throws IOException {
		FileWriter file = new FileWriter("src\\CSVSaida\\ProfissionalCSV.csv");

		BufferedWriter output = new BufferedWriter(file);

		output.write(list.get(0).tiposDeDadosCSV());
		for (int i = 0; i < list.size(); i++) {
			output.write(list.get(i).toString());
		}

		output.close();

	}
}
