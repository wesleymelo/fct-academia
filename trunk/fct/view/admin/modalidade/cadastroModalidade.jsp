<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:import url="../../includes/header.jsp" />

<div class="container_12">

	<!-- Form elements -->
	<div class="grid_12">

		<div class="module">
			<h2>
				<span><fmt:message key="cadastroModalidade"/></span>
			</h2>

			<div class="module-body">

				<form action="cadastroModalidade.do" method="post">

					<p>
						<label><fmt:message key="desc"/></label>
						<input type="text" class="input-short" name="desc" id="desc" value="${param.desc }"/>
						<c:if test="${not empty erros['errodesc'] }">
							<span class="notification-input ni-error"><fmt:message key="desc_invalida"/></span>
						</c:if>
					</p>

					<fieldset>
						<input class="submit-green" type="submit" value="<fmt:message key='cadastrar'/>" /> 
						<input class="submit-gray" type="reset" value="<fmt:message key='limpar'/>" />
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
