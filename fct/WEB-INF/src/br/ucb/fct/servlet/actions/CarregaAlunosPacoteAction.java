package br.ucb.fct.servlet.actions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.aluno.Aluno;
import br.ucb.fct.pacote.Pacote;
import br.ucb.fct.pacote.PacoteDAO;
import br.ucb.fct.util.Factory;

public class CarregaAlunosPacoteAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		
		PacoteDAO dao = Factory.initPacoteDAO();
		
		List<Aluno> alunos = dao.selectAlunosById(Integer.parseInt(req.getParameter("id")));
		Pacote pacote = dao.selectById(Integer.parseInt(req.getParameter("id")));
		req.setAttribute("alunos", alunos);
		req.setAttribute("pacote", pacote);
		return "/view/admin/pacote/cadastraAlunoNoPacote.jsp?id="+req.getParameter("id");
		
	}

}
