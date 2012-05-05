package br.ucb.fct.util;

import br.ucb.fct.endereco.EnderecoDAO;
import br.ucb.fct.endereco.EnderecoDAOConexao;
import br.ucb.fct.modalidade.ModalidadeDAO;
import br.ucb.fct.modalidade.ModalidadeDAOConexao;
import br.ucb.fct.pessoa.PessoaDAO;
import br.ucb.fct.pessoa.PessoaDAOConexao;
import br.ucb.fct.professores.ProfessorDAO;
import br.ucb.fct.professores.ProfessorDAOConexao;
import br.ucb.fct.telefone.TelefoneDAO;
import br.ucb.fct.telefone.TelefoneDAOConexao;

public class Factory {
	
	public static EnderecoDAO initEnderecoDAO(){
		return new EnderecoDAOConexao();
	}
	
	public static TelefoneDAO initTelefoneDAO(){
		return new TelefoneDAOConexao();
	}
	
	public static ModalidadeDAO initModalidadeDAO(){
		return new ModalidadeDAOConexao();
	}
	
	public static PessoaDAO initPessoaDAO(){
		return new PessoaDAOConexao();
	}
	
	public static ProfessorDAO iniProfessor(){
		return new ProfessorDAOConexao();
	}
	
	
}
