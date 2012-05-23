package br.ucb.fct.servlet.actions;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.pagamento.Pagamento;
import br.ucb.fct.util.Factory;
import br.ucb.fct.util.GeraErros;
import br.ucb.fct.util.Util;

public class CadastroPagamentoAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {


		Map<String, String> erros = GeraErros.verificaErrosPagamento(req);
		boolean retorno = false;
		if(Integer.parseInt(req.getParameter("pg")) == 1){
			if(!erros.isEmpty()){
				req.setAttribute("erros", erros);
				return "/view/admin/pagamento/cadastroPagamento.jsp";
			}
			else{
				Pagamento pagamento = Util.getCadastroPagamento(req);
				retorno = Factory.initPagamentoDAO().insert(pagamento);
				return "/view/admin/pagamento/listaPagamentos.do?status="+retorno;
			}
		}
		else{
			if(!erros.isEmpty()){
				req.setAttribute("erros", erros);
				req.setAttribute("codigo", req.getParameter("codigo"));
				return "/view/admin/pagamento/alteraPagamento.jsp";
			}
			else{
				Pagamento pagamento = Util.getCadastroPagamento(req);
				retorno = Factory.initPagamentoDAO().update(pagamento, Integer.parseInt(req.getParameter("codigo")));
				return "/view/admin/pagamento/listaPagamentos.do?status="+retorno;
			}
		}
		
	}

}
