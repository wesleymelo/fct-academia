package br.ucb.fct.turma;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.ucb.fct.connection.MyConnection;
import br.ucb.fct.exceptions.DAOException;

public class TurmaDAOConexao implements TurmaDAO{

	@Override
	public boolean insert(Turma turma) throws DAOException {
		String sql = "INSERT INTO turmas(idTurma, idProfessor, idModalidade, nome,horarioInicial, horarioFinal ) VALUES(null,?,?,?,?,?);";
		Connection con = MyConnection.init();
		int retorno;
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1,turma.getIdProfessor());
			ps.setInt(2,turma.getIdModalidade());
			ps.setString(3,turma.getNomeTurma());
			ps.setTime(4,turma.getHorarioInicial());
			ps.setTime(5, turma.getHorarioFinal());
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
										  
		String sql = "UPDATE turmas  SET idProfessor = ?, idModalidade = ?, nomeTurma = ?, horarioInicial = ?, horarioFinal = ?  WHERE = ? ;";
		Connection con = MyConnection.init();
		PreparedStatement ps = null;
		int retorno;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1,turma.getIdProfessor());
			ps.setInt(2,turma.getIdModalidade());
			ps.setString(3,turma.getNomeTurma());
			ps.setTime(4,turma.getHorarioInicial());
			ps.setTime(5,turma.getHorarioFinal());
			ps.setInt(6,id);
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
		String sql = "SELECT * FROM enderecos e, pessoas p  WHERE e.idEndereco = p.idEndereco AND p.idPessoa = ?;";
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
		return new Turma(rs.getInt("IdTurma"),rs.getInt("idProfessor") , rs.getInt("idModalidade"), rs.getString("nome"), rs.getTime("horarioInicial"), rs.getTime("horarioFinal"));
	}
}
