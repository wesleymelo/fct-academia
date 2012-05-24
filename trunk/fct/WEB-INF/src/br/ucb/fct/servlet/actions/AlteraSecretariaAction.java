package br.ucb.fct.servlet.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.secretaria.Secretaria;
import br.ucb.fct.util.Factory;
import br.ucb.fct.util.Util;

public class AlteraSecretariaAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		
		Secretaria secretaria = Factory.initSecretariaDAO().selectById(Integer.parseInt(req.getParameter("codigo")));
		Util.putAtribuRequisicaoSecretaria(req, secretaria);
		req.setAttribute("codigo",secretaria.getEndereco().getIdEndereco());
		req.setAttribute("idPessoa", secretaria.getIdPessoa());
		return "/view/admin/secretaria/alteraCadastroSecretaria.jsp";
	}

}
