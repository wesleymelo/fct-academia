package br.ucb.fct.telefone;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import br.ucb.fct.exceptions.DAOException;

public interface TelefoneDAO {
	
	public boolean insert(Telefone telefone)  throws DAOException;
	public boolean insert(List<Telefone> telefones) throws DAOException;
	public boolean delete(int id, int tipo) throws DAOException;
	public boolean update(Telefone telefone, int id, int tipo) throws DAOException;
	public boolean update(List<Telefone> telefone, int id) throws DAOException;
	public List<Telefone> selectById(int id) throws DAOException;

}
