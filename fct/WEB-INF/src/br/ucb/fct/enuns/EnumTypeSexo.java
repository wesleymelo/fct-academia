package br.ucb.fct.enuns;

public enum EnumTypeSexo {
	MASCULINO("Masculino",'m'), FEMININO("Feminino",'f');
	
	private Character codigo;
	private String descricao;
	
	private EnumTypeSexo(String descricao,char codigo) {
		setCodigo(codigo);
		setDescricao(descricao);
	}
	public static EnumTypeSexo findByCodigo(char codigo){
		for (EnumTypeSexo e : values()) {
			if(e.getCodigo()==codigo)
				return e;
		}
		return null;
	}
	public Character getCodigo() {
		return codigo;
	}
	public void setCodigo(Character codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
