package br.com.magnasistemas.testesEmCSV;

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

import br.com.magnasistemas.classes.Endereco;
import br.com.magnasistemas.classes.formal.Estagiario;
import br.com.magnasistemas.enumerator.enumEscolaridade;
import br.com.magnasistemas.enumerator.enumEstadoCivil;
import br.com.magnasistemas.enumerator.enumEtnia;
import br.com.magnasistemas.enumerator.enumGenero;
import br.com.magnasistemas.enumerator.enumSituacaoEscolar;

public class EstagiarioCSV {
	public static void main(String[] args) throws Exception {
		// Importa o csv para dentro da variável path;
		String path = "src\\CSVs\\EstagiarioCSV.csv";

		List<Estagiario> list = new ArrayList<Estagiario>();

		// Depois de importar, le o arquivo path, divide ele em um array chamado campo,
		// atraves do split, verifica os valores e cria o objeto
		// E adiciona esse objeto na lista de estagiários criada acima
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
				String nomeDaEmpresa = campo[21];
				Integer diaDeInicio = Integer.parseInt(campo[22]);
				Month mesDeInicio = Month.valueOf(campo[23]);
				Integer anoDeInicio = Integer.parseInt(campo[24]);

				Estagiario estagio = new Estagiario.Builder().nome(nome).genero(genero).etnia(etnia)
						.dataDeNascimento(LocalDate.of(anoDeNasc, mesDeNasc, diaDeNasc))
						.certidaoDeNascimento(certidaoDeNascimento).rg(rg).cpf(cpf).contato(contato)
						.endereco(new Endereco(rua, cep, numero, cidade, uf, pais)).estadoCivil(estadoCivil)
						.escolaridade(escolaridade).situacaoEscolar(situacaoEscolar).cargo(cargo)
						.remuneracao(remuneracao).nomeDaEmpresa(nomeDaEmpresa)
						.diaDeInicio(LocalDate.of(anoDeInicio, mesDeInicio, diaDeInicio)).build();

				list.add(estagio);

			}

		} catch (FileNotFoundException e) {
			throw new FileNotFoundException();
		}

		// verifica o tamanho da lista de objetos
		if (list.size() > 0) {
			try {
				// Criando o arquivo csv para armazenar os dados
				FileWriter file = new FileWriter(
						"src\\CSVSaida\\EstagiarioCSV.csv");
				BufferedWriter output = new BufferedWriter(file);

				output.write(list.get(0).tiposDeDadosCSV());
				for (int i = 0; i < list.size(); i++) {
					output.write(list.get(i).toString());
				}

				output.close();
			} catch (IOException e) {
				throw new IOException("Objeto LIDO pode não existir");
			}

		} else {
			throw new Exception(
					"Nao é possível criar um CSV com as informações desejadas, pois o Objeto está não existe");
		}
		// Alem de criar um arquivo separado para cada tipo especifico de pessoa,temos
		// um com dados mistos se necessário
		try (FileWriter t = new FileWriter(
				"src\\CSVSaida\\DadosGlobais.txt", true);
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
