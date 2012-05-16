package br.ucb.fct.servlet.actions;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.ucb.fct.acesso.Acesso;
import br.ucb.fct.acesso.AcessoBO;
import br.ucb.fct.enuns.EnumAcesso;
import br.ucb.fct.enuns.EnumTypeErro;
import br.ucb.fct.exceptions.DAOException;
import br.ucb.fct.util.GeraErros;
import br.ucb.fct.util.Util;
import br.ucb.fct.util.Validator;

public class AutenticaLoginAction implements Action{

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp){
		
		String url = "";
		Map<String, String> erros = GeraErros.verificaLogar(req);
		
		if(erros.isEmpty()){
			try{
				String cpf = Util.unFormat(req.getParameter(EnumAcesso.LOGIN.getChave()));
				String senha = req.getParameter(EnumAcesso.SENHA.getChave());
				Acesso acesso = AcessoBO.findByUsuarioAndSenha(cpf, senha);
				if(acesso != null){
					HttpSession session = req.getSession(true);
					session.setAttribute(EnumAcesso.ACESSO.getChave(), acesso);
					url = "/view/admin/principal/index.jsp";
				}
				else{
					erros.put("errocpf", "logar_erro");
					req.setAttribute("erros", erros);
					url = "/view/login.jsp";
				}
			}catch (DAOException e) {
				req.setAttribute(EnumTypeErro.ERROLOGAR.getChave(), EnumTypeErro.ERROLOGAR.getDescricao());
				url = "/view/login.jsp";
			}
		}
		else{
			req.setAttribute("erros", erros);
			url = "/view/login.jsp";
		}
		
		return url;
	}


}
