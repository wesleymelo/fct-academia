package br.ucb.fct.util;

import java.text.*; 
import java.util.*; 
import javax.servlet.http.HttpServletRequest;
import br.ucb.fct.aluno.Aluno;
import br.ucb.fct.endereco.Endereco;
import br.ucb.fct.enuns.EnumTypeFone;
import br.ucb.fct.enuns.EnumTypePessoa;
import br.ucb.fct.enuns.EnumTypeSexo;
import br.ucb.fct.telefone.Telefone;

public class Util {

	public static Date formatDateOut(String data){
		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");  
		Date date = null;
		try {
			date = formatador.parse(data);
		} catch (ParseException e) {
			e.printStackTrace();
		}  
		return date;
	}

	public static String unFormat(String str)  {
		if(str != null)
			return str.replace(".", "").replace("-", "").replace(" ", "").replace("/", "").replace("(", "").replace(")", "");
		return str;
	}

	public static Date formatDateIn(String data){
		SimpleDateFormat formatador = new SimpleDateFormat("yyyy-MM-dd");  
		System.out.println(data);
		Date date = new Date();
		try {
			date = formatador.parse(data);
		} catch (ParseException e) {
			e.printStackTrace();
		}  
		return date;
	}

	public static String[] formateTelOut(String tel){
		String ddd = tel.substring(0,2);
		String numero =  tel.substring(2);
		String [] fone = {ddd,numero};
		return  fone; 
	}

	public static Aluno getCadastroAluno(HttpServletRequest req){		

		String nome = (String) req.getSession().getAttribute("nome");
		String cpf = (String) req.getSession().getAttribute("cpf");
		EnumTypeSexo sexo = (EnumTypeSexo) req.getSession().getAttribute("sexo");
		Date dataNasc = formatDateIn((String)req.getSession().getAttribute("dataNasc"));
		Date dataCadas = (Date) req.getSession().getAttribute("dataCadas");
		String email = (String) req.getSession().getAttribute("email");
		List<Telefone> telefones = (List<Telefone>) req.getSession().getAttribute("telefones"); 
		Endereco endereco = getEnderecoCadastro(req);
		double altura = Double.parseDouble((String)req.getSession().getAttribute("altura"));
		double peso = Double.parseDouble((String)req.getSession().getAttribute("peso"));
		Aluno aluno = new Aluno(EnumTypePessoa.ALUNO, dataCadas, nome, cpf, sexo, dataNasc, endereco, telefones, email, true, peso, altura);
		System.out.println(aluno);
		return aluno;

	}

	public static Telefone getTelefoneCadastro(HttpServletRequest req){

		String numero = (String) req.getSession().getAttribute("numero");
		String ddd = (String) req.getSession().getAttribute("ddd");
		EnumTypeFone tipo = (EnumTypeFone) req.getSession().getAttribute("tipoTel");
		return new Telefone(numero, ddd, tipo);

	}

	public static Endereco getEnderecoCadastro(HttpServletRequest req){

		String enderecoResidencial = req.getParameter("endereco");
		String cidade = req.getParameter("cidade");
		String bairro = req.getParameter("bairro");
		String complemento = (req.getParameter("complemento") == null ? "" : req.getParameter("complemento"));
		String uf = req.getParameter("uf");
		String cep = req.getParameter("cep");
		int numero = Integer.parseInt(req.getParameter("numero"));
		return new Endereco(enderecoResidencial, cidade, bairro, complemento, uf, cep, numero);
	}


}
