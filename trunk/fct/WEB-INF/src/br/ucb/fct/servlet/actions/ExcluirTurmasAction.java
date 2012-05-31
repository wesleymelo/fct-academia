package br.ucb.fct.servlet.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import br.ucb.fct.turma.TurmaDAO;
import br.ucb.fct.util.Factory;
import br.ucb.fct.util.Util;

public class ExcluirTurmasAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		if(Boolean.parseBoolean(req.getParameter("confirma"))){
			TurmaDAO turmasDao= Factory.initTurmaDAO();
			turmasDao.delete(Integer.parseInt(req.getParameter("id")));
			return "/view/admin/turmas/listaTurmases.do";
		}
		req.setAttribute("turmas", Factory.initTurmaDAO().selectById(Integer.parseInt(req.getParameter("id"))));
		req.setAttribute("pendencias",Util.buscaPendencias(Factory.initTurmaDAO().selectById(Integer.parseInt(req.getParameter("id")))));
		return "/view/admin/turmas/listaTurmases.do?excluir=true&show=true";
	}

}
