package br.ucb.fct.servlet.actions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.pagamento.Pagamento;
import br.ucb.fct.util.Factory;

public class ListaPagamentoAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {

		List<Pagamento> pagamentos = Factory.initPagamentoDAO().selectAll();
		req.setAttribute("pagamentos", pagamentos);
		return "/view/admin/pagamento/listaPagamento.jsp";
		
	}

}
