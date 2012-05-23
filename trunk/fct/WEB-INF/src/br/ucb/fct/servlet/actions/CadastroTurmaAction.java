package br.ucb.fct.servlet.actions;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.ucb.fct.turma.Turma;
import br.ucb.fct.util.Factory;
import br.ucb.fct.util.GeraErros;
import br.ucb.fct.util.Util;

public class CadastroTurmaAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		
		Map<String, String> erros;
		boolean retorno = false;
		erros = GeraErros.verificaErrosTurmas(req);
		if(Integer.parseInt(req.getParameter("pg"))==1){	
			if(!erros.isEmpty()){
				req.setAttribute("erros",erros);
				return "/view/admin/turma/cadastroTurma.jsp";
			}
			else{
				Turma turma = Util.getCadastroTurmas(req);
				retorno = Factory.initTurmaDAO().insert(turma);
				return "/view/admin/turma/listaTurmas.do?status="+retorno;
			}
		}
		else{
			if(!erros.isEmpty()){
				req.setAttribute("erros", erros);
				req.setAttribute("codigo", req.getParameter("codigo"));
				return "/view/admin/turma/alteraTurma.jsp"; 
			}
			else{
				Turma turma = Util.getCadastroTurmas(req);
				retorno = Factory.initTurmaDAO().update(turma,Integer.parseInt(req.getParameter("codigo")));
				return "/view/admin/turma/listaTurmas.do?status="+retorno;
			}
		}
	}
}
