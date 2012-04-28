package br.ucb.fct.endereco;

import java.sql.Connection;
import java.sql.SQLException;

import br.ucb.fct.connection.BDConnection;
import br.ucb.fct.connection.MySqlConnection;
import br.ucb.fct.exceptions.DAOException;

public class EnderecoDAOConexao implements EnderecoDAO {
	MySqlConnection conection;

	public EnderecoDAOConexao() {
		conection = new MySqlConnection();
	}

	public MySqlConnection getConection() {
		return conection;
	}

	public void setConection(MySqlConnection conection) {
		this.conection = conection;
	}

	@Override
	public void insert(Endereco endereco) throws DAOException {
		String sql = "INSERT INTO endereco values(?,?,?,?,?,?,?);";
		
	}
/*
 * 		private String enderecoResidencial, cidade, bairro, complemento, uf, cep;
	private Integer numero;
 */

	@Override
	public void delete(Integer id) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Endereco endereco, Integer id) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectAll() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectById(int id) throws SQLException {
		// TODO Auto-generated method stub
		
	}
}
