<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<c:import url="../../includes/header.jsp" />
            
            
        
		<div class="container_12">
        
          <!-- Form elements -->    
            <div class="grid_12">
            
                <div class="module">
                     <h2><span><fmt:message key="cadastroSecretaria"/></span></h2>
                        
                     <div class="module-body">
                        <form action="cadastroSecretaria.do?codigo=${codigo}" method="post">
                   
                        	<input type="hidden" name="pg" value="4"/>
                   
                            
                            <p>
                                <label><fmt:message key="cidade" /></label>
                                <input type="text" class="input-short" name="cidade" value="${cidade }" />
                                <c:if test="${not empty erros['errocidade'] }">
									<span class="notification-input ni-error"><fmt:message key="cidade_invalida"/></span>
								</c:if>
                            </p>
                            
                            <p>
                                <label><fmt:message key="bairro"/></label>
                                <input type="text" class="input-short" name="bairro" value="${bairro }" />
                                <c:if test="${not empty erros['errobairro'] }">
									<span class="notification-input ni-error"><fmt:message key="bairro_invalido"/></span>
								</c:if>
                            </p>
                            
                            <p>
                                <label><fmt:message key="cep" /></label>
                                <input type="text" class="input-short" name="cep" value="${cep }" />
                                <c:if test="${not empty erros['errocep'] }">
									<span class="notification-input ni-error"><fmt:message key="cep_invalido"/></span>
								</c:if>
                            </p>
  							
  							<label>UF
	  							<select class="input" name="uf">
										<c:forEach items="${estados }" var="estado" >
											<option value="${estado.sigla }"><c:out value="${estado.sigla }" /></option>
										</c:forEach>
								</select>
							</label>
                            
                            <p>
                                <label><fmt:message key="endereco"/></label>
                                <input type="text" class="input-medium" name="endereco" id="endereco" value="${endereco }" />
                                <c:if test="${not empty erros['erroendereco'] }">
									<span class="notification-input ni-error"><fmt:message key="endereco_invalido"/></span>
								</c:if>
                            </p>
                            
                            <p>
                                <label><fmt:message key="numero"/></label>
                                <input type="text" class="input-short" name="numero" value="${numero }" />
                                <c:if test="${not empty erros['erronumero'] }">
									<span class="notification-input ni-error"><fmt:message key="numero_invalido"/></span>
								</c:if>
                            </p>
                                
                            <p>
                                <label><fmt:message key="complemento"/></label>
                                <input type="text" class="input-medium" name="complemento" id="cpf" value="${complemento }" />
                            </p>
                            
                            <fieldset>
                                <input class="submit-green" type="submit" value="<fmt:message key="bt_enviar"/>" /> 
                                <input class="submit-gray" type="submit" value="<fmt:message key="bt_cancelar"/>" />
                            </fieldset>
                            
                        </form>
                     </div> <!-- End .module-body -->

                </div>  <!-- End .module -->
        		<div style="clear:both;"></div>
            </div> <!-- End .grid_12 -->
            <div style="clear:both;"></div>
        </div> <!-- End .container_12 -->
		
           
<c:import url="../../includes/footer.jsp" />