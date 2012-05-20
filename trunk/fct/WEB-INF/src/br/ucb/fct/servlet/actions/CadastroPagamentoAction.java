package br.ucb.fct.servlet.actions;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.util.GeraErros;

public class CadastroPagamentoAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {


		Map<String, String> erros = GeraErros.verificaErrosPagamento(req);
		
		if(Integer.parseInt(req.getParameter("pg")) == 1){
			if()
		}
		
		
		
	}

}
