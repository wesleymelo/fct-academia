package br.ucb.fct.servlet.actions;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.acesso.Acesso;
import br.ucb.fct.util.Factory;
import br.ucb.fct.util.GeraErros;
import br.ucb.fct.util.Util;

public class CadastroAcessoAction implements Action{

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		
		Map<String,String> erros;
		boolean retorno = false;
		erros = GeraErros.verificaErrosAcesso(req);
		if(!erros.isEmpty()){
			req.setAttribute("erros", erros);
			return "/view/admin/acesso/cadastroAcesso.jsp";
		}
		else{
			Acesso acesso = Util.getCadastroAcesso(req);
			retorno = Factory.initAcessoDAO().insert(acesso);
			return "/view/admin/acesso/listaAcessos.do?status="+retorno;
		}
	}

}
