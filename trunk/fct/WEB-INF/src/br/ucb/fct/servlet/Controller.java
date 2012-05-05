package br.ucb.fct.servlet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.ucb.fct.servlets.actions.Action;

@SuppressWarnings("serial")
public class Controller extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		processaRequisicao(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		processaRequisicao(req, resp);
	}
	
	protected void processaRequisicao(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		Action action = null;
		System.out.println("AQUI SERVLET");
		Properties properties = getProperties();
		String acao = properties.getProperty(getAcao(req));
		if(acao != null){
			try {
				action = (Action) Class.forName(acao).newInstance();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			if (action != null) {
				String url = action.execute(req, resp);
				req.getRequestDispatcher(url).forward(req, resp);
			}/* else {
				req.getRequestDispatcher("index.jsp");
			}*/
		}
	}
	
	public Properties getProperties() {
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream("controller"));
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return properties;
	}
	
	protected String getAcao(HttpServletRequest req) {
		String url = req.getRequestURL().toString();
		String acao = url.subSequence(url.lastIndexOf("/") + 1,
				url.lastIndexOf(".do")).toString();
		return acao;
	}
}
