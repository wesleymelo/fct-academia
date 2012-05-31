package br.ucb.fct.servlet.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.util.Factory;

public class BuscaAlunoPacoteAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		req.setAttribute("alunos", Factory.initAlunoDAO().selectAll());
		return "/view/admin/pacote/popupListaAlunos.jsp";
	}

}
