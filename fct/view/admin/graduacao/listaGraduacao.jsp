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
					href="${pageContext.request.contextPath}/view/admin/graduacao/cadastroGraduacao.do?pg=1"
					class="button"> <span><b><fmt:message key="new" /></b>
						<img
						src="${pageContext.request.contextPath}/view/images/plus-small.gif"
						tppabs="http://www.xooom.pl/work/magicadmin/images/plus-small.gif"
						width="12" height="9" alt="<fmt:message key="new" />" /> </span>
				</a>
			</div>

			<!-- Table records filtering -->
			Filter: <select class="input-short">
				<option value="1" selected="selected">Select filter</option>
				<option value="2">Created last week</option>
				<option value="3">Created last month</option>
				<option value="4">Edited last week</option>
				<option value="5">Edited last month</option>
			</select>

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
		

		<!-- Example table -->
		<div class="module">
			<h2>
				<span><fmt:message key="alunos" /></span>
			</h2>

			<div class="module-table-body">
				<form action="">
					<table id="myTable" class="tablesorter">
						<thead>
							<tr>
								<th style="width: 25%">Descricao</th>
								<th style="width: 20%">Modalidade</th>
								<th style="width: 10%">A&ccedil;&otilde;es</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="gradu" items="${graduacoes}">
								<tr>
									<td><a href="">${gradu.descricao}</a></td>
									<td><a href="">${gradu.modalidadeString}</a></td>
									<td><input type="checkbox" /> <a href=""><img
											src="${pageContext.request.contextPath}/view/images/tick-circle.gif"
											tppabs="http://www.xooom.pl/work/magicadmin/images/tick-circle.gif"
											width="16" height="16" alt="published" /></a> <a href="${pageContext.request.contextPath}/view/admin/graduacao/alteraGraduacao.do?codigo=${gradu.idGraduacao }"><img
											src="${pageContext.request.contextPath}/view/images/pencil.gif"
											tppabs="http://www.xooom.pl/work/magicadmin/images/pencil.gif"
											width="16" height="16" alt="edit" /></a> <a href=""><img
											src="${pageContext.request.contextPath}/view/images/balloon.gif"
											tppabs="http://www.xooom.pl/work/magicadmin/images/balloon.gif"
											width="16" height="16" alt="comments" /></a> <a href=""><img
											src="${pageContext.request.contextPath}/view/images/bin.gif"
											tppabs="http://www.xooom.pl/work/magicadmin/images/bin.gif"
											width="16" height="16" alt="delete" /></a></td>
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
				<div class="table-apply">
					<form action="">
						<div>
							<span>Apply action to selected:</span> <select
								class="input-medium">
								<option value="1" selected="selected">Select action</option>
								<option value="2">Publish</option>
								<option value="3">Unpublish</option>
								<option value="4">Delete</option>
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