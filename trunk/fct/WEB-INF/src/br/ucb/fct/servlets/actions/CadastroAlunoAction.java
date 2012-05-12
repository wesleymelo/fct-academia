package br.ucb.fct.servlets.actions;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.ucb.fct.aluno.Aluno;
import br.ucb.fct.enuns.EnumTypeFone;
import br.ucb.fct.enuns.EnumTypePessoa;
import br.ucb.fct.telefone.Telefone;
import br.ucb.fct.util.Util;
import br.ucb.fct.util.Validator;



public class CadastroAlunoAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {

		int pg = Integer.parseInt(req.getParameter("pg"));
		String nome = req.getParameter("nome");
		//String


		Map<String, String> erros = Validator.verificaErros(req);
		HttpSession sessao = req.getSession();




		switch (pg) {
		case 1:
			erros.
			if(!erros.isEmpty()){
				return "cadastroAluno.jsp";
			}
			else{
				setSessionAluno(sessao, req);
				return "cadastraAlunoEndereco.jsp";
			}

			break;


		}



		return null;
	}

	public void setSessionAluno(HttpSession sessao, HttpServletRequest req){
		sessao.setAttribute("nome",req.getParameter("nome"));
		sessao.setAttribute("dataCadas",Util.formatDateOut(new Date().toString()));
		sessao.setAttribute("dataNasc",Util.unFormat(req.getParameter("dataNasc")));
		sessao.setAttribute("sexo",req.getParameter("sexo"));
		sessao.setAttribute("cpf",req.getParameter("cpf"));
		sessao.setAttribute("email",req.getParameter("email"));
		List<Telefone> tel = new ArrayList<Telefone>();		
		
		if(Validator.verificaTel(Util.unFormat(req.getParameter("celular")))){
			String [] fone = Util.formateTelOut(req.getParameter("celular"));
			tel.add(new Telefone(fone[0], fone[1], EnumTypeFone.CELULAR));
		}
		
		if(Validator.verificaTel(Util.unFormat(req.getParameter("residencial")))){
			String [] fone = Util.formateTelOut(req.getParameter("residencial"));
			tel.add(new Telefone(fone[0], fone[1], EnumTypeFone.RESIDENCIAL));
		}
		
		if(Validator.verificaTel(Util.unFormat(req.getParameter("comercial")))){
			String [] fone = Util.formateTelOut(req.getParameter("comercial"));
			tel.add(new Telefone(fone[0], fone[1], EnumTypeFone.COMERCIAL));
		}
		
		sessao.setAttribute("telefones",tel);
		sessao.setAttribute("altura",req.getParameter("altura"));
		sessao.setAttribute("peso",req.getParameter("peso"));
	}




}
