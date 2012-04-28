package br.ucb.fct.aluno;	

import br.ucb.fct.pessoa.Pessoa;

public class Aluno extends Pessoa{
	
	private Double peso;
	private Double altura;
	
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getAltura() == null) ? 0 : getAltura().hashCode());
		result = prime * result + ((getPeso() == null) ? 0 : getPeso().hashCode());
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
		Aluno other = (Aluno) obj;
		if (getAltura() == null) {
			if (other.getAltura() != null)
				return false;
		} else if (!getAltura().equals(other.getAltura()))
			return false;
		if (getPeso() == null) {
			if (other.getPeso() != null)
				return false;
		} else if (!getPeso().equals(other.getPeso()))
			return false;
		return true;
	}
	
}
