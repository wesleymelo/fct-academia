package br.ucb.fct.servlet.actions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.secretaria.Secretaria;
import br.ucb.fct.util.Factory;

public class ListaSecretariasAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		List<Secretaria> secretarias = Factory.initSecretariaDAO().selectAll();
		req.setAttribute("secretarias", secretarias);
	
		return "/view/admin/secretaria/listaSecretarias.jsp";
	}

}
