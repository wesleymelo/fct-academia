package br.ucb.fct.servlet.actions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.modalidade.Modalidade;
import br.ucb.fct.pacote.Pacote;
import br.ucb.fct.pacote.PacoteDAO;
import br.ucb.fct.util.Factory;

public class CarregaModalidadePacoteAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		
		PacoteDAO dao = Factory.initPacoteDAO(); 
		
		List<Modalidade> modalidades = dao.selectModalidadeById(Integer.parseInt(req.getParameter("id")));
		Pacote pacote = dao.selectById(Integer.parseInt(req.getParameter("id")));
		req.setAttribute("modalidades",modalidades);
		req.setAttribute("pacote",pacote);
		
		return "/view/admin/pacote/cadastraModalidadeNoPacote.jsp?id="+req.getParameter("id");
		
		
	}

}
