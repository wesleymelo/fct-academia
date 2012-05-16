package br.ucb.fct.servlet.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.ucb.fct.util.Factory;

public class ListaTurmasAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		req.setAttribute("turmas", Factory.initTurmaDAO().selectAll());
		return "/view/admin/turma/listaTurmas.jsp";
	}

}
