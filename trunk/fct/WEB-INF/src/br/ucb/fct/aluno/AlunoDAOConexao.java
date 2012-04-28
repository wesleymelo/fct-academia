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
import br.ucb.fct.endereco.Endereco;
import br.ucb.fct.exceptions.*;
import br.ucb.fct.telefone.Telefone;
import br.ucb.fct.util.Util;

public class AlunoDAOConexao implements AlunoDAO {

	@Override
	public void insert(Aluno aluno) throws DAOException {
		
		String sql = "INSERT INTO alunos (?,?,?,?,?,?,?,?,?);";
		Connection con = MyConnection.init();

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(2,aluno.getNome());
			ps.setString(3,aluno.getRg());
			ps.setString(4,aluno.getCpf());
			ps.setString(6,aluno.getStatus().toString());
			ps.setBoolean(7,aluno.getStatus());
			ps.setDouble(8,aluno.getAltura());
			ps.setDouble(9,aluno.getPeso());
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! INSERT no Banco ALUNOS. DATA("+new Date()+")");
		}
	}

	@Override
	public void delete(int id) throws DAOException {
		String sql = "DELETE FROM aluno WHERE id = "+id+";";
		Connection con = MyConnection.init();
		Statement stm = null;
		try {
			stm = con.createStatement();
			stm.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! DELETE no Banco. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, stm);
		}
		
	}

	@Override
	public void update(Aluno aluno, int id) throws DAOException {
		
		
		String sql = "UPDATE alunos SET id = ?, nome = ?, cpf = ?, dataNasc = ?, tipo = ?, status = ?, altura = ?, peso = ? ;";
		Connection con = MyConnection.init();

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setObject(2,aluno.getNome());
			ps.setObject(3,aluno.getCpf());
			ps.setObject(6,aluno.getStatus());
			ps.setObject(7,aluno.getAltura());
			ps.setObject(8,aluno.getPeso());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! UPDATE no Banco. DATA("+new Date()+")");
		}
		
	}

	@Override
	public List<Aluno> selectAll() throws DAOException {
		String sql = "SELECT * FROM alunos;";
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
			throw new DAOException(e,"ERRO! SELECTALL no Banco. DATA("+new Date()+")");
		}
		return alunos;
		
	}

	@Override
	public Aluno selectById(int id) throws DAOException {
		return new Aluno();
	}
	
	public static Aluno getAluno(ResultSet rs){
		
		return new Aluno();
		
	}
	

}
