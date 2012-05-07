package br.ucb.fct.enuns;

public enum EnumAcesso {
	ACESSO("acesso"), LOGIN("cpf"), SENHA("senha");
	
	private String chave;
	
	private EnumAcesso(String chave){
		setChave(chave);
	}

	public String getChave() {
		return chave;
	}

	public void setChave(String chave) {
		this.chave = chave;
	}
	
	
	
	
}
