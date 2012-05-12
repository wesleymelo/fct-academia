<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="${pageContext.request.contextPath}/includes/header.jsp" />

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
				<a href="" class="button"> <span><b>Novo(a) Aluno(a)</b><img
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
				<span>Tabela de Alunos(as)</span>
			</h2>

			<div class="module-table-body">
				<form action="">
					<table id="myTable" class="tablesorter">
						<thead>
							<tr>
								<th style="width: 4%">#</th>
								<th style="width: 25%">Nome</th>
								<th style="width: 10%">CPF</th>
								<th style="width: 10%">Data Nascimento</th>
								<th style="width: 10%">Data Nascimento</th>
								<th style="width: 25%">Email</th>
								<th style="width: 08%">Sexo</th>
								<th style="width: 10%">A&ccedil;&otilde;es</th>
								
							</tr>
						</thead>
						<tbody>
							<tr>
								<td class="align-center">1</td>
								<td><a href="">123 da Silva 4</a></td>
								<td>000.000.000-00</td>
								<td>00/00/0000</td>
								<td>nada@algumacoisa.dominio</td>
								<td>M</td>
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
							<tr>
								<td class="align-center">2</td>
								<td><a href="">Lord Jim</a></td>
								<td>Joseph Conrad</td>
								<td>thriller</td>
								<td>400</td>
								<td>$6.95</td>
								<td><input type="checkbox" /> <a href=""><img
										src="${pageContext.request.contextPath}/view/images/minus-circle.gif"
										tppabs="http://www.xooom.pl/work/magicadmin/images/minus-circle.gif"
										width="16" height="16" alt="not published" /></a> <a href=""><img
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
							<tr>
								<td class="align-center">3</td>
								<td><a href="">Inferno</a></td>
								<td>Dante</td>
								<td>drama</td>
								<td>528</td>
								<td>$8.76</td>
								<td><input type="checkbox" /> <a href=""><img
										src="${pageContext.request.contextPath}/view/images/minus-circle.gif"
										tppabs="http://www.xooom.pl/work/magicadmin/images/minus-circle.gif"
										width="16" height="16" alt="not published" /></a> <a href=""><img
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
							<tr>
								<td class="align-center">4</td>
								<td><a href="">David Copperfield</a></td>
								<td>Charles Dickens</td>
								<td>literary</td>
								<td>1024</td>
								<td>$9.00</td>
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
							<tr>
								<td class="align-center">5</td>
								<td><a href="">Crime and Punishment</a></td>
								<td>Fyodor Dostoevsky</td>
								<td>world literature</td>
								<td>592</td>
								<td>$10.85</td>
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
							<tr>
								<td class="align-center">6</td>
								<td><a href="">Faust</a></td>
								<td>Johann Wolfgang von Goethe</td>
								<td>drama</td>
								<td>464</td>
								<td>$5.95</td>
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
							<tr>
								<td class="align-center">7</td>
								<td><a href="">Lord of the Flies</a></td>
								<td>William Golding</td>
								<td>drama</td>
								<td>190</td>
								<td>$15.88</td>
								<td><input type="checkbox" /> <a href=""><img
										src="${pageContext.request.contextPath}/view/images/minus-circle.gif"
										tppabs="http://www.xooom.pl/work/magicadmin/images/minus-circle.gif"
										width="16" height="16" alt="not published" /></a> <a href=""><img
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
							<tr>
								<td class="align-center">8</td>
								<td><a href="">A Farewell To Arms</a></td>
								<td>Ernest Hemingway</td>
								<td>romance</td>
								<td>304</td>
								<td>$22.80</td>
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
							<tr>
								<td class="align-center">9</td>
								<td><a href="">The Old Man and the Sea</a></td>
								<td>Ernest Hemingway</td>
								<td>adventure</td>
								<td>112</td>
								<td>$4.63</td>
								<td><input type="checkbox" /> <a href=""><img
										src="${pageContext.request.contextPath}/view/images/minus-circle.gif"
										tppabs="http://www.xooom.pl/work/magicadmin/images/minus-circle.gif"
										width="16" height="16" alt="not published" /></a> <a href=""><img
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
							<tr>
								<td class="align-center">10</td>
								<td><a href="">The Snows of Kilimanjaro</a></td>
								<td>Ernest Hemingway</td>
								<td>adventure</td>
								<td>144</td>
								<td>$19.00</td>
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
							<tr>
								<td class="align-center">11</td>
								<td><a href="">The Sun Also Rises</a></td>
								<td>Ernest Hemingway</td>
								<td>drama</td>
								<td>256</td>
								<td>$10.20</td>
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
							<tr>
								<td class="align-center">12</td>
								<td><a href="">The Metamorphosis</a></td>
								<td>Franz Kafka</td>
								<td>existentialism</td>
								<td>94</td>
								<td>$9.95</td>
								<td><input type="checkbox" /> <a href=""><img
										src="${pageContext.request.contextPath}/view/images/minus-circle.gif"
										tppabs="http://www.xooom.pl/work/magicadmin/images/minus-circle.gif"
										width="16" height="16" alt="not published" /></a> <a href=""><img
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
							<tr>
								<td class="align-center">13</td>
								<td><a href="">One Flew Over the Cuckoo's Nest</a></td>
								<td>Ken Kesey</td>
								<td>thriller</td>
								<td>288</td>
								<td>$10.88</td>
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
							<tr>
								<td class="align-center">14</td>
								<td><a href="">Moby Dick</a></td>
								<td>Herman Melville</td>
								<td>world literature</td>
								<td>464</td>
								<td>$5.00</td>
								<td><input type="checkbox" /> <a href=""><img
										src="${pageContext.request.contextPath}/view/images/minus-circle.gif"
										tppabs="http://www.xooom.pl/work/magicadmin/images/minus-circle.gif"
										width="16" height="16" alt="not published" /></a> <a href=""><img
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
							<tr>
								<td class="align-center">15</td>
								<td><a href="">The Crucible</a></td>
								<td>Arthur Miller</td>
								<td>drama</td>
								<td>176</td>
								<td>$10.01</td>
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
							<tr>
								<td class="align-center">16</td>
								<td><a href="">Death of a Salesman</a></td>
								<td>Arthur Miller</td>
								<td>drama</td>
								<td>448</td>
								<td>$12.24</td>
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
							<tr>
								<td class="align-center">17</td>
								<td><a href="">Paradise Lost</a></td>
								<td>John Milton</td>
								<td>christianity</td>
								<td>512</td>
								<td>$9.24</td>
								<td><input type="checkbox" /> <a href=""><img
										src="${pageContext.request.contextPath}/view/images/minus-circle.gif"
										tppabs="http://www.xooom.pl/work/magicadmin/images/minus-circle.gif"
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
							<tr>
								<td class="align-center">18</td>
								<td><a href="">Animal Farm</a></td>
								<td>George Orwell</td>
								<td>criticism &amp; theory</td>
								<td>113</td>
								<td>$9.85</td>
								<td><input type="checkbox" /> <a href=""><img
										src="${pageContext.request.contextPath}/view/images/minus-circle.gif"
										tppabs="http://www.xooom.pl/work/magicadmin/images/minus-circle.gif"
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
							<tr>
								<td class="align-center">19</td>
								<td><a href="">Hamlet</a></td>
								<td>William Shakespeare</td>
								<td>tragedy</td>
								<td>400</td>
								<td>$5.99</td>
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
							<tr>
								<td class="align-center">20</td>
								<td><a href="">Julius Caesar</a></td>
								<td>William Shakespeare</td>
								<td>politics</td>
								<td>288</td>
								<td>$5.99</td>
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
							<tr>
								<td class="align-center">21</td>
								<td><a href="">King Lear</a></td>
								<td>William Shakespeare</td>
								<td>tragedy</td>
								<td>384</td>
								<td>$5.99</td>
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
<c:import url="${pageContext.request.contextPath}/includes/footer.jsp" />