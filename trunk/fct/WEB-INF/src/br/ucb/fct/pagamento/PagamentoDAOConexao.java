package br.ucb.fct.pagamento;

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
import br.ucb.fct.pacote.Pacote;
import br.ucb.fct.util.Util;

public class PagamentoDAOConexao implements PagamentoDAO{

	@Override
	public boolean insert(Pagamento pagamento) throws DAOException {
		String sql = "INSERT INTO pagamentos(idPagamento,valorPago,dataPagamento) VALUES(null,?,?);";
		Connection con = MyConnection.init();
		int retorno;
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setDouble(1,pagamento.getValorPago());
			ps.setDate(2,pagamento.getDataPagamento());
			retorno = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! INSERT na TABELA PAGAMENTOS. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, ps);
		}
		return retorno == 0 ? false: true;
	}

	@Override
	public boolean delete(int id) throws DAOException {
		String sql = "DELETE FROM pagamentos WHERE idPagamento = ?;";
		Connection con = MyConnection.init();
		PreparedStatement ps = null;
		int retorno;
		try {
			ps = con.prepareStatement(sql);
			ps.setObject(1,id);
			retorno = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! DELETE na TABELA PAGAMENTOS. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, ps);
		}
		return retorno == 0 ? false: true;
	}

	@Override
	public boolean update(Pagamento pagamento, int id) throws DAOException {
		String sql = "UPDATE pagamentos SET  valorPago = ?, dataPagamento = ? WHERE idPagamento = ? ;";
		Connection con = MyConnection.init();
		PreparedStatement ps = null;
		int retorno;
		try {
			ps = con.prepareStatement(sql);
			ps.setDouble(1,pagamento.getValorPago());
			ps.setDate(2,pagamento.getDataPagamento());
			ps.setInt(3, id);
			retorno = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! UPDATE na TABELA PAGAMENTO. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, ps);
		}
		return retorno == 0 ? false: true;
	}

	@Override
	public List<Pagamento> selectAll() throws DAOException {
		String sql = "SELECT * FROM pagamentos;";
		Connection con = MyConnection.init();
		Statement stm = null;
		ResultSet rs = null;
		List<Pagamento> pagamentos = new ArrayList<Pagamento>();
		try {
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while(rs.next())
				pagamentos.add(getPagamento(rs));
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! SELECT_ALL na TABELA PAGAMENTOS. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, stm, rs);
		}
		return pagamentos;
	}

	@Override
	public Pagamento selectById(int id) throws DAOException {
		String sql = "SELECT * FROM pagamentos WHERE idPagamento = ?;";
		Connection con = MyConnection.init();
		PreparedStatement ps = null;
		ResultSet rs = null;
		Pagamento pagamento = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if(rs.first())
				pagamento = getPagamento(rs);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! SELECT_BY_ID na TABELA PAGAMENTOS. DATA("+new java.util.Date()+")");
		}
		return pagamento;
	}
	
	public Pagamento getPagamento(ResultSet rs) throws SQLException{
		return new Pagamento(rs.getInt("idPagamento"), 
				             rs.getDouble("valorPago"),
				             rs.getDate("dataPagamento"),
				             Util.getDateView(rs.getDate("dataPagamento").toString(),"/"));
	}
	
}
