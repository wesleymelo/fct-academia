package br.ucb.fct.servlet.actions;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.acesso.Acesso;
import br.ucb.fct.enuns.EnumAcesso;
import br.ucb.fct.envelope.Envelope;
import br.ucb.fct.pessoa.Pessoa;
import br.ucb.fct.util.Factory;
import br.ucb.fct.util.GeraErros;
import br.ucb.fct.util.Util;

public class CadastroEnvelopeAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		Pessoa pessoa;
		boolean retorno = false;
		
		
		if(req.getParameter("ps") != null && Integer.parseInt(req.getParameter("ps")) == 0){
			pessoa = (Pessoa) ((Acesso) req.getSession().getAttribute(EnumAcesso.ACESSO.getChave())).getPessoa();
			req.setAttribute("secret", pessoa);
			return "/view/admin/envelope/cadastroEnvelope.jsp";
		}
		Map<String,String> erros = GeraErros.verificaErrosEnvelope(req);
		if(Integer.parseInt(req.getParameter("pg")) == 1){
			if(!erros.isEmpty()){
				req.setAttribute("erros", erros);
				return "/view/admin/envelope/cadastroEnvelope.jsp";
			}
			else{
				Envelope envelope = Util.getCadastroEnvelope(req);
				retorno = Factory.initEnvelopeDAO().insert(envelope);
				return "/view/admin/envelope/listaEnvelopes.do?status="+retorno;
			}
		}
		return null;
	}

}
