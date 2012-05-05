package br.ucb.fct.envelope;

import java.util.List;

import br.ucb.fct.exceptions.DAOException;

public interface EnvelopeDAO {
	public boolean insert(Envelope envelope)  throws DAOException;
	public boolean delete(int id) throws DAOException;
	public boolean update(Envelope envelope, int id) throws DAOException;
	public List<Envelope> selectAll() throws DAOException;
	public Envelope selectById(int id) throws DAOException;
}