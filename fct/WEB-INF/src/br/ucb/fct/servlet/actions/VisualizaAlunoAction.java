package br.ucb.fct.servlet.actions;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.ucb.fct.aluno.Aluno;
import br.ucb.fct.util.Factory;

public class VisualizaAlunoAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		
		
		Aluno aluno = Factory.initAlunoDAO().selectById(Integer.parseInt(req.getParameter("id")));
		req.setAttribute("aluno", aluno);
		
		
		return "/view/admin/aluno/listaAlunos.do?show=true";

	}

}
