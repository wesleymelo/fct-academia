<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

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
                        </div><!-- End. #Logo -->
                    </div><!-- End. .grid_12-->
                    <div style="clear: both;"></div>
                </div><!-- End. .container_12 -->
            </div> <!-- End #header-main -->
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
                        
                    </div><!-- End. .grid_12-->
                </div><!-- End. .container_12 -->
                <div style="clear: both;"></div>
            </div> <!-- End #subnav -->
        </div> <!-- End #header -->
        
		<div class="container_12">
        
          <!-- Form elements -->    
            <div class="grid_12">
            
                <div class="module">
                     <h2><span>Cadastro Aluno</span></h2>
                        
                     <div class="module-body">
                        <form action="cadastroAluno.do" method="post">
                   
                        	<input type="hidden" name="pg" value="2"/>
                   
                            <p>
                                <label><fmt:message key="endereco"/></label>
                                <input type="text" class="input-medium" name="endereco" id="endereco"/>
                                <c:if test="${not empty erros['erroendereco'] }">
									<span class="notification-input ni-correct"><fmt:message key="endereco_invalido"/></span>
								</c:if>
                            </p>
                            
                            <p>
                                <label><fmt:message key="cidade" /></label>
                                <input type="text" class="input-short" name="cidade" />
                                <c:if test="${not empty erros['errocidade'] }">
									<span class="notification-input ni-correct"><fmt:message key="cidade_invalida"/></span>
								</c:if>
                            </p>
                            
                            <p>
                                <label><fmt:message key="bairro"/></label>
                                <input type="text" class="input-short" name="bairro" />
                                <c:if test="${not empty erros['errobairro'] }">
									<span class="notification-input ni-correct"><fmt:message key="bairro_invalido"/></span>
								</c:if>
                            </p>
                            
                            <p>
                                <label><fmt:message key="cep" /></label>
                                <input type="text" class="input-short" name="cep" />
                                <c:if test="${not empty erros['errocep'] }">
									<span class="notification-input ni-correct"><fmt:message key="cep_invalido"/></span>
								</c:if>
                            </p>
  							
  							<label>UF
	  							<select class="input">
										<option value="1">Option 1</option>
									    <option value="2">Option 2</option>
										<option value="3">Option 3</option>
										<option value="4">Option 4</option>
								</select>
							</label>
                            
                            <p>
                                <label><fmt:message key="numero"/></label>
                                <input type="text" class="input-short" name="numero" />
                                <c:if test="${not empty erros['erronumero'] }">
									<span class="notification-input ni-correct"><fmt:message key="numero_invalido"/></span>
								</c:if>
                            </p>
                                
                            <p>
                                <label><fmt:message key="complemento"/></label>
                                <input type="text" class="input-medium" name="complemento" id="cpf" />
                            </p>
                            
                            <fieldset>
                                <input class="submit-green" type="submit" value="Enviar" /> 
                                <input class="submit-gray" type="submit" value="Cancelar" />
                            </fieldset>
                            
                        </form>
                     </div> <!-- End .module-body -->

                </div>  <!-- End .module -->
        		<div style="clear:both;"></div>
            </div> <!-- End .grid_12 -->
            <div style="clear:both;"></div>
        </div> <!-- End .container_12 -->
		
           
<c:import url="../../includes/footer.jsp" />