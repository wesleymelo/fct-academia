package br.ucb.fct.util;
import java.text.*; 
import java.util.*; 

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import br.ucb.fct.aluno.Aluno;
import br.ucb.fct.endereco.Endereco;
import br.ucb.fct.enuns.EnumTypeFone;
import br.ucb.fct.enuns.EnumTypePessoa;
import br.ucb.fct.enuns.EnumTypeSexo;
import br.ucb.fct.telefone.Telefone;

public class Util {
	
	public static Date formatDate(String data){
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
        return str.replace(".", "").replace("-", "").replace(" ", "").replace("/", "").replace("(", "").replace(")", "");
	}
		
	public static Date formatDateOut(String data){
		DateFormat formatador = new SimpleDateFormat("yyyy-MM-dd");  
		Date date = null;
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
		Date dataNasc = (Date) req.getSession().getAttribute("dataNasc");
		Date dataCadas = (Date) req.getSession().getAttribute("dataCadas");
		String email = (String) req.getSession().getAttribute("email");
		List<Telefone> telefones = (List<Telefone>) req.getSession().getAttribute("telefones"); 
		Endereco endereco = (Endereco) req.getSession().getAttribute("endereco");
		double altura = (Double) req.getSession().getAttribute("altura");
		double peso = (Double) req.getSession().getAttribute("peso");
		return new Aluno(EnumTypePessoa.ALUNO, dataCadas, nome, cpf, sexo, dataNasc, endereco, telefones, email, true, peso, altura);
		
	}
	
	public static Telefone getTelefoneCadastro(HttpServletRequest req){
		
		String numero = (String) req.getSession().getAttribute("numero");
		String ddd = (String) req.getSession().getAttribute("ddd");
		EnumTypeFone tipo = (EnumTypeFone) req.getSession().getAttribute("tipoTel");
		
		return new Telefone(numero, ddd, tipo);
		
	}
	

}
