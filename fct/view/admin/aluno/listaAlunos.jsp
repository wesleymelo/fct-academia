<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<c:import url="../../includes/header.jsp" />

<script type="text/javascript">
$(document).ready(function() {	
	$('a[name=modal]').click(function(e) {
		e.preventDefault();
		var id = $(this).attr('href');
		var maskHeight = $(document).height();
		var maskWidth = $(window).width();

		$('#mask').css({'width':maskWidth,'height':maskHeight});
		$('#mask').fadeIn(1000);	
		$('#mask').fadeTo("slow",0.8);	

		//Get the window height and width
		var winH = $(window).height();
		var winW = $(window).width();
		$(id).css('top',  winH/2-$(id).height()/2);
		$(id).css('left', winW/2-$(id).width()/2);
		$(id).fadeIn(2000); 

	});

	$('.window .close').click(function (e) {
		e.preventDefault();
		$('#mask').hide();
		$('.window').hide();
	});		

	$('#mask').click(function () {
		$(this).hide();
		$('.window').hide();
	});			

});

</script>


<!-- janela modal -->
<div id="boxes">

<div id="dialog" class="window">
	<a href="#" class="close"><fmt:message key="fechar"/></a>
	
			<h2>
				<fmt:message key="visualizaAluno"/>
			</h2>
					<table>
						<thead>
							<tr>
								
								<td><fmt:message key="nome"/></td><td>${aluno.nome}</td>
								<td><fmt:message key="cpf"/></td><td>${aluno.cpf}</td>
								<td><fmt:message key="sexo"/></td><td>${aluno.sexo}</td>
								<td><fmt:message key="altura"/></td><td>${aluno.altura}</td>
								<td><fmt:message key="peso"/></td><td>${aluno.peso}</td>
								<td><fmt:message key="telefones"/></td>
								
										<td>
										
											<c:forEach var="telefone" items="${aluno.telefones}">
												(${telefone.ddd}) ${telefone.numero} <br />
											</c:forEach>
											
										
										</td>
								<td><fmt:message key="email"/></td><td>${aluno.email}</td>
								<td><fmt:message key="dataCadastro"/></td><td>${aluno.dataCadastro}</td>
								<td><fmt:message key="status"/></td><td>${aluno.status}</td>
								
							</tr>
						</thead>
					</table>
</div>

<div id="mask"></div>




<div class="container_12">

	<div class="grid_12">

		<div class="bottom-spacing">

			<!-- Button -->
			<div class="float-right">
				<a
					href="${pageContext.request.contextPath}/view/admin/aluno/cadastroAluno.jsp"
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
									<td><c:forEach var="telefone" items="${aluno.telefones}">
											(${telefone.ddd}) ${telefone.numero} <br />
										</c:forEach></td>

									<td>${aluno.email}</td>
									<td>${aluno.sexo.descricao}</td>
									<td><input type="checkbox" /> 
											<a href=""><img src="${pageContext.request.contextPath}/view/images/tick-circle.gif"
											width="16" height="16" alt="published" />
											
											</a> <a href="${pageContext.request.contextPath}/view/admin/aluno/alteraAluno.do?codigo=${aluno.idPessoa }"><img
											src="${pageContext.request.contextPath}/view/images/pencil.gif"
											width="16" height="16" alt="edit" /></a>
											
											
											 <a href=""><img
											src="${pageContext.request.contextPath}/view/images/balloon.gif"
											width="16" height="16" alt="comments" /></a>
											
											
											 <a href=""><img
											src="${pageContext.request.contextPath}/view/images/bin.gif"
											width="16" height="16" alt="delete" /></a>
											
											 <a href="${pageContext.request.contextPath}/view/admin/aluno/visualizaAluno.do?id=${aluno.idPessoa}"><img
											src="${pageContext.request.contextPath}/view/images/view.png"
											width="16" height="16" alt="<fmt:message key="view" />" /></a>
											
											
											
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