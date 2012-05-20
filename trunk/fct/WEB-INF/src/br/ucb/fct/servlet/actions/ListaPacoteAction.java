package br.ucb.fct.servlet.actions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.pacote.Pacote;
import br.ucb.fct.util.Factory;

public class ListaPacoteAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		
		List<Pacote> pacotes = Factory.initPacoteDAO().selectAll();
		req.setAttribute("pacotes", pacotes);
		
		return "/view/admin/pacote/listaPacote.jsp";
		
	}

}
