package br.ucb.fct.gasto;

import java.util.Date;

public class Gasto {
	private Integer idGasto, idDespesa,idSecretaria;
	private Double valor;
	private Date data;
	
	public Gasto(Integer idGasto, Integer idDespesa, Integer idSecretaria,
			Double valor, Date data) {
		setIdGasto(idGasto);
		setIdDespesa(idDespesa);
		setIdSecretaria(idSecretaria);
		setValor(valor);
		setData(data);
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
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result
				+ ((idDespesa == null) ? 0 : idDespesa.hashCode());
		result = prime * result + ((idGasto == null) ? 0 : idGasto.hashCode());
		result = prime * result
				+ ((idSecretaria == null) ? 0 : idSecretaria.hashCode());
		result = prime * result + ((valor == null) ? 0 : valor.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gasto other = (Gasto) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (idDespesa == null) {
			if (other.idDespesa != null)
				return false;
		} else if (!idDespesa.equals(other.idDespesa))
			return false;
		if (idGasto == null) {
			if (other.idGasto != null)
				return false;
		} else if (!idGasto.equals(other.idGasto))
			return false;
		if (idSecretaria == null) {
			if (other.idSecretaria != null)
				return false;
		} else if (!idSecretaria.equals(other.idSecretaria))
			return false;
		if (valor == null) {
			if (other.valor != null)
				return false;
		} else if (!valor.equals(other.valor))
			return false;
		return true;
	}
	
	
	
}
