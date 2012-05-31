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
				<fmt:message key="cadastroSecretaria" />
			</h2>

			<div class="module-body">

				<form action="cadastroSecretaria.do?codigo=${codigo }" method="post">

					<input type="hidden" name="pg" value="3" />
					<input type="hidden" name="idPessoa" value="${idPessoa}" />
					
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
							class="input-short-short" readonly="readonly" name="dataNasc"
							id="dataNasc" value="${dataNasc }" />
						<c:if test="${not empty erros['errodataNasc'] }">
							<span class="notification-input ni-error"><fmt:message
									key="dataNasc_invalido" /></span>
						</c:if>


						<!--  -->
						<script>
								$("#dataNasc").datepicker({
									changeMonth: true,
									changeYear: true
								});
							
						</script>

					</p>

					<fieldset>
						<ul>
							<li><label><fmt:message key="sexo" />:&nbsp;&nbsp;&nbsp;

									<input type="radio" name="sexo"
									<c:if test="${empty sexo or (sexo eq 'F') }">
									checked="checked"
								</c:if>
									id="sexo" value="F" /> &nbsp;&nbsp;<fmt:message key="feminino" />&nbsp;&nbsp;&nbsp;&nbsp;

									<input type="radio"
									<c:if test="${(sexo eq 'M') }">
									checked="checked"
							</c:if>
									name="sexo" id="sexo" value="M" /> &nbsp;&nbsp;<fmt:message
										key="masculino" /></label></li>
						</ul>
					</fieldset>

					<p>

						<label><fmt:message key="cpf" /></label> <input type="text"
							class="input-short-short" name="cpf" id="cpf" value="${cpf }" />
						<c:if test="${not empty erros['errocpf'] }">
							<span class="notification-input ni-error"><fmt:message
									key="cpf_invalido" /></span>
						</c:if>

					</p>

					<p>
						<label><fmt:message key="email" /></label> <input type="text"
							class="input-short" name="email" id="email" value="${email }" />
						<c:if test="${not empty erros['erroemail'] }">
							<span class="notification-input ni-error"><fmt:message
									key="email_invalido" /></span>
						</c:if>
						<p><p>	
						<label><fmt:message key="celular" /></label>
						<input type="text" class="input-short-short" name="celular"
							id="celular" value="${celular }" />
						<c:if test="${not empty erros['errocelular'] }">
							<span class="notification-input ni-error"><fmt:message
									key="telefone_invalido" /></span>
						</c:if>                        
					</p>
					
					

					<p>
						<label><fmt:message key="residencial" /></label> 
						<input type="text" class="input-short-short" name="residencial"
							id="residencial" value="${residencial }" /> 
						<c:if test="${not empty erros['erroresidencial'] }">
							<span class="notification-input ni-error"><fmt:message
									key="telefone_invalido" /></span>
						</c:if>                        
					</p>
					
					
					
					<p>
						<label><fmt:message key="comercial" /></label> 
						<input type="text" class="input-short-short" name="comercial"
							id="comercial" value="${comercial }" /> 
						<c:if test="${not empty erros['errocomercial'] }">
							<span class="notification-input ni-error"><fmt:message
									key="telefone_invalido" /></span>
						</c:if> 
					</p>
					
					<script>
						
							$("#cpf").mask("999.999.999-99");
							$("#celular").mask("(99)9999-9999");
  							$("#residencial").mask("(99)9999-9999");
      						$("#comercial").mask("(99)9999-9999");
      					
					</script>
					
					<p>
						
					</p>
					
					<label><fmt:message key="dataAdmissao" /></label> 
                        <input type="text" class="input-short-short"
						readonly="readonly" name="dataAdmissao" id="dataAdmissao"
						value="${dataAdmissao }" />
                    <c:if test="${not empty erros['errodataAdmissao'] }">
                    		<span class="notification-input ni-error"><fmt:message
								key="dataAdmissao_invalido" /></span>
					</c:if>
					<c:if test="${not empty erros['errodataAdmIguaNasc'] }">
                    		<span class="notification-input ni-error"><fmt:message
								key="dataAdmissaoIgualDataNasc_invalido" /></span>
					</c:if>
				<!--  -->
						<script>
							$( "#dataAdmissao ").datepicker({
									changeMonth: true,
									changeYear: true
								});
						</script>

							
							<label><fmt:message key="salario" /></label> <input type="text"
							class="input-short" name="salario" value="${salario}"
							id="salario" /> 
							<c:if test="${not empty erros['errosalario'] }">
                    		<span class="notification-input ni-error"><fmt:message
								key="salario_invalido" /></span>
						  </c:if>
							
					</p>
					
					
					
					
					
					
					
					
					<p>
								<label><fmt:message key="horarioInicial" /></label> <input
							type="text" class="input-short" name="horarioInicial"
							value="${horarioInicial}" id="horarioInicial" readonly="readonly" />
							
							 <c:if test="${not empty erros['errohorarioInicial'] }">
                    		<span class="notification-input ni-error"><fmt:message
								key="horarioInicial_invalido" /></span>
						  </c:if>
					
					</p>
							
							<p>
								<label><fmt:message key="horarioFinal" /></label> <input
							type="time" class="input-short" name="horarioFinal"
							value="${horarioFinal}" id="horarioFinal" readonly="readonly" />
						<c:if test="${not empty erros['errohorarioFinal'] }">
                    		<span class="notification-input ni-error"><fmt:message
								key="horarioFinal_invalido" /></span>								
						  </c:if>
						  <c:if test="${not empty erros['erroHorInIguaHorFi'] }">
                    		<span class="notification-input ni-error"><fmt:message
								key="horaInicioIgualHoraFim_invalido" /></span>
						  </c:if>
							</p>
							<script>
							
							$('#horarioInicial').timepicker({
						        showLeadingZero: false,
						        onHourShow: tpStartOnHourShowCallback,
						        onMinuteShow: tpStartOnMinuteShowCallback,
						        defaultTime: '12:25'
						    });
						    $('#horarioFinal').timepicker({
						        showLeadingZero: false,
						        onHourShow: tpEndOnHourShowCallback,
						        onMinuteShow: tpEndOnMinuteShowCallback,
						        defaultTime: '12:30'
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
														
							

						<fieldset>
							<input class="submit-green" type="submit" value="<fmt:message key="bt_proximo"/>" name="enviar"/> 
							<input class="submit-gray" type="submit" value="<fmt:message key="back"/>" name="voltar" />
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
