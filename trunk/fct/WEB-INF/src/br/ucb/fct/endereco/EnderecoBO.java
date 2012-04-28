package br.ucb.fct.endereco;

import java.sql.SQLException;

import br.ucb.fct.util.Factory;

public class EnderecoBO {
	private EnderecoDAO enderecoDAO;

	public EnderecoBO() {
		this.enderecoDAO = Factory.criaEnderecoDAO();
	}	
	
	public void insert(Endereco endereco) throws SQLException{
		enderecoDAO.insert(endereco);
	}
	
	public EnderecoDAO getEnderecoDAO() {
		return enderecoDAO;
	}

	public void setEnderecoDAO(EnderecoDAO enderecoDAO) {
		this.enderecoDAO = enderecoDAO;
	}
}
