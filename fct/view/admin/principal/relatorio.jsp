<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>

<c:import url="../../includes/header.jsp" />

<!-- Dashboard icons -->
<div class="container_12">
	<div class="grid_7">
		<a href="${pageContext.request.contextPath}/view/admin/aluno/listaAlunos.do" class="dashboard-module"> <img
			src="${pageContext.request.contextPath}/view/images/aluno_.png"
			width="64" height="64" alt="edit" /> <span><fmt:message key="rel_alunos"/></span>
		</a> <a href="${pageContext.request.contextPath}/view/admin/professor/listaProfessores.do" class="dashboard-module"> <img
			src="${pageContext.request.contextPath}/view/images/professor_.png"
			width="64" height="64" alt="edit" /> <span><fmt:message key="rel_professores"/></span>
		 </a> <!--<a href="${pageContext.request.contextPath}/view/admin/secretaria/listaSecretarias.do" class="dashboard-module"> <img
			src="${pageContext.request.contextPath}/view/images/secretaria.png"
			width="64" height="64" alt="edit" /> <span><fmt:message key="secretarias"/></span> 
		</a> --><a href="${pageContext.request.contextPath}/view/admin/turma/listaTurmas.do" class="dashboard-module"> <img
			src="${pageContext.request.contextPath}/view/images/turma.png"
			width="64" height="64" alt="edit" /> <span><fmt:message key="rel_turmas"/></span>
		</a> <!--<a href="${pageContext.request.contextPath}/view/admin/pacote/listaPacotes.do" class="dashboard-module"> <img
			src="${pageContext.request.contextPath}/view/images/pacote.png"
			width="64" height="64" alt="edit" /> <span><fmt:message key="pacotes"/></span>
		</a>--> <a href="${pageContext.request.contextPath}/view/admin/modalidade/listaModalidades.do" class="dashboard-module"> <img
			src="${pageContext.request.contextPath}/view/images/modalidade.png"
			width="64" height="64" alt="edit" /> <span><fmt:message key="rel_modalidades"/></span>
		</a><!-- <a href="${pageContext.request.contextPath}/view/admin/graduacao/listaGraduacoes.do" class="dashboard-module"> <img
			src="${pageContext.request.contextPath}/view/images/graduacao_.png"
			width="64" height="64" alt="edit" /> <span><fmt:message key="graduacoes"/></span>
		</a>-->
		<a href="${pageContext.request.contextPath}/view/admin/pagamento/listaPagamentos.do" class="dashboard-module"> <img
			src="${pageContext.request.contextPath}/view/images/pagamento.png"
			width="64" height="64" alt="edit" /> <span><fmt:message key="rel_pagamentos"/></span>
		</a>
		<a href="${pageContext.request.contextPath}/view/admin/envelope/listaEnvelopes.do" class="dashboard-module"> <img
			src="${pageContext.request.contextPath}/view/images/envelope.png"
			width="64" height="64" alt="edit" /> <span><fmt:message key="rel_envelopes"/></span>
		</a>
		<a href="${pageContext.request.contextPath}/view/admin/gasto/listaGastos.do" class="dashboard-module"> <img
			src="${pageContext.request.contextPath}/view/images/gastos.png"
			width="64" height="64" alt="edit" /> <span><fmt:message key="rel_gastos"/></span>
		</a>
		
		<a href="${pageContext.request.contextPath}/view/admin/despesa/listaDespesas.do" class="dashboard-module"> <img
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