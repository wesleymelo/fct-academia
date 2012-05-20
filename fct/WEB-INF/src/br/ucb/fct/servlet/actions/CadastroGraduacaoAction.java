package br.ucb.fct.servlet.actions;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.graduacao.Graduacao;
import br.ucb.fct.modalidade.Modalidade;
import br.ucb.fct.util.Factory;
import br.ucb.fct.util.GeraErros;
import br.ucb.fct.util.Util;

public class CadastroGraduacaoAction implements Action{

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		
		List<Modalidade> modalidades = Factory.initModalidadeDAO().selectAll();
		if(req.getParameter("pg") != null && Integer.parseInt(req.getParameter("pg")) == 1){
			req.setAttribute("modalidades", modalidades);
			return "/view/admin/graduacao/cadastroGraduacao.jsp";		
		}
		
		Map<String,String> erros = GeraErros.verificaErrosGraduacao(req);
		boolean retorno = false;
		
		if(!erros.isEmpty()){
			req.setAttribute("erros", erros);
			req.setAttribute("modalidades", modalidades);
			return "/view/admin/graduacao/cadastroGraduacao.jsp";
		}
		else{
			Graduacao graduacao = Util.getCadastroGraduacao(req);
			retorno = Factory.initGraduacaoDAO().insert(graduacao);
			return "/view/admin/aluno/listaGraduacoes.do?status="+retorno;
		}

	}

}
