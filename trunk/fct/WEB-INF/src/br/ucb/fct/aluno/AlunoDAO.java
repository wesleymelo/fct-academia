package br.ucb.fct.aluno;

import java.util.List;

import br.ucb.fct.exceptions.DAOException;

public interface AlunoDAO {
	public boolean insert(Aluno aluno)  throws DAOException;
	public boolean delete(int id) throws DAOException;
	public boolean update(Aluno aluno, int id) throws DAOException;
	public List<Aluno> selectAll() throws DAOException;
	public Aluno selectById(int id) throws DAOException;
}
