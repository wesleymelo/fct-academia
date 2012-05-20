package br.ucb.fct.servlet.actions;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.pacote.Pacote;
import br.ucb.fct.util.Factory;
import br.ucb.fct.util.GeraErros;
import br.ucb.fct.util.Util;

public class CadastraPacoteAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {


		Map<String,String> erros = GeraErros.verificaErrosPacote(req);
		boolean retorno = false;
		
		
		if(Integer.parseInt(req.getParameter("pg")) == 1){
			if(!erros.isEmpty()){
				req.setAttribute("erros", erros);
				return "/view/admin/pacote/cadastroPacote.jsp";
			}else{
				Pacote pacote = Util.getCadastroPacote(req);
				retorno = Factory.initPacoteDAO().insert(pacote);
				return "/view/admin/pacote/listaPacotes.do?retorno"+retorno;	
			}
		}else{
			if(!erros.isEmpty()){
				req.setAttribute("erros", erros);
				req.setAttribute("codigo", req.getParameter("codigo"));
				return "/view/admin/pacote/cadastroPacote.jsp";
			}else{
				Pacote pacote = Util.getCadastroPacote(req);
				retorno = Factory.initPacoteDAO().update(pacote,Integer.parseInt(req.getParameter("codigo")));
				return "/view/admin/pacote/listaPacotes.do?retorno"+retorno;	
			}
		}
		
	}

}
