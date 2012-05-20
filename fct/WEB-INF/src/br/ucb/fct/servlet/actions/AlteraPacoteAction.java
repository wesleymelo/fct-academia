package br.ucb.fct.servlet.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.pacote.Pacote;
import br.ucb.fct.util.Factory;
import br.ucb.fct.util.Util;

public class AlteraPacoteAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		Pacote pacote = Factory.initPacoteDAO().selectById(Integer.parseInt(req.getParameter("codigo")));
		Util.putAtribuRequisicaoPacote(req, pacote);
		req.setAttribute("codigo", req.getParameter("codigo"));
		return "/view/admin/pacote/alteraPacote.jsp";
	}

}
