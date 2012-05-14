package br.ucb.fct.endereco;

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

public class EnderecoDAOConexao implements EnderecoDAO {

	@Override
	public boolean insert(Endereco endereco) throws DAOException {
		String sql = "INSERT INTO enderecos(idEndereco, enderecoResidencial, complemento, bairro, cidade, uf, cep, numero) VALUES(null,?,?,?,?,?,?,?);";
		Connection con = MyConnection.init();
		int retorno;
		PreparedStatement ps = null;
		
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1,endereco.getEnderecoResidencial());
			ps.setString(2,endereco.getComplemento());
			ps.setString(3,endereco.getBairro());
			ps.setString(4,endereco.getCidade());
			ps.setString(5,endereco.getUf());
			ps.setString(6,endereco.getCep());
			ps.setInt(7,endereco.getNumero());
			retorno = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! INSERT na TABELA ENDERECOS. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, ps);
		}
		return retorno == 0 ? false: true;

	}

	@Override
	public boolean delete(int id) throws DAOException {
		String sql = "DELETE FROM enderecos WHERE idEndereco = ?;";
		Connection con = MyConnection.init();
		PreparedStatement ps = null;
		int retorno;
		try {
			ps = con.prepareStatement(sql);
			ps.setObject(1,id);
			retorno = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! DELETE na TABELA ENDERECOS. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, ps);
		}
		return retorno == 0 ? false: true;

	}

	@Override
	public boolean update(Endereco endereco, int id) throws DAOException {
		String sql = "UPDATE enderecos  SET enderecoResidencial = ?, complemento = ?, bairro = ?, cidade = ?, uf = ?, cep = ?, numero = ? WHERE = ? ;";
		Connection con = MyConnection.init();
		PreparedStatement ps = null;
		int retorno;
		try {
			ps = con.prepareStatement(sql);
			ps.setObject(1,endereco.getEnderecoResidencial());
			ps.setObject(2,endereco.getComplemento());
			ps.setObject(3,endereco.getBairro());
			ps.setObject(4,endereco.getCidade());
			ps.setObject(5,endereco.getUf());
			ps.setObject(6,endereco.getCep());
			ps.setObject(7,endereco.getNumero());
			retorno = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! DELETE na TABELA ENDERECOS. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, ps);
		}
		return retorno == 0 ? false: true;
	}

	@Override
	public List<Endereco> selectAll() throws DAOException {
		String sql = "SELECT * FROM enderecos;";
		Connection con = MyConnection.init();
		Statement stm = null;
		ResultSet rs = null;
		List<Endereco> enderecos = new ArrayList<Endereco>();
		try {
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while(rs.next())
				enderecos.add(getEndereco(rs));
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! SELECT_ALL na TABELA ENDERECOS. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, stm, rs);
		}
		return enderecos;

	}

	@Override
	public Endereco selectById(int id) throws DAOException {
		String sql = "SELECT * FROM enderecos e, pessoas p  WHERE e.idEndereco = p.idEndereco AND p.idEndereco = ?;";
		Connection con = MyConnection.init();
		PreparedStatement ps = null;
		ResultSet rs = null;
		Endereco endereco = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setObject(1, id);
			rs = ps.executeQuery();
			if(rs.first())
				endereco = getEndereco(rs);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! SELECT_BY_ID na TABELA ENDERECOS. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, ps, rs);
		}
		return endereco;
	
	}
	
	public Endereco getEndereco(ResultSet rs) throws SQLException{
		return new Endereco(rs.getString("enderecoResidencial"), rs.getString("cidade"),rs.getString("bairro"),rs.getString("complemento"),rs.getString("uf"),rs.getString("cep"),rs.getInt("numero"),rs.getInt("idEndereco"));
	}
	
	public List<Estados> selectEstados(){
		String sql = "SELECT * FROM estados;";
		Connection con = MyConnection.init();
		Statement stm = null;
		ResultSet rs = null;
		List<Estados> estados = new ArrayList<Estados>();
		try {
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while(rs.next())
				estados.add(getEstados(rs));
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! SELECT_ALL na TABELA ESTADOS. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, stm, rs);
		}
		return estados;
		
	}
	
	public Estados getEstados(ResultSet rs) throws SQLException{
		return new Estados(rs.getString(2),rs.getString(3));
	}
	
	public int findLastId() throws DAOException {
		String sql = "SELECT MAX(idEndereco) as id FROM enderecos;";
		Connection con = MyConnection.init();
		PreparedStatement ps = null;
		ResultSet rs = null;
		int lastId = -1;
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.first())
				lastId = rs.getInt("id");
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! FINDLASTID na TABELA ENDERCOS. DATA("+new java.util.Date()+")");
		}
		return lastId;
		
	}
	
	

}
