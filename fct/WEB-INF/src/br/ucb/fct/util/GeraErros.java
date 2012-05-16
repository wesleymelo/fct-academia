package br.ucb.fct.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import br.ucb.fct.enuns.EnumTypeFone;
import br.ucb.fct.telefone.Telefone;

public class GeraErros {
	
	public static Map<String, String> verificaErrosAlunos(HttpServletRequest req) {
		
		Map<String, String> erros = new HashMap<String, String>();
		
		if(!Validator.isStringValid(req.getParameter("nome"), 255))
			erros.put("erronome","nome_invalido");
		if(!Validator.isStringValid(Util.unFormat(req.getParameter("dataNasc")),8))
			erros.put("errodataNasc", "dataNasc_invalido");
		if(!Validator.isCPFValid(Util.unFormat(req.getParameter("cpf"))))
			erros.put("errocpf","cpf_invalido");
		if(!Validator.isEmailValid(req.getParameter("email"),100))
			erros.put("erroemail","email_invalido");
		if(!Validator.verificaTamanho(Util.unFormat(req.getParameter("celular")),10))
			erros.put("errocelular", "telefone_invalido");
		if(!Validator.verificaTamanho(Util.unFormat(req.getParameter("residencial")),10))
			erros.put("erroresidencial", "telefone_invalido");
		if(!Validator.verificaTamanho(Util.unFormat(req.getParameter("comercial")),10))
			erros.put("errocomercial", "telefone_invalido");
		if(!Validator.verificaDouble(req.getParameter("altura"),0.40,3))
			erros.put("erroaltura", "altura_invalida");
		if(!Validator.verificaDouble(req.getParameter("peso"),0.40,600))
			erros.put("erropeso", "peso_invalido");	
		
		return erros;
	
	}
	
public static Map<String, String> verificaErrosModalidades(HttpServletRequest req) {
		
		Map<String, String> erros = new HashMap<String, String>();
		
		if(!Validator.isStringValid(req.getParameter("desc"), 255))
			erros.put("errodesc","desc_invalida");
		return erros;
	
	}

	public static Map<String, String> verificaErrosAlunoEndereco(HttpServletRequest req) {
		
		Map<String, String> erros = new HashMap<String, String>();
		
		if(!Validator.isStringValid(req.getParameter("endereco"), 255))
			erros.put("erroendereco","endereco_invalido");
		if(!Validator.isStringValid(req.getParameter("cidade"),100))
			erros.put("errocidade","cidade_invalida");
		if(!Validator.isStringValid(req.getParameter("bairro"), 100))
			erros.put("errobairo", "bairro_invalido");
		if(!Validator.verificaInteger((Util.unFormat(req.getParameter("cep"))),0,Integer.MAX_VALUE))
			erros.put("errocep", "cep_invalido");
		if(!Validator.verificaInteger(req.getParameter("numero"),0,Integer.MAX_VALUE))
			erros.put("erronumero", "numero_invalido");
		return erros;
	}
	

}
