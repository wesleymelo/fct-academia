package br.ucb.fct.servlet.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.pacote.PacoteDAO;
import br.ucb.fct.util.Factory;
import br.ucb.fct.util.Util;

public class ExcluirPacotesAction implements Action{

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		if(Boolean.parseBoolean(req.getParameter("confirma"))){
			PacoteDAO pacoteDao= Factory.initPacoteDAO();
			pacoteDao.delete(Integer.parseInt(req.getParameter("id")));
			return "/view/admin/pacote/listaPacotees.do";
		}
		req.setAttribute("pacote", Factory.initPacoteDAO().selectById(Integer.parseInt(req.getParameter("id"))));
		req.setAttribute("pendencias",Util.buscaPendencias(Factory.initPacoteDAO().selectById(Integer.parseInt(req.getParameter("id")))));
		return "/view/admin/pacote/listaPacotees.do?excluir=true&show=true";
	}

}
