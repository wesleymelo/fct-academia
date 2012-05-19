package br.ucb.fct.gasto;

import java.util.Date;

public class Gasto {
	private Integer idGasto, idDespesa,idSecretaria,quantidade;
	private Date data;
	
	public Gasto(Integer idGasto, Integer idDespesa,
			Integer quantidade, Date data, Integer idSecretaria) {
		setIdGasto(idGasto);
		setIdDespesa(idDespesa);
		setIdSecretaria(idSecretaria);
		setQuantidade(quantidade);		
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
	
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
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
		result = prime * result
				+ ((quantidade == null) ? 0 : quantidade.hashCode());
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
		if (quantidade == null) {
			if (other.quantidade != null)
				return false;
		} else if (!quantidade.equals(other.quantidade))
			return false;
		return true;
	}
	
	
}
