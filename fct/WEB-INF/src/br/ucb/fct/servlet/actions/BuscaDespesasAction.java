package br.ucb.fct.servlet.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.util.Factory;

public class BuscaDespesasAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		req.setAttribute("despesas", Factory.initDespesaDAO().selectAll());
		return "/view/admin/gasto/popupListaDespesas.jsp";

	}

}
