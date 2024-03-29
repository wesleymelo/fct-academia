package br.ucb.fct.servlet.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.util.Factory;

public class BuscaModalidadesAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		req.setAttribute("modalidades", Factory.initModalidadeDAO().selectAll());
		return "/view/admin/pacote/popupListaModalidades.jsp";
	}

}
