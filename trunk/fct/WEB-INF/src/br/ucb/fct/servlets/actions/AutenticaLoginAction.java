package br.ucb.fct.servlets.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.ucb.fct.acesso.Acesso;
import br.ucb.fct.acesso.AcessoBO;
import br.ucb.fct.enuns.EnumAcesso;
import br.ucb.fct.enuns.EnumTypeErro;
import br.ucb.fct.exceptions.DAOException;
import br.ucb.fct.util.Util;
import br.ucb.fct.util.Validator;

public class AutenticaLoginAction implements Action{

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp){
		String url = "";
		if(isValida(req)){
			try{
				String cpf = Util.unFormat(req.getParameter(EnumAcesso.LOGIN.getChave()));
				String senha = req.getParameter(EnumAcesso.SENHA.getChave());
				Acesso acesso = AcessoBO.findByUsuarioAndSenha(cpf, senha);
				System.out.println("Acesso = "+acesso);
				if(acesso != null){
					HttpSession session = req.getSession(true);
					session.setAttribute(EnumAcesso.ACESSO.getChave(), acesso);
					url = "/view/admin/principal/index.jsp";
				}
				else{
					req.setAttribute(EnumTypeErro.ERROLOGAR.getChave(), EnumTypeErro.ERROLOGAR.getDescricao());
					url = "/view/login.jsp";
				}
			}catch (DAOException e) {
				req.setAttribute(EnumTypeErro.ERROLOGAR.getChave(), EnumTypeErro.ERROLOGAR.getDescricao());
				url = "/view/login.jsp";
			}
		}
		System.out.println("url: >>>'"+url+"'<<<");
		return url;
	}

	private boolean isValida(HttpServletRequest req) {
		String senha = req.getParameter("senha");
		String cpf = Util.unFormat(req.getParameter("cpf"));
		
		if(!(Validator.isStringValid(senha)) || !Validator.isCPFValid(cpf)){
			req.setAttribute(EnumTypeErro.ERROLOGAR.getChave(), EnumTypeErro.ERROLOGAR.getDescricao());
			return false;
		}
		return true;
	}

}
