package br.com.magnasistemas.classes.pessoaJuridica;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
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
	private HashSet<Integer> notasGeradas = new HashSet();


	@Override
	public int notaFiscalPessoa(String c, LocalDate dataDeEmissao) {
		Random aleatorio = new Random();
		Integer valor = aleatorio.nextInt(30000) + 10000;
		boolean verifica = true;
		if (notasGeradas.size() > 0) {
			while (verifica == true) {

				for (int i = 0; i < this.notasGeradas.size(); i++) {
					if (notasGeradas.contains(valor)) {
						verifica = true;
						valor = aleatorio.nextInt(30000) + 10000;
					} else {
						verifica = false;
 
					}
				}
			}
		}
		this.notasGeradas.add(valor);
		return valor;
	}

	
	public HashSet<Integer> getNotasGeradas() {
		return notasGeradas;
	}
	public Integer getQuantidadeNotasGeradas() {
		return notasGeradas.size();
	}



}
