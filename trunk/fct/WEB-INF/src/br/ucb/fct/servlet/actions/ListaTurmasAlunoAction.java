package br.ucb.fct.servlet.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.ucb.fct.util.Factory;

public class ListaTurmasAlunoAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		req.setAttribute("turmas", Factory.initAlunoDAO().selectTurmasById(Integer.parseInt(req.getParameter("id"))));
		return "/view/admin/aluno/popupListaTurmas.jsp";
	}

}
