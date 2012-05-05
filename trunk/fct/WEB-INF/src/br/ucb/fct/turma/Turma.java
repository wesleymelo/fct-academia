package br.ucb.fct.turma;



import java.sql.Time;

public class Turma {
	private Integer idTurma;
	private Integer idProfessor;
	private Integer idModalidade;
	private String  nomeTurma;
	private Time	horario;

	
	
	
	public Time getHorario() {
		return horario;
	}
	public void setHorario(Time horario) {
		this.horario = horario;
	}
	public Turma(Integer idTurma, Integer idProfessor, Integer idModalidade,
			String nomeTurma, Time horario) {
		setHorario(horario);
		setIdModalidade(idModalidade);
		setIdProfessor(idProfessor);
		setIdTurma(idTurma);
		setNomeTurma(nomeTurma);
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
	public String getNomeTurma() {
		return nomeTurma;
	}
	public void setNomeTurma(String nomeTurma) {
		this.nomeTurma = nomeTurma;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((horario == null) ? 0 : horario.hashCode());
		result = prime * result
				+ ((idModalidade == null) ? 0 : idModalidade.hashCode());
		result = prime * result
				+ ((idProfessor == null) ? 0 : idProfessor.hashCode());
		result = prime * result + ((idTurma == null) ? 0 : idTurma.hashCode());
		result = prime * result
				+ ((nomeTurma == null) ? 0 : nomeTurma.hashCode());
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
		if (horario == null) {
			if (other.horario != null)
				return false;
		} else if (!horario.equals(other.horario))
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
		if (nomeTurma == null) {
			if (other.nomeTurma != null)
				return false;
		} else if (!nomeTurma.equals(other.nomeTurma))
			return false;
		return true;
	}
	
	
	
	
	
}
