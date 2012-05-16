package br.ucb.fct.servlet.actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.ucb.fct.aluno.Aluno;
import br.ucb.fct.endereco.Endereco;
import br.ucb.fct.enuns.EnumTypeFone;
import br.ucb.fct.enuns.EnumTypeSexo;
import br.ucb.fct.telefone.Telefone;
import br.ucb.fct.util.Factory;
import br.ucb.fct.util.GeraErros;
import br.ucb.fct.util.Util;



public class CadastroAlunoAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		
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
			case 2:
				erros = GeraErros.verificaErrosEndereco(req);
				if(!erros.isEmpty()){
					req.setAttribute("erros",erros);
					return "/view/admin/aluno/cadastroAlunoEndereco.jsp";
				}
				else{
					boolean retorno = false;
					Aluno aluno = Util.getCadastroAluno(req);					
					Endereco endereco = Util.getEnderecoCadastro(req);
					
					if(Factory.initEnderecoDAO().insert(endereco)){
						if(Factory.initAlunoDAO().insert(aluno))
							retorno = Factory.initTelefoneDAO().insert(aluno.getTelefones());
					}
					return "../../admin/aluno/listaAlunos.do?status="+retorno+"";
				}
			case 3:
				erros = GeraErros.verificaErrosAlunos(req);
				System.out.println(req.getParameter("codigo"));
				/*if(!erros.isEmpty()){
					req.setAttribute("erros", erros);
					return "/alteraAluno.do?codigo="+req.getParameter("codigo");
				}*/
		}
		return null;
	
	}

	public void setSessionAluno(HttpSession sessao, HttpServletRequest req){
		sessao.setAttribute("nome",req.getParameter("nome"));
	//	sessao.setAttribute("dataCadas",Util.formatDateOut(new Date().toString()));
		sessao.setAttribute("dataNasc",req.getParameter("dataNasc"));
		
		System.out.println(req.getParameter("dataNasc"));
		
		sessao.setAttribute("sexo",EnumTypeSexo.findByCodigo(req.getParameter("sexo").charAt(0)));
		
		
		
		sessao.setAttribute("cpf",Util.unFormat(req.getParameter("cpf")));
		sessao.setAttribute("email",req.getParameter("email"));
		
		// telefone
		
		List<Telefone> tel = new ArrayList<Telefone>();		
		String [] fone = Util.formateTelOut(Util.unFormat(req.getParameter("celular")));
		
		System.out.println(fone[0]);
		
		tel.add(new Telefone(fone[0], fone[1], EnumTypeFone.CELULAR));		
		fone = Util.formateTelOut(Util.unFormat(req.getParameter("residencial")));
		tel.add(new Telefone(fone[0], fone[1], EnumTypeFone.RESIDENCIAL));
		fone = Util.formateTelOut(Util.unFormat(req.getParameter("comercial")));
		tel.add(new Telefone(fone[0], fone[1], EnumTypeFone.COMERCIAL));
		
		// fim telefone
		
		sessao.setAttribute("telefones",tel);
		sessao.setAttribute("altura",req.getParameter("altura"));
		sessao.setAttribute("peso",req.getParameter("peso"));
	}




}
