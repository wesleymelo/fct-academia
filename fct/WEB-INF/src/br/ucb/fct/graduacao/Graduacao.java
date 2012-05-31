package br.ucb.fct.graduacao;

public class Graduacao {
	
	private Integer idGraduacao;
	private Integer idModalidade;
	private String descricao, modalidadeString;
	
	
	public String getModalidadeString() {
		return modalidadeString;
	}
	public void setModalidadeString(String modalidadeString) {
		this.modalidadeString = modalidadeString;
	}
	
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
			String descricao, String modalidadeString ) {
		setDescricao(descricao);
		setIdGraduacao(idGraduacao);
		setIdModalidade(idModalidade);
		setModalidadeString(modalidadeString);
	}
	
	public Graduacao(Integer idModalidade,
			String descricao) {
		setDescricao(descricao);
		setIdModalidade(idModalidade);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Graduacao){
			Graduacao graducao = (Graduacao) obj;
			return getDescricao().equalsIgnoreCase(graducao.getDescricao()) && getIdModalidade() == graducao.getIdModalidade();
		}
		return false;
		
	}
	
	
}















