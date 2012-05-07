package br.ucb.fct.acesso;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import br.ucb.fct.connection.MyConnection;
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
		System.out.println("AQUI");
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
		System.out.println("Acesso: sql -> "+acesso);
		return acesso;
	}

	@Override
	public boolean insert(Acesso acesso) throws DAOException {
		String sql = "INSERT INTO acesso(idAcesso, idPessoa, senha) VALUES(null, ?, ?)";
		Connection conn;
		PreparedStatement ps;
		int retorno;
		
		try {
			conn = MyConnection.init();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, acesso.getPessoa().getIdPessoa());
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
	
}
