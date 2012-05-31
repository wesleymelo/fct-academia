package br.ucb.fct.servlet.actions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.aluno.Aluno;
import br.ucb.fct.graduacao.Graduacao;
import br.ucb.fct.util.Factory;

public class CarregaGraduacoesAlunoAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		List<Graduacao> graduacoes = Factory.initAlunoDAO().selectGraducoesById(Integer.parseInt(req.getParameter("id")));
		Aluno aluno = Factory.initAlunoDAO().selectById(Integer.parseInt(req.getParameter("id")));
		req.setAttribute("graduacoes", graduacoes);
		req.setAttribute("aluno", aluno);
		return "/view/admin/aluno/cadastroGraduacoesAluno.jsp?id="+req.getParameter("id");
	}

}
