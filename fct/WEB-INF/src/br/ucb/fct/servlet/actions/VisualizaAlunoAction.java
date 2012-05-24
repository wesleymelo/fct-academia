package br.ucb.fct.servlet.actions;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.aluno.Aluno;
import br.ucb.fct.util.Factory;

public class VisualizaAlunoAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		
		List<Aluno> alunos = (List<Aluno>) req.getAttribute("alunos");
		req.setAttribute("aluno", Factory.initAlunoDAO().selectById(Integer.parseInt(req.getParameter("id"))));
		return "/view/admin/aluno/listaAlunos.do?show=true";

	}

}
