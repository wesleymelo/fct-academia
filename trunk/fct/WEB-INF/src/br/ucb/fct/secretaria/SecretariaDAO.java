package br.ucb.fct.secretaria;

import java.util.List;

import br.ucb.fct.exceptions.DAOException;
import br.ucb.fct.professor.Professor;

public interface SecretariaDAO {
	public boolean insert(Secretaria secretaria)  throws DAOException;
	public boolean delete(int id) throws DAOException;
	public boolean update(Secretaria secretaria, int id) throws DAOException;
	public List<Secretaria> selectAll() throws DAOException;
	public List<Secretaria> selectByNome(String nome) throws DAOException;
	public Secretaria selectById(int id) throws DAOException;
}