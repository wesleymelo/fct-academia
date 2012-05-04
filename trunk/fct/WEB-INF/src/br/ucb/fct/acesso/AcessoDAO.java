package br.ucb.fct.acesso;

import br.ucb.fct.exceptions.DAOException;

public interface AcessoDAO {
	Acesso findByUsuarioAndSenha(String usuario, String senha) throws DAOException;
	boolean insert(Acesso acesso) throws DAOException;
	boolean delete(int id) throws DAOException;
	boolean update(Acesso acesso, int id) throws DAOException;
}
