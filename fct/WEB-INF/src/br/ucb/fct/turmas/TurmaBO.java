package br.ucb.fct.turmas;

import java.sql.SQLException;

import br.ucb.fct.util.Factory;

public class TurmaBO {
	private TurmaDAO turmaDAO;

	public TurmaBO() {
		this.turmaDAO = Factory.initTurmaDAO();
	}	
	
	public void insert(Turma turma) throws SQLException{
		turmaDAO.insert(turma);
	}
	
	public TurmaDAO getEnderecoDAO() {
		return turmaDAO;
	}

	public void setEnderecoDAO(TurmaDAO turmaDAO) {
		this.turmaDAO = turmaDAO;
	}
}
