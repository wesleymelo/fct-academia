package br.ucb.fct.servlet.actions;

import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.aluno.Aluno;
import br.ucb.fct.util.Factory;
import br.ucb.fct.util.Util;

public class AlteraAlunoAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {		
		
		Aluno aluno = Factory.initAlunoDAO().selectById(Integer.parseInt(req.getParameter("codigo")));
		
		System.out.println(aluno.getIdPessoa());
		
		//Aluno aluno = Factory.initAlunoDAO().selectById(Integer.parseInt(req.getParameter("codigo")));
		Map<String, String> tel = Util.separaTelefones(aluno.getTelefones());
		
		req.setAttribute("nascimento", Util.formatDateView(aluno.getDataNascimento().toString()));
		req.setAttribute("tel",tel);
		req.setAttribute("aluno",aluno);
		System.out.println("/view/admin/aluno/alteraCadastroAluno.jsp?codigo="+aluno.getIdPessoa());
		return "/view/admin/aluno/alteraCadastroAluno.jsp?codigo="+aluno.getIdPessoa();
		
	}

}
