<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<c:import url="../../includes/header.jsp" />

<div class="container_12">

	<div class="grid_12">

		<div class="bottom-spacing">

			<!-- Button -->
			<div class="float-right">
				<a
					href="${pageContext.request.contextPath}/view/admin/turma/carregaModalidades.do"
					class="button"> <span><b><fmt:message key="new" /></b>
						<img
						src="${pageContext.request.contextPath}/view/images/plus-small.gif"
						tppabs="http://www.xooom.pl/work/magicadmin/images/plus-small.gif"
						width="12" height="9" alt="<fmt:message key="new" />" /> </span>
				</a>
			</div>
			<form action="buscaTurma.do" method="post">
					<fieldset>
						<b><fmt:message key="busca" /></b> <input type="text" name="busca"
							class="input-short" />&nbsp;&nbsp;<input class="submit-green"
							type="submit" value="<fmt:message key="pesquisar"/>" />
					</fieldset>
			</form>
		
		</div>
		&nbsp;&nbsp;
		
		
		<c:choose>
			<c:when test="${param.status == true}">
				<span class="notification n-success"><fmt:message key="sucesso"/></span>
			</c:when>
			<c:otherwise>
				<c:choose>
					<c:when test="${param.status == false }">
						<span class="notification n-error"><fmt:message key="fracasso"/></span>
					</c:when>
				</c:choose>
			</c:otherwise>			
		</c:choose>


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


		<!-- Example table -->
		<div class="module">
			<h2>
				<span><fmt:message key="turmas" /></span>
			</h2>

			<div class="module-table-body">
				<form action="">
					<table id="myTable" class="tablesorter">
						<thead>
							<tr>
								<th style="width: 20%"><fmt:message key="nome"/></th>
								<th style="width: 20%"><fmt:message key="professor"/></th>
								<th style="width: 15%"><fmt:message key="modalidade"/></th>
								<th style="width: 15%"><fmt:message key="horario"/></th>
								<th style="width: 10%"><fmt:message key="capacidade"/></th>
								<th style="width: 8%"><fmt:message key="vagas"/></th>
								<th style="width: 10%"><fmt:message key="acoes"/></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="turma" items="${turmas}"  varStatus="i" begin="${inicio}" end="${fim}">
								<tr>
									<td>${turma.nome}</td>
									<td>${turma.professor.nome}</td>
									<td>${turma.modalidade.descricao}</td>
									<td>${turma.horarioInicial} ~ ${turma.horarioFinal}</td>
									<td>${turma.capacidade}</td>
									<td>${turma.vagas}</td>
									<td>   
											<a href="${pageContext.request.contextPath}/view/admin/turma/alteraTurma.do?codigo=${turma.idTurma }"><img
											src="${pageContext.request.contextPath}/view/images/pencil.gif"
											width="16" height="16" alt="<fmt:message key="alterar"/>" /></a> 
											
											
											<a href=""><img
											src="${pageContext.request.contextPath}/view/images/bin.gif"
											width="16" height="16" alt="<fmt:message key="excluir"/>" /></a>
											
											<a href="${pageContext.request.contextPath}/view/admin/turma/carregaAlunosTurma.do?id=${turma.idTurma }"><img
											src="${pageContext.request.contextPath}/view/images/people.png"
											width="16" height="16" alt="<fmt:message key="adicionarAluno"/>" /></a>
											
								    </td>		
											
											
											
											
											
											
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</form>
				<div class="pager" id="pager">
					<form action="">
						<div>
							<img class="first"
								src="${pageContext.request.contextPath}/view/images/arrow-stop-180.gif"
								tppabs="http://www.xooom.pl/work/magicadmin/images/arrow-stop-180.gif"
								alt="first" /> <img class="prev"
								src="${pageContext.request.contextPath}/view/images/arrow-180.gif"
								tppabs="http://www.xooom.pl/work/magicadmin/images/arrow-180.gif"
								alt="prev" /> <input type="text"
								class="pagedisplay input-short align-center" /> <img
								class="next"
								src="${pageContext.request.contextPath}/view/images/arrow.gif"
								tppabs="http://www.xooom.pl/work/magicadmin/images/arrow.gif"
								alt="next" /> <img class="last"
								src="${pageContext.request.contextPath}/view/images/arrow-stop.gif"
								tppabs="http://www.xooom.pl/work/magicadmin/images/arrow-stop.gif"
								alt="last" /> <select class="pagesize input-short align-center">
								<option value="10" selected="selected">10</option>
								<option value="20">20</option>
								<option value="30">30</option>
								<option value="40">40</option>
							</select>
						</div>
					</form>
				</div>
				<div style="clear: both"></div>
			</div>
			<!-- End .module-table-body -->
		</div>
		<!-- End .module -->

		
		<c:if test="${fn:length(turmas) % tamPag == 0}">
				<c:set var="numPags" value="${fn:length(turmas) / tamPag }" />
		</c:if>
		<c:if test="${fn:length(turmas) % tamPag != 0}">
				<c:set var="numPags" value="${(fn:length(turmas) / tamPag)+1}" />
		</c:if>


		<div class="pagination">
			<a href="${pageContext.request.contextPath}/view/admin/turma/listaTurmas.do?pag=1" class="button"><span><img
					src="${pageContext.request.contextPath}/view/images/arrow-stop-180-small.gif"
					height="9" width="12" alt="First" /><fmt:message key="primeiro"/></span>
			</a> 
					
					
					
			<a href="${pageContext.request.contextPath}/view/admin/turma/listaTurmas.do?pag=<c:if test="${pag > 1}">${pag - 1}</c:if><c:if test="${pag == 1}">1</c:if>"
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
						<a href="${pageContext.request.contextPath}/view/admin/turma/listaTurmas.do?pag=${i}"><c:out value="${i}" /></a>
					</c:if>
					<c:if test="${i < numPags}">
						<span>|</span>
					</c:if>	
				</c:forEach>
			</div>
			
			<a href="${pageContext.request.contextPath}/view/admin/turma/listaTurmas.do?pag=<c:if test="${pag < numPags}">${pag + 1}</c:if> <c:if test="${pag == numPags}">${pag}</c:if>" class="button"><span><fmt:message key="proximo"/> <img
					src="${pageContext.request.contextPath}/view/images/arrow-000-small.gif"
					height="9" width="12" alt="Next" /></span>
			</a> 
					
			<a href="${pageContext.request.contextPath}/view/admin/turma/listaTurmas.do?pag=<c:out value="${numPags}"/>" class="button last"><span><fmt:message key="ultimo"/><img
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