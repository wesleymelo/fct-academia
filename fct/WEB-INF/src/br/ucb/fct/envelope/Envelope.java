package br.ucb.fct.envelope;	

import br.ucb.fct.professor.Professor;
import br.ucb.fct.secretaria.Secretaria;

public class Envelope {
	
	private Integer idSecretaria;
	private Integer idProfessor;
	private Professor professor;
	private Secretaria secretaria;
	
	public Envelope(Integer idSecretaria, Integer idProfessor, Professor professor, Secretaria secretaria) {
		setIdSecretaria(idSecretaria);
		setIdProfessor(idProfessor);
		setSecretaria(secretaria);
		setProfessor(professor);
	}
	
	public Envelope(Integer idSecretaria, Integer idProfessor) {
		setIdSecretaria(idSecretaria);
		setIdProfessor(idProfessor);
	}
	
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Secretaria getSecretaria() {
		return secretaria;
	}
	public void setSecretaria(Secretaria secretaria) {
		this.secretaria = secretaria;
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
