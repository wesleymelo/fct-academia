package br.ucb.fct.enuns;

public enum EnumRelatorio {
	ALUNO("view/jasper/reportAluno.jasper"),
	ALUNO_TELEFONE("view/jasper/reportAlunoTelefones.jasper");
	
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
