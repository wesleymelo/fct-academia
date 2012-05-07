package br.ucb.fct.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import br.ucb.fct.exceptions.DAOException;

public class MyConnection {
	
	private static final String URL = "jdbc:mysql://localhost:3306/academia", USER = "root", PASS = "root", NAME = "com.mysql.jdbc.Driver" ;
	
	public static Connection init() {
		Connection con;
		try {
			Class.forName(NAME);
			con = DriverManager.getConnection(URL, USER, PASS);			
		} catch (ClassNotFoundException e) {
			throw new DAOException(e, "ERRO! 'Driver não encontrado' - Conexão não realizada... "+new Date());
		}catch (SQLException e) {
			throw new DAOException(e,"ERRO! 'Banco não encontrado' - Conexão não realizada... "+new Date());
		}
		return con;
		
	}
	
	public static void closeConnection(Connection con, Statement stm) throws DAOException{
		if(con != null && stm != null){
			try {
				con.close();
				stm.close();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new DAOException(e, "Erro ao fechar conexão. DATA("+(new Date())+")");
			}
			
		}
	}
	
	public static void closeConnection(Connection con, Statement stm, ResultSet rs) throws DAOException{
		if(con != null && stm != null && rs != null){
			try {
				con.close();
				stm.close();
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new DAOException(e, "Erro ao fechar conexão. DATA("+(new Date())+")");
			}
			
		}
	}
	
	
}
