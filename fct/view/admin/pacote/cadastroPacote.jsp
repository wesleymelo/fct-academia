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
			 <h2><span><fmt:message key="cadastroPacote" /></span></h2>         
					
			<div class="module-body">

				<form action="cadastroPacote.do" method="post">
					
					<input type="hidden" value="1" name="pg">
					
					<p>
						<label><fmt:message key="desc"/></label>
						<input type="text" class="input-short" name="descricao" id="descricao" value="${descricao}"/>
						<c:if test="${not empty erros['errodescricao'] }">
							<span class="notification-input ni-error"><fmt:message key="descricao_invalido"/></span>
						</c:if>
					</p>					
			
					<p>
						<label><fmt:message key="preco"/></label>
						<input type="text" class="input-short-short" name="preco" id="preco" value="${preco}"/>
						<c:if test="${not empty erros['erropreco'] }">
							<span class="notification-input ni-error"><fmt:message key="preco_invalido"/></span>
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
