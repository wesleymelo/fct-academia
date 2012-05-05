package br.ucb.fct.envelope;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import br.ucb.fct.connection.MyConnection;
import br.ucb.fct.exceptions.*;

public class EnvelopeDAOConexao implements EnvelopeDAO {

	@Override
	public boolean insert(Envelope envelope) throws DAOException {
		String sql = "INSERT INTO envelopes(null,idSecretaria, idProfessor) VALUES (?,?);";
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
		String sql = "UPDATE envelopes SET idSecretaria = ?, idProfessor = ?;";
		Connection con = null;
		PreparedStatement ps = null;
		int retorno = 0;
		try {
			con = MyConnection.init();
			ps = con.prepareStatement(sql);
			ps.setObject(1,envelope.getIdSecretaria());
			ps.setObject(2,envelope.getIdProfessor());
			ps.executeUpdate();
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
		Envelope envelope;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
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
		return new Envelope(rs.getInt("idSecretaria"), rs.getInt("idProfessor"));
	}

}