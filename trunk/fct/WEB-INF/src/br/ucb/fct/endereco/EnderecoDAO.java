package br.ucb.fct.endereco;

import java.util.List;

import br.ucb.fct.exceptions.DAOException;

public interface EnderecoDAO {

	public boolean insert(Endereco endereco)  throws DAOException;
	public boolean delete(int id) throws DAOException;
	public boolean update(Endereco endereco, int id) throws DAOException;
	public List<Endereco> selectAll() throws DAOException;
	public Endereco selectById(int id) throws DAOException;
	public List<Estados> selectEstados();
	
}
