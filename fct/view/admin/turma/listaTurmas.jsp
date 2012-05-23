<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

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

		</div>
		
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
								<th style="width: 10%"><fmt:message key="vagas"/></th>
								<th style="width: 10%"><fmt:message key="acoes"/></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="turma" items="${turmas}" varStatus="i" begin="${inicio}" end="${fim}">
								<tr>
									<td>${turma.nome}</td>
									<td>${turma.professor.nome}</td>
									<td>${turma.modalidade.descricao}</td>
									<td>${turma.horarioInicial} - ${turma.horarioFinal}</td>
									<td>${turma.capacidade}</td>
									<td>${turma.vagas}</td>
									
									<td>
											</a> <a href="${pageContext.request.contextPath}/view/admin/aluno/alteraAluno.do?codigo=${aluno.idPessoa }"><img
									<td>${turma.horarioInicial}</td>
									<td>${turma.horarioFinal}</td>
									<td><input type="checkbox" /> <a href=""><img
											src="${pageContext.request.contextPath}/view/images/tick-circle.gif"
											tppabs="http://www.xooom.pl/work/magicadmin/images/tick-circle.gif"
											width="16" height="16" alt="published" /></a> <a href="${pageContext.request.contextPath}/view/admin/turma/alteraTurma.do?codigo=${turma.idTurma }"><img
											src="${pageContext.request.contextPath}/view/images/pencil.gif"
											tppabs="http://www.xooom.pl/work/magicadmin/images/pencil.gif"
											width="16" height="16" alt="<fmt:message key="alterar"/>" /></a> 
											
											<a href=""><img
											src="${pageContext.request.contextPath}/view/images/bin.gif"
											width="16" height="16" alt="<fmt:message key="excluir"/>" /></a>
											
											<a href=""><img
											src="${pageContext.request.contextPath}/view/images/add-person.png"
											width="16" height="16" alt="<fmt:message key="adicionarAluno"/>" /></a>
											
											<a href=""><img
											src="${pageContext.request.contextPath}/view/images/view.png"
											width="16" height="16" alt="<fmt:message key="view"/>" /></a>
											
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


		<div class="pagination">
			<a href="" class="button"><span><img
					src="${pageContext.request.contextPath}/view/images/arrow-stop-180-small.gif"
					tppabs="http://www.xooom.pl/work/magicadmin/images/arrow-stop-180-small.gif"
					height="9" width="12" alt="First" /> First</span></a> <a href=""
				class="button"><span><img
					src="${pageContext.request.contextPath}/view/images/arrow-180-small.gif"
					tppabs="http://www.xooom.pl/work/magicadmin/images/arrow-180-small.gif"
					height="9" width="12" alt="Previous" /> Prev</span></a>
			<div class="numbers">
				<span>Page:</span> <a href="">1</a> <span>|</span> <a href="">2</a>
				<span>|</span> <span class="current">3</span> <span>|</span> <a
					href="">4</a> <span>|</span> <a href="">5</a> <span>|</span> <a
					href="">6</a> <span>|</span> <a href="">7</a> <span>|</span> <span>...</span>
				<span>|</span> <a href="">99</a>
			</div>
			<a href="" class="button"><span>Next <img
					src="${pageContext.request.contextPath}/view/images/arrow-000-small.gif"
					tppabs="http://www.xooom.pl/work/magicadmin/images/arrow-000-small.gif"
					height="9" width="12" alt="Next" /></span></a> <a href="" class="button last"><span>Last
					<img
					src="${pageContext.request.contextPath}/view/images/arrow-stop-000-small.gif"
					tppabs="http://www.xooom.pl/work/magicadmin/images/arrow-stop-000-small.gif"
					height="9" width="12" alt="Last" />
			</span></a>
			<div style="clear: both;"></div>
		</div>




	</div>
	<!-- End .grid_12 -->



	<div style="clear: both;"></div>
</div>
<!-- End .container_12 -->
<c:import url="../../includes/footer.jsp" />