package br.ucb.fct.servlet.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.graduacao.Graduacao;
import br.ucb.fct.util.Factory;
import br.ucb.fct.util.Util;

public class AlteraGraduacao implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		
		Graduacao graduacao = Factory.initGraduacaoDAO().selectById(Integer.parseInt(req.getParameter("codigo")));
		Util.putAtribuRequisicaoGraducao(req, graduacao);
		req.setAttribute("codigo", graduacao.getIdGraduacao());
		return "/view/admin/graduacao/alteraGraduacao.jsp";
	}

}
