package br.ucb.fct.gasto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.ucb.fct.connection.MyConnection;
import br.ucb.fct.exceptions.DAOException;

public class GastoDAOConexao implements GastoDAO {

	@Override
	public boolean insert(Gasto gasto) throws DAOException {
		String sql="INSERT INTO gastos(idGasto,idDespesa,valor,data,idSecretaria) VALUES (?,?,?,?,?);";
		Connection con = null;
		PreparedStatement ps = null;
		int retorno;
		try {
			con=MyConnection.init();
			ps=con.prepareStatement(sql);
			ps.setInt(1,gasto.getIdGasto());
			ps.setInt(2,gasto.getIdDespesa());
			ps.setDouble(3,gasto.getValor());
			ps.setDate(4,(java.sql.Date)gasto.getData());
			ps.setInt(5,gasto.getIdSecretaria());
			retorno=ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! INSERT na TABELA GASTOS. DATA("+new Date()+")");
		}
		finally{
			MyConnection.closeConnection(con, ps);
		}
		return retorno ==0?false:true;
	}

	@Override
	public boolean delete(int id) throws DAOException {
		String sql="DELETE FROM gastos WHERE idGasto = ?;";
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
			throw new DAOException(e,"ERRO! DELETE na TABELA GASTOS. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con,ps);
		}
		return retorno ==0?false:true;//AJUSTAR AO FACTORY???
	}

	@Override
	public boolean update(Gasto gasto, int id) throws DAOException {
		String sql="UPDATE gastos SET idDespesa=?,valor=?,data=?,idSecretaria=? WHERE idGasto=?;";
		Connection con=null;
		PreparedStatement ps=null;
		int retorno=0;
		try {
			con=MyConnection.init();
			ps=con.prepareStatement(sql);
			ps.setInt(1,gasto.getIdDespesa());
			ps.setDouble(2,gasto.getValor());
			ps.setDate(3,(java.sql.Date)gasto.getData());
			ps.setInt(4,gasto.getIdSecretaria());
			ps.setInt(5,id);
			retorno=ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! UPDATE na TABELA GASTOS. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, ps);
		}
		return retorno == 0?false:true;
	}

	@Override
	public List<Gasto> selectAll() throws DAOException {
		String sql="SELECT * FROM gastos;";
		List<Gasto> gastos= new ArrayList<Gasto>();
		Connection con=null;
		Statement  stm=null;
		ResultSet rs=null;
		try {
			con=MyConnection.init();
			stm=con.createStatement();
			rs=stm.executeQuery(sql);
			while(rs.next()){
				gastos.add(getGasto(rs));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! SELECTALL na TABELA Gastos. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, stm, rs);
		}
		return gastos;
	}
	@Override
	public Gasto selectById(int id) throws DAOException {
		String sql="SELECT * FROM gastos WHERE idGasto="+id+";";
		Connection con=null;
		Statement  stm=null;
		ResultSet rs=null;
		Gasto newGasto=null;
		try {
			con=MyConnection.init();
			stm=con.createStatement();
			rs=stm.executeQuery(sql);
			newGasto=getGasto(rs);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! SELECT BY ID NA TABELA GASTOS. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, stm, rs);
		}
		return newGasto;
	}
	
	private Gasto getGasto(ResultSet rs) throws SQLException {
		return new Gasto(rs.getInt("idGasto"),rs.getInt("idDespesa"),rs.getDouble("valor"),rs.getDate("data"),rs.getInt("idSecretaria"));
	}

	
	
	

}
