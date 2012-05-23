package br.ucb.fct.servlet.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;


import br.ucb.fct.professor.Professor;
import br.ucb.fct.util.Factory;
import br.ucb.fct.util.Util;

public class AlteraProfessorAction implements Action {
	
	
	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {		
		
		Professor professor = Factory.initProfessorDAO().selectById(Integer.parseInt(req.getParameter("codigo")));
		Util.putAtribuRequisicaoProfessor(req, professor);
		req.setAttribute("codigo",professor.getEndereco().getIdEndereco());
		
		return "/view/admin/professor/alteraCadastroProfessor.jsp?codigo="+professor.getIdPessoa();
		
	}
}
