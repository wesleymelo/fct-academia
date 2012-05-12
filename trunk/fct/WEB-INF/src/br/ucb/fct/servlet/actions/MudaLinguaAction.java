package br.ucb.fct.servlet.actions;

import java.io.IOException;
import java.util.Locale;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.jstl.core.Config;

import org.omg.CORBA.Request;

public class MudaLinguaAction implements Action{
	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		
		String language = req.getParameter("lingua");
        Locale locale = new Locale(language);
 
        Config.set(req.getSession(), Config.FMT_LOCALE, locale);
        Config.set(req.getSession(), Config.FMT_FALLBACK_LOCALE, locale);
        try {
			resp.sendRedirect(req.getContextPath()+"view/admin/principal/index.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return(null);
	}
}
