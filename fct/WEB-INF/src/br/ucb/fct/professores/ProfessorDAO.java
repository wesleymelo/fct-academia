package br.ucb.fct.professores;

import java.util.List;

import br.ucb.fct.exceptions.DAOException;

public interface ProfessorDAO {
	public boolean insert(Professor professor)  throws DAOException;
	public boolean delete(int id) throws DAOException;
	public boolean update(Professor professor, int id) throws DAOException;
	public List<Professor> selectAll() throws DAOException;
	public Professor selectById(int id) throws DAOException;
}