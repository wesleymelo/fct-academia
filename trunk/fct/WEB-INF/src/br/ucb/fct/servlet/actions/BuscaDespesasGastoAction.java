package br.ucb.fct.servlet.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.util.Factory;

public class BuscaDespesasGastoAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		if(req.getParameter("busca") != null && !req.getParameter("busca").isEmpty())
			req.setAttribute("despesas", Factory.initDespesaDAO().selectByDesc(req.getParameter("busca")));
		else
			req.setAttribute("despesas", Factory.initDespesaDAO().selectAll());
		return "/view/admin/gasto/popupListaDespesas.jsp";
	}

}
