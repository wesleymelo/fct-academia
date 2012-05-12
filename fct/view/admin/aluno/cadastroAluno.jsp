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
				<span>Cadastro Aluno</span>
			</h2>

			<div class="module-body">

				<form action="cadastroAluno.do" method="post">

					<input type="hidden" name="pg" value="1" />

					<p>
						<label>Nome</label>
						<input type="text" class="input-short" name="nome" value="${nome}" id="nome" />
						<span class="notification-input ni-correct">This is	correct, thanks!</span>
					</p>
					
					<p>
                        <label>Data de Nascimento</label> 
                        <input type="text" class="input-short-short" name="dataNasc" id="dataNasc"/> 
                        <span class="notification-input ni-error">Sorry, try again.</span>
					</p>
					
					<script>
						jQuery(function($){
      							$("#dataNasc").mask("99/99/9999");
      						});
					</script>

					<fieldset>
						<ul>
							<li><label>Sexo:&nbsp;&nbsp;&nbsp;<input type="radio" name="sexo"	checked="checked" id="sexo" value="F" />&nbsp;&nbsp;Feminino &nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="sexo" id="sexo" value="M" />&nbsp;&nbsp;Masculino</label></li>
						</ul>
					</fieldset>

					<p>
					
						<label>CPF</label> 
						<input type="text" class="input-short-short" name="cpf" id="cpf" />
						<span class="notification-input ni-correct">This is correct, thanks!</span>
					
					</p>
					
					<script>
						jQuery(function($){
      							$("#cpf").mask("999.999.999.99");
      						});
					</script>

					<p>
						<label>E-Mail</label> 
						<input type="text" class="input-short" name="email" id="email" />
						<span class="notification-input ni-correct">This is correct, thanks!</span>
					<p>
					
					<p>	
						<label>Telefone Celular</label>
						<input type="text" class="input-short-short" name="celular" id="celular" />
						<span class="notification-input ni-correct">This is	correct, thanks!</span>
					</p>
					
					<script>
						jQuery(function($){
      							$("#celular").mask("(99)9999-9999");
      						});
					</script>

					<p>
						<label>Telefone Residencial</label> <input type="text" class="input-short-short" name="residencial" id="residencial" /> 
						<span class="notification-input ni-error">Sorry, try again.</span>
					</p>
					
					<script>
						jQuery(function($){
      							$("#residencial").mask("(99)9999-9999");
      						});
					</script>
					
					<p>
						<label>Telefone Comercial</label> 
						<input type="text" class="input-short-short" name="comercial" id="comercial" /> 
						<span class="notification-input ni-error">Sorry, try again.</span>
					</p>
					
					<script>
						jQuery(function($){
      							$("#comercial").mask("(99)9999-9999");
      						});
					</script>
					
					<p>
						<label>Altura</label> <input type="text" class="input-short-short" name="altura" id="altura" />
					</p>

					<p>
						<label>Peso</label> <input type="text" class="input-short-short" name="peso" id="peso" />
					</p>

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

<c:import url="${pageContext.request.contextPath}/includes/footer.jsp" />
