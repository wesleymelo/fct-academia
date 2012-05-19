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
						href="${pageContext.request.contextPath}/view/admin/aluno/listaAlunos.do"
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
			 <h2><span><fmt:message key="cadastroAluno" /></span></h2>         
					
			<div class="module-body">

				<form action="cadastroAluno.do" method="post">

					<input type="hidden" name="pg" value="1" />

					<p>
						<label><fmt:message key="nome"/></label>
						<input type="text" class="input-short" name="nome" id="nome" value="${param.nome }"/>
						<c:if test="${not empty erros['erronome'] }">
							<span class="notification-input ni-error"><fmt:message key="nome_invalido"/></span>
						</c:if>
						
					</p>					
					
					<p>
                        <label><fmt:message key="nascimento"/></label> 
                        <input type="text" class="input-short-short" readonly="readonly" name="dataNasc" id="dataNasc" value="${param.dataNasc }" />
                        <c:if test="${not empty erros['errodataNasc'] }">
							<span class="notification-input ni-error"><fmt:message key="dataNasc_invalido"/></span>
						</c:if>  
						
						
						<!--  -->
						<script>
							$(function() {
								$( "#dataNasc").datepicker({
									changeMonth: true,
									changeYear: true
								});
							});
						</script>
						                      
					</p>

					<fieldset>
						<ul>
							<li><label><fmt:message key="sexo"/>:&nbsp;&nbsp;&nbsp;<input type="radio" name="sexo"	checked="checked" id="sexo" value="F" />&nbsp;&nbsp;<fmt:message key="feminino"/>&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="sexo" id="sexo" value="M" />&nbsp;&nbsp;<fmt:message key="masculino"/></label></li>
						</ul>
					</fieldset>
					<p>
					
						<label><fmt:message key="cpf"/></label> 
						<input type="text" class="input-short-short" name="cpf" id="cpf" value="${param.cpf }" />
						<c:if test="${not empty erros['errocpf'] }">
							<span class="notification-input ni-error"><fmt:message key="cpf_invalido"/></span>
						</c:if>                        
					
					</p>
				
					<p>
						<label><fmt:message key="email"/></label> 
						<input type="text" class="input-short" name="email" id="email" value="${param.email }"/>
						<c:if test="${not empty erros['erroemail'] }">
							<span class="notification-input ni-error"><fmt:message key="email_invalido"/></span>
						</c:if>                        
					<p>
					
					<p>	
						<label><fmt:message key="celular"/></label>
						<input type="text" class="input-short-short" name="celular" id="celular" value="${param.celular }" />
						<c:if test="${not empty erros['errocelular'] }">
							<span class="notification-input ni-error"><fmt:message key="telefone_invalido"/></span>
						</c:if>                        
					</p>
					
					

					<p>
						<label><fmt:message key="residencial"/></label> 
						<input type="text" class="input-short-short" name="residencial" id="residencial" value="${param.residencial }"/> 
						<c:if test="${not empty erros['errocelular'] }">
							<span class="notification-input ni-error"><fmt:message key="telefone_invalido"/></span>
						</c:if>                        
					</p>
					
					
					
					<p>
						<label><fmt:message key="comercial"/></label> 
						<input type="text" class="input-short-short" name="comercial" id="comercial" value="${param.comercial }"/> 
						<c:if test="${not empty erros['errocomercial'] }">
							<span class="notification-input ni-error"><fmt:message key="telefone_invalido"/></span>
						</c:if> 
					</p>
					
					<script>
						jQuery(function($){
							$("#cpf").mask("999.999.999-99");
							$("#celular").mask("(99)9999-9999");
  							$("#residencial").mask("(99)9999-9999");
      						$("#comercial").mask("(99)9999-9999");
      						});
					</script>
					
					<p>
						<label><fmt:message key="altura"/></label> <input type="text" class="input-short-short" name="altura" value="${param.altura }" id="altura" />
						<c:if test="${not empty erros['erroaltura'] }">
							<span class="notification-input ni-error"><fmt:message key="altura_invalida"/></span>
						</c:if> 
					</p>

					<p>
						<label><fmt:message key="peso"/></label> 
						<input type="text" class="input-short-short" name="peso" id="peso" value="${param.peso }" />
						<c:if test="${not empty erros['erropeso'] }">
							<span class="notification-input ni-error"><fmt:message key="peso_invalido"/></span>
						</c:if>
					</p>

					<fieldset>
						<input class="submit-green" type="submit" value="<fmt:message key="bt_proximo"/>" /> <input
						class="submit-gray" type="submit" value="<fmt:message key="bt_cancelar"/>" />
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
