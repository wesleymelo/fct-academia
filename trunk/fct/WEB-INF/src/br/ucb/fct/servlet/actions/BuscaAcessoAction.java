package br.ucb.fct.servlet.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.util.Factory;

public class BuscaAcessoAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		
		if(req.getParameter("busca") != null && !req.getParameter("busca").isEmpty())
			req.setAttribute("acessos", Factory.initAcessoDAO().selectByNome(req.getParameter("busca")));
		else
			req.setAttribute("acessos", Factory.initAcessoDAO().selectAll());
		return "/view/admin/acesso/listaAcessos.jsp";
	}

}
