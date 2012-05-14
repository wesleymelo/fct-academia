package br.ucb.fct.endereco;

public class Estados {
	
	private String sigla, descricao;

	public Estados(String sigla, String descricao) {
		setSigla(sigla);
		setDescricao(descricao);
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
	
}
