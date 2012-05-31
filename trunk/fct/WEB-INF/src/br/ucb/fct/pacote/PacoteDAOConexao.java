package br.ucb.fct.pacote;

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
import br.ucb.fct.exceptions.DAOException;
import br.ucb.fct.modalidade.Modalidade;
import br.ucb.fct.util.Factory;
import br.ucb.fct.util.Util;

public class PacoteDAOConexao implements PacoteDAO{

	@Override
	public boolean insert(Pacote pacote) throws DAOException {
		String sql = "INSERT INTO pacotes(idPacote,descricao,preco) VALUES(null,?,?);";
		Connection con = MyConnection.init();
		int retorno;
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1,pacote.getDescricao());
			ps.setDouble(2,pacote.getValor());
			retorno = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! INSERT na TABELA PACOTES. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, ps);
		}
		return retorno == 0 ? false: true;
	}

	@Override
	public boolean delete(int id) throws DAOException {
		String sql = "DELETE FROM pacotes WHERE idPacote = ?;";
		Connection con = MyConnection.init();
		PreparedStatement ps = null;
		int retorno;
		try {
			ps = con.prepareStatement(sql);
			ps.setObject(1,id);
			retorno = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! DELETE na TABELA PACOTES. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, ps);
		}
		return retorno == 0 ? false: true;

	}

	@Override
	public boolean update(Pacote pacote, int id) throws DAOException {

		String sql = "UPDATE pacotes  SET  descricao = ?, preco = ? WHERE idPacote = ? ;";
		Connection con = MyConnection.init();
		PreparedStatement ps = null;
		int retorno;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1,pacote.getDescricao());
			ps.setDouble(2,pacote.getValor());
			ps.setInt(3, id);
			retorno = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! UPDATE na TABELA PACOTES. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, ps);
		}
		return retorno == 0 ? false: true;

	}

	@Override
	public List<Pacote> selectAll() throws DAOException {
		String sql = "SELECT * FROM pacotes;";
		Connection con = MyConnection.init();
		Statement stm = null;
		ResultSet rs = null;
		List<Pacote> pacotes = new ArrayList<Pacote>();
		try {
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while(rs.next())
				pacotes.add(getPacote(rs));
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! SELECT_ALL na TABELA PACOTES. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, stm, rs);
		}
		return pacotes;
	}

	@Override
	public Pacote selectById(int id) throws DAOException {
		String sql = "SELECT * FROM pacotes WHERE idPacote = ?;";
		Connection con = MyConnection.init();
		PreparedStatement ps = null;
		ResultSet rs = null;
		Pacote pacote = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if(rs.first())
				pacote = getPacote(rs);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! SELECT_BY_ID na TABELA PACOTES. DATA("+new java.util.Date()+")");
		}
		return pacote;
	}

	public Pacote getPacote(ResultSet rs) throws SQLException{
		return new Pacote(rs.getInt("idPacote"), 
				rs.getDouble("preco"),
				rs.getString("descricao"));
	}

	@Override
	public List<Modalidade> selectModalidadeById(int id) throws DAOException {
		String sql = "SELECT * FROM pacotes_modalidades p, modalidades m WHERE m.idModalidade = p.idModalidade AND p.idPacote = ?;";
		Connection con = MyConnection.init();
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Modalidade> modalidades = new ArrayList<Modalidade>();
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while(rs.next())
				modalidades.add(getModalidade(rs));
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! SELECTMODALIDADEBYID na TABELA PACOTES_MODALIDADES. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, ps, rs);
		}
		return modalidades;
	}

	public Modalidade getModalidade(ResultSet rs) throws SQLException{
		return new Modalidade(rs.getInt("idModalidade"), rs.getString("descricao"));
	}

	@Override
	public boolean hasModalidadeInPacote(int idModalidade, int idPacote)
			throws DAOException {
		String sql = "SELECT * FROM pacotes_modalidades WHERE idPacote = ? AND idModalidade = ?";
		Connection con = MyConnection.init();
		PreparedStatement ps = null;
		ResultSet rs = null;
		boolean retorno = false;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, idPacote);
			ps.setInt(2, idModalidade);
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

	@Override
	public boolean insertModalidadeNoPacote(int idPacote, int idModalidade, int idPagamento)
			throws DAOException {
		String sql = "INSERT INTO pacotes_modalidades(idPacote, idModalidade, idPagamento) VALUES(?,?,?);";
		Connection con = MyConnection.init();
		int retorno;
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1,idPacote);
			ps.setInt(2,idModalidade);
			ps.setInt(3, idPagamento);
			retorno = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! INSERTMODALIDADENOPACOTE na TABELA PACOTES_MODALIDADES. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, ps);
		}
		return retorno == 0 ? false: true;
	}

	@Override
	public List<Aluno> selectAlunosById(int id) throws DAOException {
		String sql = "SELECT * FROM pacotes_modalidades m, alunos a, pessoas p WHERE a.idAluno = m.idAluno AND a.idAluno = p.idPessoa AND m.idPacote = ?;";
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
			throw new DAOException(e,"ERRO! SELECT_ALUNOS na TABELA PACOTES_MODALIDADES. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, ps, rs);
		}
		return alunos;
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
	public boolean hasAlunoInPacote(int idPacote, int idAluno) throws DAOException {
		String sql = "SELECT * FROM pacotes_modalidades WHERE idAluno = ? AND idPacote = ?";
		Connection con = MyConnection.init();
		PreparedStatement ps = null;
		ResultSet rs = null;
		boolean retorno = false;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, idAluno);
			ps.setInt(2, idPacote);
			rs = ps.executeQuery();
			if(rs.first())
				retorno = true;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! HASALUNOINPACOTE na TABELA PACOTES_MODALIDADES. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, ps, rs);
		}
		return retorno;
	}

	@Override
	public boolean insertAlunoNoPacote(int idPacote, int idAluno) {
		String sql = "INSERT INTO pacotes_modalidades(idAluno,idPacote,idModalidade, idPagamento) VALUES(?,?) WHERE idPacote = ?";
		Connection con = MyConnection.init();
		int retorno;
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1,idAluno);
			ps.setInt(2,idPacote);
			retorno = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! INSERTALUNONOPACOTE na TABELA PACOTES_MODALIDADES. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, ps);
		}
		return retorno == 0 ? false: true;
		
	}

}
