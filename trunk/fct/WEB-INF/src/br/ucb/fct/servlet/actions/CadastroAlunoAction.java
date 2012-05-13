package br.ucb.fct.servlet.actions;

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
import br.ucb.fct.util.GeraErros;
import br.ucb.fct.util.Util;
import br.ucb.fct.util.Validator;



public class CadastroAlunoAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {

		//Declarações
		
		int pg = Integer.parseInt(req.getParameter("pg"));
		Map<String, String> erros;
		HttpSession sessao = req.getSession();


		System.out.println(pg);

		switch (pg) {
			
			case 1:
				erros = GeraErros.verificaErrosAlunos(req);
				if(!erros.isEmpty()){
					req.setAttribute("erros",erros);
					return "/view/admin/aluno/cadastroAluno.jsp";
				}
				else{
					setSessionAluno(sessao, req);
					return "/view/admin/aluno/cadastraAlunoEndereco.jsp";
				}
			default:
				erros = GeraErros.verificaErrosAlunoEndereco(req);

		}



		return "asdas";
	}

	public void setSessionAluno(HttpSession sessao, HttpServletRequest req){
		sessao.setAttribute("nome",req.getParameter("nome"));
		sessao.setAttribute("dataCadas",Util.formatDateOut(new Date().toString()));
		sessao.setAttribute("dataNasc",Util.unFormat(req.getParameter("dataNasc")));
		sessao.setAttribute("sexo",req.getParameter("sexo"));
		sessao.setAttribute("cpf",req.getParameter("cpf"));
		sessao.setAttribute("email",req.getParameter("email"));
		
		// telefone
		
		List<Telefone> tel = new ArrayList<Telefone>();		
		String [] fone = Util.formateTelOut(req.getParameter("celular"));
		tel.add(new Telefone(fone[0], fone[1], EnumTypeFone.CELULAR));		
		fone = Util.formateTelOut(req.getParameter("residencial"));
		tel.add(new Telefone(fone[0], fone[1], EnumTypeFone.RESIDENCIAL));
		fone = Util.formateTelOut(req.getParameter("comercial"));
		tel.add(new Telefone(fone[0], fone[1], EnumTypeFone.COMERCIAL));
		
		// fim telefone
		
		sessao.setAttribute("telefones",tel);
		sessao.setAttribute("altura",req.getParameter("altura"));
		sessao.setAttribute("peso",req.getParameter("peso"));
	}




}
