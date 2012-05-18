package br.ucb.fct.professores;	

import java.util.Date;
import java.util.List;

import br.ucb.fct.endereco.Endereco;
import br.ucb.fct.enuns.EnumTypePessoa;
import br.ucb.fct.enuns.EnumTypeSexo;
import br.ucb.fct.pessoa.Pessoa;
import br.ucb.fct.telefone.Telefone;

public class Professor extends Pessoa{
	
	private Date dataAdmissao;
	
	public Professor(Integer idPessoa, EnumTypePessoa tipoPessoa,
			Date dataCadastro, String nome, String cpf, EnumTypeSexo sexo,
			Date dataNascimento, Endereco endereco,
			List<Telefone> telefones, String email, Boolean status,
			Date dataAdmissao) {
		super(idPessoa, tipoPessoa, dataCadastro, nome, cpf, sexo,
				dataNascimento, endereco, telefones, email, status);
		setdataAdmissao(dataAdmissao);
	}
	public Professor( EnumTypePessoa tipoPessoa,
			Date dataCadastro, String nome, String cpf, EnumTypeSexo sexo,
			Date dataNascimento, Endereco endereco,
			List<Telefone> telefones, String email, Boolean status,
			Date dataAdmissao) {
		super( tipoPessoa, dataCadastro, nome, cpf, sexo,
				dataNascimento, endereco, telefones, email, status);
		setdataAdmissao(dataAdmissao);
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setdataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((getDataAdmissao() == null) ? 0 : getDataAdmissao().hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Professor other = (Professor) obj;
		if (getDataAdmissao() == null) {
			if (other.getDataAdmissao() != null)
				return false;
		} else if (!getDataAdmissao().equals(other.getDataAdmissao()))
			return false;
		return true;
	}
}
