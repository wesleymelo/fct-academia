package br.ucb.fct.servlet.actions;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.ucb.fct.aluno.Aluno;
import br.ucb.fct.turma.Turma;
import br.ucb.fct.util.Factory;

public class CarregaAlunosTurmaAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		List<Aluno> alunos = Factory.initTurmaDAO().selectAlunosById(Integer.parseInt(req.getParameter("id")));
		Turma turma = Factory.initTurmaDAO().selectById(Integer.parseInt(req.getParameter("id")));
		req.setAttribute("alunos", alunos);
		req.setAttribute("turma", turma);
		return "/view/admin/turma/cadastraAlunoNaTurma.jsp?id="+req.getParameter("id");
	}

}
