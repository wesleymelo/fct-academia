package br.ucb.fct.servlet.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.turma.Turma;
import br.ucb.fct.util.Factory;
import br.ucb.fct.util.Util;

public class AlteraTurmaAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		
		Turma turma = Factory.initTurmaDAO().selectById(Integer.parseInt(req.getParameter("codigo")));
		
		System.out.println(turma);
		Util.putAtribuRequisicaoTurma(req, turma);
		req.setAttribute("codigo", turma.getIdTurma());
		return "/view/admin/turma/alteraTurma.jsp";
	}

}
