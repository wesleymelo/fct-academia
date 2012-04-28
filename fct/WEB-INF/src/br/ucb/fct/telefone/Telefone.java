package br.ucb.fct.telefone;

import br.ucb.fct.enuns.EnumTypeFone;

public class Telefone {
	
	private Integer id;
	private String numero;
	private String ddd;
	private EnumTypeFone tipo;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
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
