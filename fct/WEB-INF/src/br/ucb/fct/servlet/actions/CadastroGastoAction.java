package br.ucb.fct.servlet.actions;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.acesso.Acesso;
import br.ucb.fct.enuns.EnumAcesso;
import br.ucb.fct.gasto.Gasto;
import br.ucb.fct.pessoa.Pessoa;
import br.ucb.fct.util.Factory;
import br.ucb.fct.util.GeraErros;
import br.ucb.fct.util.Util;

public class CadastroGastoAction implements Action{

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		Map<String, String> erros;
		Pessoa pessoa;
		boolean retorno = false;
		if(req.getParameter("ps") != null && Integer.parseInt(req.getParameter("ps")) == 0){
			pessoa = (Pessoa) ((Acesso) req.getSession().getAttribute(EnumAcesso.ACESSO.getChave())).getPessoa();
			req.setAttribute("secret", pessoa);
			return "/view/admin/gasto/cadastroGasto.jsp";
		}
		erros = GeraErros.verificaErrosGastos(req);
		if(Integer.parseInt(req.getParameter("pg")) == 1){
			if(!erros.isEmpty()){
				req.setAttribute("erros", erros);
				return "/view/admin/gasto/cadastroGasto.jsp";
			}
			else{
				Gasto gasto = Util.getCadastroGasto(req);
				retorno = Factory.initGastoDAO().insert(gasto);
				return "/view/admin/gasto/listaGastos.do?status="+retorno;
			}
		}
		else{
			if(!erros.isEmpty()){
				req.setAttribute("erros", erros);
				return "/view/admin/gasto/cadastroGasto.jsp";
			}
			else{
				Gasto gasto = Util.getCadastroGasto(req);
				retorno = Factory.initGastoDAO().update(gasto, Integer.parseInt(req.getParameter("codigo")));
				return "/view/admin/gasto/listaGastos.do?status="+retorno;
			}
		}
	}

}
