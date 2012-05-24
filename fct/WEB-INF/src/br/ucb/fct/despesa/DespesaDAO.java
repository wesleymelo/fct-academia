package br.ucb.fct.despesa;

import java.util.List;

import br.ucb.fct.exceptions.DAOException;

public interface DespesaDAO {
		public boolean insert(Despesa despesa)  throws DAOException;
		public boolean delete(int id) throws DAOException;
		public boolean update(Despesa despesa, int id) throws DAOException;
		public List<Despesa> selectAll() throws DAOException;
		public Despesa selectById(int id) throws DAOException;
}
