package br.ucb.fct.servlet.actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.ucb.fct.endereco.Endereco;
import br.ucb.fct.enuns.EnumTypeFone;
import br.ucb.fct.enuns.EnumTypeSexo;
import br.ucb.fct.secretaria.Secretaria;
import br.ucb.fct.telefone.Telefone;
import br.ucb.fct.util.Factory;
import br.ucb.fct.util.GeraErros;
import br.ucb.fct.util.Util;

public class CadastroSecretariaAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {

		int pg = Integer.parseInt(req.getParameter("pg"));
		Map<String, String> erros;
		HttpSession sessao = req.getSession();
		
		boolean retorno = false;
		
		switch (pg) {

			case 1:
				erros = GeraErros.verificaErrosSecretarias(req);
				if(!erros.isEmpty()){
					req.setAttribute("erros",erros);
					return "/view/admin/secretaria/cadastroSecretaria.jsp";
				}
				else{
					setSessionSecretaria(sessao, req);
					req.getSession().setAttribute("estados", Factory.initEnderecoDAO().selectEstados());
					return "/view/admin/secretaria/cadastroSecretariaEndereco.jsp";
				}
			case 2:
				erros = GeraErros.verificaErrosEndereco(req);
				if(!erros.isEmpty()){
					req.setAttribute("erros",erros);
					return "/view/admin/secretaria/cadastroSecretariaEndereco.jsp";
				}
				else{
					Secretaria secretaria = Util.getCadastroSecretaria(req);
					Endereco endereco = Util.getEnderecoCadastro(req);
					secretaria.setEndereco(endereco);
					if(Factory.initEnderecoDAO().insert(endereco)){
						if(Factory.initSecretariaDAO().insert(secretaria))
							Factory.initTelefoneDAO().insert(secretaria.getTelefones());
					}
					return "/view/admin/secretaria/listaSecretarias.do?status="+retorno;
				}
			case 3: 
				erros = GeraErros.verificaErrosSecretarias(req);
				if(!erros.isEmpty()){
					req.setAttribute("erros", erros);
					req.setAttribute("codigo",req.getParameter("codigo"));
					return "/view/admin/secretaria/alteraCadastroSecretaria.jsp";
				}
				else{
					setSessionSecretaria(sessao, req);
					Secretaria secretaria = Util.getCadastroSecretaria(req);				
					if(Factory.initSecretariaDAO().update(secretaria, Integer.parseInt(req.getParameter("idPessoa")))){
						if(Factory.initTelefoneDAO().update(secretaria.getTelefones(),Integer.parseInt(req.getParameter("idPessoa")))){
							Endereco endereco = Factory.initEnderecoDAO().selectById(Integer.parseInt(req.getParameter("codigo")));
							Util.putAtribuRequisicaoPessoaEndereco(req,endereco);
							req.setAttribute("codigo",endereco.getIdEndereco());
							return "/view/admin/secretaria/alteraCadastroSecretariaEndereco.jsp";
						}
					}
				}
				break;
				
			case 4: 
				erros = GeraErros.verificaErrosEndereco(req);
				if(!erros.isEmpty()){
					req.setAttribute("erros", erros);
					req.setAttribute("codigo",req.getParameter("codigo"));
					return "/view/admin/secretaria/alteraCadastroSecretariaEndereco.jsp";
				}
				else{
					Endereco endereco = Util.getEnderecoCadastro(req);
					retorno = Factory.initEnderecoDAO().update(endereco,Integer.parseInt(req.getParameter("codigo")));
					return "/view/admin/secretaria/listaSecretarias.do?status="+retorno;
				}
				
		}
		return null;




	}

	public void setSessionSecretaria(HttpSession sessao, HttpServletRequest req){
		sessao.setAttribute("nome",req.getParameter("nome"));
		sessao.setAttribute("dataCadas", new java.sql.Date(new java.util.Date().getTime()));
		sessao.setAttribute("dataNasc",req.getParameter("dataNasc"));

		System.out.println(req.getParameter("dataNasc"));

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
		
		//Exclusivo Secretaria
		
		sessao.setAttribute("salario",req.getParameter("salario"));
		sessao.setAttribute("horarioInicial",req.getParameter("horarioInicial"));
		sessao.setAttribute("horarioFinal",req.getParameter("horarioFinal"));
		sessao.setAttribute("dataAdmissao",req.getParameter("dataAdmissao"));
	}

}
