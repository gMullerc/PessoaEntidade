package br.com.magnasistemas.classes.pessoaJuridica;

import java.util.ArrayList;
import java.util.List;

import br.com.magnasistemas.classes.Cidadao;
import br.com.magnasistemas.classes.formal.Clt;
import br.com.magnasistemas.classes.formal.Estagiario;
import br.com.magnasistemas.classes.formal.ProfissionalFormal;

public abstract class DireitoPrivado extends PessoaJuridica {
	protected String sigla;
	protected List<ProfissionalFormal> funcionarios = new ArrayList<>();

	public ProfissionalFormal contratarFuncionario(ProfissionalFormal c) {

		this.funcionarios.add(c);
		return c;
	}

	public boolean realizarPagamento(double valor, Clt p) {

		if (valor != p.getRemuneracao()) {
			return false;
		} else {
			p.setSaldoFgts(valor * 0.06);
			System.out.printf("Um valor de: %.2f foi depositado", valor);
			return true;
		}

	}

	public boolean demitirFuncionario(ProfissionalFormal f) {
		boolean val = false;
		for (int i = 0; i < this.funcionarios.size(); i++) {
			if (this.funcionarios.get(i).equals(f)) {
				this.funcionarios.remove(i);
				val = true;
			} else {
				System.out.println("Funcionario Inexistente");
				val = false;
			}

		}
		return val;
	} 

	public void ListarFuncionario() {
		for (Cidadao string : this.funcionarios) {
			System.out.println(string);
		}

	}

	@Override
	public String toString() {


		return  super.toString() + this.cargo + "," + this.remuneracao + ","
				+ this.cnpj + "," + this.razaoSocial + "," + this.nomeFantasia + "," + this.enderecoEmpresarial;

	}
	@Override
	public String tiposDeDadosCSV() {
		// TODO Auto-generated method stub
		return super.tiposDeDadosCSV();
	}
	
	@Override
	public String AdicionarValores() {
		
		return    	super.AdicionarValores() + '\n' +  
					"Situação Empresarial: " + "\n\n" +
					"Cargo: " + this.cargo + '\n' + 
					"Remuneração: " + this.remuneracao + '\n' + 
					"CNPJ: " + this.cnpj + '\n' + 
					"Razao Social: " + this.razaoSocial + '\n' +	
					"Endereço Empresarial: " + this.enderecoEmpresarial + '\n';
	}
}
