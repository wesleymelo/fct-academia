package br.ucb.fct.graduacao;

import java.util.List;

import br.ucb.fct.exceptions.DAOException;

public interface GraduacaoDAO {

	public boolean insert(Graduacao graduacao)  throws DAOException;
	public boolean delete(int id) throws DAOException;
	public boolean update(Graduacao graduacao, int id) throws DAOException;
	public List<Graduacao> selectAll() throws DAOException;
	public Graduacao selectById(int id) throws DAOException;
	public List<Graduacao> selectByDesc(String desc) throws DAOException;
}
