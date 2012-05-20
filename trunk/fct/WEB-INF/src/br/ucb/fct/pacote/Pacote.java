package br.ucb.fct.pacote;

public class Pacote {
	
	private Integer idPacote;
	private Double valor;
	private String descricao;
	
	public Pacote(Integer idPacote, Double valor, String descricao) {
		setIdPacote(idPacote);
		setValor(valor);
		setDescricao(descricao);
	}
	
	public Pacote(Double valor, String descricao) {
		setValor(valor);
		setDescricao(descricao);
	}
	
	public Integer getIdPacote() {
		return idPacote;
	}
	public void setIdPacote(Integer idPacote) {
		this.idPacote = idPacote;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

}
