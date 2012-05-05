package br.ucb.fct.professores;	

import java.util.Date;
import java.util.List;

import br.ucb.fct.endereco.Endereco;
import br.ucb.fct.enuns.EnumTypePessoa;
import br.ucb.fct.enuns.EnumTypeSexo;
import br.ucb.fct.pessoa.Pessoa;
import br.ucb.fct.telefone.Telefone;

public class Professor extends Pessoa{
	
	private Date dataAdimissao;
	
	public Professor(Integer idPessoa, EnumTypePessoa tipoPessoa,
			Date dataCadastro, String nome, String cpf, EnumTypeSexo sexo,
			Date dataNascimento, String rg, String orgaoEmissor,
			String naturalidade, String nacionalidade, Endereco endereco,
			List<Telefone> telefones, String email, Boolean status,
			Date dataAdimissao) {
		super(idPessoa, tipoPessoa, dataCadastro, nome, cpf, sexo,
				dataNascimento, rg, orgaoEmissor, naturalidade, nacionalidade,
				endereco, telefones, email, status);
		setDataAdimissao(dataAdimissao);
	}

	public Date getDataAdimissao() {
		return dataAdimissao;
	}

	public void setDataAdimissao(Date dataAdimissao) {
		this.dataAdimissao = dataAdimissao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((getDataAdimissao() == null) ? 0 : getDataAdimissao().hashCode());
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
		if (getDataAdimissao() == null) {
			if (other.getDataAdimissao() != null)
				return false;
		} else if (!getDataAdimissao().equals(other.getDataAdimissao()))
			return false;
		return true;
	}
	
	
	
	
}
