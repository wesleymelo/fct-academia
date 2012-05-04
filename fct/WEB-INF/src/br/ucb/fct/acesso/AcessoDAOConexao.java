package br.ucb.fct.acesso;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import br.ucb.fct.connection.MyConnection;
import br.ucb.fct.exceptions.DAOException;
import br.ucb.fct.util.Encriptor;

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
			ps.setString(2, Encriptor.encripta(senha));
			rs = ps.executeQuery();
			if(rs.first())
				acesso = new Acesso(rs.getInt("idAcesso"), rs.getInt("idPessoa"), rs.getString("usuario"));
		} catch (SQLException e) {
			e.printStackTrace();
			throw new br.ucb.fct.exceptions.DAOException(e, "ERRO! FINDBYUSUARIOANDSENHA na TABELA ACESSO. DATA("+new Date()+")");
		}
		return acesso;
	}

	@Override
	public boolean insert(Acesso acesso) throws DAOException {
		// TODO Auto-generated method stub
		return false;
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
