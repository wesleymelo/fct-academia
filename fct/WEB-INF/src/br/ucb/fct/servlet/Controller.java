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
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String actionName = getNameAction(req.getRequestURI());
		Action action = obterAction(actionName);
		String next = action.execute(req, resp);
		if(next != null)
			req.getRequestDispatcher(next).forward(req, resp);
	}
	
	public String getNameAction(String uri) {
		return uri.substring(uri.lastIndexOf("/") + 1,uri.lastIndexOf(".do"));
	}
	
	public Action obterAction(String actionName){
		String classe = ResourceBundle.getBundle("controller").getString(actionName);
		Action action = null;
		
		try {
			action = (Action) Class.forName(classe).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return action;
	}
}
