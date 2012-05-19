package br.ucb.fct.pessoa;

import java.sql.Date;
import java.util.List;

import br.ucb.fct.endereco.Endereco;
import br.ucb.fct.enuns.EnumTypeSexo;
import br.ucb.fct.enuns.EnumTypePessoa;
import br.ucb.fct.telefone.Telefone;

public class Pessoa {

	private Integer idPessoa;
	private EnumTypePessoa tipoPessoa;
	private Date dataCadastro;
	private String nome;
	private String cpf;
	private EnumTypeSexo sexo; 
	private Date dataNascimento;
	private Endereco endereco;
	private List<Telefone> telefones;
	private String email;
	private Boolean status;
	private String dateNascimentoString;
	private String dateCadastroString;
	
	
	public Pessoa(Integer idPessoa, EnumTypePessoa tipoPessoa, Date dataCadastro, String nome,
			String cpf, EnumTypeSexo sexo, Date dataNascimento,
			Endereco endereco, List<Telefone> telefones,
			String email, Boolean status, String dataNascimentoString, String dateCadastroString) {
		setIdPessoa(idPessoa);
		setTipoPessoa(tipoPessoa);
		setDataCadastro(dataCadastro);
		setNome(nome);
		setCpf(cpf);
		setSexo(sexo);
		setDataNascimento(dataNascimento);
		setTelefones(telefones);
		setEndereco(endereco);
		setEmail(email);
		setStatus(status);
		setDateNascimentoString(dataNascimentoString);
		setDateNascimentoString(dataNascimentoString);
		
	}

	public Pessoa(EnumTypePessoa tipoPessoa, Date dataCadastro, String nome,
			String cpf, EnumTypeSexo sexo, Date dataNascimento,
			Endereco endereco, List<Telefone> telefones, String email,
			Boolean status) {
		setTipoPessoa(tipoPessoa);
		setDataCadastro(dataCadastro);
		setNome(nome);
		setCpf(cpf);
		setSexo(sexo);
		setDataNascimento(dataNascimento);
		setTelefones(telefones);
		setEndereco(endereco);
		setEmail(email);
		setStatus(status);	}

	public Integer getIdPessoa() {
		return idPessoa;
	}
	
	public String getDateNascimentoString() {
		return dateNascimentoString;
	}

	public void setDateNascimentoString(String dateNascimentoString) {
		this.dateNascimentoString = dateNascimentoString;
	}

	public String getDateCadastroString() {
		return dateCadastroString;
	}

	public void setDateCadastroString(String dateCadastroString) {
		this.dateCadastroString = dateCadastroString;
	}

	public void setIdPessoa(Integer idPessoa) {
		this.idPessoa = idPessoa;
	}
	
	public EnumTypePessoa getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(EnumTypePessoa tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}
	
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public EnumTypeSexo getSexo() {
		return sexo;
	}
	
	public void setSexo(EnumTypeSexo sexo) {
		this.sexo = sexo;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public List<Telefone> getTelefones() {
		return telefones;
	}
	
	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Boolean getStatus() {
		return status;
	}
	
	public void setStatus(Boolean status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result
				+ ((dataCadastro == null) ? 0 : dataCadastro.hashCode());
		result = prime * result
				+ ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result
				+ ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result
				+ ((idPessoa == null) ? 0 : idPessoa.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result
				+ ((telefones == null) ? 0 : telefones.hashCode());
		result = prime * result
				+ ((tipoPessoa == null) ? 0 : tipoPessoa.hashCode());
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
		Pessoa other = (Pessoa) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (dataCadastro == null) {
			if (other.dataCadastro != null)
				return false;
		} else if (!dataCadastro.equals(other.dataCadastro))
			return false;
		if (dataNascimento == null) {
			if (other.dataNascimento != null)
				return false;
		} else if (!dataNascimento.equals(other.dataNascimento))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (idPessoa == null) {
			if (other.idPessoa != null)
				return false;
		} else if (!idPessoa.equals(other.idPessoa))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (sexo != other.sexo)
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (telefones == null) {
			if (other.telefones != null)
				return false;
		} else if (!telefones.equals(other.telefones))
			return false;
		if (tipoPessoa != other.tipoPessoa)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pessoa [idPessoa=" + idPessoa + ", tipoPessoa=" + tipoPessoa
				+ ", dataCadastro=" + dataCadastro + ", nome=" + nome
				+ ", cpf=" + cpf + ", sexo=" + sexo + ", dataNascimento="
				+ dataNascimento + ", endereco=" + endereco + ", telefones="
				+ telefones + ", email=" + email + ", status=" + status + "]";
	}		
}
