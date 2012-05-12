<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>.:: FCT - Fl&aacute;vio Carvalho Team ::.</title>

<!-- CSS Reset -->
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/view/css/reset.css"
	tppabs="http://www.xooom.pl/work/magicadmin/css/reset.css"
	media="screen" />

<!-- Fluid 960 Grid System - CSS framework -->
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/view/css/grid.css"
	tppabs="http://www.xooom.pl/work/magicadmin/css/grid.css"
	media="screen" />

<!-- IE Hacks for the Fluid 960 Grid System -->
<!--[if IE 6]><link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/view/css/ie6.css" tppabs="http://www.xooom.pl/work/magicadmin/css/ie6.css" media="screen" /><![endif]-->
<!--[if IE 7]><link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/view/css/ie.css" tppabs="http://www.xooom.pl/work/magicadmin/css/ie.css" media="screen" /><![endif]-->

<!-- Main stylesheet -->
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/view/css/styles.css"
	tppabs="http://www.xooom.pl/work/magicadmin/css/styles.css"
	media="screen" />

<!-- Themes. Below are several color themes. Uncomment the line of your choice to switch to different color. All styles commented out means blue theme. -->
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/view/css/theme.css"
	tppabs="http://www.xooom.pl/work/magicadmin/css/theme-blue.css"
	media="screen" />
<!--<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/view/css/theme-red.css" media="screen" />-->
<!--<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/view/css/theme-yellow.css" media="screen" />-->
<!--<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/view/css/theme-green.css" media="screen" />-->
<!--<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/view/css/theme-graphite.css" media="screen" />-->

<!-- JQuery engine script-->
<script type="text/javascript" src="${pageContext.request.contextPath}/view/js/jquery-1.3.2.min.js"
	tppabs="http://www.xooom.pl/work/magicadmin/js/jquery-1.3.2.min.js"></script>

<!-- JQuery password strength plugin script -->
<script type="text/javascript" src="${pageContext.request.contextPath}/view/js/jquery.pstrength-min.1.2.js"
	tppabs="http://www.xooom.pl/work/magicadmin/js/jquery.pstrength-min.1.2.js"></script>

<!-- JQuery thickbox plugin script -->
<script type="text/javascript" src="${pageContext.request.contextPath}/view/js/thickbox.js"
	tppabs="http://www.xooom.pl/work/magicadmin/js/thickbox.js"></script>

<!-- JQuery thickbox plugin script -->
<script type="text/javascript" src="${pageContext.request.contextPath}/view/js/jquery.masked-input-plugin.js"></script>



</head>
<body>
	<!-- Header -->
	<div id="header">



		<div style="clear: both;"></div>

	</div>
	<!-- End #header -->
	<!-- Dashboard icons -->
	<div class="container_login">
		<!-- Password -->
		<div class="grid_login">
			<div class="module">
				<h2>
					<span><center>Realize seu Login</center></span>
				</h2>

				<div class="module-body">
					<form action="autenticaLogin.do" " method="post">
						<p>
							<label>CPF:</label> <input class="input-short" type="text"
								name="cpf" id="cpf" size="15" maxlength="14" /> <span
								class="notification-input ni-correct">This is correct,
								thanks!</span>
							<script>
									jQuery(function($){
		       							$("#cpf").mask("999.999.999-99");
		       						});
								</script>
						</p>

						<p>
							<label>Senha:</label> <input class="input-short" type="password"
								name="senha" id="senha" /> <span
								class="notification-input ni-error">Sorry, try again.</span>
						</p>




						<fieldset>
							<input class="submit-green" type="submit" value="Entrar" /> <input
								class="submit-gray" type="reset" value="Limpar" />
						</fieldset>
					</form>

				</div>
				<!-- End .module-body -->
			</div>
			<!-- End .module -->
			<div style="clear: both;"></div>
		</div>
		<!-- End .grid_6 -->
		<div style="clear: both;"></div>
	</div>
	<!-- End .container_12 -->
</body>	
</html>
