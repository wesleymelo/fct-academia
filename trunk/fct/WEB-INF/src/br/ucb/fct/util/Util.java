package br.ucb.fct.util;

import java.text.*; 
import java.util.*; 
import javax.servlet.http.HttpServletRequest;
import javax.swing.JOptionPane;

import br.ucb.fct.aluno.Aluno;
import br.ucb.fct.endereco.Endereco;
import br.ucb.fct.enuns.EnumTypeFone;
import br.ucb.fct.enuns.EnumTypePessoa;
import br.ucb.fct.enuns.EnumTypeSexo;
import br.ucb.fct.professores.Professor;
import br.ucb.fct.secretaria.Secretaria;

import br.ucb.fct.telefone.Telefone;

public class Util {

	public static Date formatDateOut(String data){
		
		String dataTmp[] = data.split("-");
		data = dataTmp[2]+"/"+dataTmp[1]+"/"+dataTmp[0];
		
		System.out.println("Data 2: "+data);
		
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");  
		Date date = null;
		try {
			date = formatador.parse(data);
		} catch (ParseException e) {
			e.printStackTrace();
		}  
		return date;
	}
	
	public static Object formatDateView(String data){
		
		String dataTmp[] = data.split("-");
		return  dataTmp[2]+dataTmp[1]+dataTmp[0];
	
	}
	

	public static String unFormat(String str)  {
		if(str != null)
			return str.replace(".", "").replace("-", "").replace(" ", "").replace("/", "").replace("(", "").replace(")", "");
		return str;
	}

	public static Date formatDateIn(String data){
		
		String dataTmp[] = data.split("/");
		data = dataTmp[2]+"-"+dataTmp[1]+"-"+dataTmp[0];
		
		SimpleDateFormat formatador = new SimpleDateFormat("yyyy-MM-dd");  
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
		Date dataNasc = formatDateIn((String)req.getSession().getAttribute("dataNasc"));
		Date dataCadas = (Date) req.getSession().getAttribute("dataCadas");
		String email = (String) req.getSession().getAttribute("email");
		List<Telefone> telefones = (List<Telefone>) req.getSession().getAttribute("telefones"); 
		double altura = Double.parseDouble((String)req.getSession().getAttribute("altura"));
		double peso = Double.parseDouble((String)req.getSession().getAttribute("peso"));
		Aluno aluno = new Aluno(EnumTypePessoa.ALUNO, dataCadas, nome, cpf, sexo, dataNasc, null, telefones, email, true, peso, altura);
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
		String cep = Util.unFormat(req.getParameter("cep"));
		int numero = Integer.parseInt(req.getParameter("numero"));
		return new Endereco(enderecoResidencial, cidade, bairro, complemento, uf, cep, numero);
	}

	public static Map<String,String> separaTelefones(List<Telefone> telefones) {
		
		Map<String, String> tels = new HashMap<String, String>();
		
		for (Telefone telefone : telefones) {
			
			if(telefone.getTipo().getNumber() == 1){
				tels.put("celular",telefone.getDdd()+telefone.getNumero());
			}
			
			if(telefone.getTipo().getNumber() == 2){
				tels.put("residencial",telefone.getDdd()+telefone.getNumero());
			}
			
			if(telefone.getTipo().getNumber() == 3){
				tels.put("comercial",telefone.getDdd()+telefone.getNumero());
			}
		}
		
		return tels;
		
		
	}
	
	public static Secretaria getCadastroSecretaria(HttpServletRequest req) {
		String nome = (String) req.getSession().getAttribute("nome");
		String cpf = (String) req.getSession().getAttribute("cpf");
		EnumTypeSexo sexo = (EnumTypeSexo) req.getSession().getAttribute("sexo");
		Date dataNasc = formatDateIn((String)req.getSession().getAttribute("dataNasc"));
		Date dataCadas = (Date) req.getSession().getAttribute("dataCadas");
		String email = (String) req.getSession().getAttribute("email");
		List<Telefone> telefones = (List<Telefone>) req.getSession().getAttribute("telefones"); 
		Endereco endereco = getEnderecoCadastro(req);
		Double salario = (Double) req.getSession().getAttribute("salario");
		String horarioInicial = (String) req.getSession().getAttribute("horarioInicial");
		String horarioFinal = (String) req.getSession().getAttribute("horarioFinal");
		Date dataAdmissao = (Date) req.getSession().getAttribute("dataAdmissao");
		Secretaria secretaria = new Secretaria(EnumTypePessoa.SECRETARIA, dataCadas, nome, cpf, sexo, dataNasc, endereco, telefones, email, true, dataAdmissao, horarioInicial, horarioFinal) ;
		System.out.println(secretaria);
		return secretaria;
	}

	public static Professor getCadastroProfessor(HttpServletRequest req) {
		String nome = (String) req.getSession().getAttribute("nome");
		String cpf = (String) req.getSession().getAttribute("cpf");
		EnumTypeSexo sexo = (EnumTypeSexo) req.getSession().getAttribute("sexo");
		Date dataNasc = formatDateIn((String)req.getSession().getAttribute("dataNasc"));
		Date dataCadas = (Date) req.getSession().getAttribute("dataCadas");
		String email = (String) req.getSession().getAttribute("email");
		List<Telefone> telefones = (List<Telefone>) req.getSession().getAttribute("telefones"); 
		Endereco endereco = getEnderecoCadastro(req);
		JOptionPane.showInputDialog("133");
		Date dataAdmissao = formatDateIn((String) req.getSession().getAttribute("dataAdmissao"));
		Professor professor = new Professor(EnumTypePessoa.PROFESSOR, dataCadas, nome, cpf, sexo, dataNasc, endereco, telefones, email, true, dataAdmissao); 
		System.out.println(professor);
		return professor;
	}
	
	

}
