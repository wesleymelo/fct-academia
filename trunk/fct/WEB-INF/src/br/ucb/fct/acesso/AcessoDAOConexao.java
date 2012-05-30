package br.ucb.fct.acesso;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.ucb.fct.connection.MyConnection;
import br.ucb.fct.envelope.Envelope;
import br.ucb.fct.exceptions.DAOException;
import br.ucb.fct.util.Factory;

public class AcessoDAOConexao implements AcessoDAO {

	@Override
	public Acesso findByUsuarioAndSenha(String login, String senha)
			throws DAOException {
		String sql = "SELECT a.idAcesso, a.idPessoa, p.idPessoa, p.cpf  FROM acessos a, pessoas p WHERE p.idPessoa = a.idPessoa AND p.cpf = ? AND senha = MD5(?);";
		Connection conn;
		PreparedStatement ps;
		ResultSet rs;
		Acesso acesso = null;
		try {
			conn = MyConnection.init();
			ps = conn.prepareStatement(sql);
			ps.setString(1, login);
			ps.setString(2, senha);
			rs = ps.executeQuery();
			if(rs.first())
				acesso = new Acesso(rs.getInt("idAcesso"), Factory.initPessoaDAO().selectById(rs.getInt("idPessoa")));
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e, "ERRO! FINDBYUSUARIOANDSENHA na TABELA ACESSO. DATA("+new Date()+")");
		}
		return acesso;
	}
	
	@Override
	public Acesso findByUsuario(Integer idPessoa)
			throws DAOException {
		String sql = "SELECT * FROM acessos WHERE idPessoa = ?;";
		Connection conn;
		PreparedStatement ps;
		ResultSet rs;
		Acesso acesso = null;
		try {
			conn = MyConnection.init();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, idPessoa);
			rs = ps.executeQuery();
			if(rs.first())
				acesso = new Acesso(rs.getInt("idAcesso"), Factory.initPessoaDAO().selectById(rs.getInt("idPessoa")));
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e, "ERRO! FINDBYUSUARIO na TABELA ACESSO. DATA("+new Date()+")");
		}
		return acesso;
	}

	@Override
	public boolean insert(Acesso acesso) throws DAOException {
		String sql = "INSERT INTO acessos (idAcesso, idPessoa, senha) VALUES(null, ?, MD5(?))";
		Connection conn;
		PreparedStatement ps;
		int retorno;
		
		try {
			conn = MyConnection.init();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, acesso.getIdPessoa());
			ps.setString(2, acesso.getSenha());
			retorno = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e, "ERRO! INSERT na TABELA ACESSO. DATA("+new Date()+")");
		}
		return retorno == 0 ? false : true;
	}

	@Override
	public boolean delete(int id) throws DAOException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Acesso acesso, int id) throws DAOException {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public List<Acesso> selectAll() throws DAOException {
		String sql = "SELECT * FROM acessos;";
		List<Acesso> acessos = new ArrayList<Acesso>();
		Connection con = MyConnection.init();		
		Statement stm = null;
		ResultSet rs = null;
		try {
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while(rs.next())
				acessos.add(getAcesso(rs));
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! SELECTALL na TABELA ACESSOS. DATA("+new Date()+")");
		}
		return acessos;
	}
	
	
	@Override
	public List<Acesso> selectByNome(String nome) throws DAOException {
		String sql = "SELECT * FROM acessos a, pessoas p WHERE a.idPessoa = p.idPessoa AND nome LIKE'%"+nome+"%';";
		List<Acesso> acessos = new ArrayList<Acesso>();
		Connection con = MyConnection.init();		
		Statement stm = null;
		ResultSet rs = null;
		try {
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while(rs.next())
				acessos.add(getAcesso(rs));
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! SELECTBYNOME na TABELA ACESSOS. DATA("+new Date()+")");
		}
		return acessos;
		
	}
	
	public static Acesso getAcesso(ResultSet rs) throws SQLException{
		return new Acesso(rs.getInt("idAcesso"), 
				            Factory.initPessoaDAO().selectById(rs.getInt("idPessoa")));
	}
	
}
