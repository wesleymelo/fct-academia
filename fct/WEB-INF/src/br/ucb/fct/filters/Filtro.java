package br.ucb.fct.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.ucb.fct.acesso.Acesso;
import br.ucb.fct.enuns.EnumAcesso;
import br.ucb.gameStore.model.beans.Usuario;

public class Filtro implements Filter{

	@Override
	public void destroy() {		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain filtro) throws IOException, ServletException {
		
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		
		Acesso acesso = (Acesso) req.getSession().getAttribute(EnumAcesso.ACESSO.getChave());
			
		if(acesso==null){
			resp.sendRedirect(req.getContextPath()+"/admin/index.jsp");	
			return;
		}
		filtro.doFilter(req,resp);
		
			
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
	}
	
}
