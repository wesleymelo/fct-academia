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

		//System.out.println(new Date().toString());


		//Declarações

		int pg = Integer.parseInt(req.getParameter("pg"));
		Map<String, String> erros;
		HttpSession sessao = req.getSession();

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
		default:
			erros = GeraErros.verificaErrosSecretariaEndereco(req);
			if(!erros.isEmpty()){
				req.setAttribute("erros",erros);
				return "/view/admin/secretaria/cadastroSecretariaEndereco.jsp";
			}
			else{

				Secretaria secretaria = Util.getCadastroSecretaria(req);
				Endereco endereco = Util.getEnderecoCadastro(req);

				if(Factory.initEnderecoDAO().insert(endereco)){
					if(Factory.initSecretariaDAO().insert(secretaria))
						Factory.initTelefoneDAO().insert(secretaria.getTelefones());
				}
				return "../../admin/principal/index.jsp";
			}
		}




	}

	public void setSessionSecretaria(HttpSession sessao, HttpServletRequest req){
		//setSessionPessoa(sessao,req);
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
		
		//Exclusivo Secretaria
		
		sessao.setAttribute("salario",req.getParameter("salario"));
		sessao.setAttribute("horarioInicial",req.getParameter("horarioInicial"));
		sessao.setAttribute("horarioFinal",req.getParameter("horarioFinal"));
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
