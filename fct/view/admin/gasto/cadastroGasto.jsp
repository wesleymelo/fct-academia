<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:import url="../../includes/header.jsp" />

<script type="text/javascript">
	function abrir(programa,janela)
	{
   		if(janela=="") janela = "janela";
   			window.open(programa,janela,'height=350,width=640');
	}
</script>


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
			 <h2><span><fmt:message key="cadastroGasto" /></span></h2>         
					
			<div class="module-body">

				<form action="cadastroGasto.do" method="post">
					
					<input type="hidden" value="1" name="ps">
					<input type="hidden" value="1" name="pg">
					<input type="hidden" value="${secret.idPessoa }" name="idPessoa">
					<input type="hidden" value="${id}" name="id" id="id">
					
					
					<p>
						<label><fmt:message key="desc"/></label>
						<input type="text" class="input-short" name="secretaria" id="secretaria" readonly="readonly" value="${secret.nome}"/>
					</p>					
					
					<p>
                        <label><fmt:message key="despesas"/></label>
                        <input type="text" class="input-short" name="despesa" id="despesa" readonly="readonly" value="${despesa}" /><a href="javascript:abrir('buscaDespesa.do')"> <fmt:message key="buscar"/> </a>
                        <c:if test="${not empty erros['errodespesa'] }">
							<span class="notification-input ni-error"><fmt:message key="secretaria_invalido"/></span>
						</c:if>                        
					</p>
			
					<p>
						<label><fmt:message key="valor"/></label>
						<input type="text" class="input-short-short" name="valor" id="valor" value="${valor}"/>
						<c:if test="${not empty erros['errovalor'] }">
							<span class="notification-input ni-error"><fmt:message key="valor_invalido"/></span>
						</c:if>
					</p>
					
					<p>
						<label><fmt:message key="dataPag"/></label>
						<input type="text" class="input-short-short" name="data" id="data" value="${data}"/>
						<c:if test="${not empty erros['errodata'] }">
							<span class="notification-input ni-error"><fmt:message key="data_invalido"/></span>
						</c:if>
						
						<script>
							$(function() {
								$( "#data").datepicker({
									changeMonth: true,
									changeYear: true
								});
							});
						</script>
						
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
