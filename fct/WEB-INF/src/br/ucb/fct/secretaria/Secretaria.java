package br.ucb.fct.secretaria;	

import java.util.Date;
import java.util.List;

import br.ucb.fct.endereco.Endereco;
import br.ucb.fct.enuns.EnumTypePessoa;
import br.ucb.fct.enuns.EnumTypeSexo;
import br.ucb.fct.pessoa.Pessoa;
import br.ucb.fct.telefone.Telefone;

public class Secretaria extends Pessoa{
	
	private Date dataAdmissao;
	private String horarioInicial;
	private String horarioFinal;

	

	public Secretaria( EnumTypePessoa tipoPessoa,
			Date dataCadastro, String nome, String cpf, EnumTypeSexo sexo,
			Date dataNascimento, Endereco endereco,
			List<Telefone> telefones, String email, Boolean status,
			Date dataAdmissao, String horarioInicial, String horarioFinal) {
		super( tipoPessoa, dataCadastro, nome, cpf, sexo,
				dataNascimento, endereco, telefones, email, status);
		setDataAdmissao(dataAdmissao);
		setHoraInicial(horarioInicial);
		setHoraFinal(horarioFinal);
	}

	public Secretaria(Integer idPessoa, EnumTypePessoa tipoPessoa,
			Date dataCadastro, String nome, String cpf, EnumTypeSexo sexo,
			Date dataNascimento, Endereco endereco,
			List<Telefone> telefones, String email, Boolean status,
			Date dataAdmissao, String horarioInicial, String horarioFinal) {
		super(idPessoa, tipoPessoa, dataCadastro, nome, cpf, sexo,
				dataNascimento, endereco, telefones, email, status);
		setDataAdmissao(dataAdmissao);
		setHoraInicial(horarioInicial);
		setHoraFinal(horarioFinal);
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	
	public String getHoraInicial() {
		return horarioInicial;
	}

	public void setHoraInicial(String horarioInicial) {
		this.horarioInicial = horarioInicial;
	}

	public String getHoraFinal() {
		return horarioFinal;
	}

	public void setHoraFinal(String horarioFinal) {
		this.horarioFinal = horarioFinal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((dataAdmissao == null) ? 0 : dataAdmissao.hashCode());
		result = prime * result
				+ ((horarioFinal == null) ? 0 : horarioFinal.hashCode());
		result = prime * result
				+ ((horarioInicial == null) ? 0 : horarioInicial.hashCode());
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
		Secretaria other = (Secretaria) obj;
		if (getDataAdmissao() == null) {
			if (other.getDataAdmissao() != null)
				return false;
		} else if (!getDataAdmissao().equals(other.getDataAdmissao()))
			return false;
		if (getHoraFinal() == null) {
			if (other.getHoraFinal() != null)
				return false;
		} else if (!getHoraFinal().equals(other.getHoraFinal()))
			return false;
		if (getHoraInicial() == null) {
			if (other.getHoraInicial() != null)
				return false;
		} else if (!getHoraInicial().equals(other.getHoraInicial()))
			return false;
		return true;
	}
	
	
	
	
}
