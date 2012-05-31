package br.ucb.fct.servlet.actions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.aluno.Aluno;
import br.ucb.fct.envelope.Envelope;
import br.ucb.fct.envelope.EnvelopeDAO;
import br.ucb.fct.turma.Turma;
import br.ucb.fct.util.Factory;

public class CarregaAlunosEnvelopeAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		
		EnvelopeDAO dao = Factory.initEnvelopeDAO();
		
		List<Aluno> alunos = dao.selectAlunosById(Integer.parseInt(req.getParameter("id")));
		Envelope envelope = dao.selectById(Integer.parseInt(req.getParameter("id")));
		req.setAttribute("alunos", alunos);
		req.setAttribute("envelope", envelope);
		return "/view/admin/envelope/cadastraAlunoNoEnvelope.jsp?id="+req.getParameter("id");
	}

}
