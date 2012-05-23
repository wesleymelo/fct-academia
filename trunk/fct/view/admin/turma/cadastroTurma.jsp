<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
						href="${pageContext.request.contextPath}/view/admin/turma/listaTurmas.do"
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
					
					<input type="hidden" name="idProfessor" id="idProfessor" value="${id}" />
					<input type="hidden" name="pg" value="1">
					
					<p>
						<label><fmt:message key="nome"/></label>
						<input type="text" class="input-short" name="nome" id="nome" value="${nome }"/>
						<c:if test="${not empty erros['erronome'] }">
							<span class="notification-input ni-error"><fmt:message key="nome_invalido"/></span>
						</c:if>
						
					</p>
					
					<p>
                        <label><fmt:message key="professor"/></label>
                        <input type="text" class="input-short" name="professor" id="professor" readonly="readonly" value="${professor}" /><a href="javascript:abrir('buscaProfessor.do')"> <fmt:message key="buscar"/> </a>
                        <c:if test="${not empty erros['erroprofessor'] }">
							<span class="notification-input ni-error"><fmt:message key="professor_invalido"/></span>
						</c:if>                        
					</p>
					
					<p>
						<label><fmt:message key="modalidade"/></label>
						<select class="input-short" name="modalidade">
							<c:choose>
								<c:when test="${! empty modalidades}">
									<option value="0"><fmt:message key="selecione"/></option>
									<c:forEach var="m" items="${modalidades}">	
										<option value="${m.idModalidade}" <c:if test="${modalidade == m.idModalidade}"> selected="selected" </c:if> >${m.descricao}</option>
									</c:forEach>			
								</c:when>
								<c:otherwise>
									<option value="0"><fmt:message key="noItens"/></option>
								</c:otherwise>
							</c:choose>
						</select>
						<c:if test="${not empty erros['erromodalidade'] }">
							<span class="notification-input ni-error"><fmt:message key="modalidade_invalido"/></span>
						</c:if>
						
					</p>
					
					<p>
						<label><fmt:message key="capacidade"/></label>
						<input type="text" class="input-short" name="capacidade" id="capacidade" value="${capacidade }"/>
						<c:if test="${not empty erros['errocapacidade'] }">
							<span class="notification-input ni-error"><fmt:message key="capacidade_invalida"/></span>
						</c:if>
						
					</p>
					
					<p>
                        <label><fmt:message key="horarioInicial"/></label> 
                        <input type="text" readonly="readonly" class="input-short-short" name="horarioInicial" id="horarioInicial" value="${horarioInicial }" />
                        <c:if test="${not empty erros['erroHorarioInicial'] }">
							<span class="notification-input ni-error"><fmt:message key="horarioInicial_invalido"/></span>
						</c:if>                        
					</p>
					
					
					<p>
                        <label><fmt:message key="horarioFinal"/></label>
                        <input type="text" readonly="readonly" class="input-short-short" name="horarioFinal" id="horarioFinal" value="${horarioFinal }" />
                        <c:if test="${not empty erros['erroHorarioFinal'] }">
							<span class="notification-input ni-error"><fmt:message key="horarioFinal_invalido"/></span>
						</c:if>                        
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
					<fieldset>
						<input class="submit-green" type="submit" value="<fmt:message key="bt_enviar"/>" /> <input
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