package br.ucb.fct.enuns;

public enum EnumTypePessoa {
	ALUNO(1, "Aluno"), SECRETARIA(2, "Secretária"), PROFESSOR(3, "Professor");
	
	private Integer number;
	private String descricao;
	
	private EnumTypePessoa(Integer number, String descricao){
		setNumber(number);
		setDescricao(descricao);
	}

	public static EnumTypePessoa findEmunTypePessoaByNumber (Integer number){
		for(EnumTypePessoa e : values())
			if(e.getNumber() == number)
				return e;
		return null;
	}
	
	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
