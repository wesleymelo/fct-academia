package br.ucb.fct.graduacao;

public class Graduacao {
	private Integer idGraduacao;
	private Integer idModalidade;
	private String descricao;
	public Integer getIdGraduacao() {
		return idGraduacao;
	}
	public void setIdGraduacao(Integer idGraduacao) {
		this.idGraduacao = idGraduacao;
	}
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
	public Graduacao(Integer idGraduacao, Integer idModalidade,
			String descricao) {
		setDescricao(descricao);
		setIdGraduacao(idGraduacao);
		setIdModalidade(idModalidade);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idGraduacao == null) ? 0 : idGraduacao.hashCode());
		result = prime * result
				+ ((idModalidade == null) ? 0 : idModalidade.hashCode());
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
		Graduacao other = (Graduacao) obj;
		if (idGraduacao == null) {
			if (other.idGraduacao != null)
				return false;
		} else if (!idGraduacao.equals(other.idGraduacao))
			return false;
		if (idModalidade == null) {
			if (other.idModalidade != null)
				return false;
		} else if (!idModalidade.equals(other.idModalidade))
			return false;
		return true;
	}
	
	
}
