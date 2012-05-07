package br.ucb.fct.pessoa;

import java.util.List;

import br.ucb.fct.exceptions.DAOException;
import br.ucb.fct.pessoa.Pessoa;

public interface PessoaDAO {
	public boolean insert(Pessoa pessoa)  throws DAOException;
	public boolean delete(int id) throws DAOException;
	public boolean update(Pessoa pessoa, int id) throws DAOException;
	public List<Pessoa> selectAll() throws DAOException;
	public Pessoa selectById(int id) throws DAOException;
	public Pessoa selectByCPF(String cpf) throws DAOException;
	public int findLastId() throws DAOException;
}
