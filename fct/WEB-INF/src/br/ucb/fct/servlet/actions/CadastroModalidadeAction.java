package br.ucb.fct.servlet.actions;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.ucb.fct.modalidade.Modalidade;
import br.ucb.fct.util.Factory;
import br.ucb.fct.util.GeraErros;



public class CadastroModalidadeAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		
		Map<String, String> erros;
		boolean retorno = false;
		erros = GeraErros.verificaErrosModalidades(req);
		if(!erros.isEmpty()){
			req.setAttribute("erros",erros);
			return "/view/admin/modalidade/cadastroModalidade.jsp";
		}
		Modalidade modalidade = new Modalidade(req.getParameter("desc"));
		retorno = Factory.initModalidadeDAO().insert(modalidade);
			
		return "../../admin/modalidade/listaModalidades.do?status="+retorno;
	}
}
