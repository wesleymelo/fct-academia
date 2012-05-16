package br.ucb.fct.servlet.actions;

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

public class LogoutAction implements Action{

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp){
		req.getSession().invalidate();
		return "/view/login.jsp";
	}
}
