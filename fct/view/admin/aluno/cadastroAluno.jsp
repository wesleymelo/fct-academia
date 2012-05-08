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
				<span>Cadastro Aluno</span>
			</h2>

			<div class="module-body">

				<form action="cadastroAluno.do" method="post">

					<input type="hidden" name="pg" value="1" />

					<p>
						<label>Nome <c:forEach begin="1" end="61">
                                     	&nbsp;
                                     </c:forEach> Data de Nascimento
						</label> <input type="text" class="input-short" name="nome"
							value="${nome}" id="nome" />

						<c:choose>
							<c:when test="${not empty erros['erronome'] }">
								<span class="notification-input ni-correct">This is
									correct, thanks!</span>
							</c:when>
							<c:otherwise>
								<c:forEach begin="1" end="23">
                                     		&nbsp;
                                     	</c:forEach>
							</c:otherwise>

						</c:choose>
						<input type="text" class="input-short" name="dataNasc" /> <span
							class="notification-input ni-error">Sorry, try again.</span>
					</p>

					<fieldset>
						<legend>Sexo</legend>
						<ul>
							<li><label><input type="radio" name="sexo"
									checked="checked" id="sexo" /> Feminino</label></li>
							<li><label><input type="radio" name="sexo" id="sexo" />
									Masculino</label></li>
						</ul>
					</fieldset>

					<p>

						<label>CPF <c:forEach begin="1" end="63">
                                     	&nbsp;
                                     </c:forEach> RG <c:forEach begin="1" end="62">
                                     	&nbsp;
                                     </c:forEach> Orgão Emissor
						</label> <input type="text" class="input-short" name="cpf" id="cpf" />
						<c:choose>
							<c:when test="${not empty erros['erroscpf'] }">
								<span class="notification-input ni-correct">This is
									correct, thanks!</span>
							</c:when>
							<c:otherwise>
								<c:forEach begin="1" end="23">
                                     		&nbsp;
                                     	</c:forEach>
							</c:otherwise>
						</c:choose>
						<input type="text" class="input-short" name="rg" id="rg" />
						<c:choose>
							<c:when test="${not empty erros['erroscpf'] }">
								<span class="notification-input ni-correct">This is
									correct, thanks!</span>
							</c:when>
							<c:otherwise>
								<c:forEach begin="1" end="23">
                                     		&nbsp;
                                     	</c:forEach>
							</c:otherwise>
						</c:choose>
						<select class="input">
							<option value="1">Option 1</option>
							<option value="2">Option 2</option>
							<option value="3">Option 3</option>
							<option value="4">Option 4</option>
						</select>
					</p>

					<p>
						<label>E-Mail <c:forEach begin="1" end="63">
                                     	&nbsp;
                                    </c:forEach> Celular
						</label> <input type="text" class="input-short" name="email" id="email" />
						<c:choose>
							<c:when test="${not empty erros['erroscpf'] }">
								<span class="notification-input ni-correct">This is
									correct, thanks!</span>
							</c:when>
							<c:otherwise>
								<c:forEach begin="1" end="23">
                                     		&nbsp;
                                     	</c:forEach>
							</c:otherwise>
						</c:choose>
						<input type="text" class="input-short" name="celular" id="celular" />
						<span class="notification-input ni-correct">This is
							correct, thanks!</span>
					</p>

					<p>
						<label>Telefone Residencial</label> <input type="text"
							class="input-short" name="residencial" id="residencial" /> <span
							class="notification-input ni-error">Sorry, try again.</span>
					</p>
					<p>
						<label>Altura</label> <input type="text" class="input-short"
							name="altura" id="altura" />
					</p>

					<p>
						<label>Peso</label> <input type="text" class="input-short"
							name="peso" id="peso" />
					</p>

					<p>
						<label>Naturalidade</label> <input type="text" class="input-short"
							name="natural" id="natural" />
					</p>

					<p>
						<label>Nacionalidade</label> <input type="text"
							class="input-short" name="nacional" id="nacional" />
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

<c:import url="../../includes/footer.jsp" />
