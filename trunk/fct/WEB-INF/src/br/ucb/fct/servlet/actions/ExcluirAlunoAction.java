package br.ucb.fct.servlet.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.aluno.AlunoDAO;
import br.ucb.fct.util.Factory;
import br.ucb.fct.util.Util;

public class ExcluirAlunoAction implements Action {


	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		boolean retorno;
		if(Boolean.parseBoolean(req.getParameter("confirma"))){
			AlunoDAO alunoDao= Factory.initAlunoDAO();
			retorno = alunoDao.desativa(Integer.parseInt(req.getParameter("id")));
			return "/view/admin/aluno/listaAlunos.do?status="+retorno;
		}
		req.setAttribute("aluno", Factory.initAlunoDAO().selectById(Integer.parseInt(req.getParameter("id"))));
		req.setAttribute("pendencias",Util.buscaPendencias(Factory.initAlunoDAO().selectById(Integer.parseInt(req.getParameter("id")))));
		return "/view/admin/aluno/listaAlunos.do?excluir=true&show=true";
	}

}
