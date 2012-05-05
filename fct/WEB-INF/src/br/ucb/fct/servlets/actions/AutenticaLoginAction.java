package br.ucb.fct.servlets.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.ucb.fct.acesso.Acesso;
import br.ucb.fct.acesso.AcessoBO;
import br.ucb.fct.enuns.EnumAcesso;
import br.ucb.fct.enuns.EnumTypeErro;
import br.ucb.fct.exceptions.DAOException;
import br.ucb.fct.util.Encrypter;
import br.ucb.fct.util.Validator;

public class AutenticaLoginAction implements Action{

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp){
		String url = "";
		if(isValida(req)){
			try{
				Acesso acesso = AcessoBO.findByUsuarioAndSenha(req.getParameter(EnumAcesso.USUARIO.toString()), Encrypter.encripta(EnumAcesso.SENHA.toString()));
				if(acesso != null){
					HttpSession session = req.getSession(true);
					session.setAttribute(EnumAcesso.ACESSO.toString(), acesso);
					url = "index.do";	
				}
				else{
					req.setAttribute(EnumTypeErro.ERROLOGAR.getChave(), EnumTypeErro.ERROLOGAR.getDescricao());
					url = "login.jsp";
				}
			}catch (DAOException e) {
				req.setAttribute(EnumTypeErro.ERROLOGAR.getChave(), EnumTypeErro.ERROLOGAR.getDescricao());
				url = "login.jsp";
			}
		}
		return url;
	}

	private boolean isValida(HttpServletRequest req) {
		Acesso acesso = (Acesso) req.getAttribute(EnumAcesso.ACESSO.toString());
		if(!Validator.isStringValid(acesso.getSenha()) || !Validator.isStringValid(acesso.getUsuario())){
			req.setAttribute(EnumTypeErro.ERROLOGAR.getChave(), EnumTypeErro.ERROLOGAR.getDescricao());
			return false;
		}
		return true;
	}

}
