<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:import url="../../includes/header.jsp" />

<div id="boxes">



<div id="dialog" class="window">
	<a href="#" class="close"><fmt:message key="fechar"/></a>
			
</div>

<div id="mask"></div>

</div>

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
			<h2>
				<span><fmt:message key="cadastroTurma"/></span>
			</h2>
					
			<div class="module-body">

				<form action="cadastroTurma.do" method="post">

					<p>
						<label><fmt:message key="nome"/></label>
						<input type="text" class="input-short" name="nome" id="nome" value="${param.nome }"/>
						<c:if test="${not empty erros['erronome'] }">
							<span class="notification-input ni-error"><fmt:message key="nome_invalido"/></span>
						</c:if>
						
					</p>
					
					<p>
                        <label><fmt:message key="horarioInicial"/></label> 
                        <input type="text" class="input-short-short" name="horarioInicial" id="horarioInicial" value="${param.horarioInicial }" />
                        <c:if test="${not empty erros['erroHorarioInicial'] }">
							<span class="notification-input ni-error"><fmt:message key="horarioInicial_invalido"/></span>
						</c:if>                        
					</p>
					
					
					<p>
                        <label><fmt:message key="horarioFinal"/></label>
                        <input type="text" class="input-short-short" name="horarioFinal" id="horarioFinal" value="${param.horarioFinal }" />
                        <c:if test="${not empty erros['erroHorarioFinal'] }">
							<span class="notification-input ni-error"><fmt:message key="horarioFinal_invalido"/></span>
						</c:if>                        
					</p>
					
					<script>
						jQuery(function($){
      							$("#horarioInicial").mask("99:99");
      							$("#horarioFinal").mask("99:99");
      						});
					</script>

					<p>
                        <label><fmt:message key="professor"/></label>
                        <input type="text" class="input-short-short" name="professor" id="professor" readonly="readonly" value="${param.professor}" /><a href="#dialog" name="modal"> <fmt:message key="buscar"/></a>
                        <c:if test="${not empty erros['erroProfessor'] }">
							<span class="notification-input ni-error"><fmt:message key="professor_invalido"/></span>
						</c:if>                        
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
					
					<script>
						jQuery(function($){
      							$("#cpf").mask("999.999.999-99");
      						});
					</script>

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
					
					<script>
						jQuery(function($){
      							$("#celular").mask("(99)9999-9999");
      						});
					</script>

					<p>
						<label><fmt:message key="residencial"/></label> 
						<input type="text" class="input-short-short" name="residencial" id="residencial" value="${param.residencial }"/> 
						<c:if test="${not empty erros['errocelular'] }">
							<span class="notification-input ni-error"><fmt:message key="telefone_invalido"/></span>
						</c:if>                        
					</p>
					
					<script>
						jQuery(function($){
      							$("#residencial").mask("(99)9999-9999");
      						});
					</script>
					
					<p>
						<label><fmt:message key="comercial"/></label> 
						<input type="text" class="input-short-short" name="comercial" id="comercial" value="${param.comercial }"/> 
						<c:if test="${not empty erros['errocomercial'] }">
							<span class="notification-input ni-error"><fmt:message key="telefone_invalido"/></span>
						</c:if> 
					</p>
					
					<script>
						jQuery(function($){
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
						<input class="submit-green" type="submit" value="Próximo" /> <input
						class="submit-gray" type="submit" value="Cancelar" />
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
