package br.ucb.fct.servlet.actions;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.pacote.PacoteDAO;
import br.ucb.fct.util.Factory;
import br.ucb.fct.util.GeraErros;

public class CadastroModalidadeNoPacoteAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		
		PacoteDAO dao =  Factory.initPacoteDAO();
		
		Map<String, String> erros;
		boolean retorno = false;
		req.setAttribute("pacote",dao.selectById(Integer.parseInt(req.getParameter("idPacote"))));
		erros = GeraErros.verificaErrosModalidadeNoPacote(req);
		if(!erros.isEmpty()){
			req.setAttribute("erros",erros);
			return "/view/admin/pacote/carregaModalidadePacote.do?status="+retorno+"&id="+req.getParameter("idPacote");
		}
		retorno = dao.insertModalidadeNoPacote(Integer.parseInt(req.getParameter("idPacote")), 
				                               Integer.parseInt(req.getParameter("idModalidade")),
				                               Integer.parseInt(req.getParameter("idPagamento")));
		return "/view/admin/pacote/carregaModalidadePacote.do?status="+retorno+"&id="+req.getParameter("idPacote");

	}

}
