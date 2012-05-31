package br.ucb.fct.servlet.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CadastroModalidadeNoPacoteAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		
		if(Integer.parseInt(req.getParameter("pg")) == 1){
			req.setAttribute("valueModalidade",req.getParameterValues("check"));
			for (String v : req.getParameterValues("check")) {
				System.out.println(v);
				
			}
			return "";
		}
		return null;
	}

}
