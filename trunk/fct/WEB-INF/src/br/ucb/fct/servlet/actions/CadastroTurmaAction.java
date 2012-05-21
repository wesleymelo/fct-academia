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
		if(!erros.isEmpty()){
			req.setAttribute("erros",erros);
			return "/view/admin/turma/cadastroTurma.jsp";
		}
		Turma turma = new Turma(Integer.parseInt(req.getParameter("idProfessor")), Integer.parseInt(req.getParameter("modalidade")), req.getParameter("nome"), Util.formatTime(req.getParameter("horarioInicial")), Util.formatTime(req.getParameter("horarioFinal")));
		retorno = Factory.initTurmaDAO().insert(turma);
			
		return "../../admin/turma/listaTurmas.do?status="+retorno;
	}
}
