package br.com.magnasistemas.testesEmCSV;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import br.com.magnasistemas.classes.Endereco;
import br.com.magnasistemas.classes.pessoaJuridica.Sociedade;
import br.com.magnasistemas.enumerator.enumEscolaridade;
import br.com.magnasistemas.enumerator.enumEstadoCivil;
import br.com.magnasistemas.enumerator.enumEtnia;
import br.com.magnasistemas.enumerator.enumGenero;
import br.com.magnasistemas.enumerator.enumNatureza;
import br.com.magnasistemas.enumerator.enumSituacaoEscolar;

public class SociedadeCSV {
	public static void main(String[] args) throws Exception {

		String path = "C:\\Users\\Guilherme\\Desktop\\PessoaEntidade\\src\\CSVs\\SociedadeCSV.csv";
		List<Sociedade> list = new ArrayList<Sociedade>();

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
				String cargo = campo[19];
				Double remuneracao = Double.parseDouble(campo[20]);
				String cnpj = campo[21];
				String razaoSocial = campo[22];
				String nomeFantasia = campo[23];
				String ruaDaEmpresa = campo[24];
				Integer cepDaEmpresa = Integer.parseInt(campo[25]);
				Integer numeroDaEmpresa = Integer.parseInt(campo[26]);
				String cidadeDaEmpresa = campo[27];
				String ufDaEmpresa = campo[28];
				String paisDaEmpresa = campo[29];
				String sigla = campo[30];
				enumNatureza natureza = enumNatureza.valueOf(campo[31]);

				Sociedade i = new Sociedade.Builder().nome(nome).genero(genero).etnia(etnia)
						.dataDeNascimento(LocalDate.of(anoDeNasc, mesDeNasc, diaDeNasc))
						.certidaoDeNascimento(certidaoDeNascimento).rg(rg).cpf(cpf).contato(contato)
						.endereco(new Endereco(rua, cep, numero, cidade, uf, pais)).estadoCivil(estadoCivil)
						.escolaridade(escolaridade).situacaoEscolar(situacaoEscolar).cargo(cargo)
						.remuneracao(remuneracao).cnpj(cnpj).razaoSocial(razaoSocial).nomeFantasia(nomeFantasia)
						.enderecoProfissional(new Endereco(ruaDaEmpresa, cepDaEmpresa, numeroDaEmpresa, cidadeDaEmpresa,
								ufDaEmpresa, paisDaEmpresa))
						.Sigla(sigla).natureza(natureza).build();
				list.add(i);

			}

		} catch (FileNotFoundException e) {
			throw new FileNotFoundException();
		}

		if (list.size() > 0) {
			try {

				// Criando o arquivo para armazenar
				FileWriter file = new FileWriter(
						"C:\\Users\\Guilherme\\Desktop\\PessoaEntidade\\src\\CSVSaida\\SociedadesCSV.csv");

				BufferedWriter output = new BufferedWriter(file);

				output.write(list.get(0).tiposDeDadosCSV());
				for (int i = 0; i < list.size(); i++) {
					output.write(list.get(i).toString());
				}

				output.close();
			} catch (Exception e) {
			}

		} else {
			throw new Exception(
					"Nao é possível criar um CSV com as informações desejadas, pois o Objeto está não existe");
		}

		try (FileWriter t = new FileWriter(
				"C:\\Users\\Guilherme\\Desktop\\PessoaEntidade\\src\\CSVSaida\\DadosGlobais.txt", true);
				BufferedWriter bw = new BufferedWriter(t);
				PrintWriter out = new PrintWriter(bw);) {
			for (int i = 0; i < list.size(); i++) {
				out.println(list.get(0).AdicionarValores());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
