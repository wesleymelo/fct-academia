package br.ucb.fct.pacote;

import java.util.List;

import br.ucb.fct.exceptions.DAOException;

public interface PacoteDAO{
	
	public boolean insert(Pacote pacote)  throws DAOException;
	public boolean delete(int id) throws DAOException;
	public boolean update(Pacote pacote, int id) throws DAOException;
	public List<Pacote> selectAll() throws DAOException;
	public Pacote selectById(int id) throws DAOException;

}
