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

public class Filtro implements Filter{

	@Override
	public void destroy() {		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		
		System.out.println("COCOCOCOCOCOCOCOCOCO");
		
		Acesso acesso = (Acesso) req.getSession().getAttribute(EnumAcesso.ACESSO.getChave());
	
		System.out.println(acesso);
		
		if(acesso!=null){
			chain.doFilter(req,resp);
			return;
		}
		resp.sendRedirect(req.getContextPath()+"/index.jsp");
			
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
	}
	
}
