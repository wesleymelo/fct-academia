package br.ucb.fct.endereco;

import java.sql.SQLException;

public interface EnderecoDAO {

	public void insert(Endereco endereco)  throws SQLException;
	public void delete(Integer id) throws SQLException;
	public void update(Endereco endereco, Integer id) throws SQLException;
	public void selectAll() throws SQLException;
	public void selectById(int id) throws SQLException;
	
}
