package br.ucb.fct.servlet.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.gasto.GastoDAO;
import br.ucb.fct.util.Factory;
import br.ucb.fct.util.Util;

public class ExcluirGastosAction implements Action{

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		if(Boolean.parseBoolean(req.getParameter("confirma"))){
			GastoDAO gastoDao= Factory.initGastoDAO();
			gastoDao.delete(Integer.parseInt(req.getParameter("id")));
			return "/view/admin/gasto/listaGastoes.do";
		}
		req.setAttribute("gasto", Factory.initGastoDAO().selectById(Integer.parseInt(req.getParameter("id"))));
		req.setAttribute("pendencias",Util.buscaPendencias(Factory.initGastoDAO().selectById(Integer.parseInt(req.getParameter("id")))));
		return "/view/admin/gasto/listaGastoes.do?excluir=true&show=true";
	}


}
