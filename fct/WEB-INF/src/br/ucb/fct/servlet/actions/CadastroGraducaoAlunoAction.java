package br.ucb.fct.servlet.actions;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.modalidade.Modalidade;
import br.ucb.fct.turma.Turma;
import br.ucb.fct.util.Factory;
import br.ucb.fct.util.GeraErros;
import br.ucb.fct.util.Util;

public class CadastroGraducaoAlunoAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		
		Map<String, String> erros;
		boolean retorno = false;
		req.setAttribute("aluno", Factory.initAlunoDAO().selectById(Integer.parseInt(req.getParameter("idAluno"))));
		erros = GeraErros.verificaErrosGraducaoAluno(req);
		if(!erros.isEmpty()){
			req.setAttribute("erros",erros);
			return "/view/admin/aluno/cadastroGraduacoesAluno.jsp?status="+retorno+"&id="+req.getParameter("idAluno");
		}
		retorno = Factory.initAlunoDAO().insertGraducaoAluno(Integer.parseInt(req.getParameter("idAluno")), Integer.parseInt(req.getParameter("idGraduacao")));
		return "/view/admin/aluno/cadastroGraduacoesAluno.jsp?status="+retorno+"&id="+req.getParameter("idAluno");
	}
}
