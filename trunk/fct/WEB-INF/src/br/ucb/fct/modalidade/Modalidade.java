package br.ucb.fct.modalidade;

public class Modalidade {
	
	private Integer idModalidade;
	private String descricao;
	
	
	public Integer getIdModalidade() {
		return idModalidade;
	}
	public void setIdModalidade(Integer idModalidade) {
		this.idModalidade = idModalidade;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Modalidade(Integer idModalidade, String descricao) {
		setIdModalidade(idModalidade);
		setDescricao(descricao);
	}
	
	public Modalidade(String descricao) {
		setDescricao(descricao);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((getDescricao() == null) ? 0 : getDescricao().hashCode());
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
		Modalidade other = (Modalidade) obj;
		if (getDescricao() == null) {
			if (other.getDescricao() != null)
				return false;
		} else if (!getDescricao().equals(other.getDescricao()))
			return false;
		return true;
	}
}
