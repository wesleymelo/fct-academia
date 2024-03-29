<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<c:import url="../../includes/header.jsp" />


	<script>
		$(function() {
			// a workaround for a flaw in the demo system (http://dev.jqueryui.com/ticket/4375), ignore!
			$( "#dialog:ui-dialog" ).dialog( "destroy" );
		
			$( "#dialog-message" ).dialog({
				modal: true,
				height: 500,
				width: 650,
				buttons: {
					Ok: function() {
						$( this�).dialog( "close" );
					}
				}
			});
		});
	</script>
	
	<script type="text/javascript">
	function abrir(programa,janela)
	{
   		if(janela=="") janela = "janela";
   			window.open(programa,janela,'height=350,width=640');
	}
	</script>

<c:if test="${! empty param.show && param.show == true}">
<div id="dialog-message" title="<fmt:message key="visualizaAluno"/>">
		
					<h4>
						<fmt:message key="dadosPessoais"/>
					</h4>
					
					<b> <fmt:message key="nome"/>: </b>${aluno.nome} &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
					<b><fmt:message key="nascimento"/>: </b>${aluno.dateNascimentoString}<br/>
                    <b> <fmt:message key="cpf"/>: </b>${aluno.cpf} &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
                    <b><fmt:message key="sexo"/>: </b>${aluno.sexo.descricao}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <b> <fmt:message key="dataCadastro"/>: </b>${aluno.dateCadastroString}<br/>
                    <b><fmt:message key="status"/>: </b>${aluno.situacao}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <b> <fmt:message key="altura"/>: </b>${aluno.altura} &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
                    <b><fmt:message key="peso"/>: </b>${aluno.peso} kg<br/><br/>
                           
                
                	<h4>
						<fmt:message key="endereco"/>
					</h4>
					
					
					<b> <fmt:message key="logradouro"/>: </b>${aluno.endereco.enderecoResidencial} &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
					<b><fmt:message key="cidade"/>: </b>${aluno.endereco.cidade}<br/>
                    <b> <fmt:message key="bairro"/>: </b>${aluno.endereco.bairro} &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
                    <b><fmt:message key="complemento"/>: </b><c:out value="${aluno.endereco.complemento}: " default="vazio"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <b> <fmt:message key="uf"/>: </b>${aluno.endereco.uf}<br/>
                    <b><fmt:message key="cep"/>: </b>${aluno.endereco.cep}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <b> <fmt:message key="numero"/>: </b>${aluno.endereco.numero}<br/><br/>
                	
                	<h4>
						<fmt:message key="contatos"/>
					</h4>
                
                
                	<table>
                		<thead>
                			<c:forEach var="telefone" items="${aluno.telefones}">
	                			<tr>
										<td>	
											<b><fmt:message key="numero"/>:</b> (${telefone.ddd}) ${telefone.numero}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
										</td>
										<td>
											<b><fmt:message key="tipo"/>:</b> ${telefone.tipo.descricao}
										</td>
										
								</tr>
							</c:forEach>
                		</thead>
					</table>
					<b> <fmt:message key="email"/>: </b>${aluno.email}<br/><br/>
		                    
</div>
</c:if>

<div class="container_12">
	
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
	
	
	<!-- Form elements -->
	<div class="grid_12">

		<div class="module">
			<h2><span><fmt:message key="addAlunoEnvelope" /></span></h2>
					
			<div class="module-body">

				<form action="cadastraAlunoNoEnvelope.do" method="post">
					<input type="hidden" name="idAluno" id="idAluno" />
					<input type="hidden" name="idEnvelope" id="idEnvelope" value="${param.id}" />
					
					<p>
                        <label><fmt:message key="aluno"/></label>
                        <input type="text" value="${param.aluno}" class="input-short" name="aluno" id="aluno" readonly="readonly" value="${aluno}" /><a href="javascript:abrir('buscaAlunoEnvelope.do')"> <fmt:message key="buscar"/> </a>
                    
                        <c:if test="${not empty erros['erroaluno'] }">
							<span class="notification-input ni-error"><fmt:message key="aluno_invalido"/></span>
						</c:if>
						
						<c:if test="${not empty erros['erroaluno_duplicado'] }">
							<span class="notification-input ni-error"><fmt:message key="aluno_duplicado"/></span>
						</c:if>                        
					</p>

					<fieldset>
						<input class="submit-green" type="submit" value="<fmt:message key="inserir"/>" /> 
						<input class="submit-gray" type="reset" value="<fmt:message key="bt_limpar"/>" />
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
			
			
			<form action="buscaAluno.do" method="post">
				<fieldset>
					<b><fmt:message key="nome" /></b> <input type="text" name="busca"
						class="input-short" />&nbsp;&nbsp;<input class="submit-green"
						type="submit" value="<fmt:message key="pesquisar"/>" />
				</fieldset>
			</form>
			
			&nbsp;&nbsp;
		</div>

		<!-- Example table -->
		<div class="module">
			<h2>
				<span><fmt:message key="turma" /><c:out value=": ${turma.nome}" /></span>
			</h2>

			<%-- Vari�veis para pagina��o --%>
			<c:if test="${empty param.pag}">
				<c:set var="pag" value="${1}" scope="page" />
			</c:if>

			<c:if test="${not empty param.pag}">
				<c:set var="pag" value="${param.pag}" scope="page" />
			</c:if>

			<c:set var="tamPag" value="${40}" scope="page" />


			<c:set var="inicio" value="${pag * tamPag - tamPag}" scope="page" />


			<c:set var="fim" value="${(pag * tamPag) - 1}" scope="page" />

			<div class="module-table-body">
				<form action="">
					<table id="myTable" class="tablesorter">
						<thead>
							<tr>
								<th style="width: 25%"><fmt:message  key="nome"/></th>
								<th style="width: 10%"><fmt:message  key="cpf"/></th>
								<th style="width: 10%"><fmt:message  key="nascimento"/></th>
								<th style="width: 15%"><fmt:message  key="telefones"/></th>
								<th style="width: 25%"><fmt:message  key="email"/></th>
								<th style="width: 08%"><fmt:message  key="sexo"/></th>
								<th style="width: 10%"><fmt:message  key="acoes"/></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="aluno" items="${alunos}" varStatus="i" begin="${inicio}" end="${fim}" >
								<tr>
									<td>${aluno.nome}</td>
									<td>${aluno.cpf}</td>
									<td>${aluno.dateNascimentoString}</td>
									<td><c:forEach var="telefone" items="${aluno.telefones}">
											(${telefone.ddd}) ${telefone.numero} <br />
										</c:forEach></td>

									<td>${aluno.email}</td>
									<td>${aluno.sexo.descricao}</td>
									<td>		
											<a href="${pageContext.request.contextPath}/view/admin/aluno/alteraAluno.do?codigo=${aluno.idPessoa }"><img
											src="${pageContext.request.contextPath}/view/images/pencil.gif"
											tppabs="http://www.xooom.pl/work/magicadmin/images/pencil.gif"
											width="16" height="16" alt="<fmt:message  key="alterar"/>" /></a> 
								
											<a href=""><img
											src="${pageContext.request.contextPath}/view/images/bin.gif"
											tppabs="http://www.xooom.pl/work/magicadmin/images/bin.gif"
											width="16" height="16" alt="<fmt:message  key="excluir"/>" /></a>
											
											<a href="visualizaAluno.do?id=${aluno.idPessoa}"><img
											src="${pageContext.request.contextPath}/view/images/view.png"
											width="16" height="16" alt="<fmt:message key="view"/>" /></a>
									</td>
											
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</form>
				
				<c:if test="${fn:length(alunos) % tamPag == 0}">
						<c:set var="numPags" value="${fn:length(alunos) / tamPag }" />
				</c:if>
				<c:if test="${fn:length(alunos) % tamPag != 0}">
						<c:set var="numPags" value="${(fn:length(alunos) / tamPag)+1}" />
				</c:if>
				
				<div class="pager" id="pager">
					<form action="">
						<div>
							<img class="first" src="${pageContext.request.contextPath}/view/images/arrow-stop-180.gif" alt="first" /> 
							<img class="prev" src="${pageContext.request.contextPath}/view/images/arrow-180.gif" alt="prev" /> 
							
							
							<input type="text" class="pagedisplay input-short align-center" /> 
								
							<img class="next" src="${pageContext.request.contextPath}/view/images/arrow.gif" alt="next" /> 
							<img class="last" src="${pageContext.request.contextPath}/view/images/arrow-stop.gif" alt="last" /> 
							
							<select class="pagesize input-short align-center">
								<option value="20" selected="selected">20</option>
								<option value="40">40</option>
								<option value="60">60</option>
								<option value="80">80</option>
								<option value="100">100</option>
							</select>
							
						</div>
					</form>
				</div>

			</div>
			
			<!-- End .module-table-body -->
			<div style="clear: both"></div>			
		</div>
		<!-- End .module -->

		<div class="pagination">
			<a href="${pageContext.request.contextPath}/view/admin/aluno/listaAlunos.do?pag=1" class="button"><span><img
					src="${pageContext.request.contextPath}/view/images/arrow-stop-180-small.gif"
					height="9" width="12" alt="First" /><fmt:message key="primeiro"/></span>
			</a> 
					
					
					
			<a href="${pageContext.request.contextPath}/view/admin/aluno/listaAlunos.do?pag=<c:if test="${pag > 1}">${pag - 1}</c:if><c:if test="${pag == 1}">1</c:if>"
					class="button"><span>
					<img src="${pageContext.request.contextPath}/view/images/arrow-180-small.gif"
					height="9" width="12" alt="Previous" /><fmt:message key="anterior"/></span>
		    </a>
			<div class="numbers">
				<span><fmt:message key="pg"/></span>
				
				
				<%-- Links para as outras p�ginas --%>
				<c:forEach var="i" begin="1" end="${numPags}">
					<c:if test="${i == pag}">
						<c:out value="${i}" />
					</c:if>
					<c:if test="${i != pag}">
						<a href="${pageContext.request.contextPath}/view/admin/aluno/listaAlunos.do?pag=${i}"><c:out value="${i}" /></a>
					</c:if>
					<c:if test="${i < numPags}">
						<span>|</span>
					</c:if>	
				</c:forEach>
			</div>
			
			<a href="${pageContext.request.contextPath}/view/admin/aluno/listaAlunos.do?pag=<c:if test="${pag < numPags}">${pag + 1}</c:if> <c:if test="${pag == numPags}">${pag}</c:if>" class="button"><span><fmt:message key="proximo"/> <img
					src="${pageContext.request.contextPath}/view/images/arrow-000-small.gif"
					height="9" width="12" alt="Next" /></span>
			</a> 
					
			<a href="${pageContext.request.contextPath}/view/admin/aluno/listaAlunos.do?pag=<c:out value="${numPags}"/>" class="button last"><span><fmt:message key="ultimo"/><img
					src="${pageContext.request.contextPath}/view/images/arrow-stop-000-small.gif"
					height="9" width="12" alt="Last" /></span>
			</a>
			<div style="clear: both;"></div>
		</div>




	</div>
	<!-- End .grid_12 -->



	<div style="clear: both;"></div>
</div>
<!-- End .container_12 -->
<c:import url="../../includes/footer.jsp" />