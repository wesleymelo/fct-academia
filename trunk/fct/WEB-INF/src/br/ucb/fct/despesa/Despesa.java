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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result
				+ ((idDespesa == null) ? 0 : idDespesa.hashCode());
		result = prime * result + ((valor == null) ? 0 : valor.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Despesa other = (Despesa) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (idDespesa == null) {
			if (other.idDespesa != null)
				return false;
		} else if (!idDespesa.equals(other.idDespesa))
			return false;
		if (valor == null) {
			if (other.valor != null)
				return false;
		} else if (!valor.equals(other.valor))
			return false;
		return true;
	}
	
	
	
}
