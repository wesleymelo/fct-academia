package br.ucb.fct.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Conexão com o banco de dados MySQL
 *
 */
public class MySqlConnection implements BDConnection{
	static final String DB_HOST = "localhost";
	static final String DB_PORT = "3306";
	static final String DB_USER = "root";
	static final String DB_PASS = "root";
	static final String DB_NAME = "#####";
	static final String JDBC_NAME = "jdbc:mysql";
	static final String DRIVER_NAME = "com.mysql.jdbc.Driver";

	private Connection connection = null;
	private PreparedStatement preparedeStatement = null;
	private ResultSet resultSet = null;

	public void connection() throws DAOException {
		String url = JDBC_NAME + "://" + DB_HOST + ":" + DB_PORT + "/"+ DB_NAME;
		try {
			Class.forName(DRIVER_NAME);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new DAOException("ERRO no "+DRIVER_NAME,e);
		}
		try {
			setConnection(DriverManager.getConnection(url, DB_USER, DB_PASS));
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException("Erro ao Conectar ao Banco: "+url,e);
		}
		System.out.println("Conectado ao Banco: "+url);
	}

	public void closeConnection() throws DAOException {
		if (getConnection() != null) {
			try {
				getConnection().close();
			} catch (SQLException e) {
				throw new DAOException("Erro ao Encerrar Conexao",e);
			}
		}
		System.out.println("Banco Desconectado");
	}

	public boolean execute() throws DAOException{
		System.out.println("Executando: "+getPreparedeStatement().toString());
		try {
			getPreparedeStatement().execute();
		} catch (SQLException e) {
			return false;
		}
		return true;
	}
	
	public ResultSet executeQuery() throws DAOException {
		System.out.println(getPreparedeStatement().toString());
		try {
			setResultSet(getPreparedeStatement().executeQuery());
		} catch (SQLException e) {
			throw new DAOException("Erro no ExecuteQuery ",e);
		}
		return getResultSet();
	}
	
	public void preparedStatement(String sql) throws DAOException{
		try {
			setPreparedeStatement(getConnection().prepareStatement(sql));
		} catch (SQLException e) {
			throw new DAOException("ERRO PreparedeStatement", e);
		}
	}

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	public PreparedStatement getPreparedeStatement() {
		return preparedeStatement;
	}

	public void setPreparedeStatement(PreparedStatement preparedeStatement) {
		this.preparedeStatement = preparedeStatement;
	}

	public ResultSet getResultSet() {
		return resultSet;
	}

	public void setResultSet(ResultSet resultSet) {
		this.resultSet = resultSet;
	}
}
