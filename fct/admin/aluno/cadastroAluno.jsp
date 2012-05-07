<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="content-type" content="text/html; charset=utf-8" />
		<title>Magic Admin. Advanced, Beautiful and Customizable Admin Template.</title>
       
        <!-- CSS Reset -->
		<link rel="stylesheet" type="text/css" href="../css/reset.css" tppabs="http://www.xooom.pl/work/magicadmin/css/reset.css" media="screen" />
       
        <!-- Fluid 960 Grid System - CSS framework -->
		<link rel="stylesheet" type="text/css" href="../css/grid.css" tppabs="http://www.xooom.pl/work/magicadmin/css/grid.css" media="screen" />
		
        <!-- IE Hacks for the Fluid 960 Grid System -->
        <!--[if IE 6]><link rel="stylesheet" type="text/css" href="../ie6.css" tppabs="http://www.xooom.pl/work/magicadmin/css/ie6.css" media="screen" /><![endif]-->
		<!--[if IE 7]><link rel="stylesheet" type="text/css" href="../ie.css" tppabs="http://www.xooom.pl/work/magicadmin/css/ie.css" media="screen" /><![endif]-->
        
        <!-- Main stylesheet -->
        <link rel="stylesheet" type="text/css" href="../css/styles.css" tppabs="http://www.xooom.pl/work/magicadmin/css/styles.css" media="screen" />
        
        <!-- WYSIWYG editor stylesheet -->
        <link rel="stylesheet" type="text/css" href="../css/jquery.wysiwyg.css" tppabs="http://www.xooom.pl/work/magicadmin/css/jquery.wysiwyg.css" media="screen" />
        
        <!-- Table sorter stylesheet -->
        <link rel="stylesheet" type="text/css" href="../css/tablesorter.css" tppabs="http://www.xooom.pl/work/magicadmin/css/tablesorter.css" media="screen" />
        
        <!-- Thickbox stylesheet -->
        <link rel="stylesheet" type="text/css" href="../css/thickbox.css" tppabs="http://www.xooom.pl/work/magicadmin/css/thickbox.css" media="screen" />
        
        <!-- Themes. Below are several color themes. Uncomment the line of your choice to switch to different color. All styles commented out means blue theme. -->
        <link rel="stylesheet" type="text/css" href="../css/theme.css" tppabs="http://www.xooom.pl/work/magicadmin/css/theme-blue.css" media="screen" />
        <!--<link rel="stylesheet" type="text/css" href="../css/theme-red.css" media="screen" />-->
        <!--<link rel="stylesheet" type="text/css" href="../css/theme-yellow.css" media="screen" />-->
        <!--<link rel="stylesheet" type="text/css" href="../css/theme-green.css" media="screen" />-->
        <!--<link rel="stylesheet" type="text/css" href="../css/theme-graphite.css" media="screen" />-->
        
		<!-- JQuery engine script-->
		<script type="text/javascript" src="../js/jquery-1.3.2.min.js" tppabs="http://www.xooom.pl/work/magicadmin/js/jquery-1.3.2.min.js"></script>
        
		<!-- JQuery WYSIWYG plugin script -->
		<script type="text/javascript" src="../js/jquery.wysiwyg.js" tppabs="http://www.xooom.pl/work/magicadmin/js/jquery.wysiwyg.js"></script>
        
        <!-- JQuery tablesorter plugin script-->
		<script type="text/javascript" src="../js/jquery.tablesorter.min.js" tppabs="http://www.xooom.pl/work/magicadmin/js/jquery.tablesorter.min.js"></script>
        
		<!-- JQuery pager plugin script for tablesorter tables -->
		<script type="text/javascript" src="../js/jquery.tablesorter.pager.js" tppabs="http://www.xooom.pl/work/magicadmin/js/jquery.tablesorter.pager.js"></script>
        
		<!-- JQuery password strength plugin script -->
		<script type="text/javascript" src="../js/jquery.pstrength-min.1.2.js" tppabs="http://www.xooom.pl/work/magicadmin/js/jquery.pstrength-min.1.2.js"></script>
        
		<!-- JQuery thickbox plugin script -->
		<script type="text/javascript" src="../js/thickbox.js" tppabs="http://www.xooom.pl/work/magicadmin/js/thickbox.js"></script>
        
        <!-- Initiate WYIWYG text area -->
		<script type="text/javascript">
			$(function()
			{
			$('#wysiwyg').wysiwyg(
			{
			controls : {
			separator01 : { visible : true },
			separator03 : { visible : true },
			separator04 : { visible : true },
			separator00 : { visible : true },
			separator07 : { visible : false },
			separator02 : { visible : false },
			separator08 : { visible : false },
			insertOrderedList : { visible : true },
			insertUnorderedList : { visible : true },
			undo: { visible : true },
			redo: { visible : true },
			justifyLeft: { visible : true },
			justifyCenter: { visible : true },
			justifyRight: { visible : true },
			justifyFull: { visible : true },
			subscript: { visible : true },
			superscript: { visible : true },
			underline: { visible : true },
            increaseFontSize : { visible : false },
            decreaseFontSize : { visible : false }
			}
			} );
			});
        </script>
        
        <!-- Initiate tablesorter script -->
        <script type="text/javascript">
			$(document).ready(function() { 
				$("#myTable") 
				.tablesorter({
					// zebra coloring
					widgets: ['zebra'],
					// pass the headers argument and assing a object 
					headers: { 
						// assign the sixth column (we start counting zero) 
						6: { 
							// disable it by setting the property sorter to false 
							sorter: false 
						} 
					}
				}) 
			.tablesorterPager({container: $("#pager")}); 
		}); 
		</script>
        
        <!-- Initiate password strength script -->
		<script type="text/javascript">
			$(function() {
			$('.password').pstrength();
			});
        </script>
	</head>
	<body>
	
		
    	<!-- Header -->
        <div id="header">
            <!-- Header. Status part -->
            <div id="header-status">
                <div class="container_12">
                    <div class="grid_8">
					&nbsp;
                    </div>
                    <div class="grid_4">
                        <a href="" id="logout">
                        Logout
                        </a>
                    </div>
                </div>
                <div style="clear:both;"></div>
            </div> <!-- End #header-status -->
            
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
                   
                        	<input type="hidden" name="pg" value="1"/>
                   
                            <p>
                                <label>Nome
                                     <c:forEach begin="1" end="61">
                                     	&nbsp;
                                     </c:forEach>
                                	 Data de Nascimento
                                </label>
                                
                                <input type="text" class="input-short" name="nome" value="${nome}" id="nome"/>
                                
                                <c:choose>
                                	<c:when test="${not empty erros['erronome'] }">
                                		<span class="notification-input ni-correct">This is correct, thanks!</span>
                                	</c:when>
                                	<c:otherwise>
                                		<c:forEach begin="1" end="23">
                                     		&nbsp;
                                     	</c:forEach>
                                	</c:otherwise>
                                	
                                </c:choose>
                                <input type="text" class="input-short" name="dataNasc" />
                                <span class="notification-input ni-error">Sorry, try again.</span>
                            </p>
  							
  							<fieldset>
                                <legend>Sexo</legend>
                                <ul>
                                    <li><label><input type="radio" name="sexo" checked="checked" id="sexo"/> Feminino</label></li>
                                    <li><label><input type="radio" name="sexo" id="sexo"/> Masculino</label></li>
                                </ul>
                            </fieldset>
  							    
                            <p>
                            
                            	<label>CPF
                                     <c:forEach begin="1" end="63">
                                     	&nbsp;
                                     </c:forEach>
                                	 RG
                                	 <c:forEach begin="1" end="62">
                                     	&nbsp;
                                     </c:forEach>
                                	 Orgão Emissor
                                </label>
                                <input type="text" class="input-short" name="cpf" id="cpf" />
                                <c:choose>
                                	<c:when test="${not empty erros['erroscpf'] }">
                                		<span class="notification-input ni-correct">This is correct, thanks!</span>
                                	</c:when>
                                	<c:otherwise>
                                		<c:forEach begin="1" end="23">
                                     		&nbsp;
                                     	</c:forEach>
                                	</c:otherwise>
                                </c:choose>
                                <input type="text" class="input-short" name="rg" id="rg"/>
                                <c:choose>
                                <c:when test="${not empty erros['erroscpf'] }">
                                		<span class="notification-input ni-correct">This is correct, thanks!</span>
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
                            	 <label>E-Mail
                            	 	<c:forEach begin="1" end="63">
                                     	&nbsp;
                                    </c:forEach>
                                	Celular
                            	 </label>
                                 <input type="text" class="input-short" name="email" id="email" />
                                 <c:choose>
                                 <c:when test="${not empty erros['erroscpf'] }">
                                		<span class="notification-input ni-correct">This is correct, thanks!</span>
                                	</c:when>
                                	<c:otherwise>
                                		<c:forEach begin="1" end="23">
                                     		&nbsp;
                                     	</c:forEach>
                                	</c:otherwise>
                                </c:choose>
                                <input type="text" class="input-short" name="celular" id="celular" />
                           		<span class="notification-input ni-correct">This is correct, thanks!</span>
                            </p>
                            
                            <p>
                            	<label>Telefone Residencial</label>
                            	<input type="text" class="input-short" name="residencial" id="residencial" />
                                <span class="notification-input ni-error">Sorry, try again.</span>
                            </p>
                            <p>    
	                            <label>Altura</label>
                                <input type="text" class="input-short" name="altura" id="altura"/>
                            </p>
                            
                            <p>    
	                            <label>Peso</label>
                                <input type="text" class="input-short" name="peso" id="peso"/>
                            </p>
                            
                            <p>
                            	<label>Naturalidade</label>
		                        <input type="text" class="input-short" name="natural" id="natural"/> 
	                        </p>
	                        
	                        <p>    
	                            <label>Nacionalidade</label>
                                <input type="text" class="input-short" name="nacional" id="nacional"/>
                            </p>
                                                        
                            <fieldset>
                                <input class="submit-green" type="submit" value="Próximo" /> 
                                <input class="submit-gray" type="submit" value="Cancelar" />
                            </fieldset>
                            
                        </form>
                     </div> <!-- End .module-body -->

                </div>  <!-- End .module -->
        		<div style="clear:both;"></div>
            </div> <!-- End .grid_12 -->
            <div style="clear:both;"></div>
        </div> <!-- End .container_12 -->
		
           
        <!-- Footer -->
        <div id="footer">
        	<div class="container_12">
            	<div class="grid_12">
                	<!-- You can change the copyright line for your own -->
                	<p>&copy; UCB - Todos os direitos reservados</p>
        		</div>
            </div>
            <div style="clear:both;"></div>
        </div> <!-- End #footer -->
	</body>
</html>