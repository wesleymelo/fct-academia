package br.ucb.fct.turma;

import java.util.List;
import br.ucb.fct.aluno.Aluno;
import br.ucb.fct.exceptions.DAOException;



public interface TurmaDAO {

	public boolean insert(Turma turma)  throws DAOException;
	public boolean delete(int id) throws DAOException;
	public boolean update(Turma turma, int id) throws DAOException;
	public List<Turma> selectAll() throws DAOException;
	public Turma selectById(int id) throws DAOException;
	public List<Aluno> selectAlunosById(int id) throws DAOException;
}
