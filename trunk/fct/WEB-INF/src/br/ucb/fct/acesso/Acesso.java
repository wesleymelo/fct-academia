package br.ucb.fct.acesso;

public class Acesso {
	private Integer idAcesso;
	private Integer idPessoa;
	private String usuario;
	private String senha;

	public Acesso(Integer idAcesso, Integer idPessoa, String usuario) {
		setIdAcesso(idAcesso);
		setIdPessoa(idPessoa);
		setUsuario(usuario);
	}

	public Integer getIdAcesso() {
		return idAcesso;
	}
	
	public void setIdAcesso(Integer idAcesso) {
		this.idAcesso = idAcesso;
	}
	
	public Integer getIdPessoa() {
		return idPessoa;
	}
	
	public void setIdPessoa(Integer idPessoa) {
		this.idPessoa = idPessoa;
	}
	
	public String getUsuario() {
		return usuario;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
	
}
