<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<c:import url="../../includes/header.jsp" />




<div class="container_12">

	<!-- Form elements -->
	<div class="grid_12">

		<div class="module">
			<h2>
				<span><fmt:message key="cadastroProfessor" /></span>
			</h2>

			<div class="module-body">

				<form action="cadastroProfessor.do" method="post">

					<input type="hidden" name="pg" value="1" />

					<p>
						<label><fmt:message key="nome" /></label> <input type="text"
							class="input-short" name="nome" id="nome" value="${nome }" />
						<c:if test="${not empty erros['erronome'] }">
							<span class="notification-input ni-error"><fmt:message
									key="nome_invalido" /></span>
						</c:if>

					</p>

					<p>
						<label><fmt:message key="nascimento" /></label> <input type="text"
							class="input-short-short" name="dataNasc" id="dataNasc"
							value="${dataNasc }" />
						<c:if test="${not empty erros['errodataNasc'] }">
							<span class="notification-input ni-error"><fmt:message
									key="dataNasc_invalido" /></span>
						</c:if>
					</p>

					<<!--  -->
						<script>
							$(function() {
								$( "#dataNasc").datepicker({
									changeMonth: true,
									changeYear: true
								});
							});
						</script>
						    

					<fieldset>
						<ul>
							<li><label><fmt:message key="sexo" />:&nbsp;&nbsp;&nbsp;<input
									type="radio" name="sexo" checked="checked" id="sexo" value="F" />&nbsp;&nbsp;<fmt:message
										key="feminino" />&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio"
									name="sexo" id="sexo" value="M" />&nbsp;&nbsp;<fmt:message
										key="masculino" /></label></li>
						</ul>
					</fieldset>
					<p>

						<label><fmt:message key="cpf" /></label> <input type="text"
							class="input-short-short" name="cpf" id="cpf"
							value="${cpf }" />
						<c:if test="${not empty erros['errocpf'] }">
							<span class="notification-input ni-error"><fmt:message
									key="cpf_invalido" /></span>
						</c:if>

					</p>

					<script>
						jQuery(function($){
      							$("#cpf").mask("999.999.999-99");
      						});
					</script>

					<p>
						<label><fmt:message key="email" /></label> <input type="text"
							class="input-short" name="email" id="email"
							value="${email }" />
						<c:if test="${not empty erros['erroemail'] }">
							<span class="notification-input ni-error"><fmt:message
									key="email_invalido" /></span>
						</c:if>
					<p>
					<p>
						<label><fmt:message key="celular" /></label> <input type="text"
							class="input-short-short" name="celular" id="celular"
							value="${celular }" />
						<c:if test="${not empty erros['errocelular'] }">
							<span class="notification-input ni-error"><fmt:message
									key="telefone_invalido" /></span>
						</c:if>
					</p>

					<script>
						jQuery(function($){
      							$("#celular").mask("(99)9999-9999");
      						});
					</script>

					<p>
						<label><fmt:message key="residencial" /></label> <input
							type="text" class="input-short-short" name="residencial"
							id="residencial" value="${residencial }" />
						<c:if test="${not empty erros['errocelular'] }">
							<span class="notification-input ni-error"><fmt:message
									key="telefone_invalido" /></span>
						</c:if>
					</p>
					<script>
						jQuery(function($){
      							$("#residencial").mask("(99)9999-9999");
      						});
					</script>

					<p>
						<label><fmt:message key="comercial" /></label> <input type="text"
							class="input-short-short" name="comercial" id="comercial"
							value="${comercial }" />
						<c:if test="${not empty erros['errocomercial'] }">
							<span class="notification-input ni-error"><fmt:message
									key="telefone_invalido" /></span>
						</c:if>
					</p>

					<script>
						jQuery(function($){
      							$("#comercial").mask("(99)9999-9999");
      						});
					</script>
					<p>
						<label><fmt:message key="dataAdmissao" /></label> <input
							type="text" class="input-short" name="dataAdmissao"
							id="dataAdmissao" value="${dataAdmissao }" />
						<c:if test="${not empty erros['dataAdmissao'] }">
							<span class="notification-input ni-error"><fmt:message
									key="dataAdmissao_invalido" /></span>
						</c:if>
					</p>
				<<!--  -->
						<script>
							$(function() {
								$( "#dataAdmissao").datepicker({
									changeMonth: true,
									changeYear: true
								});
							});
						</script>

					<fieldset>
						<input class="submit-green" type="submit"
							value="<fmt:message key="bt_proximo"/>" /> <input
							class="submit-gray" type="submit"
							value="<fmt:message key="bt_cancelar"/>" />
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