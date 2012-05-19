package br.ucb.fct.util;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

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
		
		if(!erros.isEmpty()){
			Util.putAtribuRequisicaoAluno(req);
		}	

		return erros;

	}

	public static Map<String, String> verificaErrosModalidades(HttpServletRequest req) {

		Map<String, String> erros = new HashMap<String, String>();

		if(!Validator.isStringValid(req.getParameter("desc"), 255))
			erros.put("errodesc","desc_invalida");
		return erros;

	}

	public static Map<String, String> verificaErrosEndereco(HttpServletRequest req) {

		Map<String, String> erros = new HashMap<String, String>();

		if(!Validator.isStringValid(req.getParameter("endereco"), 255))
			erros.put("erroendereco","endereco_invalido");
		if(!Validator.isStringValid(req.getParameter("cidade"),100))
			erros.put("errocidade","cidade_invalida");
		if(!Validator.isStringValid(req.getParameter("bairro"), 100))
			erros.put("errobairro", "bairro_invalido");
		if(!Validator.verificaTamanho((Util.unFormat(req.getParameter("cep"))),8))
			erros.put("errocep", "cep_invalido");
		if(!Validator.verificaTamanho(req.getParameter("numero"),8))
			erros.put("erronumero", "numero_invalido");
		
		if(!erros.isEmpty())
			Util.putAtribuRequisicaoPessoaEndereco(req);
		return erros;
	}

	public static Map<String,String> verificaLogar(HttpServletRequest req) {
		String senha = req.getParameter("senha");
		String cpf = Util.unFormat(req.getParameter("cpf"));
		Map<String, String> erros = new HashMap<String, String>();

		if(!Validator.isCPFValid(cpf))
			erros.put("errocpf","logar_erro");
		if(!Validator.isStringValid(senha,100))
			erros.put("errosenha", "logar_erro");
		
		return erros;
	}

	public static Map<String, String> verificaErrosSecretarias(
			HttpServletRequest req) {
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
		if(!Validator.verificaDouble(req.getParameter("salario"),1))
			erros.put("errosalario", "salario_invalida");
		if(!Validator.isStringValid(Util.unFormat(req.getParameter("dataAdmissao")),8))
			erros.put("errodataAdmissao", "dataAdmissao_invalido");
		if(!Validator.isStringValid(Util.unFormat(req.getParameter("horarioFinal")),5))
			erros.put("errohorarioFinal", "horarioFinal_invalido");		
		if(!Validator.isStringValid(Util.unFormat(req.getParameter("horarioInicial")),5))
			erros.put("errohorarioInicial", "horarioInicial_invalido");	
		return erros;
	}

	public static Map<String, String> verificaErrosProfessors(
			HttpServletRequest req) {
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

		if(!Validator.isStringValid(Util.unFormat(req.getParameter("dataAdmissao")),8))
			erros.put("errodataAdmissao", "dataAdmissao_invalido");

		return erros;
	}
	 
	public static Map<String, String> verificaExisteAluno(HttpServletRequest req) {
		
		Map<String, String> erros = new HashMap<String, String>();
		
		if(Validator.isExisteAluno(Factory.initAlunoDAO().selectById(Integer.parseInt(req.getParameter("id")))))
			erros.put("erroaluno", "aluno_nao_existe");
		
		return erros;
	}

	public static Map<String, String> verificaErrosGastos(HttpServletRequest req) {
		
		
		return null;
	}

}
