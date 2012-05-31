package br.ucb.fct.servlet.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.secretaria.SecretariaDAO;
import br.ucb.fct.util.Factory;
import br.ucb.fct.util.Util;

public class ExcluirSecretariaAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		if(Boolean.parseBoolean(req.getParameter("confirma"))){
			SecretariaDAO secretariaDao= Factory.initSecretariaDAO();
			boolean retorno = secretariaDao.desativa(Integer.parseInt(req.getParameter("id")));
			return "/view/admin/secretaria/listaSecretarias.do?status="+retorno;
		}
		req.setAttribute("secretaria", Factory.initSecretariaDAO().selectById(Integer.parseInt(req.getParameter("id"))));
		req.setAttribute("pendencias",Util.buscaPendencias(Factory.initSecretariaDAO().selectById(Integer.parseInt(req.getParameter("id")))));
		return "/view/admin/secretaria/listaSecretarias.do?excluir=true&show=true";
	}

}
