package br.ucb.fct.servlet.actions;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.ucb.fct.util.Factory;

public class VisualizaSecretariaAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		
		req.setAttribute("secretaria", Factory.initSecretariaDAO().selectById(Integer.parseInt(req.getParameter("id"))));
		return "/view/admin/secretaria/listaSecretarias.do?show=true";

	}

}
