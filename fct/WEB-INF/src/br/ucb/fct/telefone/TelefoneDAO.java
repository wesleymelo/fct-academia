package br.ucb.fct.telefone;

import br.ucb.fct.connection.DAOException;

public interface TelefoneDAO {
	
	public void insert(Telefone telefone)  throws DAOException;
	public void delete(int id) throws DAOException;
	public void update(Telefone telefone, int id) throws DAOException;
	public void selectAll() throws DAOException;
	public void selectById(int id) throws DAOException;
	

}
