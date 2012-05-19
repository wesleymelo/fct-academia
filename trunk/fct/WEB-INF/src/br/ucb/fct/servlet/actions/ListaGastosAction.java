package br.ucb.fct.servlet.actions;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.despesa.Despesa;
import br.ucb.fct.gasto.Gasto;
import br.ucb.fct.util.Factory;

public class ListaGastosAction implements Action{
	
	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		List<Gasto> gastos = Factory.initGastoDAO().selectAll();
		List<Despesa> despesas=new ArrayList<Despesa>();
		for (Gasto gasto : gastos) {
			despesas.add(Factory.initDespesaDAO().selectById(gasto.getIdDespesa()));
		}
		req.setAttribute("despesas", despesas);
		req.setAttribute("gastos", gastos);
		return "/view/admin/gasto/listaGasto.jsp";
	}
}
