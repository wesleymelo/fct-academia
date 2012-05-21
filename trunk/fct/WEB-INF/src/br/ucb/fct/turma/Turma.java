package br.ucb.fct.turma;

import java.sql.Time;

import br.ucb.fct.modalidade.Modalidade;
import br.ucb.fct.professor.Professor;

public class Turma {
	private Integer idTurma;
	private Professor Professor;
	private Integer idProfessor;
	private Integer idModalidade;
	private Modalidade modalidade;
	private String  nome;
	private Time horarioInicial;
	private Time horarioFinal;
	
	public Turma(Integer idTurma, Integer idProfessor, Integer idModalidade,
			String nomeTurma, Time horarioInicial, Time horarioFinal) {
		setHorarioFinal(horarioFinal);
		setHorarioInicial(horarioInicial);
		setIdModalidade(idModalidade);
		setIdProfessor(idProfessor);
		setIdTurma(idTurma);
		setNomeTurma(nomeTurma);
	}
	
	public Turma(Integer idTurma, Professor professor, Modalidade modalidade,
			String nomeTurma, Time horarioInicial, Time horarioFinal) {
		setHorarioFinal(horarioFinal);
		setHorarioInicial(horarioInicial);
		setModalidade(modalidade);
		setProfessor(professor);
		setIdTurma(idTurma);
		setNomeTurma(nomeTurma);
	}
	
	public Turma(Integer idProfessor, Integer idModalidade,
			String nomeTurma, Time horarioInicial, Time horarioFinal) {
		setHorarioFinal(horarioFinal);
		setHorarioInicial(horarioInicial);
		setIdModalidade(idModalidade);
		setIdProfessor(idProfessor);
		setNomeTurma(nomeTurma);
	}
	
	public Time getHorarioInicial() {
		return horarioInicial;
	}
	
	

	public Professor getProfessor() {
		return Professor;
	}

	public void setProfessor(Professor professor) {
		Professor = professor;
	}

	public Modalidade getModalidade() {
		return modalidade;
	}

	public void setModalidade(Modalidade modalidade) {
		this.modalidade = modalidade;
	}

	public void setHorarioInicial(Time horarioInicial) {
		this.horarioInicial = horarioInicial;
	}

	public Time getHorarioFinal() {
		return horarioFinal;
	}

	public void setHorarioFinal(Time horarioFinal) {
		this.horarioFinal = horarioFinal;
	}
	
	public Integer getIdTurma() {
		return idTurma;
	}
	
	public void setIdTurma(Integer idTurma) {
		this.idTurma = idTurma;
	}
	
	public Integer getIdProfessor() {
		return idProfessor;
	}
	
	public void setIdProfessor(Integer idProfessor) {
		this.idProfessor = idProfessor;
	}
	
	public Integer getIdModalidade() {
		return idModalidade;
	}
	
	public void setIdModalidade(Integer idModalidade) {
		this.idModalidade = idModalidade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNomeTurma(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((horarioFinal == null) ? 0 : horarioFinal.hashCode());
		result = prime * result
				+ ((horarioInicial == null) ? 0 : horarioInicial.hashCode());
		result = prime * result
				+ ((idModalidade == null) ? 0 : idModalidade.hashCode());
		result = prime * result
				+ ((idProfessor == null) ? 0 : idProfessor.hashCode());
		result = prime * result + ((idTurma == null) ? 0 : idTurma.hashCode());
		result = prime * result
				+ ((nome == null) ? 0 : nome.hashCode());
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
		Turma other = (Turma) obj;
		if (horarioFinal == null) {
			if (other.horarioFinal != null)
				return false;
		} else if (!horarioFinal.equals(other.horarioFinal))
			return false;
		if (horarioInicial == null) {
			if (other.horarioInicial != null)
				return false;
		} else if (!horarioInicial.equals(other.horarioInicial))
			return false;
		if (idModalidade == null) {
			if (other.idModalidade != null)
				return false;
		} else if (!idModalidade.equals(other.idModalidade))
			return false;
		if (idProfessor == null) {
			if (other.idProfessor != null)
				return false;
		} else if (!idProfessor.equals(other.idProfessor))
			return false;
		if (idTurma == null) {
			if (other.idTurma != null)
				return false;
		} else if (!idTurma.equals(other.idTurma))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	
}
