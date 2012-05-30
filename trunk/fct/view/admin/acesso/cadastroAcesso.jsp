<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:import url="../../includes/header.jsp" />

<div class="container_12">
	
	<div class="grid_12">
		
		<!-- Button -->
		<div class="float-right">
		
			<div class="bottom-spacing">
	
				<!-- Button -->
				<div class="float-right">
					<a
						href="${pageContext.request.contextPath}/view/admin/aluno/listaPacotes.do"
						class="button"> <span><b><fmt:message key="back" /></b>
							<img
							src="${pageContext.request.contextPath}/view/images/arrow-curve-180-left.gif"
							tppabs="http://www.xooom.pl/work/magicadmin/images/arrow-curve-180-left.gif"
							width="12" height="9" alt="<fmt:message key="back" />" /> </span>
					</a>
				</div>
				<div style="clear: both;"></div>
			</div>
			<div style="clear: both;"></div>
		</div>	
		<div style="clear: both;"></div>
	</div>
	<div style="clear: both;"></div>   
	
	<!-- Form elements -->
	<div class="grid_12">

		<div class="module">
			 <h2>
				<span><fmt:message key="cadastroAcesso"/></span>
			</h2>
					
			<div class="module-body">

				<form action="cadastroAcesso.do" method="post">
					
					<input type="hidden" name="idSecretaria" id="idSecretaria" value="${id}" />
					
					<p>
                        <label><fmt:message key="secretaria"/></label>
                        <input type="text" class="input-short" name="secretaria" id="secretaria" readonly="readonly" value="${secretaria}" /><a href="javascript:abrir('buscaSecretariaAcesso.do')"> <fmt:message key="buscar"/> </a>
                        <c:if test="${not empty erros['errosecretaria'] }">
							<span class="notification-input ni-error"><fmt:message key="secretaria_invalido"/></span>
						</c:if>                        
					</p>
					
					<p>
						<label><fmt:message key="senha"/></label>
						<input type="text" class="input-short" name="senha" id="senha" value="${senha}"/>
						<c:if test="${not empty erros['errosenha'] }">
							<span class="notification-input ni-error"><fmt:message key="senha_invalida"/></span>
						</c:if>
					</p>
					
					<p>
						<label><fmt:message key="repetesenha"/></label>
						<input type="text" class="input-short" name="repetesenha" id="repetesenha" value="${repetesenha}"/>
						<c:if test="${not empty erros['errorepetesenha'] }">
							<span class="notification-input ni-error"><fmt:message key="repetesenha_invalida"/></span>
						</c:if>
					</p>
															
					<fieldset>
						<input class="submit-green" type="submit" value="<fmt:message key="cadastrar"/>" /> <input
						class="submit-gray" type="reset" value="<fmt:message key="limpar"/>" />
					</fieldset>

				</form>
			</div>
			<!-- End .module-body -->

		</div>
		<!-- End .module -->
		<div style="clear: both;"></div>
	</div>
	<!-- End .grid_12 -->
	<div style="clear: both;"></div>
</div>
<!-- End .container_12 -->

<c:import url="../../includes/footer.jsp" />
