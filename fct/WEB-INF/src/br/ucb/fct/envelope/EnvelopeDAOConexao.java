package br.ucb.fct.envelope;

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
import br.ucb.fct.enuns.EnumTypePessoa;
import br.ucb.fct.enuns.EnumTypeSexo;
import br.ucb.fct.exceptions.*;
import br.ucb.fct.util.Factory;
import br.ucb.fct.util.Util;

public class EnvelopeDAOConexao implements EnvelopeDAO {

	@Override
	public boolean insert(Envelope envelope) throws DAOException {

		String sql = "INSERT INTO envelopes (idEnvelope,idSecretaria, idProfessor) VALUES (null,?,?);";
		Connection con = null;
		PreparedStatement ps = null;
		int retorno;
		try {
			con = MyConnection.init();
			ps = con.prepareStatement(sql);
			ps.setInt(1,envelope.getIdSecretaria());
			ps.setInt(2,envelope.getIdProfessor());
			retorno = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! INSERT na TABELA ENVELOPES. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, ps);
		}
		return retorno == 0 ? false: true;
		
	}

	@Override
	public boolean delete(int id) throws DAOException {
		String sql = "DELETE FROM envelopes WHERE idEnvelope = ?;";
		Connection con = MyConnection.init();
		PreparedStatement ps = null;
		int retorno;
		try {
			ps = con.prepareStatement(sql);
			ps.setObject(1,id);
			retorno = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! DELETE na TABELA ENVELOPES. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, ps);
		}
		return retorno == 0 ? false: true;
		
	}

	@Override
	public boolean update(Envelope envelope, int id) throws DAOException {
		String sql = "UPDATE envelopes SET idSecretaria = ?, idProfessor = ?; WHERE idEnvelope = ?";
		Connection con = null;
		PreparedStatement ps = null;
		int retorno = 0;
		try {
			con = MyConnection.init();
			ps = con.prepareStatement(sql);
			ps.setInt(1,envelope.getIdSecretaria());
			ps.setInt(2,envelope.getIdProfessor());
			ps.setInt(3, id);
			retorno = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! UPDATE na TABELA ENVELOPES. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, ps);
		}
		return retorno == 0 ? false: true;
		
	}

	@Override
	public List<Envelope> selectAll() throws DAOException {
		String sql = "SELECT * FROM envelopes;";
		List<Envelope> envelopes = new ArrayList<Envelope>();
		Connection con = MyConnection.init();		
		Statement stm = null;
		ResultSet rs = null;
		try {
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while(rs.next())
				envelopes.add(getEnvelope(rs));
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! SELECTALL na TABELA ENVELOPES. DATA("+new Date()+")");
		}
		return envelopes;
		
	}

	@Override
	public Envelope selectById(int id) throws DAOException {
		String sql = "SELECT * FROM envelopes WHERE idEnvelope = ?";
		Connection con = MyConnection.init();
		PreparedStatement ps = null;
		ResultSet rs = null;
		Envelope envelope = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if(rs.first())
				envelope = getEnvelope(rs);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! SELECT_BY_ID na TABELA ENVELOPES. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, ps, rs);
		}
		return envelope;
	}
	
	public static Envelope getEnvelope(ResultSet rs) throws SQLException{
		return new Envelope(rs.getInt("idEnvelope"),
							rs.getInt("idSecretaria"), 
				            rs.getInt("idProfessor"),
				            Factory.initProfessorDAO().selectById( rs.getInt("idProfessor")), 
				            Factory.initSecretariaDAO().selectById(rs.getInt("idSecretaria")));
	}
	
	@Override
	public List<Aluno> selectAlunosById(int id) throws DAOException {
		String sql = "SELECT * FROM alunos_envelopes t, alunos a, pessoas p WHERE a.idAluno = t.idAluno AND a.idAluno = p.idPessoa AND t.idEnvelope = ?;";
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
			throw new DAOException(e,"ERRO! SELECT_ALUNOS na TABELA alunos_envelopes. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, ps, rs);
		}
		return alunos;
	}
	
	@Override
	public boolean hasAlunoInEnvelope(int idEnvelope, int idAluno) throws DAOException {
		
		String sql = "SELECT * FROM alunos_envelopes WHERE idAluno = ? AND idEnvelope = ?";
		Connection con = MyConnection.init();
		PreparedStatement ps = null;
		ResultSet rs = null;
		boolean retorno = false;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, idAluno);
			ps.setInt(2, idEnvelope);
			rs = ps.executeQuery();
			if(rs.first())
				retorno = true;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! HASALUNOINTURMA na TABELA alunos_envelopes. DATA("+new Date()+")");
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
	public boolean insertAlunoNaEnvelope(int idEnvelope, int idAluno)
			throws DAOException {
		
		String sql = "INSERT INTO alunos_envelopes (idAluno, idEnvelope, dataEnvelope) VALUES(?,?,?);";
		Connection con = MyConnection.init();
		int retorno;
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1,idEnvelope);
			ps.setInt(2,idAluno);
			ps.setDate(3, new java.sql.Date(new Date().getTime()));
			retorno = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! INSERT na TABELA alunos_envelopes. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, ps);
		}
		return retorno == 0 ? false: true;
	}

}