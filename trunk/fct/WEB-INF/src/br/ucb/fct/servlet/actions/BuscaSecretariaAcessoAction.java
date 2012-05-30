package br.ucb.fct.servlet.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.util.Factory;

public class BuscaSecretariaAcessoAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		
		if(req.getParameter("busca") != null && !req.getParameter("busca").isEmpty())
			req.setAttribute("secretarias", Factory.initSecretariaDAO().selectByNome(req.getParameter("busca")));
		else
			req.setAttribute("secretarias", Factory.initSecretariaDAO().selectAll());
		return "/view/admin/acesso/popupListaSecretarias.jsp";
	}

}
