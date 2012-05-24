package br.ucb.fct.servlet.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.util.Factory;

public class BuscaTurmaAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		if(req.getParameter("busca") != null && !req.getParameter("busca").isEmpty())
			req.setAttribute("turmas", Factory.initTurmaDAO().selectByOther(req.getParameter("busca")));
		else
			req.setAttribute("turmas", Factory.initTurmaDAO().selectAll());
		return "/view/admin/turma/listaTurmas.jsp";
	}
	
}
