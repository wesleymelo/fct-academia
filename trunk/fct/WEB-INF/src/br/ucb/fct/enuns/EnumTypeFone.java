package br.ucb.fct.enuns;

public enum EnumTypeFone {
	
	CELULAR(1,"Celular"), RESIDENCIAL(2,"Residencial"), COMERCIAL(3,"Comercial");
	
	private Integer number;
	private String descricao;
	
	public static EnumTypeFone findEnumTypeFonebyNumber(int number){
		for (EnumTypeFone e : values()) {
			if(e.getNumber() == number)
				return e; 
		}
		return null;
	}
	
	private EnumTypeFone(Integer number, String descricao) {
		this.number = number;
		this.descricao = descricao;
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
