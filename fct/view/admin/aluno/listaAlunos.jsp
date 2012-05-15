<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="../../includes/header.jsp" />

<!-- Header. Main part -->
<div id="header-main">
	<div class="container_12">
		<div class="grid_12">
			<div id="logo">
				<div id="logo_top">
					<ul id="nav">
						<li id="current"><a href="">Painel de Controle</a></li>
						<li><a href="">Outro</a></li>
					</ul>
				</div>
				<div id="logo_bottom"></div>
			</div>
			<!-- End. #Logo -->
		</div>
		<!-- End. .grid_12-->
		<div style="clear: both;"></div>
	</div>
	<!-- End. .container_12 -->
</div>
<!-- End #header-main -->
<div style="clear: both;"></div>
<!-- Sub navigation -->
<div id="subnav">
	<div class="container_12">
		<div class="grid_12">
			<ul>
				<li id="current"><a href="#">Alunos</a></li>
				<li><a href="#">Professores</a></li>
				<li><a href="#">Secret&aacute;ria</a></li>
				<li><a href="#">Modadidades</a></li>
				<li><a href="#">Turmas</a></li>
			</ul>

		</div>
		<!-- End. .grid_12-->
	</div>
	<!-- End. .container_12 -->
	<div style="clear: both;"></div>
</div>
<!-- End #subnav -->
</div>
<!-- End #header -->
<div class="container_12">







	<div class="grid_12">

		<div class="bottom-spacing">

			<!-- Button -->
			<div class="float-right">
				<a href="" class="button"> <span><b><fmt:message key="new" /></b><t
						src="${pageContext.request.contextPath}/view/images/plus-small.gif"
						tppabs="http://www.xooom.pl/work/magicadmin/images/plus-small.gif"
						width="12" height="9" alt="Novo" /></span>
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


		<!-- Example table -->
		<div class="module">
			<h2>
				<span><fmt:message key="alunos"/></span>
			</h2>

			<div class="module-table-body">
				<form action="">
					<table id="myTable" class="tablesorter">
						<thead>
							<tr>
								<th style="width: 25%">Nome</th>
								<th style="width: 10%">CPF</th>
								<th style="width: 10%">Data Nascimento</th>
								<th style="width: 15%">Telefones</th>
								<th style="width: 25%">Email</th>
								<th style="width: 08%">Sexo</th>
								<th style="width: 10%">A&ccedil;&otilde;es</th>								
							</tr>
						</thead>
						<tbody>
							<c:forEach var="aluno" items="${alunos}">
								<tr>
									<td><a href="">${aluno.nome}</a></td>
									<td>${aluno.cpf}</td>
									<td>${aluno.dataNascimento}</td>
									<td>
										<c:forEach var="telefone" items="${aluno.telefones}">
											(${telefone.ddd}) ${telefone.numero} <br/>
										</c:forEach>
									</td>
									
									<td>${aluno.email}</td>
									<td>${aluno.sexo.descricao}</td>
									<td><input type="checkbox" /> <a href=""><img
											src="${pageContext.request.contextPath}/view/images/tick-circle.gif"
											tppabs="http://www.xooom.pl/work/magicadmin/images/tick-circle.gif"
											width="16" height="16" alt="published" /></a> <a href=""><img
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
							<img class="first" src="${pageContext.request.contextPath}/view/images/arrow-stop-180.gif"
								tppabs="http://www.xooom.pl/work/magicadmin/images/arrow-stop-180.gif"
								alt="first" /> <img class="prev" src="${pageContext.request.contextPath}/view/images/arrow-180.gif"
								tppabs="http://www.xooom.pl/work/magicadmin/images/arrow-180.gif"
								alt="prev" /> <input type="text"
								class="pagedisplay input-short align-center" /> <img
								class="next" src="${pageContext.request.contextPath}/view/images/arrow.gif"
								tppabs="http://www.xooom.pl/work/magicadmin/images/arrow.gif"
								alt="next" /> <img class="last" src="${pageContext.request.contextPath}/view/images/arrow-stop.gif"
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
					<img src="${pageContext.request.contextPath}/view/images/arrow-stop-000-small.gif"
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