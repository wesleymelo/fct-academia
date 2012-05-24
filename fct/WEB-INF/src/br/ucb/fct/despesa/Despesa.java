package br.ucb.fct.despesa;

public class Despesa {
	private Integer idDespesa;
	private Integer quantidade;
	private String descricao;
	
	public Despesa(String descricao, Integer quantidade) {
		setQuantidade(quantidade);
		setDescricao(descricao);
	}
	
	public Despesa(Integer idDespesa, String descricao, Integer quantidade) {
		setIdDespesa(idDespesa);
		setQuantidade(quantidade);
		setDescricao(descricao);
	}
	public Integer getIdDespesa() {
		return idDespesa;
	}
	public void setIdDespesa(Integer idDespesa) {
		this.idDespesa = idDespesa;
	}
	
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
	
}
