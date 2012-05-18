package br.ucb.fct.aluno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import br.ucb.fct.connection.MyConnection;
import br.ucb.fct.enuns.EnumTypePessoa;
import br.ucb.fct.enuns.EnumTypeSexo;
import br.ucb.fct.exceptions.*;
import br.ucb.fct.pessoa.Pessoa;
import br.ucb.fct.pessoa.PessoaDAO;
import br.ucb.fct.util.Factory;
import br.ucb.fct.util.Util;

public class AlunoDAOConexao implements AlunoDAO {

	@Override
	public boolean insert(Aluno aluno) throws DAOException {
		String sql = "INSERT INTO alunos(idAluno, peso, altura) VALUES (?,?,?);";
		Connection con = null;
		PreparedStatement ps = null;
		PessoaDAO dao = Factory.initPessoaDAO();
		int retorno;
		if(!dao.insert(getPessoaByAluno(aluno)))
			return false;
		try {
			con = MyConnection.init();
			ps = con.prepareStatement(sql);
			ps.setInt(1,dao.findLastId());
			ps.setDouble(2,aluno.getPeso());
			ps.setDouble(3,aluno.getAltura());
			retorno = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! INSERT na TABELA ALUNOS. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, ps);
		}
		return retorno == 0 ? false: true;
	}

	@Override
	public boolean delete(int id) throws DAOException {
		String sql = "DELETE FROM alunos WHERE idAluno = ?;";
		Connection con = MyConnection.init();
		PreparedStatement ps = null;
		int retorno;
		try {
			ps = con.prepareStatement(sql);
			ps.setObject(1,id);
			retorno = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! DELETE na TABELA MODALIDADES. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, ps);
		}
		return retorno == 0 ? false: Factory.initPessoaDAO().delete(id);
	}

	@Override
	public boolean update(Aluno aluno, int id) throws DAOException {
		String sql = "UPDATE alunos SET peso = ?, altura = ?";
		Connection con = null;
		PreparedStatement ps = null;
		PessoaDAO dao = Factory.initPessoaDAO();
		int retorno = 0;
		
		if(!dao.update(getPessoaByAluno(aluno),aluno.getIdPessoa()))
			return false;
		try {
			con = MyConnection.init();
			ps = con.prepareStatement(sql);
			ps.setObject(1,aluno.getAltura());
			ps.setObject(2,aluno.getPeso());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! UPDATE na TABELA ALUNOS. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, ps);
		}
		return retorno == 0 ? false: Factory.initPessoaDAO().update(getPessoaByAluno(aluno), id);
		
	}

	@Override
	public List<Aluno> selectAll() throws DAOException {
		String sql = "SELECT * FROM alunos, pessoas WHERE idAluno = idPessoa";
		List<Aluno> alunos = new ArrayList<Aluno>();
		Connection con = MyConnection.init();		
		Statement stm = null;
		ResultSet rs = null;
		try {
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while(rs.next())
				alunos.add(getAluno(rs));
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! SELECTALL na TABELA ALUNOS e PESSOAS. DATA("+new Date()+")");
		}
		return alunos;
		
	}

	@Override
	public Aluno selectById(int id) throws DAOException {
		String sql = "SELECT * FROM alunos, pessoas WHERE idAluno = idPessoa AND idAluno = ?";
		Connection con = MyConnection.init();
		PreparedStatement ps = null;
		ResultSet rs = null;
		Aluno aluno = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if(rs.first())
				aluno = getAluno(rs);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! SELECT_BY_ID na TABELA ALUNOS e PESSOAS. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, ps, rs);
		}
		return aluno;
	}
	
	public static Aluno getAluno(ResultSet rs) throws SQLException{
		return new Aluno(rs.getInt("idPessoa"), EnumTypePessoa.findEmunTypePessoaByNumber(rs.getInt("tipoPessoa")), Util.formatDateOut(rs.getDate("dataCadastro").toString()), rs.getString("nome"), 
				  rs.getString("cpf"), EnumTypeSexo.findByCodigo(rs.getString("sexo").charAt(0)), rs.getDate("dataNascimento"), Factory.initEnderecoDAO().selectById(rs.getInt("idPessoa")), Factory.initTelefoneDAO().selectById(rs.getInt("idPessoa")), rs.getString("email"), rs.getBoolean("status"), rs.getDouble("peso"), rs.getDouble("altura"));
	}
	
	public static Pessoa getPessoaByAluno(Aluno aluno){
		return new Pessoa(aluno.getTipoPessoa(), aluno.getDataCadastro(), aluno.getNome(), aluno.getCpf(), aluno.getSexo(), aluno.getDataNascimento(), aluno.getEndereco(), aluno.getTelefones(), aluno.getEmail(), aluno.getStatus());
	}
}
