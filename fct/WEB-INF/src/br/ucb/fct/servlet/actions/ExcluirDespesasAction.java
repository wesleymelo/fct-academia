package br.ucb.fct.servlet.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import br.ucb.fct.despesa.DespesaDAO;
import br.ucb.fct.util.Factory;
import br.ucb.fct.util.Util;

public class ExcluirDespesasAction implements Action{

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		if(Boolean.parseBoolean(req.getParameter("confirma"))){
			DespesaDAO despesasDao= Factory.initDespesaDAO();
			despesasDao.delete(Integer.parseInt(req.getParameter("id")));
			return "/view/admin/despesas/listaDespesases.do";
		}
		req.setAttribute("despesas", Factory.initDespesaDAO().selectById(Integer.parseInt(req.getParameter("id"))));
		req.setAttribute("pendencias",Util.buscaPendencias(Factory.initDespesaDAO().selectById(Integer.parseInt(req.getParameter("id")))));
		return "/view/admin/despesas/listaDespesases.do?excluir=true&show=true";
	}

}
