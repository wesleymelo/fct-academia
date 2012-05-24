package br.ucb.fct.util;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import br.ucb.fct.turma.Turma;

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
	
	
	public static Map<String, String> verificaErrosTurmas(HttpServletRequest req) {

		Map<String, String> erros = new HashMap<String, String>();

		if(!Validator.isStringValid(req.getParameter("nome"), 50))
			erros.put("erronome","nome_invalida");
		if(!Validator.isStringValid(req.getParameter("professor"), 50))
			erros.put("erroprofessor","professor_invalido");
		if(!Validator.verificaInt(req.getParameter("modalidade"), 1))
			erros.put("erromodalidade","modalidade_invalida");
		if(!Validator.verificaInt(req.getParameter("capacidade"), 1))
			erros.put("errocapacidade","capacidade_invalida");
		
		if(!Validator.isStringValid(req.getParameter("horarioInicial"), 5))
			erros.put("erroHorarioInicial","horarioInicial_invalido");
		if(!Validator.isStringValid(req.getParameter("horarioFinal"), 5))
			erros.put("erroHorarioInicial","horarioFinal_invalido");

		if(!erros.isEmpty())
			Util.putAtribuRequisicaoTurma(req);
		
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
		if(!Validator.isIntValid(req.getParameter("numero")))
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
		if(!(erros.containsKey("errodataNasc")||erros.containsKey("errodataAdmissao")))
		{
		
			if(!(Validator.verificaPeriodoData(req.getParameter("dataNasc").toString(),req.getParameter("dataAdmissao").toString() )<0))
				erros.put("errodataAdmIguaNasc", "dataAdmissaoIgualDataNasc_invalido");
		}
		
		
		
		if(!erros.isEmpty())
			Util.putAtribuRequisicaoSecretaria(req);
		
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
		if(!(erros.containsKey("errodataNasc")||erros.containsKey("errodataAdmissao")))
			{
			
				if(!(Validator.verificaPeriodoData(req.getParameter("dataNasc").toString(),req.getParameter("dataAdmissao").toString() )<0))
					erros.put("errodataAdmIguaNasc", "dataAdmissaoIgualDataNasc_invalido");
			}
		
		if(!erros.isEmpty()){
			Util.putAtribuRequisicaoProfessor(req);
		}	

		return erros;
	}
	 
	public static Map<String, String> verificaExisteAluno(HttpServletRequest req) {
		
		Map<String, String> erros = new HashMap<String, String>();
		if(Validator.isExisteAluno(Factory.initAlunoDAO().selectById(Integer.parseInt(req.getParameter("id")))))
			erros.put("erroaluno", "aluno_nao_existe");
		
		return erros;
	}

	public static Map<String, String> verificaErrosGastos(HttpServletRequest req) {
		
		Map<String, String> erros = new HashMap<String, String>();
		
		if(!Validator.verificaDouble(req.getParameter("valor"), 0))
			erros.put("errovalor","valor_invalido");
		if(!Validator.verificaTamanho(Util.unFormat(req.getParameter("data")), 8))
			erros.put("errodata", "data_invalido");
		if(!erros.isEmpty())
			Util.putAtribuRequisicaoGasto(req);
		return erros;
	}

	public static Map<String, String> verificaErrosGraduacao(HttpServletRequest req) {
		
		Map<String, String> erros = new HashMap<String, String>();
		if(!Validator.isStringValid(req.getParameter("descricao"), 100))
			erros.put("errodescricao","decricao_invalido");
		if(!erros.isEmpty())
			Util.putAtribuRequisicaoGraducao(req);
		return erros;
	}

	public static Map<String, String> verificaErrosPacote(HttpServletRequest req) {
		Map<String, String> erros = new HashMap<String, String>();
		if(!Validator.isStringValid(req.getParameter("descricao"), 100))
			erros.put("errodescricao","decricao_invalido");
		if(!Validator.verificaDouble(req.getParameter("preco"),1))
			erros.put("erropreco", "preco_invalido");
		if(!erros.isEmpty())
			Util.putAtribuRequisicaoPacote(req);
		return erros;
	}

	public static Map<String, String> verificaErrosPagamento(HttpServletRequest req) {
		
		Map<String, String> erros = new HashMap<String, String>();
		if(!Validator.verificaTamanho(Util.unFormat(req.getParameter("dataPagamento")), 8))
			erros.put("errodatapagamento","datapagamento_invalido");
		if(!Validator.verificaDouble(req.getParameter("valorPago"),1))
			erros.put("errovalorpago", "valorpago_invalido");
		if(!erros.isEmpty()){
			Util.putAtribuRequisicaoPagamento(req);
		}
		return erros;
		
	}

	public static Map<String, String> verificaErrosAlunosNaTurma(HttpServletRequest req) {
		Map<String, String> erros = new HashMap<String, String>();
		Turma turma = (Turma)req.getAttribute("turma");
		if(turma.getVagas() == 0)
			erros.put("erroturmacheia","turmacheia_invalida");
		
		if(!Validator.isStringValid(req.getParameter("aluno"), 50)){
			erros.put("erroaluno","aluno_invalido");
		}
		else{
			if(Factory.initTurmaDAO().hasAlunoInTurma(Integer.parseInt(req.getParameter("idTurma")), Integer.parseInt(req.getParameter("idAluno"))))
				erros.put("erroaluno_duplicado","aluno_duplicado");
		}
		return erros;
	}

	public static Map<String, String> verificaErrosEnvelope(HttpServletRequest req) {
		return null;
	}
	
	public static Map<String, String> verificaErrosDespesas(HttpServletRequest req) {
		Map<String, String> erros = new HashMap<String, String>();
		if(!Validator.isStringValid(req.getParameter("descricao"), 100))
			erros.put("errodescricao","decricao_invalido");
		if(!Validator.isIntValid(req.getParameter("qtde")))
			erros.put("erroqtde", "qtde_invalido");
		if(!erros.isEmpty())
			Util.putAtribuRequisicaoDespesa(req);
		
		return erros;
		
		
	}

}
