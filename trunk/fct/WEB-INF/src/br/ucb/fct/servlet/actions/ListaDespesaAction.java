package br.ucb.fct.servlet.actions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.despesa.Despesa;
import br.ucb.fct.util.Factory;

public class ListaDespesaAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		
		List<Despesa> despesas = Factory.initDespesaDAO().selectAll();
		req.setAttribute("despesas", despesas);
		return "/view/admin/despesa/listaDespesas.jsp";
		
	}

}
