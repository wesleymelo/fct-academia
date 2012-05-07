package br.ucb.fct.pessoa;

import java.sql.Connection;
import br.ucb.fct.enuns.EnumTypePessoa;
import br.ucb.fct.enuns.EnumTypeSexo;
import br.ucb.fct.exceptions.DAOException;
import br.ucb.fct.util.Factory;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.ucb.fct.connection.MyConnection;

public class PessoaDAOConexao implements PessoaDAO {

	@Override
	public boolean insert(Pessoa pessoa) throws DAOException {
		String sql = "INSERT INTO pessoas(idPessoa,tipoPessoa, dataCadastro, nome, cpf, sexo, rg, orgaoEmissor, " +
				"idEndereco, email, nacionalidade, naturalidade, status) VALUES(null,?,?,?,?,?,?,?,?,?,?,?,?);";
		Connection con = MyConnection.init();
		int retorno;
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1,pessoa.getTipoPessoa().getNumber());
			ps.setDate(2, (Date) pessoa.getDataCadastro());
			ps.setString(3, pessoa.getNome());
			ps.setString(4, pessoa.getCpf());
			ps.setString(5, pessoa.getSexo().getCodigo().toString());
			ps.setString(6, pessoa.getRg());
			ps.setString(7, pessoa.getOrgaoEmissor());
			ps.setInt(8, pessoa.getEndereco().getIdEndereco());
			ps.setString(9, pessoa.getEmail());
			ps.setString(10, pessoa.getNacionalidade());
			ps.setString(11, pessoa.getNaturalidade());
			ps.setBoolean(12, pessoa.getStatus());
			retorno = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! INSERT na TABELA PESSOAS. DATA("+new java.util.Date()+")");
		}
		return retorno == 0 ? false: true;
	}

	@Override
	public boolean delete(int id) throws DAOException {
		String sql = "DELETE FROM pessoas WHERE idPessoa = ?";
		Connection con = MyConnection.init();
		int retorno;
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1,id);
			retorno = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! DELETE na TABELA PESSOAS. DATA("+new java.util.Date()+")");
		}
		return retorno == 0 ? false: true;
	}

	@Override
	public boolean update(Pessoa pessoa, int id) throws DAOException {
		String sql = "UPDATE pessoas SET idPessoa,tipoPessoa, dataCadastro, nome, cpf, sexo, rg, orgaoEmissor, " +
				"idEndereco, email, nacionalidade, naturalidade, status) VALUES(null,?,?,?,?,?,?,?,?,?,?,?,?);";
		Connection con = MyConnection.init();
		int retorno;
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1,pessoa.getTipoPessoa().getNumber());
			ps.setDate(2, (Date) pessoa.getDataCadastro());
			ps.setString(3, pessoa.getNome());
			ps.setString(4, pessoa.getCpf());
			ps.setString(5, pessoa.getSexo().getCodigo().toString());
			ps.setString(6, pessoa.getRg());
			ps.setString(7, pessoa.getOrgaoEmissor());
			ps.setInt(8, pessoa.getEndereco().getIdEndereco());
			ps.setString(9, pessoa.getEmail());
			ps.setString(10, pessoa.getNacionalidade());
			ps.setString(11, pessoa.getNaturalidade());
			ps.setBoolean(12, pessoa.getStatus());
			retorno = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! INSERT na TABELA PESSOAS. DATA("+new java.util.Date()+")");
		}
		return retorno == 0 ? false: true;
		
	}

	@Override
	public List<Pessoa> selectAll() throws DAOException {
		String sql = "SELECT * FROM pessoas";
		Connection con = MyConnection.init();
		Statement stm = null;
		ResultSet rs = null;
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		try {
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while(rs.next())
				pessoas.add(getPessoa(rs));
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! SELECTALL na TABELA PESSOAS. DATA("+new java.util.Date()+")");
		}finally{
			MyConnection.closeConnection(con, stm, rs);
		}
		return pessoas;
		
	}

	public Pessoa getPessoa(ResultSet rs) throws SQLException {
		return new Pessoa(rs.getInt("idPessoa"), EnumTypePessoa.findEmunTypePessoaByNumber(rs.getInt("tipoPessoa")), rs.getDate("dataCadastro"), rs.getString("nome"), 
						  rs.getString("cpf"), EnumTypeSexo.findByCodigo(rs.getString("sexo").charAt(0)), rs.getDate("dataNascimento"), rs.getString("rg"), rs.getString("orgaoEmissor"), rs.getString("naturalidade"), rs.getString("nacionalidade"),
						  Factory.initEnderecoDAO().selectById(rs.getInt("idEndereco")), Factory.initTelefoneDAO().selectById(rs.getInt("idPessoa")), rs.getString("email"), rs.getBoolean("status"));
	}

	@Override
	public Pessoa selectById(int id) throws DAOException {
		String sql = "SELECT * FROM pessoas WHERE idPessoa = ?;";
		Connection con = MyConnection.init();
		PreparedStatement ps = null;
		ResultSet rs = null;
		Pessoa pessoa = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if(rs.first())
				pessoa = getPessoa(rs);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! FIND_PESSOA_BY_ID na TABELA PESSOAS. DATA("+new java.util.Date()+")");
		}
		return pessoa;
		
	}
	
	public int findLastId() throws DAOException {
		String sql = "SELECT MAX(idPessoa)FROM pessoas as id";
		Connection con = MyConnection.init();
		PreparedStatement ps = null;
		ResultSet rs = null;
		int lastId = -1;
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			lastId = rs.getInt("id");
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! FINDLASTID na TABELA PESSOAS. DATA("+new java.util.Date()+")");
		}
		return lastId;
		
	}

	@Override
	public Pessoa selectByCPF(String cpf) throws DAOException {
		String sql = "SELECT * FROM pessoas WHERE cpf = ?;";
		Connection con = MyConnection.init();
		PreparedStatement ps = null;
		ResultSet rs = null;
		Pessoa pessoa = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, cpf);
			rs = ps.executeQuery();
			if(rs.first())
				pessoa = getPessoa(rs);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e,"ERRO! FIND_PESSOA_BY_CPF na TABELA PESSOAS. DATA("+new java.util.Date()+")");
		}
		return pessoa;
	}

}
