package br.ucb.fct.util;

import java.sql.Date;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import br.ucb.fct.acesso.Acesso;
import br.ucb.fct.aluno.Aluno;
import br.ucb.fct.despesa.Despesa;
import br.ucb.fct.endereco.Endereco;
import br.ucb.fct.enuns.EnumAcesso;
import br.ucb.fct.enuns.EnumTypeFone;
import br.ucb.fct.enuns.EnumTypePessoa;
import br.ucb.fct.enuns.EnumTypeSexo;
import br.ucb.fct.gasto.Gasto;
import br.ucb.fct.graduacao.Graduacao;
import br.ucb.fct.pacote.Pacote;
import br.ucb.fct.pagamento.Pagamento;
import br.ucb.fct.pessoa.Pessoa;
import br.ucb.fct.professor.Professor;
import br.ucb.fct.secretaria.Secretaria;
import br.ucb.fct.telefone.Telefone;
import br.ucb.fct.turma.Turma;

public class Util {

	public static Date formatDateOut(String data){
		
		String dataTmp[] = data.split("-");
		data = dataTmp[2]+"/"+dataTmp[1]+"/"+dataTmp[0];
		
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");  
		Date date = null;
		try {
			date = (Date) formatador.parse(data);
		} catch (ParseException e) {
			e.printStackTrace();
		}  
		return date;
	}
	
	
	public static String getDateView(String data, String symbol){
		
		String [] d = data.split("-");
		return d[2]	+ symbol +	d[1] + symbol +d[0];
				
	}
	

	public static String unFormat(String str)  {
		if(str != null)
			return str.replace(".", "").replace("-", "").replace(" ", "").replace("/", "").replace("(", "").replace(")", "").replace(":", "");
		return str;
	}

	public static java.sql.Date formatDateIn(String data){
		
		data = data.substring(6, 10) + "-" + data.substring(3, 5) + "-" + data.substring(0, 2);
		
		SimpleDateFormat formatador = new SimpleDateFormat("yyyy-MM-dd");  
		java.sql.Date date = null;
		try {
			date = new java.sql.Date(formatador.parse(data).getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}  
		return date;
	}
	public static Time formatTime(String hora){
		Time hour;
		DateFormat formato = new SimpleDateFormat("HH:mm");  
		try {  
			hour = new Time(formato.parse(hora).getTime());  
		} catch (Exception e) {  
			throw new RuntimeException(e.getMessage());  
		}
		return hour;
	}
	
	public static String formatTimeView(String hora){
		return hora.substring(0,5);
	}
	
	
	public static String[] formateTelOut(String tel){
		String ddd = tel.substring(0,2);
		String numero =  tel.substring(2);
		String [] fone = {ddd,numero};
		return  fone; 
	}

	@SuppressWarnings("unchecked")
	public static Aluno getCadastroAluno(HttpServletRequest req){

		String nome = (String) req.getSession().getAttribute("nome");
		String cpf = (String) req.getSession().getAttribute("cpf");
		EnumTypeSexo sexo = (EnumTypeSexo) req.getSession().getAttribute("sexo");
		java.sql.Date dataNasc = formatDateIn(req.getSession().getAttribute("dataNasc").toString());
		java.sql.Date dataCadas = formatDateIn(req.getSession().getAttribute("dataCadas").toString());
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

	public static Map<String,String> separaTelefones(List<Telefone> telefones, HttpServletRequest req) {
		
		Map<String, String> tels = new HashMap<String, String>();
		
		for (Telefone telefone : telefones) {
			
			if(telefone.getTipo().getNumber() == 1){
				tels.put("celular",telefone.getDdd()+telefone.getNumero());
				req.setAttribute("celular", telefone.getDdd()+telefone.getNumero());
			}
			
			if(telefone.getTipo().getNumber() == 2){
				tels.put("residencial",telefone.getDdd()+telefone.getNumero());
				req.setAttribute("residencial", telefone.getDdd()+telefone.getNumero());
			}
			
			if(telefone.getTipo().getNumber() == 3){
				tels.put("comercial",telefone.getDdd()+telefone.getNumero());
				req.setAttribute("comercial", telefone.getDdd()+telefone.getNumero());
			}
		}
		
		return tels;
		
		
	}
	
	@SuppressWarnings("unchecked")
	public static Secretaria getCadastroSecretaria(HttpServletRequest req) {
		String nome = (String) req.getSession().getAttribute("nome");
		String cpf = (String) req.getSession().getAttribute("cpf");
		EnumTypeSexo sexo = EnumTypeSexo.findByCodigo( req.getSession().getAttribute("sexo").toString().charAt(0));
		Date dataCadas = (Date) req.getSession().getAttribute("dataCadas");
		Date dataNasc = formatDateIn((String)req.getSession().getAttribute("dataNasc"));
		String email = (String) req.getSession().getAttribute("email");
		List<Telefone> telefones = (List<Telefone>) req.getSession().getAttribute("telefones"); 
		Double salario = Double.parseDouble( req.getSession().getAttribute("salario").toString());
		String horarioInicial = (String) req.getSession().getAttribute("horarioInicial");
		String horarioFinal = (String) req.getSession().getAttribute("horarioFinal");
		Date dataAdmissao = formatDateIn((String)req.getSession().getAttribute("dataAdmissao"));
		Secretaria secretaria = new Secretaria(EnumTypePessoa.SECRETARIA, dataCadas, nome, cpf, sexo, dataNasc, null, telefones, email, true, dataAdmissao, horarioInicial, horarioFinal,salario);
		return secretaria;
	}

	@SuppressWarnings("unchecked")
	public static Professor getCadastroProfessor(HttpServletRequest req) {
		String nome = (String) req.getSession().getAttribute("nome");
		String cpf = (String) req.getSession().getAttribute("cpf");
		EnumTypeSexo sexo = (EnumTypeSexo) req.getSession().getAttribute("sexo");
		java.sql.Date dataNasc = formatDateIn(req.getSession().getAttribute("dataNasc").toString());
		java.sql.Date dataCadas = formatDateIn(req.getSession().getAttribute("dataCadas").toString());
		String email = (String) req.getSession().getAttribute("email");
		List<Telefone> telefones = (List<Telefone>) req.getSession().getAttribute("telefones");
		java.sql.Date dataAdmissao = formatDateIn(req.getSession().getAttribute("dataAdmissao").toString());
		System.out.println(formatDateIn(req.getSession().getAttribute("dataAdmissao").toString()));
		String dataAdmissaoString = (String) req.getSession().getAttribute("dataAdmissao");
		Professor professor = new Professor(EnumTypePessoa.PROFESSOR, dataCadas, nome, cpf, sexo, dataNasc, null, telefones, email, true, dataAdmissao,dataAdmissaoString); 
		return professor;
	}
	
	
	public static void putAtribuRequisicaoProfessor(HttpServletRequest req){
		
		putAtribuRequisicaoPessoa(req);
		req.setAttribute("dataAdmissao", req.getParameter("dataAdmissao"));
	}
	
	public static void putAtribuRequisicaoProfessor(HttpServletRequest req, Professor professor){

		putAtribuRequisicaoPessoa(req,professor);
		req.setAttribute("dataAdmissao", Util.getDateView(professor.getDataAdmissao().toString(),"/"));
	}
	
	public static void putAtribuRequisicaoSecretaria(HttpServletRequest req){
		
		putAtribuRequisicaoPessoa(req);
		req.setAttribute("salario", req.getParameter("salario"));
		req.setAttribute("dataAdmissao", req.getParameter("dataAdmissao"));
		req.setAttribute("horarioFinal", req.getParameter("horarioFinal"));
		req.setAttribute("horarioInicial", req.getParameter("horarioInicial"));
	}
	
	public static void putAtribuRequisicaoSecretaria(HttpServletRequest req, Secretaria secretaria){
		
		putAtribuRequisicaoPessoa(req,secretaria);
		req.setAttribute("salario", secretaria.getSalario());
		req.setAttribute("dataAdmissao", secretaria.getDataAdmissaoString());
		req.setAttribute("horarioFinal", secretaria.getHoraFinal());
		req.setAttribute("horarioInicial", secretaria.getHoraInicial());
		
	}
	
	public static void putAtribuRequisicaoAluno(HttpServletRequest req){
		
		putAtribuRequisicaoPessoa(req);
		req.setAttribute("altura", req.getParameter("altura"));
		req.setAttribute("peso", req.getParameter("peso"));
	}
	
	public static void putAtribuRequisicaoAluno(HttpServletRequest req, Aluno aluno){
		
		putAtribuRequisicaoPessoa(req,aluno);
		req.setAttribute("altura", aluno.getAltura());
		req.setAttribute("peso", aluno.getPeso());
	}
	
	
	private static void putAtribuRequisicaoPessoa(HttpServletRequest req){
		req.setAttribute("codigo", req.getParameter("codigo"));
		req.setAttribute("nome", req.getParameter("nome"));
		req.setAttribute("dataNasc", req.getParameter("dataNasc"));
		req.setAttribute("sexo", req.getParameter("sexo"));
		req.setAttribute("cpf", req.getParameter("cpf"));
		req.setAttribute("email", req.getParameter("email"));
		req.setAttribute("celular", req.getParameter("celular"));
		req.setAttribute("residencial", req.getParameter("residencial"));
		req.setAttribute("comercial", req.getParameter("comercial"));
		
	}
	
	private static void putAtribuRequisicaoPessoa(HttpServletRequest req, Pessoa pessoa){
		req.setAttribute("nome", pessoa.getNome());
		req.setAttribute("dataNasc", pessoa.getDateNascimentoString());
		req.setAttribute("sexo", pessoa.getSexo().getCodigo());
		req.setAttribute("cpf", pessoa.getCpf());
		req.setAttribute("email", pessoa.getEmail());
		Map<String,String> tels = separaTelefones(pessoa.getTelefones(),req);
		req.setAttribute("tel",tels);
	}
	
	public static void putAtribuRequisicaoPessoaEndereco(HttpServletRequest req){
		req.setAttribute("cidade", req.getParameter("cidade"));
		req.setAttribute("bairro", req.getParameter("bairro"));
		req.setAttribute("cep", req.getParameter("cep"));
		req.setAttribute("endereco", req.getParameter("endereco"));
		req.setAttribute("uf", req.getParameter("uf"));
		req.setAttribute("estados", Factory.initEnderecoDAO().selectEstados());
		req.setAttribute("numero", req.getParameter("numero"));
		req.setAttribute("complemento", req.getParameter("complemento"));
		
	}
	
	public static void putAtribuRequisicaoPessoaEndereco(HttpServletRequest req, Endereco endereco){
		req.setAttribute("cidade", endereco.getCidade());
		req.setAttribute("bairro", endereco.getBairro());
		req.setAttribute("cep", endereco.getCep());
		req.setAttribute("endereco", endereco.getEnderecoResidencial() );
		req.setAttribute("uf", endereco.getUf());
		req.setAttribute("estados", Factory.initEnderecoDAO().selectEstados());
		req.setAttribute("numero", endereco.getNumero());
		req.setAttribute("complemento", endereco.getComplemento());
	}
	
	public static Graduacao getCadastroGraduacao(HttpServletRequest req) {
		return new Graduacao(Integer.parseInt(req.getParameter("modali")), req.getParameter("descricao"));
	}
	
	public static Acesso getCadastroAcesso(HttpServletRequest req) {
		return new Acesso(Integer.parseInt(req.getParameter("idSecretaria")), req.getParameter("senha"));
	}
	
	public static void putAtribuRequisicaoGraducao(HttpServletRequest req){
		req.setAttribute("descricao", req.getParameter("descricao"));
		req.setAttribute("modali", req.getParameter("modali"));
		req.setAttribute("modalidades", Factory.initModalidadeDAO().selectAll());
	}
	
	public static void putAtribuRequisicaoAcesso(HttpServletRequest req){
		req.setAttribute("idSecretaria", req.getParameter("idSecretaria"));
		req.setAttribute("secretaria", req.getParameter("secretaria"));
		req.setAttribute("senha", req.getParameter("senha"));
		req.setAttribute("repetesenha", req.getParameter("repetesenha"));
	}

	public static void putAtribuRequisicaoGraducao(HttpServletRequest req, Graduacao graduacao){
		req.setAttribute("descricao", graduacao.getDescricao());
		req.setAttribute("modali", graduacao.getIdModalidade());
		req.setAttribute("modalidades", Factory.initModalidadeDAO().selectAll());
	}

	public static Pacote getCadastroPacote(HttpServletRequest req) {
		return new Pacote(Double.parseDouble(req.getParameter("preco")), req.getParameter("descricao"));
	}
	
	public static void putAtribuRequisicaoPacote(HttpServletRequest req) {
		req.setAttribute("descricao", req.getParameter("descricao"));
		req.setAttribute("preco", req.getParameter("preco"));	
	}
	
	public static void putAtribuRequisicaoPacote(HttpServletRequest req, Pacote pacote){
		req.setAttribute("descricao", pacote.getDescricao());
		req.setAttribute("preco", pacote.getValor());
	}

	public static void putAtribuRequisicaoPagamento(HttpServletRequest req) {
		req.setAttribute("valorPago", req.getParameter("valorPago"));
		req.setAttribute("dataPagamento", req.getParameter("dataPagamento"));	
	}
	
	public static void putAtribuRequisicaoPagamento(HttpServletRequest req, Pagamento pagamento) {
		req.setAttribute("codigo", pagamento.getIdPagamento());
		req.setAttribute("valorPago", pagamento.getValorPago());
		req.setAttribute("dataPagamento", pagamento.getDataPagamentoString());	
	}


	public static Pagamento getCadastroPagamento(HttpServletRequest req) {
		return new Pagamento(Double.parseDouble(req.getParameter("valorPago")), 
				Util.formatDateIn(req.getParameter("dataPagamento")));
	}
	
	public static void putAtribuRequisicaoTurma(HttpServletRequest req) {
		req.setAttribute("nome",req.getParameter("nome"));
		req.setAttribute("professor", req.getParameter("professor"));
		req.setAttribute("id", req.getParameter("idProfessor"));
		req.setAttribute("modalidades",Factory.initModalidadeDAO().selectAll());
		req.setAttribute("modalidade",req.getParameter("modalidade"));
		req.setAttribute("horarioInicial", req.getParameter("horarioInicial"));
		req.setAttribute("horarioFinal", req.getParameter("horarioFinal"));
		req.setAttribute("capacidade", req.getParameter("capacidade"));
		
	}
	
	public static void putAtribuRequisicaoTurma(HttpServletRequest req, Turma turma) {
		req.setAttribute("codigo",turma.getIdTurma());		
		req.setAttribute("nome",turma.getNome());
		req.setAttribute("professor",turma.getProfessor().getNome());
		req.setAttribute("id", turma.getProfessor().getIdPessoa());
		req.setAttribute("modalidades",Factory.initModalidadeDAO().selectAll());
		req.setAttribute("modalidade",turma.getModalidade().getIdModalidade());
		req.setAttribute("horarioInicial", formatTimeView(turma.getHorarioInicial().toString()));
		req.setAttribute("horarioFinal", formatTimeView(turma.getHorarioFinal().toString()));
		req.setAttribute("capacidade", turma.getCapacidade());
		
	}


	public static Turma getCadastroTurmas(HttpServletRequest req) {
		return new Turma(Integer.parseInt(req.getParameter("idProfessor")), 
				         Integer.parseInt(req.getParameter("modalidade")), 
				         req.getParameter("nome"), 
				         Util.formatTime(req.getParameter("horarioInicial")), 
				         Util.formatTime(req.getParameter("horarioFinal")),
				         Integer.parseInt(req.getParameter("capacidade")));
	}
	
	
	public static void putAtribuRequisicaoDespesa(HttpServletRequest req) {
		req.setAttribute("descricao", req.getParameter("descricao"));
		req.setAttribute("qtde", req.getParameter("qtde"));
		
	}
	
	public static void putAtribuRequisicaoDespesa(HttpServletRequest req, Despesa despesa) {
		req.setAttribute("codigo", despesa.getIdDespesa());
		req.setAttribute("descricao", despesa.getDescricao());
		req.setAttribute("qtde", despesa.getQuantidade());
		
	}


	public static Despesa getCadastroDespesa(HttpServletRequest req) {
		return new Despesa(req.getParameter("descricao"), Integer.parseInt(req.getParameter("qtde")));
	}


	public static void putAtribuRequisicaoGasto(HttpServletRequest req) {
		req.setAttribute("idPessoa",req.getParameter("idPessoa"));
		req.setAttribute("secretaria", req.getParameter("secretaria"));
		Pessoa pessoa = (Pessoa) ((Acesso) req.getSession().getAttribute(EnumAcesso.ACESSO.getChave())).getPessoa();
		req.setAttribute("secret",pessoa);  
		req.setAttribute("despesa", req.getParameter("despesa"));
		req.setAttribute("id", req.getParameter("id"));
		req.setAttribute("valor", req.getParameter("valor"));
		req.setAttribute("data", req.getParameter("data"));
	}
	
	public static void putAtribuRequisicaoGasto(HttpServletRequest req, Gasto gasto) {
		req.setAttribute("codigo",gasto.getIdGasto());	
		req.setAttribute("idPessoa",gasto.getIdSecretaria());
		Secretaria secretaria = Factory.initSecretariaDAO().selectById(gasto.getIdSecretaria());
		req.setAttribute("secretaria", secretaria);
		req.setAttribute("secret",secretaria);
		req.setAttribute("id", gasto.getIdDespesa());
		req.setAttribute("valor", gasto.getValor());
		req.setAttribute("data", gasto.getDataString());
		req.setAttribute("despesa", Factory.initDespesaDAO().selectById(gasto.getIdDespesa()).getDescricao());
	}


	public static Gasto getCadastroGasto(HttpServletRequest req) {
		return new Gasto(Integer.parseInt(req.getParameter("id")), 
						 Double.parseDouble(req.getParameter("valor")), 
						 Util.formatDateIn(req.getParameter("data")), 
						 Integer.parseInt(req.getParameter("idPessoa")));
	}


	public static void putAtribuRequisicaoEnvelope(HttpServletRequest req) {
		req.setAttribute("codigo", req.getParameter("codigo"));
		req.setAttribute("codigo", req.getParameter("codigo"));
		req.setAttribute("codigo", req.getParameter("id"));
		
	}
	
}









