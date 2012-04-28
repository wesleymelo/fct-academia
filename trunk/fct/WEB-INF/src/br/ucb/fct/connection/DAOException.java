package br.ucb.fct.connection;

public class DAOException extends RuntimeException {
	private static final long serialVersionUID = 9110147375836289908L;

	public DAOException(String message, Exception e) {
		super(message, e);
	}
}
