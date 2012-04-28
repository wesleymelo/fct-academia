package br.ucb.fct.util;

import br.ucb.fct.endereco.EnderecoDAO;
import br.ucb.fct.endereco.EnderecoDAOConexao;

public class Factory {
	
	public static EnderecoDAO criaEnderecoDAO(){
		return new EnderecoDAOConexao();
	}
}
