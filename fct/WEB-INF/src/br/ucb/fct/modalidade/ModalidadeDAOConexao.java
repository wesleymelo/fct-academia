package br.ucb.fct.modalidade;

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

public class ModalidadeDAOConexao implements ModalidadeDAO{

	@Override
	public boolean insert(Modalidade modalidade) throws DAOException {
		String sql = "INSERT INTO modalidades(idModalidade,descricao) VALUES(null,?);";
		Connection con = MyConnection.init();
		int retorno;
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1,modalidade.getDescricao());
			retorno = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! INSERT na TABELA MODALIDADES. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, ps);
		}
		return retorno == 0 ? false: true;
	}

	@Override
	public boolean delete(int id) throws DAOException {
		
		String sql = "DELETE FROM modalidades WHERE idModalidade = ?;";
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
		return retorno == 0 ? false: true;
	}

	@Override
	public boolean updade(Modalidade modalidade) throws DAOException {
		String sql = "UPDATE modalidades SET descricao = ? WHERE idModalidade = ?;";
		Connection con = MyConnection.init();
		PreparedStatement ps = null;
		int retorno;
		try {
			ps = con.prepareStatement(sql);
			ps.setObject(1,modalidade.getDescricao());
			retorno = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! DELETE na TABELA MODALIDADES. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, ps);
		}
		return retorno == 0 ? false: true;
			
	}

	@Override
	public List<Modalidade> selectAll() throws DAOException {
		String sql = "SELECT * FROM modalidades;";
		Connection con = MyConnection.init();
		Statement stm = null;
		ResultSet rs = null;
		List<Modalidade> modalidades = new ArrayList<Modalidade>();
		try {
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while(rs.next())
				modalidades.add(getModalidade(rs));
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! SELECT_ALL na TABELA MODALIDADES. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, stm, rs);
		}
		return modalidades;
	}

	@Override
	public Modalidade selectById(int id) throws DAOException {
		String sql = "SELECT * FROM modalidades WHERE idModalidade = ?;";
		Connection con = MyConnection.init();
		PreparedStatement ps = null;
		ResultSet rs = null;
		Modalidade modalidade = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setObject(1, id);
			rs = ps.executeQuery();
			if(rs.first())
				modalidade = getModalidade(rs);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! SELECT_BY_ID na TABELA MODALIDADES. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, ps, rs);
		}
		return modalidade;
	}
	
	public Modalidade getModalidade(ResultSet rs) throws SQLException{
		return new Modalidade(rs.getInt("idModalidade"), rs.getString("descricao"));
	}
}
