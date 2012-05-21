package br.ucb.fct.secretaria;	

import java.sql.Date;
import java.util.List;

import br.ucb.fct.endereco.Endereco;
import br.ucb.fct.enuns.EnumTypePessoa;
import br.ucb.fct.enuns.EnumTypeSexo;
import br.ucb.fct.pessoa.Pessoa;
import br.ucb.fct.telefone.Telefone;

public class Secretaria extends Pessoa{
	
	private Date dataAdmissao;
	private String dataAdmissaoString;
	private String horarioInicial;
	private String horarioFinal;
	private Double salario;
	

	public Secretaria( EnumTypePessoa tipoPessoa,
			Date dataCadastro, String nome, String cpf, EnumTypeSexo sexo,
			Date dataNascimento, Endereco endereco,
			List<Telefone> telefones, String email, Boolean status,
			Date dataAdmissao, String horarioInicial, String horarioFinal,Double salario) {
		super( tipoPessoa, dataCadastro, nome, cpf, sexo,
				dataNascimento, endereco, telefones, email, status);
		setDataAdmissao(dataAdmissao);
		setHoraInicial(horarioInicial);
		setHoraFinal(horarioFinal);
		setSalario(salario);
	}

	public Secretaria(Integer idPessoa, EnumTypePessoa tipoPessoa,
			Date dataCadastro, String nome, String cpf, EnumTypeSexo sexo,
			Date dataNascimento, Endereco endereco,
			List<Telefone> telefones, String email, Boolean status,
			Date dataAdmissao, String horarioInicial, String horarioFinal,
			String dataNascimentoString, String dateCadastroString,Double salario) {
		super(idPessoa, tipoPessoa, dataCadastro, nome, cpf, sexo,
				dataNascimento, endereco, telefones, email, status,
				dataNascimentoString, dateCadastroString);
		setDataAdmissao(dataAdmissao);
		setDataAdmissaoString(dateCadastroString);
		setHoraInicial(horarioInicial);
		setHoraFinal(horarioFinal);
		setSalario(salario);
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
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

	

	public String getDataAdmissaoString() {
		return dataAdmissaoString;
	}

	public void setDataAdmissaoString(String dataAdmissaoString) {
		this.dataAdmissaoString = dataAdmissaoString;
	}
	
	
	
	
}
