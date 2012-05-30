<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<c:import url="../../includes/header.jsp" />
    
		<div class="container_12">
        
		<div style="clear:both;"></div>
		<div class="grid_12">
               <div class="module">
                    <h2><span><fmt:message key="aluno"/></span></h2>
                    	<div class="module-body">
	                    	<div id="dialog-message" title="<fmt:message key="visualizaAluno"/>">
		
							<h4>
								<fmt:message key="dadosPessoais"/>
							</h4>
							
							<b> <fmt:message key="nome"/>: </b>${sessionScope.nome}<br/><br/> 
							<b><fmt:message key="nascimento"/>: </b>${sessionScope.dataNasc}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<c:choose> 
								<c:when test="${sessionScope.sexo eq 'F'}">
									<b><fmt:message key="sexo"/>: </b><fmt:message key="feminino"/><br/><br/>
								</c:when>
								<c:otherwise>
									<b><fmt:message key="sexo"/>: </b><fmt:message key="masculino"/><br/><br/>
								</c:otherwise>
							</c:choose>
							
							<b><fmt:message key="sexo"/>: </b>${sessionScope.sexo}<br/><br/>
		                    <b> <fmt:message key="cpf"/>: </b>${sessionScope.cpf} <br/><br/> 
		                    <b> <fmt:message key="altura"/>: </b>${sessionScope.altura}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		                    <b><fmt:message key="peso"/>: </b>${sessionScope.peso} kg<br/><br/><br/>
		                           
		                	<h4>
								<fmt:message key="contatos"/>
							</h4>
		                
		                    <c:if test="${not empty sessionScope.telefones}">
			                	<table>
			                		<thead>
			                			<c:forEach var="telefone" items="${sessionScope.telefones}">
				                			<tr>
													<td>	
														<b><fmt:message key="numero"/>:</b> (${telefone.ddd}) ${telefone.numero}
													</td>
													<td>
														<b><fmt:message key="tipo"/>:</b> ${telefone.tipo.descricao}
													</td>
													
											</tr>
										</c:forEach>
			                		</thead>
								</table>
							</c:if>
							<b> <fmt:message key="email"/>: </b>${sessionScope.email}<br/><br/>
	                    </div>
	                    <div style="clear:both;"></div>
	                </div>
                    <div style="clear:both;"></div>
               </div> <!-- module -->
               <div style="clear:both;"></div>
		</div> <!-- End .grid_12 -->
        
        
          <!-- Form elements -->    
            <div class="grid_12">
            
                <div class="module">
                     <h2><span><fmt:message key="cadastroAluno" /></span></h2>
                        
                     <div class="module-body">
                     
                        <form action="cadastroAluno.do?codigo=${param.codigo }" method="post">
                   
                        	<input type="hidden" name="pg" value="2"/>
                   
                           
                            
                            <p>
                                <label><fmt:message key="cidade" /></label>
                                <input type="text" class="input-short" name="cidade" value="${cidade }" />
                                <c:if test="${not empty erros['errocidade'] }">
									<span class="notification-input ni-error"><fmt:message key="cidade_invalida"/></span>
								</c:if>
                            </p>
                            
                            <p>
                                <label><fmt:message key="bairro"/></label>
                                <input type="text" class="input-short" name="bairro" value="${ bairro }" />
                                <c:if test="${not empty erros['errobairro'] }">
									<span class="notification-input ni-error"><fmt:message key="bairro_invalido"/></span>
								</c:if>
                            </p>
                            
                            <p>
                                <label><fmt:message key="cep" /></label>
                                <input type="text" class="input-short" name="cep" value="${ cep }" />
                                <c:if test="${not empty erros['errocep'] }">
									<span class="notification-input ni-error"><fmt:message key="cep_invalido"/></span>
								</c:if>
                            </p>
                            
                            <script>
								jQuery(function($){
									$("#cep").mask("99.999-999");
		      					});
							</script>
  							
  							<label><fmt:message key="uf" /></label>
	  							<select class="input" name="uf" >
										<c:forEach items="${estados }" var="estado" >
											<option value="${estado.sigla }"
												<c:if test="${uf==estado.sigla }">
													 selected="selected"
												</c:if>
											><c:out value="${estado.sigla }" /></option>
										</c:forEach>
								</select>
							</label>
                            
                            
                             <p>
                                <label><fmt:message key="endereco"/></label>
                                <input type="text" class="input-medium" name="endereco" id="endereco" value="${ endereco }" />
                                <c:if test="${not empty erros['erroendereco'] }">
									<span class="notification-input ni-error"><fmt:message key="endereco_invalido"/></span>
								</c:if>
                            </p>
                            
                            
                            <p>
                                <label><fmt:message key="numero"/></label>
                                <input type="text" class="input-short" name="numero" value="${ numero }" />
                                <c:if test="${not empty erros['erronumero'] }">
									<span class="notification-input ni-error"><fmt:message key="numero_invalido"/></span>
								</c:if>
                            </p>
                                
                            <p>
                                <label><fmt:message key="complemento"/></label>
                                <input type="text" class="input-medium" name="complemento" id="complemento" value="${ complemento }" />
                            </p>
                            
                            <fieldset>
                                <input class="submit-green" type="submit" value="<fmt:message key="bt_enviar"/>" name="enviar" /> 
                                <input class="submit-gray" type="submit" value="<fmt:message key="back"/>" name="voltar" />
                            </fieldset>
                            
                        </form>
                     </div> <!-- End .module-body -->

                </div>  <!-- End .module -->
        		<div style="clear:both;"></div>
            </div> <!-- End .grid_12 -->
            <div style="clear:both;"></div>
        </div> <!-- End .container_12 -->
		
           
<c:import url="../../includes/footer.jsp" />