package br.ucb.fct.servlet.actions;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucb.fct.enuns.EnumRelatorio;
import br.ucb.fct.util.Factory;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class RelatorioAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		//String var=req.getParameter("relatorio");
		//System.out.println(EnumRelatorio.var.getRelatorio());
		try {
			//			JasperPrint print = JasperFillManager.fillReport(req.getSession().
			//					getServletContext().getRealPath(EnumRelatorio.valueOf(req.getParameter("relatorio")).getRelatorio())/*chama relatorio*/
			//					, null, 
			//					new JRBeanCollectionDataSource(null));//puxando do banco...(fazer aqui o select)


			String url= new String();
			List<?> acessa= null;
			switch (Integer.parseInt(req.getParameter("relatorio"))) {
			case 1:
				url="view/jasper/reportAluno.jasper";
				acessa=Factory.initAlunoDAO().selectAll();
				break;
			case 2:
				url="view/jasper/reportProfessores.jasper";
				acessa=Factory.initProfessorDAO().selectAll();
				break;
			case 3:
				url="view/jasper/reportTurmas.jasper";
				acessa=Factory.initTurmaDAO().selectAll();
				break;
			case 4:
				url="view/jasper/reportModalidades.jasper";
				acessa=Factory.initModalidadeDAO().selectAll();
				break;
			case 5:
				url="view/jasper/reportPagamentos.jasper";
				acessa=Factory.initPagamentoDAO().selectAll();
				break;
			case 6:
				url="view/jasper/reportGastos.jasper";
				acessa=Factory.initGastoDAO().selectAll();
				break;
			default:
				url="view/jasper/reportDespesas.jasper";
				acessa=Factory.initDespesaDAO().selectAll();
			}

			JasperPrint print = JasperFillManager.fillReport(req.getSession().
					getServletContext().getRealPath(url)/*chama relatorio*/
					, null, 
					new JRBeanCollectionDataSource(acessa));//puxando do banco...(fazer aqui o select)
			OutputStream outStream;
			outStream = resp.getOutputStream();
			resp.setContentType("application/pdf");
			resp.addHeader("filename", "\"relatorio.pdf\"");

			JasperExportManager.exportReportToPdfStream(print, outStream);		
		} catch (JRException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
