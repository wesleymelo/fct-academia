package br.ucb.fct.pagamento;

import java.util.List;

import br.ucb.fct.exceptions.DAOException;

public interface PagamentoDAO {
	public boolean insert(Pagamento pagamento)  throws DAOException;
	public boolean delete(int id) throws DAOException;
	public boolean update(Pagamento pagamento, int id) throws DAOException;
	public List<Pagamento> selectAll() throws DAOException;
	public Pagamento selectById(int id) throws DAOException;
}
