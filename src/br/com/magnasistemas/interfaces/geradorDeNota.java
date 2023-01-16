package br.com.magnasistemas.interfaces;

import java.time.LocalDate;

public interface geradorDeNota {
	public int notaFiscalPessoaJuridica(String cnpj, LocalDate dataDeEmissao);
	
	
	public int notaFiscalPessoaFisica(String cpf, LocalDate dataDeEmissao);

}
