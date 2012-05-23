package br.ucb.fct.servlet.actions;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.ucb.fct.util.Factory;

public class VisualizaProfessorAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		
		req.setAttribute("professor", Factory.initProfessorDAO().selectById(Integer.parseInt(req.getParameter("id"))));
		return "/view/admin/professor/listaProfessores.do?show=true";

	}

}
