package br.com.magnasistemas.testes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.magnasistemas.classes.Endereco;
import br.com.magnasistemas.classes.formal.Empregado;
import br.com.magnasistemas.classes.formal.Estagiario;
import br.com.magnasistemas.classes.formal.Trainee;
import br.com.magnasistemas.enumerator.enumEscolaridade;
import br.com.magnasistemas.enumerator.enumEtnia;
import br.com.magnasistemas.enumerator.enumGenero;
import br.com.magnasistemas.enumerator.enumSituacaoEscolar;

public class EstagiarioTeste {
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
		
		String nomeDaEmpresa;
		Integer diaDeInicio; 
		Month mesDeInicio; 
		Integer anoDeInicio; 
		
		
				
				String path = "C:\\Users\\Magna\\eclipse-workspace\\PessoaEntidade\\Estagiario.csv";
				
				List<Estagiario> list = new ArrayList<Estagiario>();
				
				try(BufferedReader br = new BufferedReader(new FileReader(path))) {
					String linhas = br.readLine();
					DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy MMMM d");
					
					while (linhas != null) {
						linhas = br.readLine();
						String[] campo = linhas.split(",");

						
						nome = campo[0];
						genero = enumGenero.valueOf(campo[1].toUpperCase());
						etnia = enumEtnia.valueOf(campo[2].toUpperCase());
						diaDeNasc = Integer.parseInt(campo [3]); 
						mesDeNasc = Month.valueOf(campo[4]);
						anoDeNasc = Integer.parseInt(campo [5]); ;
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
						nomeDaEmpresa = campo[21];
						diaDeInicio = Integer.parseInt(campo [22]); 
						mesDeInicio = Month.valueOf(campo[23]); 
						anoDeInicio = Integer.parseInt(campo [24]); 

						Estagiario estagio = new Estagiario.Builder()
								.nome(nome)
								.genero(genero)
								.etnia(etnia)
								.dataDeNascimento(LocalDate.of(anoDeNasc, mesDeNasc, diaDeNasc))
								.certidaoDeNascimento(certidaoDeNascimento)
								.rg(rg)
								.cpf(cpf)
								.contato(contato )
								.endereco(new Endereco(rua, cep, numero, cidade, uf, pais))
								.estadoCivil(estadoCivil)
								.escolaridade(escolaridade)
								.situacaoEscolar(situacaoEscolar)
								.cargo(cargo)
								.remuneracao(remuneracao)
								
								.nomeDaEmpresa(nomeDaEmpresa)
								.diaDeInicio(LocalDate.of(anoDeInicio, mesDeInicio, diaDeInicio))
								
								.build();
						
						list.add(estagio);
						
					}
					
				} catch (Exception e) {
					// TODO: handle exception
				}
				System.out.println(list.get(0));
				}
	
	

}
