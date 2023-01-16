package br.com.magnasistemas.classes.pessoaJuridica;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

import br.com.magnasistemas.classes.Endereco;
import br.com.magnasistemas.classes.Profissional;
import br.com.magnasistemas.interfaces.geradorDeNota;

public abstract class PessoaJuridica extends Profissional implements geradorDeNota {

	protected String cnpj;
	protected String razaoSocial;
	protected String nomeFantasia;
	protected Endereco enderecoEmpresarial;
	private List<Integer> notasGeradasJuridicas;
	private List<Integer> notasGeradasFisicas;
	@Override
	public int notaFiscalPessoaJuridica(String cnpj, LocalDate dataDeEmissao) {
		Random aleatorio = new Random();
		Integer valor = aleatorio.nextInt(30000) + 10000;
		boolean verifica = true;
		while (verifica == true) {

			for (int i = 0; i < this.notasGeradasJuridicas.size(); i++) {
				if (valor.equals(notasGeradasJuridicas.get(i))) {
					verifica = true;
					valor = aleatorio.nextInt(30000) + 10000;
				} else {
					verifica = false;
					
				}
			}
		}
		this.notasGeradasJuridicas.add(valor);
		return valor;
	}

	@Override
	public int notaFiscalPessoaFisica(String cpf, LocalDate dataDeEmissao) {
		Random aleatorio = new Random();
		Integer valor = aleatorio.nextInt(30000) + 10000;
		boolean verifica = true;
		while (verifica == true) {

			for (int i = 0; i < this.notasGeradasFisicas.size(); i++) {
				if (valor.equals(notasGeradasFisicas.get(i))) {
					verifica = true;
					valor = aleatorio.nextInt(30000) + 10000;
				} else {
					verifica = false;
					
				}
			}
		}
		this.notasGeradasFisicas.add(valor);
		return valor;
	}

}
