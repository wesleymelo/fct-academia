package br.ucb.fct.servlet.actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.ucb.fct.aluno.Aluno;
import br.ucb.fct.aluno.AlunoDAO;
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
		boolean retorno = true;
		switch (pg) {

		case 1:
			erros = GeraErros.verificaErrosAlunos(req);
			if(!erros.isEmpty()){
				req.setAttribute("erros",erros);
				return "/view/admin/aluno/cadastroAluno.jsp";
			}
			else{
				setSessionAluno(sessao, req);
				req.setAttribute("estados", Factory.initEnderecoDAO().selectEstados());
				return "/view/admin/aluno/cadastroAlunoEndereco.jsp";
			}
		case 2:
			erros = GeraErros.verificaErrosEndereco(req);
			if(!erros.isEmpty()){
				req.setAttribute("erros",erros);
				return "/view/admin/aluno/cadastroAlunoEndereco.jsp";
			}
			else{
				Aluno aluno = Util.getCadastroAluno(req);					
				Endereco endereco = Util.getEnderecoCadastro(req);
				aluno.setEndereco(endereco);
				if(Factory.initEnderecoDAO().insert(endereco)){
					if(Factory.initAlunoDAO().insert(aluno))
						retorno = Factory.initTelefoneDAO().insert(aluno.getTelefones());
				}
				return "/view/admin/aluno/listaAlunos.do?status="+retorno;
			}
		case 3:				
			erros = GeraErros.verificaErrosAlunos(req);
			if(!erros.isEmpty()){
				req.setAttribute("erros", erros);
				req.setAttribute("codigo",req.getParameter("codigo"));
				return "/view/admin/aluno/alteraCadastroAluno.jsp";
			}
			else{
				setSessionAluno(sessao, req);
				Aluno aluno = Util.getCadastroAluno(req);	
				if(Factory.initAlunoDAO().update(aluno, Integer.parseInt(req.getParameter("idPessoa")))){
					if(Factory.initTelefoneDAO().update(aluno.getTelefones(),Integer.parseInt(req.getParameter("idPessoa")))){
						Endereco endereco = Factory.initEnderecoDAO().selectById(Integer.parseInt(req.getParameter("codigo").toString()));
						Util.putAtribuRequisicaoPessoaEndereco(req,endereco);
						req.setAttribute("codigo",endereco.getIdEndereco());
						return "/view/admin/aluno/alteraCadastroAlunoEndereco.jsp";
					}
				}
			}
			break;
		case 4:
			erros = GeraErros.verificaErrosEndereco(req);

			if(!erros.isEmpty()){
				req.setAttribute("erros", erros);
				req.setAttribute("codigo",req.getParameter("codigo"));
				return "/view/admin/aluno/alteraCadastroAlunoEndereco.jsp";
			}
			else{
				System.out.println("codigo "+req.getParameter("codigo"));
				Endereco endereco = Util.getEnderecoCadastro(req);
				retorno = Factory.initEnderecoDAO().update(endereco,Integer.parseInt(req.getParameter("codigo")));
				return "/view/admin/aluno/listaAlunos.do?status="+retorno;
			}
		}
		return null;

	}

	public void setSessionAluno(HttpSession sessao, HttpServletRequest req){

		sessao.setAttribute("nome",req.getParameter("nome"));
		sessao.setAttribute("dataCadas", new java.sql.Date(new java.util.Date().getTime()));
		sessao.setAttribute("dataNasc",Util.formatDateIn(req.getParameter("dataNasc")));
		sessao.setAttribute("sexo",EnumTypeSexo.findByCodigo(req.getParameter("sexo").charAt(0)));
		sessao.setAttribute("cpf",Util.unFormat(req.getParameter("cpf")));
		sessao.setAttribute("email",req.getParameter("email"));

		// telefone

		List<Telefone> tel = new ArrayList<Telefone>();		
		String [] fone;
		if(req.getParameter("celular") != null && !req.getParameter("celular").isEmpty()){
			fone = Util.formateTelOut(Util.unFormat(req.getParameter("celular")));		
			tel.add(new Telefone(fone[0], fone[1], EnumTypeFone.CELULAR));		
		}
		if(req.getParameter("residencial") != null && !req.getParameter("residencial").isEmpty()){
			fone = Util.formateTelOut(Util.unFormat(req.getParameter("residencial")));
			tel.add(new Telefone(fone[0], fone[1], EnumTypeFone.RESIDENCIAL));
		}
		if(req.getParameter("comercial") != null && !req.getParameter("comercial").isEmpty()){
			fone = Util.formateTelOut(Util.unFormat(req.getParameter("comercial")));
			tel.add(new Telefone(fone[0], fone[1], EnumTypeFone.COMERCIAL));
		}

		// fim telefone		
		sessao.setAttribute("telefones",tel);
		sessao.setAttribute("altura",req.getParameter("altura"));
		sessao.setAttribute("peso",req.getParameter("peso"));
	}

}
