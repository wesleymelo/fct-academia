<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<c:import url="../../includes/header.jsp" />


	<script>
		$(function() {
			// a workaround for a flaw in the demo system (http://dev.jqueryui.com/ticket/4375), ignore!
			$( "#dialog:ui-dialog" ).dialog( "destroy" );
		
			$( "#dialog-message" ).dialog({
				modal: true,
				height: 500,
				width: 650,
				buttons: {
					Ok: function() {
						$( this ).dialog( "close" );
					}
				}
			});
		});
	</script>
	
	<script type="text/javascript">
	function abrir(programa,janela)
	{
   		if(janela=="") janela = "janela";
   			window.open(programa,janela,'height=350,width=640');
	}
	</script>

<div class="container_12">
	
	<c:choose>
			<c:when test="${param.status == true}">
				<span class="notification n-success">Success notification.</span>
			</c:when>
			<c:otherwise>
				<c:choose>
					<c:when test="${param.status == false }">
						<span class="notification n-error">Error notification.</span>
					</c:when>
				</c:choose>
			</c:otherwise>			
		</c:choose>
	
	
	<!-- Form elements -->
	<div class="grid_12">

		<div class="module">
			<h2><span><fmt:message key="inserirModalidadePacote" /><c:out value=" ${pacote.descricao}"/></span></h2>
					
			<div class="module-body">

				<form action="cadastroModalidadeNoPacote.do" method="post">
					<input type="hidden" name="idPacote" id="idPacote" value="${param.id}" />
					<input type="hidden" name="idPagamento" id="idPagamento" value="${idPagamento}" />
					<input type="hidden" name="idModalidade" id="idModalidade" />
					
					<p>
                        <label><fmt:message key="modalidade"/></label>
                        <input type="text" value="${modalidade}" class="input-short" name="modalidade" id="modalidade" readonly="readonly" value="${modalidade}" /><a href="javascript:abrir('buscaModalidades.do')"> <fmt:message key="buscar"/> </a>
 						
                        <c:if test="${not empty erros['erromodalidade'] }">
							<span class="notification-input ni-error"><fmt:message key="modalidade_invalida"/></span>
						</c:if>
						
						<c:if test="${not empty erros['erromodalidade_duplicado'] }">
							<span class="notification-input ni-error"><fmt:message key="modalidade_duplicado"/></span>
						</c:if>
						<label><fmt:message key="dataPagamento"/></label>
                        <input type="text" value="${pagamento}" class="input-short" name="pagamento" id="pagamento" readonly="readonly" value="${pagamento}" /><a href="javascript:abrir('buscaPagamentos.do')"> <fmt:message key="buscar"/> </a>
 						
 						<c:if test="${not empty erros['errodatapagamento'] }">
							<span class="notification-input ni-error"><fmt:message key="data_invalido"/></span>
						</c:if>
					
					</p>

					<fieldset>
						<input class="submit-green" type="submit" value="<fmt:message key="inserir"/>" /> 
						<input class="submit-gray" type="reset" value="<fmt:message key="bt_limpar"/>" />
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
		
		
		
		
		
		<div class="bottom-spacing">

			
		</div>

		<!-- Example table -->
		<div class="module">
			<h2>
				<span><fmt:message key="pacote" /><c:out value=": ${pacote.descricao}" /></span>
			</h2>

			<%-- Variáveis para paginação --%>
			<c:if test="${empty param.pag}">
				<c:set var="pag" value="${1}" scope="page" />
			</c:if>

			<c:if test="${not empty param.pag}">
				<c:set var="pag" value="${param.pag}" scope="page" />
			</c:if>

			<c:set var="tamPag" value="${40}" scope="page" />


			<c:set var="inicio" value="${pag * tamPag - tamPag}" scope="page" />


			<c:set var="fim" value="${(pag * tamPag) - 1}" scope="page" />

			<div class="module-table-body">
				<form action="">
					<table id="myTable" class="tablesorter">
						<thead>
							<tr>
								<th style="width: 5%"><c:out value="#"></c:out></th>
								<th style="width: 95%"><fmt:message key="desc"/></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="modalidade" items="${modalidades}" varStatus="i" begin="${inicio}" end="${fim}">
								<tr>
									<td>${modalidade.idModalidade}</td>
									<td><a href="">${modalidade.descricao}</a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</form>
				
				<c:if test="${fn:length(alunos) % tamPag == 0}">
						<c:set var="numPags" value="${fn:length(alunos) / tamPag }" />
				</c:if>
				<c:if test="${fn:length(alunos) % tamPag != 0}">
						<c:set var="numPags" value="${(fn:length(alunos) / tamPag)+1}" />
				</c:if>
				
				<div class="pager" id="pager">
					<form action="">
						<div>
							<img class="first" src="${pageContext.request.contextPath}/view/images/arrow-stop-180.gif" alt="first" /> 
							<img class="prev" src="${pageContext.request.contextPath}/view/images/arrow-180.gif" alt="prev" /> 
							
							
							<input type="text" class="pagedisplay input-short align-center" /> 
								
							<img class="next" src="${pageContext.request.contextPath}/view/images/arrow.gif" alt="next" /> 
							<img class="last" src="${pageContext.request.contextPath}/view/images/arrow-stop.gif" alt="last" /> 
							
							<select class="pagesize input-short align-center">
								<option value="20" selected="selected">20</option>
								<option value="40">40</option>
								<option value="60">60</option>
								<option value="80">80</option>
								<option value="100">100</option>
							</select>
							
						</div>
					</form>
				</div>

			</div>
			
			<!-- End .module-table-body -->
			<div style="clear: both"></div>			
		</div>
		<!-- End .module -->

		<div class="pagination">
			<a href="${pageContext.request.contextPath}/view/admin/aluno/listaAlunos.do?pag=1" class="button"><span><img
					src="${pageContext.request.contextPath}/view/images/arrow-stop-180-small.gif"
					height="9" width="12" alt="First" /><fmt:message key="primeiro"/></span>
			</a> 
				
			<a href="${pageContext.request.contextPath}/view/admin/aluno/listaAlunos.do?pag=<c:if test="${pag > 1}">${pag - 1}</c:if><c:if test="${pag == 1}">1</c:if>"
					class="button"><span>
					<img src="${pageContext.request.contextPath}/view/images/arrow-180-small.gif"
					height="9" width="12" alt="Previous" /><fmt:message key="anterior"/></span>
		    </a>
			<div class="numbers">
				<span><fmt:message key="pg"/></span>
				
				
				<%-- Links para as outras páginas --%>
				<c:forEach var="i" begin="1" end="${numPags}">
					<c:if test="${i == pag}">
						<c:out value="${i}" />
					</c:if>
					<c:if test="${i != pag}">
						<a href="${pageContext.request.contextPath}/view/admin/aluno/listaAlunos.do?pag=${i}"><c:out value="${i}" /></a>
					</c:if>
					<c:if test="${i < numPags}">
						<span>|</span>
					</c:if>	
				</c:forEach>
			</div>
			
			<a href="${pageContext.request.contextPath}/view/admin/aluno/listaAlunos.do?pag=<c:if test="${pag < numPags}">${pag + 1}</c:if> <c:if test="${pag == numPags}">${pag}</c:if>" class="button"><span><fmt:message key="proximo"/> <img
					src="${pageContext.request.contextPath}/view/images/arrow-000-small.gif"
					height="9" width="12" alt="Next" /></span>
			</a> 
					
			<a href="${pageContext.request.contextPath}/view/admin/aluno/listaAlunos.do?pag=<c:out value="${numPags}"/>" class="button last"><span><fmt:message key="ultimo"/><img
					src="${pageContext.request.contextPath}/view/images/arrow-stop-000-small.gif"
					height="9" width="12" alt="Last" /></span>
			</a>
			<div style="clear: both;"></div>
		</div>




	</div>
	<!-- End .grid_12 -->



	<div style="clear: both;"></div>
</div>
<!-- End .container_12 -->
<c:import url="../../includes/footer.jsp" />