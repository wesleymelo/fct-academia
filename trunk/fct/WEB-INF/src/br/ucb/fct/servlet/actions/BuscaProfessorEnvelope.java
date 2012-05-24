package br.ucb.fct.servlet.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.util.Factory;

public class BuscaProfessorEnvelope implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		
		req.setAttribute("professores", Factory.initProfessorDAO().selectAll());
		return "/view/admin/envelope/popupListaProfessores.jsp";
	}

}
