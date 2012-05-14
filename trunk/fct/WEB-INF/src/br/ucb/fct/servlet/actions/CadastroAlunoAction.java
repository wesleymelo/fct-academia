package br.ucb.fct.servlet.actions;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.ucb.fct.aluno.Aluno;
import br.ucb.fct.endereco.EnderecoDAO;
import br.ucb.fct.enuns.EnumTypeFone;
import br.ucb.fct.enuns.EnumTypePessoa;
import br.ucb.fct.telefone.Telefone;
import br.ucb.fct.util.Factory;
import br.ucb.fct.util.GeraErros;
import br.ucb.fct.util.Util;
import br.ucb.fct.util.Validator;



public class CadastroAlunoAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		
		
		//System.out.println(new Date().toString());
		
		
		//Declarações
		
		int pg = Integer.parseInt(req.getParameter("pg"));
		Map<String, String> erros;
		HttpSession sessao = req.getSession();

		switch (pg) {
			
			case 1:
				erros = GeraErros.verificaErrosAlunos(req);
				if(!erros.isEmpty()){
					req.setAttribute("erros",erros);
					return "/view/admin/aluno/cadastroAluno.jsp";
				}
				else{
					setSessionAluno(sessao, req);
					req.getSession().setAttribute("estados", Factory.initEnderecoDAO().selectEstados());
					return "/view/admin/aluno/cadastroAlunoEndereco.jsp";
				}
			default:
				erros = GeraErros.verificaErrosAlunoEndereco(req);
				if(!erros.isEmpty()){
					req.setAttribute("erros",erros);
					return "/view/admin/aluno/cadastroAlunoEndereco.jsp";
				}
				else{
					
					Factory.initAlunoDAO().insert(Util.getCadastroAluno(req));
					
					return "../../admin/principal/index.jsp";
				}
				

		}



	
	}

	public void setSessionAluno(HttpSession sessao, HttpServletRequest req){
		sessao.setAttribute("nome",req.getParameter("nome"));
		//sessao.setAttribute("dataCadas",Util.formatDateOut(new Date().toString()));
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
