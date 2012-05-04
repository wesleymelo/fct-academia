package br.ucb.fct.endereco;

public class Endereco {
	
	private String enderecoResidencial, cidade, bairro, complemento, uf, cep;
	private Integer numero, idEndereco;
	
	public Endereco(String enderecoResidencial, String cidade, String bairro,
			String complemento, String uf, String cep, Integer numero,
			Integer idEndereco) {
		
		setEnderecoResidencial(enderecoResidencial);
		setCidade(cidade);
		setBairro(bairro);
		setComplemento(complemento);
		setUf(uf);
		setCep(cep);
		setNumero(numero);
		setIdEndereco(idEndereco);
		
	}
	
	public Integer getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(Integer idEndereco) {
		this.idEndereco = idEndereco;
	}

	public String getEnderecoResidencial() {
		return enderecoResidencial;
	}

	public void setEnderecoResidencial(String enderecoResidencial) {
		this.enderecoResidencial = enderecoResidencial;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
	
}