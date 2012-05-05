package br.ucb.fct.enuns;

public enum EnumTypeErro {
	ERROLOGAR("erroLogar", "login.erroLogar");
	
	private String chave, descricao;
	
	private EnumTypeErro(String chave, String descricao){
		setChave(chave);
		setDescricao(descricao);
	}

	public String getChave() {
		return chave;
	}

	public void setChave(String chave) {
		this.chave = chave;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
	
}
