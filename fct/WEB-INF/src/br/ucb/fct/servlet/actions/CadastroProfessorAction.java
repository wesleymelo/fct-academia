package br.ucb.fct.servlet.actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

import br.ucb.fct.connection.MyConnection;
import br.ucb.fct.endereco.Endereco;
import br.ucb.fct.enuns.EnumTypeFone;
import br.ucb.fct.enuns.EnumTypeSexo;

import br.ucb.fct.professores.Professor;
import br.ucb.fct.telefone.Telefone;
import br.ucb.fct.util.Factory;
import br.ucb.fct.util.GeraErros;
import br.ucb.fct.util.Util;

public class CadastroProfessorAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {

		//System.out.println(new Date().toString());


		//Declarações

		int pg = Integer.parseInt(req.getParameter("pg"));
		Map<String, String> erros;
		HttpSession sessao = req.getSession();
       
		switch (pg) {

		case 1:
			
			erros = GeraErros.verificaErrosProfessors(req);
			System.out.println(erros);
			if(!erros.isEmpty()){
				req.setAttribute("erros",erros);
				return "/view/admin/professor/cadastroProfessor.jsp";
			}
			else{
				setSessionProfessor(sessao, req);
				req.getSession().setAttribute("estados", Factory.initEnderecoDAO().selectEstados());
				return "/view/admin/professor/cadastroProfessorEndereco.jsp";
			}
		default:
			erros = GeraErros.verificaErrosEndereco(req);
			if(!erros.isEmpty()){
				req.setAttribute("erros",erros);
				return "/view/admin/professor/cadastroProfessorEndereco.jsp";
			}
			else{
				Professor professor = Util.getCadastroProfessor(req);
				Endereco endereco = Util.getEnderecoCadastro(req);
				professor.setEndereco(endereco);
		
				if(Factory.initEnderecoDAO().insert(endereco)){
		
					if(Factory.initProfessorDAO().insert(professor))
		
						Factory.initTelefoneDAO().insert(professor.getTelefones());
				}
				return "../../admin/principal/index.jsp";
			}
		}




	}

	public void setSessionProfessor(HttpSession sessao, HttpServletRequest req){
		
		sessao.setAttribute("nome",req.getParameter("nome"));
		sessao.setAttribute("dataCadas", new java.sql.Date(new java.util.Date().getTime()));
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
		
		//Exclusivo Professor
		
		sessao.setAttribute("dataAdmissao",req.getParameter("dataAdmissao"));
	}

	/*private void setSessionPessoa(HttpSession sessao, HttpServletRequest req) {
		sessao.setAttribute("nome",req.getParameter("nome"));
		//sessao.setAttribute("dataCadas",Util.formatDateOut(new Date().toString()));
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
		
	}*/

}
