package br.ucb.fct.servlet.actions;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class RelatorioAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {

		try {
			JasperPrint print = JasperFillManager.fillReport(req.getSession().
					getServletContext().getRealPath("jasper/relatorio"+req.getParameter("numRelatorio")+".jasper")/*chama relatorio*/
					, null, 
					new JRBeanCollectionDataSource(null));//puxando do banco...(fazer aqui o select)
			OutputStream outStream;
			outStream = resp.getOutputStream();
			resp.setContentType("application/pdf");
			resp.addHeader("filename", "\"relatorio.pdf\"");

			JasperExportManager.exportReportToPdfStream(print, outStream);		
		} catch (JRException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
