package br.ucb.fct.servlet.actions;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.ucb.fct.util.GeraErros;

public class CadastroGastoAction implements Action{

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		Map<String, String> erros;
		HttpSession sessao= req.getSession();
		
		erros=GeraErros.verificaErrosGastos(req);
		return null;
	}
	
	public void setSessionGasto(HttpServletRequest req, HttpServletResponse resp){
		
	}
	

}
