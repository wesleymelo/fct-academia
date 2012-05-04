package br.ucb.fct.enuns;

public enum EnumSexo {
	MASCULINO("Masculino",'m'), FEMININO("Feminino",'f');
	
	private char codigo;
	private String descricao;
	
	private EnumSexo(String descricao,char codigo) {
		setCodigo(codigo);
		setDescricao(descricao);
	}
	public static EnumSexo findByCodigo(char codigo){
		for (EnumSexo e : values()) {
			if(e.getCodigo()==codigo)
				return e;
		}
		return null;
	}
	public char getCodigo() {
		return codigo;
	}
	public void setCodigo(char codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
