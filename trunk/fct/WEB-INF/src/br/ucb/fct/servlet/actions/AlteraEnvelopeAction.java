package br.ucb.fct.servlet.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.envelope.Envelope;
import br.ucb.fct.util.Factory;
import br.ucb.fct.util.Util;

public class AlteraEnvelopeAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		
		Envelope envelope = Factory.initEnvelopeDAO().selectById(Integer.parseInt(req.getParameter("codigo")));
		
		Util.putAtribuRequisicaoEnvelope(req);
		
		
		return null;
	}

}
