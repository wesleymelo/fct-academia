package br.ucb.fct.telefone;

import br.ucb.fct.enuns.EnumTypeFone;

public class Telefone {
	
	private Integer idTelefone;
	private Integer idPessoa;
	private String numero;
	private String ddd;
	private EnumTypeFone tipo;
	
	public Telefone(Integer idTelefone, Integer idPessoa, String numero, String ddd, EnumTypeFone tipo) {
		setIdTelefone(idTelefone);
		setIdPessoa(idPessoa);
		setNumero(numero);
		setDdd(ddd);
		setTipo(tipo);
	}
	
	public Telefone(String ddd,String numero,EnumTypeFone tipo) {
		setNumero(numero);
		setDdd(ddd);
		setTipo(tipo);
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public Integer getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(Integer idPessoa) {
		this.idPessoa = idPessoa;
	}
	
	public Integer getIdTelefone() {
		return idTelefone;
	}
	public void setIdTelefone(Integer idTelefone) {
		this.idTelefone = idTelefone;
	}
	
	public String getDdd() {
		return ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public EnumTypeFone getTipo() {
		return tipo;
	}
	public void setTipo(EnumTypeFone tipo) {
		this.tipo = tipo;
	}
	
	
	
	
}
