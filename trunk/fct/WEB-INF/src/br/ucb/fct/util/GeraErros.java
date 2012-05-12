package br.ucb.fct.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import br.ucb.fct.enuns.EnumTypeFone;
import br.ucb.fct.telefone.Telefone;

public class GeraErros {
	
	public static Map<String, String> verificaErrosAlunos(HttpServletRequest req) {
		
		if()
			
			
			
		sessao.setAttribute("nome",req.getParameter("nome"));
		sessao.setAttribute("dataCadas",Util.formatDateOut(new Date().toString()));
		sessao.setAttribute("dataNasc",Util.unFormat(req.getParameter("dataNasc")));
		sessao.setAttribute("sexo",req.getParameter("sexo"));
		sessao.setAttribute("cpf",req.getParameter("cpf"));
		sessao.setAttribute("email",req.getParameter("email"));
		List<Telefone> tel = new ArrayList<Telefone>();		
		
		if(Validator.verificaTel(Util.unFormat(req.getParameter("celular")))){
			String [] fone = Util.formateTelOut(req.getParameter("celular"));
			tel.add(new Telefone(fone[0], fone[1], EnumTypeFone.CELULAR));
		}
		
		if(Validator.verificaTel(Util.unFormat(req.getParameter("residencial")))){
			String [] fone = Util.formateTelOut(req.getParameter("residencial"));
			tel.add(new Telefone(fone[0], fone[1], EnumTypeFone.RESIDENCIAL));
		}
		
		if(Validator.verificaTel(Util.unFormat(req.getParameter("comercial")))){
			String [] fone = Util.formateTelOut(req.getParameter("comercial"));
			tel.add(new Telefone(fone[0], fone[1], EnumTypeFone.COMERCIAL));
		}
		
		sessao.setAttribute("telefones",tel);
		sessao.setAttribute("altura",req.getParameter("altura"));
		sessao.setAttribute("peso",req.getParameter("peso"));
		
		
		return null;
	}
	

}
