package br.ucb.fct.servlet.actions;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.gasto.Gasto;
import br.ucb.fct.util.Factory;

public class ListaGastosAction implements Action{
	
	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		
		List<Gasto> gastos = Factory.initGastoDAO().selectAll();		
		req.setAttribute("gastos", gastos);
		return "/view/admin/gasto/listaGastos.jsp";
	}
}
