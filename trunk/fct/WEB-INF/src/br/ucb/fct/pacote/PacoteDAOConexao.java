package br.ucb.fct.pacote;

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
	
	
}
