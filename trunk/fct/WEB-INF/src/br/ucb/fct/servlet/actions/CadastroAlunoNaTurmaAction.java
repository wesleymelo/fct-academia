package br.ucb.fct.servlet.actions;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.modalidade.Modalidade;
import br.ucb.fct.turma.Turma;
import br.ucb.fct.util.Factory;
import br.ucb.fct.util.GeraErros;
import br.ucb.fct.util.Util;

public class CadastroAlunoNaTurmaAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		
		Map<String, String> erros;
		boolean retorno = false;
		req.setAttribute("turma", Factory.initTurmaDAO().selectById(Integer.parseInt(req.getParameter("idTurma"))));
		erros = GeraErros.verificaErrosAlunosNaTurma(req);
		if(!erros.isEmpty()){
			req.setAttribute("erros",erros);
			return "/view/admin/turma/carregaAlunosTurma.do?status="+retorno+"&id="+req.getParameter("idTurma");
		}
		retorno = Factory.initTurmaDAO().insertAlunoNaTurma(Integer.parseInt(req.getParameter("idTurma")), Integer.parseInt(req.getParameter("idAluno")));
		return "/view/admin/turma/carregaAlunosTurma.do?status="+retorno+"&id="+req.getParameter("idTurma");
	}
}
