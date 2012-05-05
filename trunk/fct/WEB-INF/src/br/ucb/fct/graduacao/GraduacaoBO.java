package br.ucb.fct.graduacao;

import java.sql.SQLException;

import br.ucb.fct.turmas.Turma;
import br.ucb.fct.turmas.TurmaDAO;
import br.ucb.fct.util.Factory;

public class GraduacaoBO {
	private GraduacaoDAO graduacaoDAO;

	public GraduacaoBO() {
		this.graduacaoDAO = Factory.initGraduacaoDAO();
	}	
	
	public void insert(Graduacao graduacao) throws SQLException{
		graduacaoDAO.insert(graduacao);
	}
	
	public GraduacaoDAO getEnderecoDAO() {
		return graduacaoDAO;
	}

	public void setEnderecoDAO(GraduacaoDAO graduacao) {
		this.graduacaoDAO = graduacao;
	}
}
