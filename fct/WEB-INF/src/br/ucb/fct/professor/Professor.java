package br.ucb.fct.professor;	

import java.sql.Date;
import java.util.List;

import br.ucb.fct.endereco.Endereco;
import br.ucb.fct.enuns.EnumTypePessoa;
import br.ucb.fct.enuns.EnumTypeSexo;
import br.ucb.fct.pessoa.Pessoa;
import br.ucb.fct.telefone.Telefone;

public class Professor extends Pessoa{
	
	private Date dataAdmissao;
	private String dataAdmissaoString;
	
	public String getDataAdmissaoString() {
		return dataAdmissaoString;
	}
	public void setDataAdmissaoString(String dataAdmissaoString) {
		this.dataAdmissaoString = dataAdmissaoString;
	}
	public Professor(Integer idPessoa, EnumTypePessoa tipoPessoa,
			Date dataCadastro, String nome, String cpf, EnumTypeSexo sexo,
			Date dataNascimento, Endereco endereco,
			List<Telefone> telefones, String email, Boolean status,
			Date dataAdmissao,String dataNascimentoString, String dateCadastroString,String dataAdmissaoString) {
		super(idPessoa, tipoPessoa, dataCadastro, nome, cpf, sexo,
				dataNascimento, endereco, telefones, email, status, dataNascimentoString, dateCadastroString);
		setdataAdmissao(dataAdmissao);
		setDataAdmissaoString(dataAdmissaoString);
	}
	public Professor( EnumTypePessoa tipoPessoa,
			Date dataCadastro, String nome, String cpf, EnumTypeSexo sexo,
			Date dataNascimento, Endereco endereco,
			List<Telefone> telefones, String email, Boolean status,
			Date dataAdmissao,String dataAdmissaoString) {
		super( tipoPessoa, dataCadastro, nome, cpf, sexo,
				dataNascimento, endereco, telefones, email, status);
		setdataAdmissao(dataAdmissao);
		setDataAdmissaoString(dataAdmissaoString);
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setdataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	
}
