package br.ucb.fct.servlet.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.gasto.Gasto;
import br.ucb.fct.util.Factory;
import br.ucb.fct.util.Util;

public class AlteraGastoAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		
		Gasto gasto = Factory.initGastoDAO().selectById(Integer.parseInt(req.getParameter("codigo")));
		Util.putAtribuRequisicaoGasto(req, gasto);
		return "/view/admin/gasto/alteraGasto.jsp";
	}

}
