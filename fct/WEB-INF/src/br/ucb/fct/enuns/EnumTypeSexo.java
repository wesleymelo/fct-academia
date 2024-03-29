package br.ucb.fct.enuns;

public enum EnumTypeSexo {
	MASCULINO("Masculino",'M'), FEMININO("Feminino",'F');
	
	private Character codigo;
	private String descricao;
	
	private EnumTypeSexo(String descricao,Character codigo) {
		setCodigo(codigo);
		setDescricao(descricao);
	}
	public static EnumTypeSexo findByCodigo(Character codigo){
		for (EnumTypeSexo e : values()) {
			if(e.getCodigo() == codigo)
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
