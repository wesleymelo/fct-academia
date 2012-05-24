package br.ucb.fct.turma;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import br.ucb.fct.aluno.Aluno;
import br.ucb.fct.connection.MyConnection;
import br.ucb.fct.exceptions.DAOException;
import br.ucb.fct.util.Factory;
import br.ucb.fct.util.Util;
import br.ucb.fct.enuns.EnumTypePessoa;
import br.ucb.fct.enuns.EnumTypeSexo;

public class TurmaDAOConexao implements TurmaDAO{

	@Override
	public boolean insert(Turma turma) throws DAOException {
		String sql = "INSERT INTO turmas(idTurma, idProfessor, idModalidade, nome, horarioInicial, horarioFinal, capacidade) VALUES(null,?,?,?,?,?,?);";
		Connection con = MyConnection.init();
		int retorno;
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1,turma.getIdProfessor());
			ps.setInt(2,turma.getIdModalidade());
			ps.setString(3,turma.getNome());
			ps.setTime(4,turma.getHorarioInicial());
			ps.setTime(5, turma.getHorarioFinal());
			ps.setInt(6, turma.getCapacidade());
			retorno = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! INSERT na TABELA TURMAS. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, ps);
		}
		return retorno == 0 ? false: true;
	}

	@Override
	public boolean delete(int id) throws DAOException {
		String sql = "DELETE FROM turmas WHERE idTurma = ?;";
		Connection con = MyConnection.init();
		PreparedStatement ps = null;
		int retorno;
		try {
			ps = con.prepareStatement(sql);
			ps.setObject(1,id);
			retorno = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! DELETE na TABELA TURMAS. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, ps);
		}
		return retorno == 0 ? false: true;
	}

	@Override
	public boolean update(Turma turma, int id) throws DAOException {
										  
		String sql = "UPDATE turmas  SET idProfessor = ?, idModalidade = ?, nome = ?, horarioInicial = ?, horarioFinal = ?  WHERE idTurma = ?;";
		Connection con = MyConnection.init();
		PreparedStatement ps = null;
		int retorno;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1,turma.getIdProfessor());
			ps.setInt(2,turma.getIdModalidade());
			ps.setString(3,turma.getNome());
			ps.setTime(4,turma.getHorarioInicial());
			ps.setTime(5,turma.getHorarioFinal());
			ps.setInt(6,id);
			retorno = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! UPDATE na TABELA TURMAS. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, ps);
		}
		return retorno == 0 ? false: true;
	}

	@Override
	public List<Turma> selectAll() throws DAOException {
		String sql = "SELECT * FROM turmas;";
		Connection con = MyConnection.init();
		Statement stm = null;
		ResultSet rs = null;
		List<Turma> turmas = new ArrayList<Turma>();
		try {
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while(rs.next())
				turmas.add(getTurma(rs));
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! SELECT_ALL na TABELA TURMA. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, stm, rs);
		}
		return turmas;
	}

	@Override
	public Turma selectById(int id) throws DAOException {
		String sql = "SELECT * FROM turmas WHERE idTurma = ?;";
		Connection con = MyConnection.init();
		PreparedStatement ps = null;
		ResultSet rs = null;
		Turma   turma = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setObject(1, id);
			rs = ps.executeQuery();
			if(rs.first())
				turma = getTurma(rs);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! SELECT_BY_ID na TABELA TURMA. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, ps, rs);
		}
		return turma;
	}
	public Turma getTurma(ResultSet rs) throws SQLException{
		return new Turma(rs.getInt("IdTurma"), Factory.initProfessorDAO().selectById(rs.getInt("idProfessor")), Factory.initTurmaDAO().selectAlunosById(rs.getInt("IdTurma")), Factory.initModalidadeDAO().selectById(rs.getInt("idModalidade")), rs.getString("nome"), rs.getTime("horarioInicial"), rs.getTime("horarioFinal"), rs.getInt("capacidade"));
	}

	@Override
	public List<Aluno> selectAlunosById(int id) throws DAOException {
		String sql = "SELECT * FROM alunos_turmas t, alunos a, pessoas p WHERE a.idAluno = t.idAluno AND a.idAluno = p.idPessoa AND t.idTurma = ?;";
		Connection con = MyConnection.init();
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Aluno> alunos = new ArrayList<Aluno>();
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while(rs.next())
				alunos.add(getAluno(rs));
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! SELECT_ALUNOS na TABELA ALUNOS_TURMAS. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, ps, rs);
		}
		return alunos;
	}
	
	@Override
	public boolean hasAlunoInTurma(int idTurma, int idAluno) throws DAOException {
		
		String sql = "SELECT * FROM alunos_turmas WHERE idAluno = ? AND idTurma = ?";
		Connection con = MyConnection.init();
		PreparedStatement ps = null;
		ResultSet rs = null;
		boolean retorno = false;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, idAluno);
			ps.setInt(2, idTurma);
			rs = ps.executeQuery();
			if(rs.first())
				retorno = true;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! HASALUNOINTURMA na TABELA ALUNOS_TURMAS. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, ps, rs);
		}
		return retorno;
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

	@Override
	public boolean insertAlunoNaTurma(int idTurma, int idAluno)
			throws DAOException {
		
		System.out.println("idTurma: "+idTurma);
		System.out.println("idAluno: "+idAluno);
		
		String sql = "INSERT INTO alunos_turmas(idTurma, idAluno) VALUES(?,?);";
		Connection con = MyConnection.init();
		int retorno;
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1,idTurma);
			ps.setInt(2,idAluno);
			retorno = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! INSERT na TABELA ALUNOS_TURMAS. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, ps);
		}
		return retorno == 0 ? false: true;
	}
	
	@Override
	public List<Turma> selectByOther(String string) throws DAOException {
		String sql = "SELECT * FROM turmas t, professores pr, pessoas p, modalidades m WHERE t.idProfessor = pr.idProfessor AND p.idPessoa = pr.idProfessor AND t.idModalidade = m.idModalidade  AND  (t.nome LIKE '%"+string+"%' OR m.descricao LIKE '%"+string+"%' OR p.nome LIKE '%"+string+"%')";
		Connection con = MyConnection.init();
		Statement stm = null;
		ResultSet rs = null;
		List<Turma> turmas = new ArrayList<Turma>();
		try {
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while(rs.next())
				turmas.add(getTurma(rs));
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! SELECTBYOTHER na TABELA TURMA. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, stm, rs);
		}
		return turmas;
	}
}
