package br.ucb.fct.servlet.actions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.aluno.Aluno;
import br.ucb.fct.professor.Professor;
import br.ucb.fct.util.Factory;

public class ListaProfessoresAction  implements Action{

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		List<Professor> professores = Factory.initProfessorDAO().selectAll();
		req.setAttribute("professores", professores);
	
		return "/view/admin/professor/listaProfessores.jsp";
	}
	
	
}
