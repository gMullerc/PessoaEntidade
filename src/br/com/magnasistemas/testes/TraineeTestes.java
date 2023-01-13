package br.com.magnasistemas.testes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.magnasistemas.classes.Endereco;
import br.com.magnasistemas.classes.Trainee;
import br.com.magnasistemas.enumerator.enumEscolaridade;
import br.com.magnasistemas.enumerator.enumEtnia;
import br.com.magnasistemas.enumerator.enumGenero;
import br.com.magnasistemas.enumerator.enumSituacaoEscolar;

public class TraineeTestes {
	public static void main(String[] args) {
		Trainee t = new Trainee.Builder()
				.nome("Guilherme")
				.genero(enumGenero.masculino)
				.etnia(enumEtnia.Pardo)
				.dataDeNascimento(LocalDate.now())
				.certidaoDeNascimento("324234234234")
				.rg("53123972184")
				.cpf("324234234")
				.contato(1198637)
				.endereco(new Endereco("chinigua", 05730100, 3, "SaoPaulo", "SP", "Brail"))
				.estadoCivil("Solteiro")
				.escolaridade(enumEscolaridade.ensinoSuperior)
				.situacaoEscolar(enumSituacaoEscolar.Cursando)
				.cargo("Dev")
				.remuneracao(2200.00)
				.carteiraDeTrabalho(23232323)
				.nomeDaEmpresa("MagnaSitemas")
				.diaDeInicio(LocalDate.of(2022, Month.DECEMBER, 05))
				.pis(23123123)
				.build();
				System.out.println(t);
				
				String path = "C:\\Users\\Magna\\eclipse-workspace\\PessoaEntidade\\Populador.csv";
				
				List<Trainee> trainee = new ArrayList<>();
				
				try(BufferedReader br = new BufferedReader(new FileReader(path))) {
					String linhas = br.readLine();
					
					while (linhas != null) {
						String[] campo = linhas.split(",");
						/*Trainee q = new Trainee.Builder()
								.nome(campo[0])
								.genero((enumGenero)campo[1])
								.etnia(campo[2])
								.dataDeNascimento(campo[3])
								.certidaoDeNascimento(campo[4])
								.rg(campo[5])
								.cpf(campo[6])
								.contato(campo[7])
								.endereco(campo[8])
								.estadoCivil(campo[9])
								.escolaridade(campo[10])
								.situacaoEscolar(campo[11])
								.cargo(campo[12])
								.remuneracao(campo[13])
								.carteiraDeTrabalho(campo[14])
								.nomeDaEmpresa(campo[15])
								.diaDeInicio(campo[16])
								.pis(campo[17])
								.build();
						*/
					}
					
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				}
	
	

}
