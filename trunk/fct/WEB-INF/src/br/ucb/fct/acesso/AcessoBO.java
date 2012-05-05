package br.ucb.fct.acesso;

import br.ucb.fct.exceptions.DAOException;

public class AcessoBO {
	private static AcessoDAO dao =  new AcessoDAOConexao();
	
	public static Acesso findByUsuarioAndSenha(String usuario, String senha) throws DAOException{
		return getDao().findByUsuarioAndSenha(usuario, senha);
	}

	public static boolean insert(Acesso acesso) throws DAOException{
		return getDao().insert(acesso);
	}

	private static AcessoDAO getDao() {
		return dao;
	}
	
}
