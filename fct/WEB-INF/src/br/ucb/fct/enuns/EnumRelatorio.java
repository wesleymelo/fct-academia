package br.ucb.fct.enuns;


public enum EnumRelatorio {
	ALUNO("view/jasper/reportAluno.jasper"),
	ALUNO_TELEFONE("view/jasper/reportAlunoTelefones.jasper"),
	PROFESSOR("view/jasper/reportProfessores.jasper"),
	DESPESA("view/jasper/reportDespesas.jasper"),
	GASTO("view/jasper/reportGastos.jasper"),
	TURMA("view/jasper/reportTurmas.jasper"),
	MODALIDADE("view/jasper/reportModalidades.jasper"),
	PAGAMENTO("view/jasper/reportPagamentos.jasper");
	
	private String relatorio;
	
	private EnumRelatorio(String relatorio){
		setRelatorio(relatorio);
	}

	public String getRelatorio() {
		return relatorio;
	}

	public void setRelatorio(String relatorio) {
		this.relatorio = relatorio;
	}
	
}
