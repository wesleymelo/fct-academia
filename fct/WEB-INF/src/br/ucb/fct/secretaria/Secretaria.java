package br.ucb.fct.secretaria;	

import java.util.Date;
import java.util.List;

import br.ucb.fct.endereco.Endereco;
import br.ucb.fct.enuns.EnumTypePessoa;
import br.ucb.fct.enuns.EnumTypeSexo;
import br.ucb.fct.pessoa.Pessoa;
import br.ucb.fct.telefone.Telefone;

public class Secretaria extends Pessoa{
	
	private Date dataAdimissao;
	private String horaInicial;
	private String horaFinal;

	

	public Secretaria( EnumTypePessoa tipoPessoa,
			Date dataCadastro, String nome, String cpf, EnumTypeSexo sexo,
			Date dataNascimento, Endereco endereco,
			List<Telefone> telefones, String email, Boolean status,
			Date dataAdimissao, String horaInicial, String horaFinal) {
		super( tipoPessoa, dataCadastro, nome, cpf, sexo,
				dataNascimento, endereco, telefones, email, status);
		setDataAdimissao(dataAdimissao);
		setHoraInicial(horaInicial);
		setHoraFinal(horaFinal);
	}

	public Secretaria(Integer idPessoa, EnumTypePessoa tipoPessoa,
			Date dataCadastro, String nome, String cpf, EnumTypeSexo sexo,
			Date dataNascimento, Endereco endereco,
			List<Telefone> telefones, String email, Boolean status,
			Date dataAdimissao, String horaInicial, String horaFinal) {
		super(idPessoa, tipoPessoa, dataCadastro, nome, cpf, sexo,
				dataNascimento, endereco, telefones, email, status);
		setDataAdimissao(dataAdimissao);
		setHoraInicial(horaInicial);
		setHoraFinal(horaFinal);
	}

	public Date getDataAdimissao() {
		return dataAdimissao;
	}

	public void setDataAdimissao(Date dataAdimissao) {
		this.dataAdimissao = dataAdimissao;
	}
	
	public String getHoraInicial() {
		return horaInicial;
	}

	public void setHoraInicial(String horaInicial) {
		this.horaInicial = horaInicial;
	}

	public String getHoraFinal() {
		return horaFinal;
	}

	public void setHoraFinal(String horaFinal) {
		this.horaFinal = horaFinal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((dataAdimissao == null) ? 0 : dataAdimissao.hashCode());
		result = prime * result
				+ ((horaFinal == null) ? 0 : horaFinal.hashCode());
		result = prime * result
				+ ((horaInicial == null) ? 0 : horaInicial.hashCode());
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
		if (getDataAdimissao() == null) {
			if (other.getDataAdimissao() != null)
				return false;
		} else if (!getDataAdimissao().equals(other.getDataAdimissao()))
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
