package br.ucb.fct.servlet.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.despesa.Despesa;
import br.ucb.fct.util.Factory;
import br.ucb.fct.util.Util;

public class AlteraDespesaAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		Despesa despesa = Factory.initDespesaDAO().selectById(Integer.parseInt(req.getParameter("codigo")));
		Util.putAtribuRequisicaoDespesa(req, despesa);
		return "/view/admin/despesa/alteraDespesa.jsp";
	}

}
