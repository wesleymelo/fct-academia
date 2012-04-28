package br.ucb.fct.telefone;

import java.util.List;
import br.ucb.fct.connection.DAOException;

public interface TelefoneDAO {
	
	public boolean insert(Telefone telefone)  throws DAOException;
	public boolean delete(int id) throws DAOException;
	public boolean update(Telefone telefone, int id) throws DAOException;
	public List<Telefone> selectById(int id) throws DAOException;

}
