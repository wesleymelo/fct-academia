package br.ucb.fct.servlet.actions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.envelope.Envelope;
import br.ucb.fct.util.Factory;

public class ListaEnvelopesAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		
		List<Envelope> envelopes = Factory.initEnvelopeDAO().selectAll();
		req.setAttribute("envelopes", envelopes);
		return "/view/admin/envelope/listaEnvelopes.jsp";
	}

}
