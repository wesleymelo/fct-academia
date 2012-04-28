package br.ucb.fct.exceptions;

public class DAOException extends RuntimeException{
	private Exception exception;
	private String msg;
	
	public Exception getException() {
		return exception;
	}

	public void setException(Exception exception) {
		this.exception = exception;
		
	}	

	public DAOException(Exception exception, String msg){
		setException(exception);
		setMsg(msg);
	}
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		return getMsg()+" - "+getException().getMessage();
	}
}
