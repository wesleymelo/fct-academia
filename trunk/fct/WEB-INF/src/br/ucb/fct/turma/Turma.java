package br.ucb.fct.turma;

import java.sql.Time;
import java.util.List;
import br.ucb.fct.aluno.Aluno;
import br.ucb.fct.modalidade.Modalidade;
import br.ucb.fct.professor.Professor;

public class Turma {
	private Integer idTurma;
	private List<Aluno> alunos;
	private Professor Professor;
	private Integer idProfessor;
	private Integer idModalidade;
	private Modalidade modalidade;
	private String  nome;
	private Time horarioInicial;
	private Time horarioFinal;
	private Integer capacidade;
	
	public Turma(Integer idTurma, Integer idProfessor, Integer idModalidade,
			String nome, Time horarioInicial, Time horarioFinal) {
		setHorarioFinal(horarioFinal);
		setHorarioInicial(horarioInicial);
		setIdModalidade(idModalidade);
		setIdProfessor(idProfessor);
		setIdTurma(idTurma);
		setNome(nome);
	}
	
	public Turma(Integer idTurma, Professor professor, List<Aluno> alunos, Modalidade modalidade,
			String nome, Time horarioInicial, Time horarioFinal, int capacidade) {
		setHorarioFinal(horarioFinal);
		setAlunos(alunos);
		setHorarioInicial(horarioInicial);
		setModalidade(modalidade);
		setProfessor(professor);
		setIdTurma(idTurma);
		setNome(nome);
		setCapacidade(capacidade);
	}
	
	public Turma(Integer idProfessor, Integer idModalidade,
			String nome, Time horarioInicial, Time horarioFinal, Integer capacidade) {
		setHorarioFinal(horarioFinal);
		setHorarioInicial(horarioInicial);
		setIdModalidade(idModalidade);
		setIdProfessor(idProfessor);
		setNome(nome);
		setCapacidade(capacidade);
	}
	
	public Time getHorarioInicial() {
		return horarioInicial;
	}
	
	public Integer getVagas(){
		return getCapacidade() - getAlunos().size();
	}
	
	public Integer getQtdeAlunos(){
		return getAlunos().size();
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
	
	
	
	

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public Integer getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(Integer capacidade) {
		this.capacidade = capacidade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	
	
}
