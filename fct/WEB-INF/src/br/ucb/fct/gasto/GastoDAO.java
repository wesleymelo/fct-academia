package br.ucb.fct.gasto;

import java.util.List;
import br.ucb.fct.exceptions.DAOException;


public interface GastoDAO {
		public boolean insert(Gasto gasto)  throws DAOException;
		public boolean delete(int id) throws DAOException;
		public boolean update(Gasto gasto, int id) throws DAOException;
		public List<Gasto> selectAll() throws DAOException;
		public Gasto selectById(int id) throws DAOException;
}

