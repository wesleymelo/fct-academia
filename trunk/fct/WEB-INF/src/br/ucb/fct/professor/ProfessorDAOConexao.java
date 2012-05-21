package br.ucb.fct.professor;

import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import br.ucb.fct.connection.MyConnection;
import br.ucb.fct.enuns.EnumTypePessoa;
import br.ucb.fct.enuns.EnumTypeSexo;
import br.ucb.fct.exceptions.*;
import br.ucb.fct.pessoa.Pessoa;
import br.ucb.fct.pessoa.PessoaDAO;
import br.ucb.fct.util.Factory;
import br.ucb.fct.util.Util;

public class ProfessorDAOConexao implements ProfessorDAO {

	@Override
	public boolean insert(Professor professor) throws DAOException {
		String sql = "INSERT INTO professores(idProfessor, dataAdmissao) VALUES (?,?);";
		Connection con = null;
		PreparedStatement ps = null;
		PessoaDAO dao = Factory.initPessoaDAO();
		int retorno;
		if(!dao.insert(getPessoaByProfessor(professor)))
			return false;
		try {
			con = MyConnection.init();
			ps = con.prepareStatement(sql);
			ps.setInt(1,dao.findLastId());
			java.sql.Date date = new java.sql.Date(professor.getDataAdmissao().getTime());
			ps.setDate(2, date);
			retorno = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! INSERT na TABELA PROFESSORES. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, ps);
		}
		return retorno == 0 ? false: true;
	}

	@Override
	public boolean delete(int id) throws DAOException {
		String sql = "DELETE FROM professores WHERE idProfessor = ?;";
		Connection con = MyConnection.init();
		PreparedStatement ps = null;
		int retorno;
		try {
			ps = con.prepareStatement(sql);
			ps.setObject(1,id);
			retorno = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! DELETE na TABELA PROFESSOR. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, ps);
		}
		return retorno == 0 ? false: Factory.initPessoaDAO().delete(id);
		
	}

	@Override
	public boolean update(Professor professor, int id) throws DAOException {
		String sql = "UPDATE professores SET dataAdmissao = ?;";
		Connection con = null;
		PreparedStatement ps = null;
		Date dataAdmissao = new Date(professor.getDataAdmissao().getTime()); 
		int retorno = 0;
		try {
			con = MyConnection.init();
			ps = con.prepareStatement(sql);
			ps.setObject(1,dataAdmissao);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! UPDATE na TABELA PROFESSORES. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, ps);
		}
		return retorno == 0 ? false: Factory.initPessoaDAO().update(getPessoaByProfessor(professor), id);
		
	}

	@Override
	public List<Professor> selectAll() throws DAOException {
		String sql = "SELECT * FROM professores, pessoas WHERE idProfessor = idPessoa";
		List<Professor> professores = new ArrayList<Professor>();
		Connection con = MyConnection.init();		
		Statement stm = null;
		ResultSet rs = null;
		try {
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while(rs.next())
				professores.add(getProfessor(rs));
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! SELECTALL na TABELA PROFESSORES e PESSOAS. DATA("+new Date()+")");
		}
		return professores;
		
	}

	@Override
	public Professor selectById(int id) throws DAOException {
		String sql = "SELECT * FROM professores, pessoas WHERE idProfessor = idPessoa AND idProfessor = ?";
		Connection con = MyConnection.init();
		PreparedStatement ps = null;
		ResultSet rs = null;
		Professor professor = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if(rs.first())
				professor = getProfessor(rs);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! SELECT_BY_ID na TABELA PROFESSOR e PESSOAS. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, ps, rs);
		}
		return professor;
	}
	
	public static Professor getProfessor(ResultSet rs) throws SQLException{
		return new Professor(rs.getInt("idPessoa"), 
				             EnumTypePessoa.findEmunTypePessoaByNumber(rs.getInt("tipoPessoa")), 
				             rs.getDate("dataCadastro"), 
				             rs.getString("nome"), 
				             rs.getString("cpf"), 
				             EnumTypeSexo.findByCodigo(rs.getString("sexo").charAt(0)), 
				             rs.getDate("dataNascimento"), 
				             Factory.initEnderecoDAO().selectById(rs.getInt("idPessoa")), 
				             Factory.initTelefoneDAO().selectById(rs.getInt("idPessoa")), 
				             rs.getString("email"), 
				             rs.getBoolean("status"), 
				             rs.getDate("dataAdmissao"),
							 Util.getDateView(rs.getDate("dataNascimento").toString(),"/"),
							 Util.getDateView(rs.getDate("dataCadastro").toString(),"/"),
							 rs.getString("dataAdmissao"));
	}
	
	
	public static Pessoa getPessoaByProfessor(Professor professor){
		return new Pessoa(professor.getTipoPessoa(), 
				professor.getDataCadastro(),
				professor.getNome(), 
				professor.getCpf(), 
				professor.getSexo(), 
				professor.getDataNascimento(),
				professor.getEndereco(), 
				professor.getTelefones(), 
				professor.getEmail(), 
				professor.getStatus());
}

	@Override
	public List<Professor> selectByNome(String nome) throws DAOException {
		String sql = "SELECT * FROM professores, pessoas WHERE idProfessor = idPessoa AND nome LIKE '%"+nome+"%'";
		List<Professor> professores = new ArrayList<Professor>();
		Connection con = MyConnection.init();		
		Statement stm = null;
		ResultSet rs = null;
		try {
			stm = con.prepareStatement(sql);
			rs = stm.executeQuery(sql);
			while(rs.next())
				professores.add(getProfessor(rs));
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! SELECTBYNOME na TABELA PROFESSORES e PESSOAS. DATA("+new Date()+")");
		}
		return professores;
	}
	

}
