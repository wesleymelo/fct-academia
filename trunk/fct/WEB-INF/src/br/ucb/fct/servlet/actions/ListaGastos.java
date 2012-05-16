package br.ucb.fct.servlet.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.util.Factory;

public class ListaGastos implements Action{
	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		req.setAttribute("gastos", Factory.initGastoDAO().selectAll());
		return "/view/admin/gasto/listaGasto.jsp";
	}

}
