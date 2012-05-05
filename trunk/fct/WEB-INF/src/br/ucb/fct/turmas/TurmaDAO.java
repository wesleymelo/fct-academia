package br.ucb.fct.turmas;

import java.util.List;

import br.ucb.fct.exceptions.DAOException;



public interface TurmaDAO {

	public boolean insert(Turma turma)  throws DAOException;
	public boolean delete(int id) throws DAOException;
	public boolean update(Turma turma, int id) throws DAOException;
	public List<Turma> selectAll() throws DAOException;
	public Turma selectById(int id) throws DAOException;
}
