package br.ucb.fct.servlet.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import br.ucb.fct.envelope.EnvelopeDAO;
import br.ucb.fct.util.Factory;
import br.ucb.fct.util.Util;

public class ExcluirEnvelopesAction implements Action{

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		if(Boolean.parseBoolean(req.getParameter("confirma"))){
			EnvelopeDAO envelopesDao= Factory.initEnvelopeDAO();
			envelopesDao.delete(Integer.parseInt(req.getParameter("id")));
			return "/view/admin/Envelopes/listaEnvelopes.do";
		}
		req.setAttribute("envelopes", Factory.initEnvelopeDAO().selectById(Integer.parseInt(req.getParameter("id"))));
		req.setAttribute("pendencias",Util.buscaPendencias(Factory.initEnvelopeDAO().selectById(Integer.parseInt(req.getParameter("id")))));
		return "/view/admin/envelopes/listaEnvelopeses.do?excluir=true&show=true";
	}

}
