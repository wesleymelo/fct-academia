package br.ucb.fct.servlet.actions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.modalidade.Modalidade;
import br.ucb.fct.util.Factory;

public class CarregaModalidadesAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		List<Modalidade> modalidades = Factory.initModalidadeDAO().selectAll();
		req.setAttribute("modalidades", modalidades);
	
		return "/view/admin/turma/cadastroTurma.jsp";
	}

}
