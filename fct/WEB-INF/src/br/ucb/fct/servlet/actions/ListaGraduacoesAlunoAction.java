package br.ucb.fct.servlet.actions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.graduacao.Graduacao;
import br.ucb.fct.util.Factory;

public class ListaGraduacoesAlunoAction implements Action{

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		List<Graduacao> graduacoes = Factory.initGraduacaoDAO().selectAll();
		req.setAttribute("graduacoes", graduacoes);
		return "/view/admin/aluno/cadastroGraduacoesAluno.jsp";
	}

}
