package br.ucb.fct.servlet;

import java.io.IOException;
import java.util.ResourceBundle;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.servlet.actions.Action;

@SuppressWarnings("serial")
public class Controller extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("Oiiii");
		processaRequisicao(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("Eiiii");
		processaRequisicao(req, resp);
	}
	
	
	protected void processaRequisicao(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		try{
			String nameAction = getNameAction(req);
			Action action = getAction(nameAction);
			String proxima = action.execute(req, resp);
			System.out.println("Proxima: asdas "+proxima);
			if(proxima!=null)
				req.getRequestDispatcher(proxima).forward(req, resp);
		}catch ( ServletException e) {
			e.printStackTrace();
		}catch (IOException i){
			i.printStackTrace();
		}
	}
	
	
	public Action getAction(String nome){
		String classe = ResourceBundle.getBundle("controller").getString(nome);
		Action action = null;
		try{
			action =(Action) Class.forName(classe).newInstance();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return action;
	}
	
	private String getNameAction(HttpServletRequest req) throws IOException {
		int inicio = req.getRequestURI().lastIndexOf("/");
		int fim = req.getRequestURI().lastIndexOf(".do");
		return req.getRequestURI().substring(inicio + 1, fim);
	}
}
