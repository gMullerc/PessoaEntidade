package br.com.magnasistemas.model;

public class DocumentosProfissionais {
	private Long pis;
	// carteira de trabalho
	private Long ctps;

	public DocumentosProfissionais(Long pis, Long ctps) {
		this.pis = pis;
		this.ctps = ctps;
	}

	public Long getPis() {
		return pis;
	}

	public Long getCtps() {
		return ctps;
	}

	@Override
	public String toString() {
		return "DocumentosCLT\n [pis: " + pis + ", ctps: " + ctps + "]";
	}
	

}
