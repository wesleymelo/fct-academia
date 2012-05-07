package br.ucb.fct.telefone;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import br.ucb.fct.enuns.EnumTypeFone;
import br.ucb.fct.exceptions.DAOException;
import br.ucb.fct.connection.MyConnection;

public class TelefoneDAOConexao implements TelefoneDAO{

	@Override
	public boolean insert(Telefone telefone) throws DAOException {
		String sql = "INSERT INTO telefones(idTelefone, idPessoa, ddd, numero, tipo) VALUES(null, ?, ?, ?, ?)";
		Connection con = MyConnection.init();
		int retorno;
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1,telefone.getIdPessoa());
			ps.setString(2, telefone.getDdd());
			ps.setString(3, telefone.getNumero());
			ps.setInt(4, telefone.getTipo().getNumber());
			retorno = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! INSERT na TABELA TELEFONES. DATA("+new java.util.Date()+")");
		}
		return retorno == 0 ? false: true;
	}

	@Override
	public boolean delete(int id) throws DAOException {
		String sql = "DELETE FROM telefones WHERE idTelefones = ?";
		Connection con = MyConnection.init();
		int retorno;
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1,id);
			retorno = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! DELETE na TABELA TELEFONES. DATA("+new java.util.Date()+")");
		}
		return retorno == 0 ? false: true;
	}

	@Override
	public boolean update(Telefone telefone, int id) throws DAOException {
		String sql = "UPDATE telefones SET ddd = ?, numero = ?, tipo = ?";
		Connection con = MyConnection.init();
		int retorno;
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1,telefone.getDdd());
			ps.setString(2, telefone.getNumero());
			ps.setInt(3, telefone.getTipo().getNumber());
			retorno = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! UPDATE na TABELA TELEFONES. DATA("+new java.util.Date()+")");
		}
		return retorno == 0 ? false: true;
		
	}

	@Override
	public List<Telefone> selectById(int id) throws DAOException {
		String sql = "SELECT * FROM telefones t, pessoas p WHERE p.idPessoa = t.idPessoa AND t.idPessoa = ?;";
		Connection con = MyConnection.init();
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Telefone> telefones = new ArrayList<Telefone>();
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while(rs.next())
				telefones.add(getTelefone(rs));
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! SELECTBYID na TABELA TELEFONES. DATA("+new java.util.Date()+")");
		}finally{
			MyConnection.closeConnection(con, ps, rs);
		}
		return telefones;
	}

	private Telefone getTelefone(ResultSet rs) throws SQLException {
		return new Telefone(rs.getInt("idTelefone"), rs.getInt("idPessoa"), rs.getString("numero"), rs.getString("ddd"), EnumTypeFone.findEnumTypeFonebyNumber(rs.getInt("tipo")));
	}

}
