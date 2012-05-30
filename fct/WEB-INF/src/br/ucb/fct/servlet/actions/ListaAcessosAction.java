package br.ucb.fct.servlet.actions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.acesso.Acesso;
import br.ucb.fct.util.Factory;

public class ListaAcessosAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		
		List<Acesso> acessos = Factory.initAcessoDAO().selectAll();
		req.setAttribute("acessos", acessos);
		
		return "/view/admin/acesso/listaAcessos.jsp";
		
	}

}
