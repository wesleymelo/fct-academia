package br.ucb.fct.modalidade;

import java.util.List;

import br.ucb.fct.exceptions.DAOException;

public interface ModalidadeDAO {
	
	public boolean insert(Modalidade modalidade) throws DAOException;
	public boolean delete(int id) throws DAOException;
	public boolean updade(Modalidade modalidade) throws DAOException;
	public List<Modalidade> selectAll() throws DAOException;
	public Modalidade selectById(int id) throws DAOException;
	
}
