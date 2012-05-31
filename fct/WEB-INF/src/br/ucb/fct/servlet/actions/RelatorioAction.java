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

		try {

			String url= new String();
			List<?> lista= null;
			Integer i=Integer.parseInt(req.getParameter("relatorio"));
			switch (i) {
			case 1:
				url=EnumRelatorio.ALUNO.getRelatorio();
				lista=Factory.initAlunoDAO().selectAll();
				break;
			case 2:
				url=EnumRelatorio.PROFESSOR.getRelatorio();
				lista=Factory.initProfessorDAO().selectAll();
				break;
			case 3:
				url=EnumRelatorio.TURMA.getRelatorio();
				lista=Factory.initTurmaDAO().selectAll();
				break;
			case 4:
				url=EnumRelatorio.MODALIDADE.getRelatorio();
				lista=Factory.initModalidadeDAO().selectAll();
				break;
			case 5:
				url=EnumRelatorio.PAGAMENTO.getRelatorio();
				lista=Factory.initPagamentoDAO().selectAll();
				break;
			case 6:
				url=EnumRelatorio.GASTO.getRelatorio();
				lista=Factory.initGastoDAO().selectAll();
				break;
			case 7:
				url=EnumRelatorio.DESPESA.getRelatorio();
				lista=Factory.initDespesaDAO().selectAll();
			}
			System.out.println(req.getSession().getServletContext().getRealPath(url));
			System.out.println("QUANTIDADE DE REG: "+lista.size());
			JasperPrint print = JasperFillManager.fillReport(req.getSession().
					getServletContext().getRealPath(url)/*chama relatorio*/
					, null, 
					new JRBeanCollectionDataSource(lista));//puxando do banco...(fazer aqui o select)
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
