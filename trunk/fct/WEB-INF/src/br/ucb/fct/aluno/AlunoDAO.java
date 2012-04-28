package br.ucb.fct.aluno;

import java.sql.SQLException;
import java.util.List;

import br.ucb.fct.connection.DAOException;

public interface AlunoDAO {
	public void insert(Aluno aluno)  throws DAOException;
	public void delete(int id) throws DAOException;
	public void update(Aluno aluno, int id) throws DAOException;
	public List<Aluno> selectAll() throws DAOException;
	public Aluno selectById(int id) throws DAOException;
}
