package br.ucb.fct.turma;

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
	
	public boolean hasAlunoInTurma(int idAluno, int idTurma){
		System.out.println("kkk idA:"+idAluno+" ------ kkk idT: "+idTurma);
		return turmaDAO.hasAlunoInTurma(idAluno, idTurma);
	}
}
