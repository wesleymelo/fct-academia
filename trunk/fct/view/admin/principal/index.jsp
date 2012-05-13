<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
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
				<li><a href="#">Alunos</a></li>
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
<!-- Dashboard icons -->
<div class="container_12">
	<div class="grid_7">
		<a href="" class="dashboard-module"> <img
			src="${pageContext.request.contextPath}/view/images/Crystal_Clear_write.gif"
			tppabs="http:/www.xooom.pl/work/magicadmin/images/Crystal_Clear_write.gif"
			width="64" height="64" alt="edit" /> <span>New article</span>
		</a> <a href="" class="dashboard-module"> <img
			src="${pageContext.request.contextPath}/view/images/Crystal_Clear_file.gif"
			tppabs="http:/www.xooom.pl/work/magicadmin/images/Crystal_Clear_file.gif"
			width="64" height="64" alt="edit" /> <span>Upload file</span>
		</a> <a href="" class="dashboard-module"> <img
			src="${pageContext.request.contextPath}/view/images/Crystal_Clear_files.gif"
			tppabs="http:/www.xooom.pl/work/magicadmin/images/Crystal_Clear_files.gif"
			width="64" height="64" alt="edit" /> <span>Articles</span>
		</a> <a href="" class="dashboard-module"> <img
			src="${pageContext.request.contextPath}/view/images/Crystal_Clear_calendar.gif"
			tppabs="http:/www.xooom.pl/work/magicadmin/images/Crystal_Clear_calendar.gif"
			width="64" height="64" alt="edit" /> <span>Calendar</span>
		</a> <a href="" class="dashboard-module"> <img
			src="${pageContext.request.contextPath}/view/images/Crystal_Clear_user.gif"
			tppabs="http:/www.xooom.pl/work/magicadmin/images/Crystal_Clear_user.gif"
			width="64" height="64" alt="edit" /> <span>My profile</span>
		</a> <a href="" class="dashboard-module"> <img
			src="${pageContext.request.contextPath}/view/images/Crystal_Clear_stats.gif"
			tppabs="http:/www.xooom.pl/work/magicadmin/images/Crystal_Clear_stats.gif"
			width="64" height="64" alt="edit" /> <span>Stats</span>
		</a> <a href="" class="dashboard-module"> <img
			src="${pageContext.request.contextPath}/view/images/Crystal_Clear_settings.gif"
			tppabs="http:/www.xooom.pl/work/magicadmin/images/Crystal_Clear_settings.gif"
			width="64" height="64" alt="edit" /> <span>Settings</span>
		</a>
		<div style="clear: both"></div>
	</div>
	<!-- End .grid_7 -->
	<!-- Account overview -->
	<div class="grid_5">
		<div class="module">
			<h2>
				<span>Account overview</span>
			</h2>

			<div class="module-body">

				<p>
					<strong>User: </strong>User X<br /> <strong>Your last
						visit was on: </strong>20 January 2010,<br /> <strong>From IP: </strong>000.000.00.00
				</p>

				<div>
					<div class="indicator">
						<div style="width: 23%;"></div>
						<!-- change the width value (23%) to dynamically control your indicator -->
					</div>
					<p>Your storage space: 23 MB out of 100MB</p>
				</div>

				<div>
					<div class="indicator">
						<div style="width: 100%;"></div>
						<!-- change the width value (100%) to dynamically control your indicator -->
					</div>
					<p>Your bandwidth (January): 1 GB out of 1 GB</p>
				</div>

					Need to switch to a bigger plan?<br /> <a href="">click here</a><br />
				</p>

			</div>
		</div>
		<div style="clear: both;"></div>
	</div>
	<!-- End .grid_5 -->
	<div style="clear: both;"></div>
</div>
<!-- End .container_12 -->
<c:import url="../../includes/footer.jsp" />