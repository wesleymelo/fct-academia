package br.ucb.fct.servlet.actions;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.despesa.Despesa;
import br.ucb.fct.util.Factory;
import br.ucb.fct.util.GeraErros;
import br.ucb.fct.util.Util;

public class CadastraDespesaAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		
		Map<String,String> erros = GeraErros.verificaErrosDespesas(req);
		boolean retorno = false;
		if(Integer.parseInt(req.getParameter("pg")) == 1){
			if(!erros.isEmpty()){
				req.setAttribute("erros", erros);
				return "/view/admin/despesa/cadastroDespesa.jsp";
			}
			else{
				Despesa despesa = Util.getCadastroDespesa(req);
				retorno = Factory.initDespesaDAO().insert(despesa);
				return "/view/admin/despesa/listaDespesas.do?status="+retorno;	
			}
		}
		else{
			if(!erros.isEmpty()){
				req.setAttribute("erros", erros);
				req.setAttribute("codigo", req.getParameter("codigo"));
				return "/view/admin/despesa/alteraDespesa.jsp";
			}
			else{
				Despesa despesa = Util.getCadastroDespesa(req);
				retorno = Factory.initDespesaDAO().update(despesa, Integer.parseInt(req.getParameter("codigo")));
				return "/view/admin/despesa/listaDespesas.do?status="+retorno;	
			}
		}
	}

}
