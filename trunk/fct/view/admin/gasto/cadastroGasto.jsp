


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
						href="${pageContext.request.contextPath}/view/admin/gasto/listaGasto.do"
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
			<h2><span><fmt:message key="cadastroGasto" /></span></h2>
					
			<div class="module-body">

				<form action="cadastroGasto.do" method="post">

					<p>
						<!-- id da secretaria, sem a opção de alterar -->
						<label><fmt:message key="pessoaResp"/></label>
						<input type='text' name='nomeSecretaria' value="${sessionScope.acesso.pessoa.nome }" readonly="readonly">
						<!-- ${sessionScope.acesso.pessoa.idPessoa} // pegar idSecretaria... -->
					</p>

					<p>
						<!-- lightbox com todas as despesas, para gerar os gastos -->
						
						
					</p>
					
					<p>
						<!-- data -->
						<label><fmt:message key="dataPag"/></label> 
                        <input type="text" class="input-short-short" name="dataPag" id="dataPag" value="${param.dataPag }" />
                        <c:if test="${not empty erros['errodataPag'] }">
							<span class="notification-input ni-error"><fmt:message key="dataPag_invalido"/></span>
						</c:if>
					</p>

					<script>
						jQuery(function($){
      							$("#dataPag").mask("99/99/9999");
      						});
					</script>					
					
					<fieldset>
						<input class="submit-green" type="submit" value="<fmt:message key="cadastrar"/>" /> 
						<input class="submit-gray" type="submit" value="<fmt:message key="bt_cancelar"/>" />
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
