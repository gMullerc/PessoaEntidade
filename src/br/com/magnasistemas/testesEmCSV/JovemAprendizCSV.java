package br.com.magnasistemas.testesEmCSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.magnasistemas.classes.Endereco;
import br.com.magnasistemas.classes.formal.JovemAprendiz;
import br.com.magnasistemas.classes.formal.Trainee;
import br.com.magnasistemas.enumerator.enumEscolaridade;
import br.com.magnasistemas.enumerator.enumEtnia;
import br.com.magnasistemas.enumerator.enumGenero;
import br.com.magnasistemas.enumerator.enumSituacaoEscolar;

public class JovemAprendizCSV {
	public static void main(String[] args) {

		String nome;
		enumGenero genero;
		enumEtnia etnia;
		Integer diaDeNasc;
		Month mesDeNasc;
		Integer anoDeNasc;
		String certidaoDeNascimento;
		String rg;
		String cpf;
		Integer contato;
		String rua;
		Integer cep;
		Integer numero;
		String cidade;
		String uf;
		String pais;
		String estadoCivil;
		enumEscolaridade escolaridade;
		enumSituacaoEscolar situacaoEscolar;
		String cargo;
		Double remuneracao;
		Integer carteiraDeTrabalho;
		String nomeDaEmpresa;
		Integer diaDeInicio;
		Month mesDeInicio;
		Integer anoDeInicio;
		Integer pis;

		String path = "C:\\Users\\Magna\\eclipse-workspace\\PessoaEntidade\\src\\CSVs\\JovemAprendizCSV.csv";

		List<JovemAprendiz> list = new ArrayList<JovemAprendiz>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String linhas = br.readLine();
			DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy MMMM d");

			while (linhas != null) {
				linhas = br.readLine();
				String[] campo = linhas.split(",");
 
				nome = campo[0];
				genero = enumGenero.valueOf(campo[1].toUpperCase());
				etnia = enumEtnia.valueOf(campo[2].toUpperCase());
				diaDeNasc = Integer.parseInt(campo[3]);
				mesDeNasc = Month.valueOf(campo[4]);
				anoDeNasc = Integer.parseInt(campo[5]);
				certidaoDeNascimento = campo[6];
				rg = campo[7];
				cpf = campo[8];
				contato = Integer.parseInt(campo[9]);
				rua = campo[10];
				cep = Integer.parseInt(campo[11]);
				numero = Integer.parseInt(campo[12]);
				cidade = campo[13];
				uf = campo[14];
				pais = campo[15];
				estadoCivil = campo[16];
				escolaridade = enumEscolaridade.valueOf(campo[17].toUpperCase());
				situacaoEscolar = enumSituacaoEscolar.valueOf(campo[18].toUpperCase());
				cargo = campo[19];
				remuneracao = Double.parseDouble(campo[20]);
				carteiraDeTrabalho = Integer.parseInt(campo[21]);
				nomeDaEmpresa = campo[22];
				diaDeInicio = Integer.parseInt(campo[23]);
				mesDeInicio = Month.valueOf(campo[24]);
				anoDeInicio = Integer.parseInt(campo[25]);
				pis = Integer.parseInt(campo[26]);

				JovemAprendiz traineee = new JovemAprendiz.Builder().nome(nome).genero(genero).etnia(etnia)
						.dataDeNascimento(LocalDate.of(anoDeNasc, mesDeNasc, diaDeNasc))
						.certidaoDeNascimento(certidaoDeNascimento).rg(rg).cpf(cpf).contato(contato)
						.endereco(new Endereco(rua, cep, numero, cidade, uf, pais)).estadoCivil(estadoCivil)
						.escolaridade(escolaridade).situacaoEscolar(situacaoEscolar).cargo(cargo)
						.remuneracao(remuneracao).carteiraDeTrabalho(carteiraDeTrabalho).nomeDaEmpresa(nomeDaEmpresa)
						.diaDeInicio(LocalDate.of(anoDeInicio, mesDeInicio, diaDeInicio)).pis(pis).build();

				list.add(traineee);

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		list.get(0).matricularEmUmaInstituicao(enumEscolaridade.SUPERIOR);

		for (JovemAprendiz trainee : list) {
			System.out.println(trainee);
		}
		String valor = list.get(0).verificar();
		System.out.println(valor);
	}

}
