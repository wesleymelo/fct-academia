package br.ucb.fct.servlet.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.util.Factory;

public class BuscaGraduacoesAlunoAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		
		if(req.getParameter("busca") != null && !req.getParameter("busca").isEmpty())
			req.setAttribute("graduacoes", Factory.initGraduacaoDAO().selectByDesc(req.getParameter("busca")));
		else
			req.setAttribute("graduacoes", Factory.initGraduacaoDAO().selectAll());
		return "/view/admin/aluno/popupListaGraduacoes.jsp";
	}

}
