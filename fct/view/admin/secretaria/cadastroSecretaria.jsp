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

<div class="container_12">

	<!-- Form elements -->
	<div class="grid_12">

		<div class="module">
			<h2>
				<span>Cadastro Secretaria</span>
			</h2>

			<div class="module-body">

				<form action="cadastroAluno.do" method="post">

					<input type="hidden" name="pg" value="1" />

					<p>
						<label>Salario</label>
						<input type="text" class="input-short" name="salario" value="${salario}" id="salario" />
						<span class="notification-input ni-correct">This is	correct, thanks!</span>
					</p>
					<script>// Arruar a formatação  do salario
						jQuery(function($){
							$("#salario").mask("@N9,99")
							});
					</script>
					<p>
						<label>Hora Inicial</label>
						<input type="text" class="input-short" name="horarioInicial" value="${horarioInicial}" id="horarioInicial" />
						<span class="notification-input ni-correct">This is	correct, thanks!</span>
					</p>
					<script>
						jQuery(function($){
      							$("#horarioInicial").mask("99:99");
      						});
					</script>
					<p>
						<label>Hora Final</label>
						<input type="text" class="input-short" name="horarioFinal" value="${horarioFinal}" id="horarioFinal" />
						<span class="notification-input ni-correct">This is	correct, thanks!</span>
					</p>
					<script>
						jQuery(function($){
      							$("#horarioFinal").mask("99:99");
      						});
					</script>
					<p>
						<label>Data Admissão</label>
						<input type="text" class="input-short" name="dataAdmissao" value="${dataAdmissao}" id="dataAdmissao" />
						<span class="notification-input ni-correct">This is	correct, thanks!</span>
					</p>
					<script>
						jQuery(function($){
      							$("#dataAdmissao").mask("99/99/9999");
      						});
					</script>
					<fieldset>
						<input class="submit-green" type="submit" value="Próximo" /> <input
						class="submit-gray" type="submit" value="Cancelar" />
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
