package br.ucb.fct.servlet.actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.ucb.fct.secretaria.Secretaria;
import br.ucb.fct.endereco.Endereco;
import br.ucb.fct.enuns.EnumTypeFone;
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
		boolean retorno = true;
		switch (pg) {

		case 1:
			if(req.getParameter("voltar") != null ){
				return "/view/admin/principal/index.jsp";
			}
			if(req.getParameter("enviar") != null){
				
				erros = GeraErros.verificaErrosSecretarias(req);
				if(!erros.isEmpty()){
					req.setAttribute("erros",erros);
					return "/view/admin/secretaria/cadastroSecretaria.jsp";
				}
				else{
					setSessionSecretaria(sessao, req);
					req.setAttribute("estados", Factory.initEnderecoDAO().selectEstados());
					return "/view/admin/secretaria/cadastroSecretariaEndereco.jsp";
				}
			}
		case 2:			
			if(req.getParameter("enviar") != null){
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
							retorno = Factory.initTelefoneDAO().insert(secretaria.getTelefones());
					}
					Util.limpaAtributosRequisicao(req);
					return "/view/admin/secretaria/listaSecretarias.do?status="+retorno;
				}
			}
			
			if(req.getParameter("voltar") != null){
				Util.putAtribuRequisicaoSecretariaSession(req);
				return "/view/admin/secretaria/cadastroSecretaria.jsp";
			}
			break;
		case 3:					
			if(req.getParameter("voltar") != null ){
				return "/view/admin/principal/index.jsp";
			}
			if(req.getParameter("enviar") != null){
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
							Endereco endereco = Factory.initEnderecoDAO().selectById(Integer.parseInt(req.getParameter("codigo").toString()));
							Util.putAtribuRequisicaoPessoaEndereco(req,endereco);
							req.setAttribute("idPessoa",req.getParameter("idPessoa"));
							req.setAttribute("codigo",endereco.getIdEndereco());
							return "/view/admin/secretaria/alteraCadastroSecretariaEndereco.jsp";
						}
					}
				}
			}
			break;
		case 4:
			
			if(req.getParameter("voltar") != null ){
				Util.putAtribuRequisicaoSecretariaSession(req);
				req.setAttribute("codigo",req.getParameter("codigo"));
				req.setAttribute("idPessoa",req.getParameter("idPessoa"));
				return "/view/admin/secretaria/alteraCadastroSecretaria.jsp";
			}
			if(req.getParameter("enviar") != null){
				erros = GeraErros.verificaErrosEndereco(req);
				if(!erros.isEmpty()){
					req.setAttribute("erros", erros);
					req.setAttribute("codigo",req.getParameter("codigo"));
					return "/view/admin/secretaria/alteraCadastroSecretariaEndereco.jsp";
				}
				else{
					Endereco endereco = Util.getEnderecoCadastro(req);
					retorno = Factory.initEnderecoDAO().update(endereco,Integer.parseInt(req.getParameter("codigo")));
					Util.limpaAtributosRequisicao(req);
					return "/view/admin/secretaria/listaSecretarias.do?status="+retorno;
				}
			}
		}
		return null;

	}

	public void setSessionSecretaria(HttpSession sessao, HttpServletRequest req){

		sessao.setAttribute("nome",req.getParameter("nome"));
		sessao.setAttribute("dataCadas", Util.getDateView(new java.sql.Date(new java.util.Date().getTime()).toString(),"/"));
		sessao.setAttribute("dataNasc",req.getParameter("dataNasc"));
		sessao.setAttribute("sexo", req.getParameter("sexo"));
		sessao.setAttribute("cpf",Util.unFormat(req.getParameter("cpf")));
		sessao.setAttribute("email",req.getParameter("email"));

		// telefone

		List<Telefone> tel = new ArrayList<Telefone>();		
		String [] fone;
		
		if(req.getParameter("celular") != null && !Util.unFormat(req.getParameter("celular")).trim().isEmpty()){
			fone = Util.formateTelOut(Util.unFormat(req.getParameter("celular")));		
			tel.add(new Telefone(fone[0], fone[1], EnumTypeFone.CELULAR));
		}
		else
			tel.add(new Telefone(null, null, EnumTypeFone.CELULAR));
		fone = Util.formateTelOut(Util.unFormat(req.getParameter("residencial")));
		tel.add(new Telefone(fone[0], fone[1], EnumTypeFone.RESIDENCIAL));
		if(req.getParameter("comercial") != null && !Util.unFormat(req.getParameter("comercial")).trim().isEmpty()){
			fone = Util.formateTelOut(Util.unFormat(req.getParameter("comercial")));
			tel.add(new Telefone(fone[0], fone[1], EnumTypeFone.COMERCIAL));
		}
		else{
			tel.add(new Telefone(null, null, EnumTypeFone.COMERCIAL));
		}

		// fim telefone		
		
		sessao.setAttribute("telefones",tel);
		
		sessao.setAttribute("salario",req.getParameter("salario"));
		sessao.setAttribute("horarioInicial",req.getParameter("horarioInicial"));
		sessao.setAttribute("horarioFinal",req.getParameter("horarioFinal"));
		sessao.setAttribute("dataAdmissao",req.getParameter("dataAdmissao"));
	}

}
