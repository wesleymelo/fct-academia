package br.ucb.fct.gasto;

import java.sql.Date;

import br.ucb.fct.secretaria.Secretaria;

public class Gasto {
	private Integer idGasto, idDespesa,idSecretaria;
	private Double valor;
	private Date data;
	private String dataString;
	private Secretaria secretaria;
	private String despesa;
	
	public Gasto(Integer idGasto, Integer idDespesa,
			Double valor, Date data, Integer idSecretaria, String dataString, Secretaria secretaria,String despesa) {
		setIdGasto(idGasto);
		setIdDespesa(idDespesa);
		setIdSecretaria(idSecretaria);
		setValor(valor);
		setData(data);
		setDataString(dataString);
		setSecretaria(secretaria);
		setDespesa(despesa);
	}
	
	public Gasto(Integer idDespesa,
			Double valor, Date data, Integer idSecretaria) {
		setIdDespesa(idDespesa);
		setIdSecretaria(idSecretaria);
		setValor(valor);
		setData(data);
	}
	
	public String getDespesa() {
		return despesa;
	}

	public void setDespesa(String despesa) {
		this.despesa = despesa;
	}

	public Secretaria getSecretaria() {
		return secretaria;
	}

	public void setSecretaria(Secretaria secretaria) {
		this.secretaria = secretaria;
	}
	
	public String getDataString() {
		return dataString;
	}

	public void setDataString(String dataString) {
		this.dataString = dataString;
	}

	public Integer getIdGasto() {
		return idGasto;
	}
	public void setIdGasto(Integer idGasto) {
		this.idGasto = idGasto;
	}
	public Integer getIdDespesa() {
		return idDespesa;
	}
	public void setIdDespesa(Integer idDespesa) {
		this.idDespesa = idDespesa;
	}
	public Integer getIdSecretaria() {
		return idSecretaria;
	}
	public void setIdSecretaria(Integer idSecretaria) {
		this.idSecretaria = idSecretaria;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}	
	
}
