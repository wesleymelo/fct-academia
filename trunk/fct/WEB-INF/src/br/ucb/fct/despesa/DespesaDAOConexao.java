package br.ucb.fct.despesa;

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

public class DespesaDAOConexao implements DespesaDAO{

	@Override
	public boolean insert(Despesa despesa) throws DAOException {
		String sql="INSERT INTO DESPESAS(idDespesa, descricao, quantidade) VALUES(null,?,?);";
		Connection con = null;
		PreparedStatement ps = null;
		int retorno;
		try {
			con=MyConnection.init();
			ps=con.prepareStatement(sql);
			ps.setString(1,despesa.getDescricao());
			ps.setInt(2,despesa.getQuantidade());
			retorno=ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! INSERT na TABELA DESPESAS. DATA("+new Date()+")");
		}
		finally{
			MyConnection.closeConnection(con, ps);
		}
		return retorno==0?false:true;
		
		
	}
	public boolean delete(int id) throws DAOException {
		String sql="DELETE FROM despesas WHERE idDespesa = ?;";
		Connection con=null;
		PreparedStatement ps=null;
		int retorno;
		try {
			con=MyConnection.init();
			ps=con.prepareStatement(sql);
			ps.setObject(1,id);
			retorno=ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! DELETE na TABELA despesas. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con,ps);
		}
		return retorno ==0?false:true;//AJUSTAR AO FACTORY???
	}

	@Override
	public boolean update(Despesa despesas, int id) throws DAOException {
		String sql="UPDATE despesas SET quantidade = ?, descricao = ? WHERE idDespesa = ?;";
		Connection con=null;
		PreparedStatement ps=null;
		int retorno=0;
		try {
			con=MyConnection.init();
			ps=con.prepareStatement(sql);
			ps.setInt(1,despesas.getQuantidade());
			ps.setString(2,despesas.getDescricao());
			ps.setInt(3,id);
			retorno=ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! UPDATE na TABELA DESPESAS. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, ps);
		}
		return retorno == 0? false : true;
	}

	@Override
	public List<Despesa> selectAll() throws DAOException {
		String sql="SELECT * FROM despesas;";
		List<Despesa> despesas= new ArrayList<Despesa>();
		Connection con=null;
		Statement  stm=null;
		ResultSet rs=null;
		try {
			con=MyConnection.init();
			stm=con.createStatement();
			rs=stm.executeQuery(sql);
			while(rs.next()){
				despesas.add(getDespesa(rs));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! SELECTALL na TABELA Despesas. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, stm, rs);
		}
		return despesas;
	}
	@Override
	public Despesa selectById(int id) throws DAOException {
		String sql="SELECT * FROM despesas WHERE idDespesa = ?;";
		Connection con = MyConnection.init();
		PreparedStatement ps = null;
		ResultSet rs = null;
		Despesa despesa = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if(rs.first())
				despesa = getDespesa(rs);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! SELECT_BY_ID na TABELA DESPESAS. DATA("+new java.util.Date()+")");
		}
		return despesa;
	
	}
	
	private Despesa getDespesa(ResultSet rs) throws SQLException {
		return new Despesa(rs.getInt("idDespesa"),rs.getString("descricao"),rs.getInt("quantidade"));
	}
	

}
