package br.ucb.fct.envelope;	

public class Envelope {
	
	private Integer idSecretaria;
	private Integer idProfessor;
	
	public Envelope(Integer idSecretaria, Integer idProfessor) {
		setIdSecretaria(idSecretaria);
		setIdProfessor(idProfessor);
	}
	
	public Integer getIdSecretaria() {
		return idSecretaria;
	}
	public void setIdSecretaria(Integer idSecretaria) {
		this.idSecretaria = idSecretaria;
	}
	public Integer getIdProfessor() {
		return idProfessor;
	}
	public void setIdProfessor(Integer idProfessor) {
		this.idProfessor = idProfessor;
	}
	
	
	
}
