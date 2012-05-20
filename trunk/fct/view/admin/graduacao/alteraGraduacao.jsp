<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:import url="../../includes/header.jsp" />

<div class="container_12">
	
	<!-- Form elements -->
	<div class="grid_12">
		
		<div class="bottom-spacing">
			<!-- Button -->
			<div class="float-right">
				<a
					href="${pageContext.request.contextPath}/view/admin/aluno/listaGraduacoes.do"
					class="button"> <span><b><fmt:message key="new" /></b>
						<img
						src="${pageContext.request.contextPath}/view/images/arrow-curve-180-left.gif"
						tppabs="http://www.xooom.pl/work/magicadmin/images/arrow-curve-180-left.gif"
						width="12" height="9" alt="<fmt:message key="new" />" /> </span>
				</a>
			</div>
			<div style="clear: both;"></div>
		</div>
		<div style="clear: both;"></div>	
		
		<div class="module">
			
			<h2>
				<span>Cadastro Aluno</span>
			</h2>

			
			<div class="module-body">

				<form action="cadastroGraduacao.do?codigo=${codigo }" method="post">
	
					<input type="hidden" value="3" name="pg">
					
					<p>
						<label><fmt:message key="desc"/></label>
						<input type="text" class="input-short" name="descricao" id="descricao" value="${descricao}"/>
						<c:if test="${not empty erros['errodescricao'] }">
							<span class="notification-input ni-error"><fmt:message key="descricao_invalido"/></span>
						</c:if>
					</p>					
			
					<label>Modalidade&nbsp;&nbsp;&nbsp;&nbsp;
						<select class="input" name="modali" >
							<c:forEach items="${modalidades }" var="modal" >
								<option value="${modal.idModalidade }"
									<c:if test="${modali == modal.idModalidade }">
										 selected="selected"
									</c:if>
								><c:out value="${modal.descricao }" /></option>
							</c:forEach>
						</select>
					</label>
					
					<fieldset>
						<input class="submit-green" type="submit" value="<fmt:message key="cadastrar"/>" /> <input
						class="submit-gray" type="reset" value="<fmt:message key="limpar"/>" />
					</fieldset>

				</form>

			</div>
			<!-- End .module-body -->
			<div style="clear: both;"></div>
		</div>
		<!-- End .module -->
		<div style="clear: both;"></div>
	</div>
	<!-- End .grid_12 -->
	<div style="clear: both;"></div>
</div>
<!-- End .container_12 -->

<c:import url="../../includes/footer.jsp" />
