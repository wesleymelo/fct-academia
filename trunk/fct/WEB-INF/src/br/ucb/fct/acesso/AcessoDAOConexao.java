package br.ucb.fct.acesso;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import br.ucb.fct.connection.MyConnection;
import br.ucb.fct.exceptions.DAOException;
import br.ucb.fct.util.Encrypter;

public class AcessoDAOConexao implements AcessoDAO {

	@Override
	public Acesso findByUsuarioAndSenha(String usuario, String senha)
			throws DAOException {
		String sql = "SELECT * FROM acesso WHERE usuario = ? AND senha = ?";
		Connection conn;
		PreparedStatement ps;
		ResultSet rs;
		Acesso acesso = null;
		try {
			conn = MyConnection.init();
			ps = conn.prepareStatement(sql);
			ps.setString(1, usuario);
			ps.setString(2, Encrypter.encripta(senha));
			rs = ps.executeQuery();
			if(rs.first())
				acesso = new Acesso(rs.getInt("idAcesso"), rs.getInt("idPessoa"), rs.getString("usuario"));
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e, "ERRO! FINDBYUSUARIOANDSENHA na TABELA ACESSO. DATA("+new Date()+")");
		}
		return acesso;
	}

	@Override
	public boolean insert(Acesso acesso) throws DAOException {
		String sql = "INSERT INTO acesso(idAcesso, idPessoa, usuario, senha) VALUES(null, ?, ?, ?)";
		Connection conn;
		PreparedStatement ps;
		int retorno;
		
		try {
			conn = MyConnection.init();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, acesso.getIdPessoa());
			ps.setString(2, acesso.getUsuario());
			ps.setString(3, Encrypter.encripta(acesso.getSenha()));
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
	
}
