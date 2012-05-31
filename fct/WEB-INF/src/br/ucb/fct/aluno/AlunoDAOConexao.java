package br.ucb.fct.aluno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.ucb.fct.connection.MyConnection;
import br.ucb.fct.enuns.EnumTypePessoa;
import br.ucb.fct.enuns.EnumTypeSexo;
import br.ucb.fct.exceptions.DAOException;
import br.ucb.fct.graduacao.Graduacao;
import br.ucb.fct.pessoa.Pessoa;
import br.ucb.fct.pessoa.PessoaDAO;
import br.ucb.fct.turma.Turma;
import br.ucb.fct.util.Factory;
import br.ucb.fct.util.Util;

public class AlunoDAOConexao implements AlunoDAO {

	@Override
	public boolean insert(Aluno aluno) throws DAOException {
		String sql = "INSERT INTO alunos(idAluno, peso, altura) VALUES (?,?,?);";
		Connection con = null;
		PreparedStatement ps = null;
		PessoaDAO dao = Factory.initPessoaDAO();
		int retorno;
		if(!dao.insert(getPessoaByAluno(aluno)))
			return false;
		try {
			con = MyConnection.init();
			ps = con.prepareStatement(sql);
			ps.setInt(1,dao.findLastId());
			ps.setDouble(2,aluno.getPeso());
			ps.setDouble(3,aluno.getAltura());
			retorno = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! INSERT na TABELA ALUNOS. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, ps);
		}
		return retorno == 0 ? false: true;
	}

	@Override
	public boolean delete(int id) throws DAOException {
		String sql = "DELETE FROM alunos WHERE idAluno = ?;";
		Connection con = MyConnection.init();
		PreparedStatement ps = null;
		int retorno;
		try {
			ps = con.prepareStatement(sql);
			ps.setObject(1,id);
			retorno = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! DELETE na TABELA MODALIDADES. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, ps);
		}
		return retorno == 0 ? false: Factory.initPessoaDAO().delete(id);
	}

	public boolean desativa(int id) throws DAOException {
		PessoaDAO dao = Factory.initPessoaDAO();
		return dao.desativa(id);
	}
	
	@Override
	public boolean update(Aluno aluno, int id) throws DAOException {
		String sql = "UPDATE alunos SET peso = ?, altura = ? WHERE idAluno = ?";
		Connection con = null;
		PreparedStatement ps = null;
		PessoaDAO dao = Factory.initPessoaDAO();
		int retorno = 0;
		
		boolean flag = dao.update(getPessoaByAluno(aluno),id); 
		
		if(!flag)
			return false;
		try {
			con = MyConnection.init();
			ps = con.prepareStatement(sql);
			ps.setDouble(1,aluno.getPeso());
			ps.setDouble(2,aluno.getAltura());
			ps.setInt(3, id);
			retorno = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! UPDATE na TABELA ALUNOS. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, ps);
		}
		return retorno == 0 ? false: flag;
		
	}

	@Override
	public List<Aluno> selectAll() throws DAOException {
		String sql = "SELECT * FROM alunos, pessoas WHERE idAluno = idPessoa";
		List<Aluno> alunos = new ArrayList<Aluno>();
		Connection con = MyConnection.init();		
		Statement stm = null;
		ResultSet rs = null;
		try {
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while(rs.next())
				alunos.add(getAluno(rs));
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! SELECTALL na TABELA ALUNOS e PESSOAS. DATA("+new Date()+")");
		}
		return alunos;
		
	}

	@Override
	public Aluno selectById(int id) throws DAOException {
		String sql = "SELECT * FROM alunos, pessoas WHERE idAluno = idPessoa AND idAluno = ?";
		Connection con = MyConnection.init();
		PreparedStatement ps = null;
		ResultSet rs = null;
		Aluno aluno = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if(rs.first())
				aluno = getAluno(rs);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! SELECT_BY_ID na TABELA ALUNOS e PESSOAS. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, ps, rs);
		}
		return aluno;
	}
	
	public static Aluno getAluno(ResultSet rs) throws SQLException{
		return new Aluno(rs.getInt("idPessoa"), 
				         EnumTypePessoa.findEmunTypePessoaByNumber(rs.getInt("tipoPessoa")), 
				         rs.getDate("dataCadastro"),
				         rs.getString("nome"), 
				         rs.getString("cpf"), 
				         EnumTypeSexo.findByCodigo(rs.getString("sexo").charAt(0)), 
				         rs.getDate("dataNascimento"),
				         Factory.initEnderecoDAO().selectById(rs.getInt("idEndereco")), 
				         Factory.initTelefoneDAO().selectById(rs.getInt("idPessoa")), 
                         rs.getString("email"), 
                         rs.getBoolean("status"),
                         rs.getDouble("peso"),
                         rs.getDouble("altura"),
                         Util.getDateView(rs.getDate("dataNascimento").toString(),"/"),
						 Util.getDateView(rs.getDate("dataCadastro").toString(),"/"));
	}
	
	public static Pessoa getPessoaByAluno(Aluno aluno){
		return new Pessoa(aluno.getTipoPessoa(), aluno.getDataCadastro(), aluno.getNome(), aluno.getCpf(), aluno.getSexo(), aluno.getDataNascimento(), aluno.getEndereco(), aluno.getTelefones(), aluno.getEmail(), aluno.getStatus());
	}
	
	@Override
	public List<Aluno> selectByNome(String nome) throws DAOException {
		String sql = "SELECT * FROM alunos, pessoas WHERE idAluno = idPessoa AND nome LIKE '%"+nome+"%'";
		List<Aluno> alunos = new ArrayList<Aluno>();
		Connection con = MyConnection.init();		
		Statement stm = null;
		ResultSet rs = null;
		try {
			stm = con.prepareStatement(sql);
			rs = stm.executeQuery(sql);
			while(rs.next())
				alunos.add(getAluno(rs));
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! SELECTBYNOME na TABELA ALUNOS e PESSOAS. DATA("+new Date()+")");
		}
		return alunos;
	}
	
	@Override
	public List<Graduacao> selectGraducoesById(int id) throws DAOException {
		String sql = "SELECT * FROM alunos_graduacoes ag, graduacoes g WHERE ag.idGraduacao = g.idGraduacao AND idAluno = ?;";
		Connection con = MyConnection.init();
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Graduacao> graduacoes = new ArrayList<Graduacao>();
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while(rs.next())
				graduacoes.add(getGraduacao(rs));
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! SELECT_GRADUACOESBYID na TABELA ALUNOS_GRADUACOES. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, ps, rs);
		}
		return graduacoes;
	}
	
	
	@Override
	public boolean insertGraducaoAluno(int idAluno, int idGraduacao)
			throws DAOException {
		String sql = "INSERT INTO alunos_graduacoes(idAluno, idGraduacao) VALUES(?,?);";
		Connection con = MyConnection.init();
		int retorno;
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1,idAluno);
			ps.setInt(2,idGraduacao);
			retorno = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! INSERT na TABELA ALUNOS_GRADUACOES. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, ps);
		}
		return retorno == 0 ? false: true;
	}
	
	
	@Override
	public boolean hasGraduacaoInAluno(int idAluno, int idGraduacao) throws DAOException {
		
		String sql = "SELECT * FROM alunos_graduacoes WHERE idAluno = ? AND idGraduacao = ?";
		Connection con = MyConnection.init();
		PreparedStatement ps = null;
		ResultSet rs = null;
		boolean retorno = false;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, idAluno);
			ps.setInt(2, idGraduacao);
			rs = ps.executeQuery();
			if(rs.first())
				retorno = true;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! HASGRADUCAOINALUNO na TABELA ALUNOS_GRADUCOES. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, ps, rs);
		}
		return retorno;
	}
	
	public Turma getTurma(ResultSet rs) throws SQLException{
		return new Turma(rs.getInt("IdTurma"), Factory.initProfessorDAO().selectById(rs.getInt("idProfessor")), Factory.initTurmaDAO().selectAlunosById(rs.getInt("IdTurma")), Factory.initModalidadeDAO().selectById(rs.getInt("idModalidade")), rs.getString("nome"), rs.getTime("horarioInicial"), rs.getTime("horarioFinal"), rs.getInt("capacidade"));
	}
	
	@Override
	public List<Turma> selectTurmasById(int id) throws DAOException {
		String sql = "SELECT * FROM alunos_turmas at, turmas t WHERE at.idTurma = t.idTurma  AND at.idAluno = ?";
		Connection con = MyConnection.init();
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Turma> turmas = new ArrayList<Turma>();
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while(rs.next())
				turmas.add(getTurma(rs));
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! SELECTTURMASBYID na TABELA ALUNOS_TURMAS. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, ps, rs);
		}
		return turmas;
	}
	
	public Graduacao getGraduacao(ResultSet rs) throws SQLException{
		return new Graduacao(rs.getInt("idGraduacao"), 
				             rs.getInt("idModalidade"),
				             rs.getString("descricao"), 
				             Factory.initModalidadeDAO().selectById(rs.getInt("idModalidade")).getDescricao());
	}
	
}
