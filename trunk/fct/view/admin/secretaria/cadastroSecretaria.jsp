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
				<fmt:message key = "cadastraSecretaria"/>
			</h2>

			<div class="module-body">

				<form action="cadastroSecretaria.do" method="post">

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
                        <input type="text" class="input-short-short" name="dataNasc" id="dataNasc" value="${param.dataNasc }" />
                        <c:if test="${not empty erros['errodataNasc'] }">
							<span class="notification-input ni-error"><fmt:message key="dataNasc_invalido"/></span>
						</c:if>                        
					</p>
					
					<script>
							jQuery(function($){
      							$("#dataNasc").mask("99/99/9999");
      						});
					</script>

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
					

							<label><fmt:message key="salario" /></label> <input type="text" class="input-short"
								name="salario" value="${salario}" id="salario" /> <span
								class="notification-input ni-correct">This is correct,
								thanks!</span>
							</p>
							
							<p>
								<label><fmt:message key="horarioInicial" /></label> <input type="text"
									class="input-short-short" name="horarioInicial"
									value="${horarioInicial}" readonly="readonly" id="horarioInicial" /> <span
									class="notification-input ni-correct">This is correct,
									thanks!</span>
							</p>
							
							<p>
								<label><fmt:message key="horarioFinal" /></label> <input type="text" class="input-short-short"
									name="horarioFinal" readonly="readonly" value="${horarioFinal}" id="horarioFinal" />
								<span class="notification-input ni-correct">This is
									correct, thanks!</span>
							</p>
							
							
							<script>
							
							$(document).ready(function() {
							    $('#horarioInicial').timepicker({
							        showLeadingZero: false,
							        onHourShow: tpStartOnHourShowCallback,
							        onMinuteShow: tpStartOnMinuteShowCallback
							    });
							    $('#horarioFinal').timepicker({
							        showLeadingZero: false,
							        onHourShow: tpEndOnHourShowCallback,
							        onMinuteShow: tpEndOnMinuteShowCallback
							    });
							});

							function tpStartOnHourShowCallback(hour) {
							    var tpEndHour = $('#horarioFinal').timepicker('getHour');
							    // Check if proposed hour is prior or equal to selected end time hour
							    if (hour <= tpEndHour) { return true; }
							    // if hour did not match, it can not be selected
							    return false;
							}
							function tpStartOnMinuteShowCallback(hour, minute) {
							    var tpEndHour = $('#horarioFinal').timepicker('getHour');
							    var tpEndMinute = $('#horarioFinal').timepicker('getMinute');
							    // Check if proposed hour is prior to selected end time hour
							    if (hour < tpEndHour) { return true; }
							    // Check if proposed hour is equal to selected end time hour and minutes is prior
							    if ( (hour == tpEndHour) && (minute < tpEndMinute) ) { return true; }
							    // if minute did not match, it can not be selected
							    return false;
							}

							function tpEndOnHourShowCallback(hour) {
							    var tpStartHour = $('#horarioInicial').timepicker('getHour');
							    // Check if proposed hour is after or equal to selected start time hour
							    if (hour >= tpStartHour) { return true; }
							    // if hour did not match, it can not be selected
							    return false;
							}
							function tpEndOnMinuteShowCallback(hour, minute) {
							    var tpStartHour = $('#horarioInicial').timepicker('getHour');
							    var tpStartMinute = $('#horarioInicial').timepicker('getMinute');
							    // Check if proposed hour is after selected start time hour
							    if (hour > tpStartHour) { return true; }
							    // Check if proposed hour is equal to selected start time hour and minutes is after
							    if ( (hour == tpStartHour) && (minute > tpStartMinute) ) { return true; }
							    // if minute did not match, it can not be selected
							    return false;
							}
							
							
							
							</script>
														
							
							<p>
								<label><fmt:message key="dataAdmissao" /></label> <input type="text"
									class="input-short" name="dataAdmissao" value="${dataAdmissao}"
									id="dataAdmissao" /> <span
									class="notification-input ni-correct">This is correct,
									thanks!</span>
							</p>
							<script>
								jQuery(function($) {
									$("#dataAdmissao").mask("99/99/9999");
								});
							</script>
							<fieldset>
								<input class="submit-green" type="submit" value= "<fmt:message key="botao.proximo "/>"> 
								<input class="submit-gray" type="submit" value= " <fmt:message key="botao.cancelar " />" />
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
