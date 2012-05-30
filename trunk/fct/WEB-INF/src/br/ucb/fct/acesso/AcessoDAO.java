package br.ucb.fct.acesso;

import java.util.List;

import br.ucb.fct.exceptions.DAOException;

public interface AcessoDAO {
	Acesso findByUsuarioAndSenha(String usuario, String senha) throws DAOException;
	boolean insert(Acesso acesso) throws DAOException;
	boolean delete(int id) throws DAOException;
	boolean update(Acesso acesso, int id) throws DAOException;
	List<Acesso> selectAll() throws DAOException;
	List<Acesso> selectByNome(String nome) throws DAOException;
	Acesso findByUsuario(Integer idPessoa) throws DAOException;
}
