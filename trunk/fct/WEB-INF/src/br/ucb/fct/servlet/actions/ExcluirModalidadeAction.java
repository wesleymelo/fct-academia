package br.ucb.fct.servlet.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.modalidade.ModalidadeDAO;
import br.ucb.fct.util.Factory;
import br.ucb.fct.util.Util;

public class ExcluirModalidadeAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		if(Boolean.parseBoolean(req.getParameter("confirma"))){
			ModalidadeDAO modalidadeDao= Factory.initModalidadeDAO();
			boolean retorno = modalidadeDao.delete(Integer.parseInt(req.getParameter("id")));
			return "/view/admin/modalidade/listaModalidades.do?status="+retorno;
		}
		req.setAttribute("modalidade", Factory.initModalidadeDAO().selectById(Integer.parseInt(req.getParameter("id"))));
		req.setAttribute("pendencias",Util.buscaPendencias(Factory.initModalidadeDAO().selectById(Integer.parseInt(req.getParameter("id")))));
		return "/view/admin/modalidade/listaModalidades.do?excluir=true&show=true";
	}

}
