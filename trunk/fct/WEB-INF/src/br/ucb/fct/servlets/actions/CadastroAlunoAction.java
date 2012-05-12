package br.ucb.fct.servlets.actions;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.ucb.fct.aluno.Aluno;
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
				if(!erros.isEmpty()){
					return "cadastroAluno.jsp";
				}
				else{
					
					
					
				}
					
				
				
				
				
			break;

		
		}
		
		
		
		return null;
	}
	
	public void setSessionAluno(HttpSession sessao, HttpServletRequest req, List<Telefone> fones){
		sessao.setAttribute("nome",req.getParameter("nome"));
		sessao.setAttribute("dataNasc",Util.unFormat(req.getParameter("nome")));
		sessao.setAttribute("sexo",req.getParameter("sexo"));
		sessao.setAttribute("cpf",req.getParameter("cpf"));
		sessao.setAttribute("email",req.getParameter("email"));
		sessao.setAttribute("telefones",fones);
		sessao.setAttribute("altura",req.getParameter("altura"));
		sessao.setAttribute("peso",req.getParameter("peso"));
	}
	
	
	public Aluno newAluno(HttpSession sessao, HttpServletRequest req){
		return new Aluno(idPessoa, tipoPessoa, dataCadastro, nome, cpf, sexo, dataNascimento, endereco, telefones, email, status, peso, altura);
		
	}

}
