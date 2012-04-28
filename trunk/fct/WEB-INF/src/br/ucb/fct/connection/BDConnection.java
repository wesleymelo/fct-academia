package br.ucb.fct.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Interface de conexão com Banco de Dados
 */
public interface BDConnection {
	public Connection getConnection();
	public void setConnection(Connection connection);
	public PreparedStatement getPreparedeStatement();
	public void setPreparedeStatement(PreparedStatement preparedeStatement);
	public ResultSet getResultSet();
	public void setResultSet(ResultSet resultSet);
	public void connection() throws DAOException;
	public void closeConnection() throws DAOException;
	public boolean execute() throws DAOException;
	public ResultSet executeQuery() throws DAOException;
	public void preparedStatement(String sql) throws DAOException;
}