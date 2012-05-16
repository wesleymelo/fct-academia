package br.ucb.fct.servlet.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.aluno.Aluno;
import br.ucb.fct.util.Factory;

public class AlteraAlunoAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		
		
		
		Aluno aluno = Factory.initAlunoDAO().selectById(Integer.parseInt(req.getParameter("codigo")));
		
		System.out.println(aluno);
		
		req.setAttribute("aluno",aluno);
		
		return "/view/admin/aluno/alteraCadastroAluno.jsp";
		
	}

}
