package br.ucb.fct.secretaria;

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

public class SecretariaDAOConexao implements SecretariaDAO {
	//É NECESSÁRIO ARRUMAR ESSAS QUERYS, POIS NÃO PODEREMOS EXCLUIR SECRETARIA, ALUNO OU PROFESSOR.
	@Override
	public boolean insert(Secretaria secretaria) throws DAOException {
		String sql = "INSERT INTO secretarias(idSecretaria,dataAdmissao , horarioInicial, horarioFinal,salario) VALUES (?,?,?,?,?);";
		Connection con = null;
		PreparedStatement ps = null;
		PessoaDAO dao = Factory.initPessoaDAO();
		int retorno;
		if(!dao.insert(getPessoaBySecretaria(secretaria)))
			return false;
		try {
			con = MyConnection.init();
			ps = con.prepareStatement(sql);
			ps.setInt(1,dao.findLastId());
			ps.setDate(2,(java.sql.Date)secretaria.getDataAdmissao());
			ps.setString(3, secretaria.getHoraInicial());
			ps.setString(4, secretaria.getHoraFinal());
			ps.setDouble(5, secretaria.getSalario());
			retorno = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! INSERT na TABELA SECRETARIAS. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, ps);
		}
		return retorno == 0 ? false: true;
	}

	@Override
	public boolean delete(int id) throws DAOException {
		String sql = "DELETE FROM secretarias WHERE idSecretaria = ?;";
		Connection con = MyConnection.init();
		PreparedStatement ps = null;
		int retorno;
		try {
			ps = con.prepareStatement(sql);
			ps.setObject(1,id);
			retorno = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! DELETE na TABELA SECRETARIAS. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, ps);
		}
		return retorno == 0 ? false: Factory.initPessoaDAO().delete(id);
		
	}

	@Override
	public boolean update(Secretaria secretaria, int id) throws DAOException {
		String sql = "UPDATE secretarias SET dataAdmissao = ?, horarioInicial = ?, horarioFinal = ?;";
		Connection con = null;
		PreparedStatement ps = null;
		int retorno = 0;
		try {
			con = MyConnection.init();
			ps = con.prepareStatement(sql);
			ps.setObject(1,secretaria.getDataAdmissao());
			ps.setObject(2,secretaria.getHoraInicial());
			ps.setObject(3,secretaria.getHoraFinal());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! UPDATE na TABELA secretarias. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, ps);
		}
		return retorno == 0 ? false: Factory.initPessoaDAO().update(getPessoaBySecretaria(secretaria), id);
		
	}

	@Override
	public List<Secretaria> selectAll() throws DAOException {
		String sql = "SELECT * FROM secretarias, pessoas WHERE idSecretaria = idPessoa";
		List<Secretaria> secretarias = new ArrayList<Secretaria>();
		Connection con = MyConnection.init();		
		Statement stm = null;
		ResultSet rs = null;
		try {
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while(rs.next())
				secretarias.add(getSecretaria(rs));
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! SELECTALL na TABELA SECRETARIAS e PESSOAS. DATA("+new Date()+")");
		}
		return secretarias;
		
	}

	@Override
	public Secretaria selectById(int id) throws DAOException {
		String sql = "SELECT * FROM secretarias, pessoas WHERE idSecretaria = idPessoa AND idSecretaria = ?";
		Connection con = MyConnection.init();
		PreparedStatement ps = null;
		ResultSet rs = null;
		Secretaria secretaria = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if(rs.first())		
			secretaria = getSecretaria(rs);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! SELECT_BY_ID na TABELA SECRETARIAS e PESSOAS. DATA("+new Date()+")");
		}finally{
			MyConnection.closeConnection(con, ps, rs);
		}
		return secretaria;
	}
	
	public static Secretaria getSecretaria(ResultSet rs) throws SQLException{
		return new Secretaria(rs.getInt("idPessoa"), 
				              EnumTypePessoa.findEmunTypePessoaByNumber(rs.getInt("tipoPessoa")),
				              rs.getDate("dataCadastro"), 
				              rs.getString("nome"), 
				              rs.getString("cpf"), 
				              EnumTypeSexo.findByCodigo(rs.getString("sexo").charAt(0)), 
				              rs.getDate("dataNascimento"), 
				              Factory.initEnderecoDAO().selectById(rs.getInt("idPessoa")), 
				              Factory.initTelefoneDAO().selectById(rs.getInt("idPessoa")), 
				              rs.getString("email"), rs.getBoolean("status"), 
				              rs.getDate("dataAdmissao"), 
				              rs.getString("horarioInicial"), 
				              rs.getString("horarioFinal"),
				              Util.getDateView(rs.getDate("dataNascimento").toString(),"/"),
						      Util.getDateView(rs.getDate("dataCadastro").toString(),"/"),
						      rs.getDouble("salario"));
	}
	
	public static Pessoa getPessoaBySecretaria(Secretaria secretaria){
		return new Pessoa(secretaria.getTipoPessoa(), secretaria.getDataCadastro(), secretaria.getNome(), secretaria.getCpf(), secretaria.getSexo(), secretaria.getDataNascimento(), secretaria.getEndereco(), secretaria.getTelefones(), secretaria.getEmail(), secretaria.getStatus());
	}
	

}