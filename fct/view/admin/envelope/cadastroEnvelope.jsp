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
			 <h2><span><fmt:message key="cadastroEnvelope" /></span></h2>         
					
			<div class="module-body">

				<form action="cadastroEnvelope.do" method="post">
					
					<input type="hidden" value="1" name="ps">
					<input type="hidden" value="1" name="pg">
					<input type="hidden" value="${secret.idPessoa }" name="idPessoa">
					<input type="hidden" value="${idProfessor}" name="idProfessor" id="idProfessor">
					
					
					<p>
						<label><fmt:message key="secretaria"/></label>
						<input type="text" class="input-short" name="secretaria" id="secretaria" readonly="readonly" value="${secret.nome}"/>
					</p>					
					
					<p>
                        <label><fmt:message key="professor"/></label>
                        <input type="text" class="input-short" name="professor" id="professor" readonly="readonly" value="${professor}" /><a href="javascript:abrir('buscaProfessorEnvelope.do')"> <fmt:message key="buscar"/> </a>
                        <c:if test="${not empty erros['erroprofessor'] }">
							<span class="notification-input ni-error"><fmt:message key="professor_invalido"/></span>
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
