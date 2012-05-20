package br.ucb.fct.pagamento;

import java.sql.Date;

public class Pagamento {
	
	private Integer idPagamento;
	private Double valorPago;
	private Date dataPagamento;
	private String dataPagamentoString;
	
	public Pagamento( Double valorPago, Date dataPagamento) {
		setValorPago(valorPago);
		setDataPagamento(dataPagamento);
	}
	
	public Pagamento(Integer idPagamento, Double valorPago, Date dataPagamento, String dataPagamentoString) {
		setIdPagamento(idPagamento);
		setValorPago(valorPago);
		setDataPagamento(dataPagamento);
		setDataPagamentoString(dataPagamentoString);
	}
	
	public Integer getIdPagamento() {
		return idPagamento;
	}
	
	public void setIdPagamento(Integer idPagamento) {
		this.idPagamento = idPagamento;
	}
	
	public Double getValorPago() {
		return valorPago;
	}
	
	public void setValorPago(Double valorPago) {
		this.valorPago = valorPago;
	}
	
	public Date getDataPagamento() {
		return dataPagamento;
	}
	
	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	
	public String getDataPagamentoString() {
		return dataPagamentoString;
	}
	
	public void setDataPagamentoString(String dataPagamentoString) {
		this.dataPagamentoString = dataPagamentoString;
	}
	
	
	
}
