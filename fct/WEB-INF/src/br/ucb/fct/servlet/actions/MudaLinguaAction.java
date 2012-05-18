package br.ucb.fct.servlet.actions;

import java.io.IOException;
import java.util.Locale;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.jstl.core.Config;

public class MudaLinguaAction implements Action{
	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		
		String language = req.getParameter("lingua");
        Locale locale = new Locale(language);
        Config.set(req.getSession(), Config.FMT_LOCALE, locale);
        Config.set(req.getSession(), Config.FMT_FALLBACK_LOCALE, locale);
        try {
        	if(req.getParameter("page").equalsIgnoreCase("other"))
        		resp.sendRedirect(req.getContextPath()+"/view/admin/principal/index.jsp");
        	else
        		resp.sendRedirect(req.getContextPath()+"/view/login.jsp");
		} catch (IOException e) {
			e.printStackTrace();
		}
        return(null);
	}
}
