<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>

<c:import url="../../includes/header.jsp" />

<!-- Dashboard icons -->
<div class="container_12">
	<div class="grid_7">
		<!--  <a href="${pageContext.request.contextPath}/view/jasper/relatorio.do?relatorio='ALUNO'" class="dashboard-module"> <img
			src="${pageContext.request.contextPath}/view/images/aluno_.png"
			width="64" height="64" alt="edit" /> <span><fmt:message key="rel_alunos"/></span>
		</a> <a href="${pageContext.request.contextPath}/view/jasper/relatorio.do?relatorio='PROFESSOR'" class="dashboard-module"> <img
			src="${pageContext.request.contextPath}/view/images/professor_.png"
			width="64" height="64" alt="edit" /> <span><fmt:message key="rel_professores"/></span>
		 </a> 
		 <a href="${pageContext.request.contextPath}/view/jasper/relatorio.do?relatorio='TURMA'" class="dashboard-module"> <img
			src="${pageContext.request.contextPath}/view/images/turma.png"
			width="64" height="64" alt="edit" /> <span><fmt:message key="rel_turmas"/></span>
		</a> 
		 <a href="${pageContext.request.contextPath}/view/jasper/relatorio.do?relatorio='MODALIDADE'" class="dashboard-module"> <img
			src="${pageContext.request.contextPath}/view/images/modalidade.png"
			width="64" height="64" alt="edit" /> <span><fmt:message key="rel_modalidades"/></span>
		</a>
		<a href="${pageContext.request.contextPath}/view/jasper/relatorio.do?relatorio='PAGAMENTO'" class="dashboard-module"> <img
			src="${pageContext.request.contextPath}/view/images/pagamento.png"
			width="64" height="64" alt="edit" /> <span><fmt:message key="rel_pagamentos"/></span>
		</a>
		
		<a href="${pageContext.request.contextPath}/view/jasper/relatorio.do?relatorio='GASTO'" class="dashboard-module"> <img
			src="${pageContext.request.contextPath}/view/images/gastos.png"
			width="64" height="64" alt="edit" /> <span><fmt:message key="rel_gastos"/></span>
		</a>
		
		<a href="${pageContext.request.contextPath}/view/jasper/relatorio.do?relatorio='DESPESA'" class="dashboard-module"> <img
			src="${pageContext.request.contextPath}/view/images/despesas.png"
			width="64" height="64" alt="edit" /> <span><fmt:message key="rel_despesas"/></span>
		</a>-->
		<a href="${pageContext.request.contextPath}/view/jasper/relatorio.do?relatorio=1" class="dashboard-module"> <img
			src="${pageContext.request.contextPath}/view/images/aluno_.png"
			width="64" height="64" alt="edit" /> <span><fmt:message key="rel_alunos"/></span>
		</a> <a href="${pageContext.request.contextPath}/view/jasper/relatorio.do?relatorio=2" class="dashboard-module"> <img
			src="${pageContext.request.contextPath}/view/images/professor_.png"
			width="64" height="64" alt="edit" /> <span><fmt:message key="rel_professores"/></span>
		 </a> 
		 <a href="${pageContext.request.contextPath}/view/jasper/relatorio.do?relatorio=3" class="dashboard-module"> <img
			src="${pageContext.request.contextPath}/view/images/turma.png"
			width="64" height="64" alt="edit" /> <span><fmt:message key="rel_turmas"/></span>
		</a> 
		 <a href="${pageContext.request.contextPath}/view/jasper/relatorio.do?relatorio=4" class="dashboard-module"> <img
			src="${pageContext.request.contextPath}/view/images/modalidade.png"
			width="64" height="64" alt="edit" /> <span><fmt:message key="rel_modalidades"/></span>
		</a>
		<a href="${pageContext.request.contextPath}/view/jasper/relatorio.do?relatorio=5" class="dashboard-module"> <img
			src="${pageContext.request.contextPath}/view/images/pagamento.png"
			width="64" height="64" alt="edit" /> <span><fmt:message key="rel_pagamentos"/></span>
		</a>
		
		<a href="${pageContext.request.contextPath}/view/jasper/relatorio.do?relatorio=6" class="dashboard-module"> <img
			src="${pageContext.request.contextPath}/view/images/gastos.png"
			width="64" height="64" alt="edit" /> <span><fmt:message key="rel_gastos"/></span>
		</a>
		
		<a href="${pageContext.request.contextPath}/view/jasper/relatorio.do?relatorio=7" class="dashboard-module"> <img
			src="${pageContext.request.contextPath}/view/images/despesas.png"
			width="64" height="64" alt="edit" /> <span><fmt:message key="rel_despesas"/></span>
		</a>
		<div style="clear: both"></div>
	</div>
	<!-- End .grid_7 -->
	<!-- Account overview -->
	<div class="grid_5">
		<div class="module">
			<h2>
				<span><fmt:message key="conta"/></span>
			</h2>

			<div class="module-body">

				<p>
					<strong><fmt:message key="usuario"/></strong>: ${sessionScope.acesso.pessoa.nome}<br /> 
				</p>

			</div>
		</div>
		<div style="clear: both;"></div>
	</div>
	<!-- End .grid_5 -->
	<div style="clear: both;"></div>
</div>
<!-- End .container_12 -->
<c:import url="../../includes/footer.jsp" />