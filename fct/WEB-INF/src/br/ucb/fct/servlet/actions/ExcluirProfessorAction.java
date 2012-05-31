package br.ucb.fct.servlet.actions;

import java.awt.List;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.professor.ProfessorDAO;
import br.ucb.fct.professor.ProfessorDAOConexao;
import br.ucb.fct.util.Factory;
import br.ucb.fct.util.Util;


public class ExcluirProfessorAction implements Action {
		

		@Override
		public String execute(HttpServletRequest req, HttpServletResponse resp) {
			if(Boolean.parseBoolean(req.getParameter("confirma"))){
				ProfessorDAO professorDao= Factory.initProfessorDAO();
				boolean retorno = professorDao.desativa(Integer.parseInt(req.getParameter("id")));
				return "/view/admin/professor/listaProfessores.do?status="+retorno;
			}
			req.setAttribute("professor", Factory.initProfessorDAO().selectById(Integer.parseInt(req.getParameter("id"))));
			req.setAttribute("pendencias",Util.buscaPendencias(Factory.initProfessorDAO().selectById(Integer.parseInt(req.getParameter("id")))));
			return "/view/admin/professor/listaProfessores.do?excluir=true&show=true&status=true";
		}

		
		
}
