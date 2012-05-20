package br.ucb.fct.graduacao;

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
import br.ucb.fct.util.Factory;

public class GraduacaoDAOConexao implements GraduacaoDAO {

	@Override
	public boolean insert(Graduacao graduacao) throws DAOException {
		String sql = "INSERT INTO graduacoes(idGraduacao,idModalidade,descricao) VALUES(null,?,?);";
		Connection con = MyConnection.init();
		int retorno;
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1,graduacao.getIdModalidade());
			ps.setString(2,graduacao.getDescricao());
			retorno = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! INSERT na TABELA GRADUACOES. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, ps);
		}
		return retorno == 0 ? false: true;
	}

	@Override
	public boolean delete(int id) throws DAOException {
		String sql = "DELETE FROM graduacoes WHERE idGraduacao = ?;";
		Connection con = MyConnection.init();
		PreparedStatement ps = null;
		int retorno;
		try {
			ps = con.prepareStatement(sql);
			ps.setObject(1,id);
			retorno = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! DELETE na TABELA GRADUACOES. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, ps);
		}
		return retorno == 0 ? false: true;
	}

	@Override
	public boolean update(Graduacao graduacao, int id) throws DAOException {

		String sql = "UPDATE graduacoes  SET  idModalidade = ?, descricao = ? WHERE idGraduacao = ? ;";
		Connection con = MyConnection.init();
		PreparedStatement ps = null;
		int retorno;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1,graduacao.getIdModalidade());
			ps.setString(2,graduacao.getDescricao());
			ps.setInt(3, id);
			retorno = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! UPDATE na TABELA GRADUACOES. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, ps);
		}
		return retorno == 0 ? false: true;
	}

	@Override
	public List<Graduacao> selectAll() throws DAOException {
		String sql = "SELECT * FROM graduacoes;";
		Connection con = MyConnection.init();
		Statement stm = null;
		ResultSet rs = null;
		List<Graduacao> graduacaos = new ArrayList<Graduacao>();
		try {
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while(rs.next())
				graduacaos.add(getGraduacao(rs));
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! SELECT_ALL na TABELA GRADUACOES. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, stm, rs);
		}
		return graduacaos;
	}

	@Override
	public Graduacao selectById(int id) throws DAOException {
		String sql = "SELECT * FROM graduacoes WHERE idGraduacao = ?;";
		Connection con = MyConnection.init();
		PreparedStatement ps = null;
		ResultSet rs = null;
		Graduacao graduacao = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if(rs.first())
				graduacao = getGraduacao(rs);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! SELECT_BY_ID na TABELA GRADUACOES. DATA("+new java.util.Date()+")");
		}
		return graduacao;
	}
	
	public Graduacao getGraduacao(ResultSet rs) throws SQLException{
		return new Graduacao(rs.getInt("idGraduacao"), 
				             rs.getInt("idModalidade"),
				             rs.getString("descricao"), 
				             Factory.initModalidadeDAO().selectById(rs.getInt("idModalidade")).getDescricao());
	}
}
