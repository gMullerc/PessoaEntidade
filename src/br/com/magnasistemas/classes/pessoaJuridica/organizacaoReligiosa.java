package br.com.magnasistemas.classes.pessoaJuridica;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.magnasistemas.classes.Cidadao;

public abstract class organizacaoReligiosa extends DireitoPrivado {
	protected List<Cidadao> seguidores = new ArrayList<>();
	protected String religiao;

	public String orar() {

		return "Orando...";

	}

	public String consultarSeguidores() {
		Iterator<Cidadao> a = seguidores.iterator();
		String val = "";
		while (a.hasNext()) {
			
			val = val.concat(a.next().toString() + ", ");
			
		}
		
		return val;
	}

	public Cidadao anotarNovoSeguidor(Cidadao s) {
		seguidores.add(s);
		return s;
	}

	@Override
	public String toString() {

		return super.toString() + "," + this.religiao + '\n';
	}
	
	public String tiposDeDadosCSV() {
		return "nome, genero,etnia,dia, mes, ano, certidao de nascimento,rg, cpf, contato, Logradouro, numero, cep, cidade, UF, Pais, estado civil, escolaridade, situacao escolar, cargo, remuneracao, CNPJ, razao social, nome fantasia, Logradouro da empresa, numero Da empresa, CEP da empresa, Cidade, UF, Pais, sigla\n";
	}
	
	
	@Override
	public String AdicionarValores() {
		
		return  "Organização Religiosa \n\n" + 
				super.AdicionarValores()+  
					"Religião: " + this.religiao + "\n";

	}
	
}
