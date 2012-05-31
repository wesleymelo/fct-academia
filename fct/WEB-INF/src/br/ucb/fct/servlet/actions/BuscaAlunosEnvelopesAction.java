package br.ucb.fct.servlet.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.util.Factory;

public class BuscaAlunosEnvelopesAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		if(req.getParameter("busca") != null && !req.getParameter("busca").isEmpty())
			req.setAttribute("alunos", Factory.initAlunoDAO().selectByNome(req.getParameter("busca")));
		else
			req.setAttribute("alunos", Factory.initAlunoDAO().selectAll());
		return "/view/admin/envelope/popupListaAlunos.jsp";
	}

}
