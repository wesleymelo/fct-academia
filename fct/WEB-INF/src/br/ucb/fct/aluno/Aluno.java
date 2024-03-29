package br.ucb.fct.aluno;	

import java.sql.Date;
import java.util.List;

import br.ucb.fct.endereco.Endereco;
import br.ucb.fct.enuns.EnumTypePessoa;
import br.ucb.fct.enuns.EnumTypeSexo;
import br.ucb.fct.graduacao.Graduacao;
import br.ucb.fct.pessoa.Pessoa;
import br.ucb.fct.telefone.Telefone;

public class Aluno extends Pessoa{
	
	private Double peso;
	private Double altura;
	private List<Graduacao> graduacoes;

	public Aluno(Integer idPessoa, EnumTypePessoa tipoPessoa, Date dataCadastro, String nome,
			String cpf, EnumTypeSexo sexo, Date dataNascimento,
			Endereco endereco, List<Telefone> telefones,
			String email, Boolean status, Double peso, Double altura, String dataNascimentoString, String dateCadastroString) {
		
		super(idPessoa,tipoPessoa,dataCadastro,nome, cpf, sexo, dataNascimento, endereco, telefones,email,  status, dataNascimentoString, dateCadastroString);
		setAltura(altura);
		setPeso(peso);
	}
	
	public Aluno(Integer idPessoa, EnumTypePessoa tipoPessoa, Date dataCadastro, String nome,
			String cpf, EnumTypeSexo sexo, Date dataNascimento,
			Endereco endereco, List<Telefone> telefones,
			String email, Boolean status, Double peso, Double altura, String dataNascimentoString, String dateCadastroString, List<Graduacao> graduacoes) {
		
		super(idPessoa,tipoPessoa,dataCadastro,nome, cpf, sexo, dataNascimento, endereco, telefones,email,  status, dataNascimentoString, dateCadastroString);
		setAltura(altura);
		setPeso(peso);
		setGraduacoes(graduacoes);
	}
	
	public Aluno(EnumTypePessoa tipoPessoa, Date dataCadastro, String nome,
			String cpf, EnumTypeSexo sexo, Date dataNascimento,
			Endereco endereco, List<Telefone> telefones,
			String email, Boolean status, Double peso, Double altura) {
		
		super(tipoPessoa,dataCadastro,nome, cpf, sexo, dataNascimento, endereco, telefones,email,  status);
		setAltura(altura);
		setPeso(peso);
	}

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
	
	public List<Graduacao> getGraduacoes() {
		return graduacoes;
	}

	public void setGraduacoes(List<Graduacao> graduacoes) {
		this.graduacoes = graduacoes;
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
