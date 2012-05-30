package br.ucb.fct.acesso;

import br.ucb.fct.pessoa.Pessoa;

public class Acesso {
	
	private Integer idAcesso;
	private Integer idPessoa; 
	private Pessoa pessoa;
	private String senha;

	public Acesso(Integer idAcesso, Pessoa pessoa) {
		setIdAcesso(idAcesso);
		setPessoa(pessoa);
	}
	
	public Acesso(Integer idPessoa, String senha) {
		setIdPessoa(idPessoa);
		setSenha(senha);
	}
	
	public Integer getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(Integer idPessoa) {
		this.idPessoa = idPessoa;
	}

	public Integer getIdAcesso() {
		return idAcesso;
	}
	
	public void setIdAcesso(Integer idAcesso) {
		this.idAcesso = idAcesso;
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
