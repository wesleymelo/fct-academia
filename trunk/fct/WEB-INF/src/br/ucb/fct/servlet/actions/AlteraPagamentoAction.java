package br.ucb.fct.servlet.actions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.pagamento.Pagamento;
import br.ucb.fct.util.Factory;
import br.ucb.fct.util.Util;

public class AlteraPagamentoAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {

		Pagamento pagamento = Factory.initPagamentoDAO().selectById(Integer.parseInt(req.getParameter("codigo")));
		Util.putAtribuRequisicaoPagamento(req, pagamento);
		return "/view/admin/pagamento/alteraPagamento.jsp";
	}

}
