package br.ucb.fct.pessoa;

import br.ucb.fct.connection.DAOException;
import br.ucb.fct.pessoa.Pessoa;

public interface PessoaDAO {
	public void insert(Pessoa pessoa)  throws DAOException;
	public void delete(int id) throws DAOException;
	public void update(Pessoa pessoa, int id) throws DAOException;
	public void selectAll() throws DAOException;
	public void selectById(int id) throws DAOException;
}
