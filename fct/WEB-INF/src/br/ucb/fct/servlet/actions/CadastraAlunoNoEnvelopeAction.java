package br.ucb.fct.servlet.actions;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.envelope.EnvelopeDAO;
import br.ucb.fct.util.Factory;
import br.ucb.fct.util.GeraErros;

public class CadastraAlunoNoEnvelopeAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {

		
		EnvelopeDAO dao = Factory.initEnvelopeDAO();
		
		Map<String, String> erros;
		boolean retorno = false;
		req.setAttribute("envelope",dao.selectById(Integer.parseInt(req.getParameter("idEnvelope"))));
		erros = GeraErros.verificaErrosAlunoNoEnvelope(req);
		if(!erros.isEmpty()){
			req.setAttribute("erros",erros);
			return "/view/admin/pacote/carregaAlunosEnvelope.do?status="+retorno+"&id="+req.getParameter("idEnvelope");
		}
		retorno = dao.insertAlunoNaEnvelope(Integer.parseInt(req.getParameter("idAluno")),Integer.parseInt(req.getParameter("idEnvelope"))); 
		return "/view/admin/pacote/carregaAlunosEnvelope.do?status="+retorno+"&id="+req.getParameter("idEnvelope");

	}

}
