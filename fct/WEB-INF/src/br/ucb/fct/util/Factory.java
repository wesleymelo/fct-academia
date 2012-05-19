package br.ucb.fct.util;

import br.ucb.fct.aluno.AlunoDAO;
import br.ucb.fct.aluno.AlunoDAOConexao;
import br.ucb.fct.despesa.DespesaDAO;
import br.ucb.fct.despesa.DespesaDAOConexao;
import br.ucb.fct.endereco.EnderecoDAO;
import br.ucb.fct.endereco.EnderecoDAOConexao;
import br.ucb.fct.envelope.EnvelopeDAO;
import br.ucb.fct.envelope.EnvelopeDAOConexao;
import br.ucb.fct.gasto.GastoDAO;
import br.ucb.fct.gasto.GastoDAOConexao;
import br.ucb.fct.graduacao.GraduacaoDAO;
import br.ucb.fct.graduacao.GraduacaoDAOConexao;
import br.ucb.fct.modalidade.ModalidadeDAO;
import br.ucb.fct.modalidade.ModalidadeDAOConexao;
import br.ucb.fct.pessoa.PessoaDAO;
import br.ucb.fct.pessoa.PessoaDAOConexao;
import br.ucb.fct.professores.ProfessorDAO;
import br.ucb.fct.professores.ProfessorDAOConexao;
import br.ucb.fct.secretaria.SecretariaDAO;
import br.ucb.fct.secretaria.SecretariaDAOConexao;
import br.ucb.fct.telefone.TelefoneDAO;
import br.ucb.fct.telefone.TelefoneDAOConexao;
import br.ucb.fct.turma.TurmaDAO;
import br.ucb.fct.turma.TurmaDAOConexao;

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
	
	public static ProfessorDAO initProfessorDAO(){
		return new ProfessorDAOConexao();
	}
	
	public static SecretariaDAO initSecretariaDAO(){
		return new SecretariaDAOConexao();
	}
	
	public static AlunoDAO initAlunoDAO(){
		return new AlunoDAOConexao();
	}
	
	public static EnvelopeDAO initEnvelopeDAO(){
		return new EnvelopeDAOConexao();
	}
	
	public static GraduacaoDAO initGraduacaoDAO(){
		return new GraduacaoDAOConexao();
	}
	
	public static TurmaDAO initTurmaDAO(){
		return new TurmaDAOConexao();
	}
	
	public static GastoDAO initGastoDAO(){
		return new GastoDAOConexao();
	}
	public static DespesaDAO initDespesaDAO(){
		return new DespesaDAOConexao();
	}
	
}
