package br.ucb.fct.modalidade;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1,modalidade.getDescricao());
			retorno = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! INSERT na TABELA MODALIDADES. DATA("+new Date()+")");
		}
		return retorno == 0 ? false: true;
	}

	@Override
	public boolean delete(int id) throws DAOException {
		
		String sql = "DELETE FROM modalidades WHERE idModalidade = ?;";
		Connection con = MyConnection.init();
		PreparedStatement ps;
		int retorno;
		try {
			ps = con.prepareStatement(sql);
			ps.setObject(1,id);
			retorno = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! DELETE na TABELA MODALIDADES. DATA("+new Date()+")");
		}
		return retorno == 0 ? false: true;
	}

	@Override
	public boolean updade(Modalidade modalidade) throws DAOException {
		String sql = "UPDATE modalidades SET descricao = ? WHERE idModalidade = ?;";
		Connection con = MyConnection.init();
		PreparedStatement ps;
		int retorno;
		try {
			ps = con.prepareStatement(sql);
			ps.setObject(1,modalidade.getDescricao());
			retorno = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! DELETE na TABELA MODALIDADES. DATA("+new Date()+")");
		}
		return retorno == 0 ? false: true;
			
	}

	@Override
	public List<Modalidade> selectAll() throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Modalidade findModalidadeById(int id) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

}
