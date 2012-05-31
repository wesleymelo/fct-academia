package br.ucb.fct.servlet.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.graduacao.GraduacaoDAO;
import br.ucb.fct.util.Factory;
import br.ucb.fct.util.Util;

public class ExcluirGraduacaoAction implements Action{

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		if(Boolean.parseBoolean(req.getParameter("confirma"))){
			GraduacaoDAO graduacaoDao= Factory.initGraduacaoDAO();
			boolean retorno = graduacaoDao.delete(Integer.parseInt(req.getParameter("id")));
			return "/view/admin/graduacao/listaGraduacoes.do?status="+retorno;
		}
		req.setAttribute("graduacao", Factory.initGraduacaoDAO().selectById(Integer.parseInt(req.getParameter("id"))));
		req.setAttribute("pendencias",Util.buscaPendencias(Factory.initGraduacaoDAO().selectById(Integer.parseInt(req.getParameter("id")))));
		return "/view/admin/graduacao/listaGraduacoes.do?excluir=true&show=true";
	}

}
