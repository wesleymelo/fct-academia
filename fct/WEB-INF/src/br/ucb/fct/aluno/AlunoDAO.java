package br.ucb.fct.aluno;

import java.util.List;

import br.ucb.fct.exceptions.DAOException;
import br.ucb.fct.graduacao.Graduacao;
import br.ucb.fct.turma.Turma;

public interface AlunoDAO {
	public boolean insert(Aluno aluno)  throws DAOException;
	public boolean delete(int id) throws DAOException;
	public boolean update(Aluno aluno, int id) throws DAOException;
	public List<Aluno> selectAll() throws DAOException;
	public Aluno selectById(int id) throws DAOException;
	public List<Aluno> selectByNome(String nome) throws DAOException;
	public List<Turma> selectTurmasById(int id) throws DAOException;
	boolean hasGraduacaoInAluno(int idAluno, int idGraduacao)
			throws DAOException;
	public boolean insertGraducaoAluno(int idAluno, int idGraduacao)
			throws DAOException;
	List<Graduacao> selectGraducoesById(int id) throws DAOException;
}