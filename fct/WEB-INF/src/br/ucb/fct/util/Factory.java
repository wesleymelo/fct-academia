package br.ucb.fct.util;

import java.util.List;

import br.ucb.fct.endereco.EnderecoDAO;
import br.ucb.fct.endereco.EnderecoDAOConexao;
import br.ucb.fct.exceptions.DAOException;
import br.ucb.fct.modalidade.ModalidadeDAO;
import br.ucb.fct.modalidade.ModalidadeDAOConexao;
import br.ucb.fct.pessoa.PessoaDAO;
import br.ucb.fct.pessoa.PessoaDAOConexao;
import br.ucb.fct.professores.ProfessorDAO;
import br.ucb.fct.professores.ProfessorDAOConexao;
import br.ucb.fct.secretaria.Secretaria;
import br.ucb.fct.secretaria.SecretariaDAO;
import br.ucb.fct.secretaria.SecretariaDAOConexao;
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
	
	public static ProfessorDAO initProfessor(){
		return new ProfessorDAOConexao();
	}
	
	public static SecretariaDAO initSecretaria(){
		return new SecretariaDAOConexao();
	}
	
	
}
