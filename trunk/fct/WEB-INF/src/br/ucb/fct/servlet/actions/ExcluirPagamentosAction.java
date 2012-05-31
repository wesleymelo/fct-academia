package br.ucb.fct.servlet.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.pagamento.PagamentoDAO;
import br.ucb.fct.util.Factory;
import br.ucb.fct.util.Util;

public class ExcluirPagamentosAction implements Action{

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		if(Boolean.parseBoolean(req.getParameter("confirma"))){
			PagamentoDAO pagamentoDao= Factory.initPagamentoDAO();
			pagamentoDao.delete(Integer.parseInt(req.getParameter("id")));
			return "/view/admin/pagamento/listaPagamentoes.do";
		}
		req.setAttribute("pagamento", Factory.initPagamentoDAO().selectById(Integer.parseInt(req.getParameter("id"))));
		req.setAttribute("pendencias",Util.buscaPendencias(Factory.initPagamentoDAO().selectById(Integer.parseInt(req.getParameter("id")))));
		return "/view/admin/pagamento/listaPagamentoes.do?excluir=true&show=true";
	}

}
