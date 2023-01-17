package br.com.magnasistemas.classes.pessoaJuridica;

import java.time.LocalDate;
import java.util.ArrayList;
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
	private List<Integer> notasGeradasJuridicas = new ArrayList<>();
	private List<Integer> notasGeradasFisicas = new ArrayList<>();

	@Override
	public int notaFiscalPessoaJuridica(String cnpj, LocalDate dataDeEmissao) {
		Random aleatorio = new Random();
		Integer valor = aleatorio.nextInt(30000) + 10000;
		boolean verifica = true;
		if (notasGeradasJuridicas.size() > 0) {
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

	public List<Integer> getNotasGeradasJuridicas() {
		return notasGeradasJuridicas;
	}

	public List<Integer> getNotasGeradasFisicas() {
		return notasGeradasFisicas;
	}

}
