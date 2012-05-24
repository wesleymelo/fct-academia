<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>.:: FCT - Fl&aacute;vio Carvalho Team ::.</title>

<!-- CSS Reset -->
<!--
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/view/css/reset.css"
	tppabs="http://www.xooom.pl/work/magicadmin/css/reset.css"
	media="screen" />
  -->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/view/css/reset.css"
	media="screen" />

<!-- Fluid 960 Grid System - CSS framework -->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/view/css/grid.css"
	media="screen" />

<!-- IE Hacks for the Fluid 960 Grid System -->
<!--[if IE 6]><link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/view/css/ie6.css" tppabs="http://www.xooom.pl/work/magicadmin/css/ie6.css" media="screen" /><![endif]-->
<!--[if IE 7]><link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/view/css/ie.css" tppabs="http://www.xooom.pl/work/magicadmin/css/ie.css" media="screen" /><![endif]-->

<!-- Main stylesheet -->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/view/css/styles.css"
	media="screen" />

<!-- WYSIWYG editor stylesheet -->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/view/css/jquery.wysiwyg.css"
	media="screen" />

<!-- Table sorter stylesheet -->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/view/css/tablesorter.css" 
	media="screen" />

<!-- Thickbox stylesheet -->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/view/css/thickbox.css"
	media="screen" />
	
<!-- Modal stylesheet -->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/view/css/modal.css"
	media="screen" />	
	

<!-- Themes. Below are several color themes. Uncomment the line of your choice to switch to different color. All styles commented out means blue theme. -->
<link rel="stylesheet" type="text/css"  href="${pageContext.request.contextPath}/view/css/theme.css"
	media="screen" />
	
<!--<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/view/css/theme-red.css" media="screen" />-->
<!--<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/view/css/theme-yellow.css" media="screen" />-->
<!--<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/view/css/theme-green.css" media="screen" />-->
<!--<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/view/css/theme-graphite.css" media="screen" />-->

<!--  CSS  datepicked-->
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/view/css/jquery.ui.all.css" media="screen"/>
<link rel="stylesheet" href="${pageContext.request.contextPath}/view/css/jquery-ui-1.8.14.custom.css" type="text/css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/view/css/jquery.ui.timepicker.css?v=0.3.0" type="text/css" />

<!-- JQuery datepicked-->


<script type="text/javascript" src="${pageContext.request.contextPath}/view/js/jquery-1.7.2.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/view/js/datepicker/jquery.ui.core.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/view/js/datepicker/jquery.ui.widget.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/view/js/datepicker/jquery.ui.datepicker.js"></script>

<script type="text/javascript" src="${pageContext.request.contextPath}/view/js/jquery-1.5.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/view/js/jquery.ui.core.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/view/js/jquery.ui.widget.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/view/js/jquery.ui.tabs.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/view/js/jquery.ui.position.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/view/js/jquery.ui.timepicker.js?v=0.3.0"></script>
<script type="text/javascript" src="https://apis.google.com/js/plusone.js"></script>

<script src="${pageContext.request.contextPath}/view/js/jquery.bgiframe-2.1.2.js"></script>
<script src="${pageContext.request.contextPath}/view/js/jquery.ui.core.js"></script>
<script src="${pageContext.request.contextPath}/view/js/jquery.ui.widget.js"></script>
<script src="${pageContext.request.contextPath}/view/js/jquery.ui.mouse.js"></script>
<script src="${pageContext.request.contextPath}/view/js/jquery.ui.button.js"></script>
<script src="${pageContext.request.contextPath}/view/js/jquery.ui.draggable.js"></script>
<script src="${pageContext.request.contextPath}/view/js/jquery.ui.position.js"></script>
<script src="${pageContext.request.contextPath}/view/js/jquery.ui.resizable.js"></script>
<script src="${pageContext.request.contextPath}/view/js/jquery.ui.dialog.js"></script>

<!-- JQuery WYSIWYG plugin script -->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/view/js/jquery.wysiwyg.js"
	tppabs="http://www.xooom.pl/work/magicadmin/js/jquery.wysiwyg.js"></script>

<!-- JQuery tablesorter plugin script-->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/view/js/jquery.tablesorter.min.js"
	tppabs="http://www.xooom.pl/work/magicadmin/js/jquery.tablesorter.min.js"></script>

<!-- JQuery pager plugin script for tablesorter tables -->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/view/js/jquery.tablesorter.pager.js"
	tppabs="http://www.xooom.pl/work/magicadmin/js/jquery.tablesorter.pager.js"></script>

<!-- JQuery password strength plugin script -->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/view/js/jquery.pstrength-min.1.2.js"
	tppabs="http://www.xooom.pl/work/magicadmin/js/jquery.pstrength-min.1.2.js"></script>

<!-- JQuery thickbox plugin script -->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/view/js/thickbox.js"
	tppabs="http://www.xooom.pl/work/magicadmin/js/thickbox.js"></script>

<!-- JQuery thickbox plugin script -->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/view/js/jquery.masked-input-plugin.js"></script>

<script type="text/javascript">

        var _gaq = _gaq || [];
        _gaq.push(['_setAccount', 'UA-24327002-1']);
        _gaq.push(['_trackPageview']);

        (function() {
            var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
            ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
            var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
        })();

        function plusone_clicked() {
            $('#thankyou').fadeIn(300);
        }

        $(document).ready(function() {
            $('#floating_timepicker').timepicker({
                onSelect: function(time, inst) {
                    $('#floating_selected_time').html('You selected ' + time);
                }
            });

            $('#tabs').tabs();

        });


    </script>

<!-- Initiate tablesorter script -->
<script type="text/javascript">
	$(document).ready(function() {
		$("#myTable").tablesorter({
			// zebra coloring
			widgets : [ 'zebra' ],
			// pass the headers argument and assing a object 
			headers : {
				// assign the sixth column (we start counting zero) 
				8 : {
					// disable it by setting the property sorter to false 
					sorter : false
				}
			}
		}).tablesorterPager({
			container : $("#pager")
		});
	});
</script>

<!-- Initiate password strength script -->
<script type="text/javascript">
	$(function() {
		$('.password').pstrength();
	});
</script>

<script>
function retorna(id, nome)
        {
           
           window.self.close();
		   window.opener.document.getElementById('idAluno').value = id;
		   window.opener.document.getElementById('aluno').value = nome;
        }
</script>

</head>
<body>

		<form action="buscaTurmasAluno.do" method="post">
                  <fieldset>
                       <b><fmt:message key="nome"/></b> <input type="text" name="busca" class="input-medium" />&nbsp;&nbsp;<input class="submit-green" type="submit" value="<fmt:message key="pesquisar"/>" />
                  </fieldset>
        </form>

	<%-- Variáveis para paginação --%>
		<c:if test="${empty param.pag}">
			<c:set var="pag" value="${1}" scope="page" />
		</c:if>

		<c:if test="${not empty param.pag}">
			<c:set var="pag" value="${param.pag}" scope="page" />
		</c:if>

		<c:set var="tamPag" value="${40}" scope="page" />


		<c:set var="inicio" value="${pag * tamPag - tamPag}" scope="page" />


		<c:set var="fim" value="${(pag * tamPag) - 1}" scope="page" />


		<!-- Example table -->
		<div class="module">
			<h2>
				<span><fmt:message key="turmas" /></span>
			</h2>

			<div class="module-table-body">
				<form action="">
					<table id="myTable" class="tablesorter">
						<thead>
							<tr>
								<th style="width: 20%"><fmt:message key="nome"/></th>
								<th style="width: 20%"><fmt:message key="professor"/></th>
								<th style="width: 15%"><fmt:message key="modalidade"/></th>
								<th style="width: 15%"><fmt:message key="horario"/></th>
								<th style="width: 10%"><fmt:message key="capacidade"/></th>
								<th style="width: 8%"><fmt:message key="vagas"/></th>
								<th style="width: 10%"><fmt:message key="acoes"/></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="turma" items="${turmas}"  varStatus="i" begin="${inicio}" end="${fim}">
								<tr>
									<td>${turma.nome}</td>
									<td>${turma.professor.nome}</td>
									<td>${turma.modalidade.descricao}</td>
									<td>${turma.horarioInicial} ~ ${turma.horarioFinal}</td>
									<td>${turma.capacidade}</td>
									<td>${turma.vagas}</td>
									<td>   
											<a href="${pageContext.request.contextPath}/view/admin/turma/alteraTurma.do?codigo=${turma.idTurma }"><img
											src="${pageContext.request.contextPath}/view/images/pencil.gif"
											width="16" height="16" alt="<fmt:message key="alterar"/>" /></a> 
											
											
											<a href=""><img
											src="${pageContext.request.contextPath}/view/images/bin.gif"
											width="16" height="16" alt="<fmt:message key="excluir"/>" /></a>
											
											<a href="${pageContext.request.contextPath}/view/admin/turma/carregaAlunosTurma.do?id=${turma.idTurma }"><img
											src="${pageContext.request.contextPath}/view/images/people.png"
											width="16" height="16" alt="<fmt:message key="adicionarAluno"/>" /></a>
											
											<a href=""><img
											src="${pageContext.request.contextPath}/view/images/view.png"
											width="16" height="16" alt="<fmt:message key="view"/>" /></a>
											
								    </td>		
											
											
											
											
											
											
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</form>
				<div class="pager" id="pager">
					<form action="">
						<div>
							<img class="first"
								src="${pageContext.request.contextPath}/view/images/arrow-stop-180.gif"
								tppabs="http://www.xooom.pl/work/magicadmin/images/arrow-stop-180.gif"
								alt="first" /> <img class="prev"
								src="${pageContext.request.contextPath}/view/images/arrow-180.gif"
								tppabs="http://www.xooom.pl/work/magicadmin/images/arrow-180.gif"
								alt="prev" /> <input type="text"
								class="pagedisplay input-short align-center" /> <img
								class="next"
								src="${pageContext.request.contextPath}/view/images/arrow.gif"
								tppabs="http://www.xooom.pl/work/magicadmin/images/arrow.gif"
								alt="next" /> <img class="last"
								src="${pageContext.request.contextPath}/view/images/arrow-stop.gif"
								tppabs="http://www.xooom.pl/work/magicadmin/images/arrow-stop.gif"
								alt="last" /> <select class="pagesize input-short align-center">
								<option value="10" selected="selected">10</option>
								<option value="20">20</option>
								<option value="30">30</option>
								<option value="40">40</option>
							</select>
						</div>
					</form>
				</div>
				<div style="clear: both"></div>
			</div>
			<!-- End .module-table-body -->
		</div>
		<!-- End .module -->

		
		<c:if test="${fn:length(turmas) % tamPag == 0}">
				<c:set var="numPags" value="${fn:length(turmas) / tamPag }" />
		</c:if>
		<c:if test="${fn:length(turmas) % tamPag != 0}">
				<c:set var="numPags" value="${(fn:length(turmas) / tamPag)+1}" />
		</c:if>


		<div class="pagination">
			<a href="${pageContext.request.contextPath}/view/admin/turma/listaTurmas.do?pag=1" class="button"><span><img
					src="${pageContext.request.contextPath}/view/images/arrow-stop-180-small.gif"
					height="9" width="12" alt="First" /><fmt:message key="primeiro"/></span>
			</a> 
					
					
					
			<a href="${pageContext.request.contextPath}/view/admin/turma/listaTurmas.do?pag=<c:if test="${pag > 1}">${pag - 1}</c:if><c:if test="${pag == 1}">1</c:if>"
					class="button"><span>
					<img src="${pageContext.request.contextPath}/view/images/arrow-180-small.gif"
					height="9" width="12" alt="Previous" /><fmt:message key="anterior"/></span>
		    </a>
			<div class="numbers">
				<span><fmt:message key="pg"/></span>
				
				
				<%-- Links para as outras páginas --%>
				<c:forEach var="i" begin="1" end="${numPags}">
					<c:if test="${i == pag}">
						<c:out value="${i}" />
					</c:if>
					<c:if test="${i != pag}">
						<a href="${pageContext.request.contextPath}/view/admin/turma/listaTurmas.do?pag=${i}"><c:out value="${i}" /></a>
					</c:if>
					<c:if test="${i < numPags}">
						<span>|</span>
					</c:if>	
				</c:forEach>
			</div>
			
			<a href="${pageContext.request.contextPath}/view/admin/turma/listaTurmas.do?pag=<c:if test="${pag < numPags}">${pag + 1}</c:if> <c:if test="${pag == numPags}">${pag}</c:if>" class="button"><span><fmt:message key="proximo"/> <img
					src="${pageContext.request.contextPath}/view/images/arrow-000-small.gif"
					height="9" width="12" alt="Next" /></span>
			</a> 
					
			<a href="${pageContext.request.contextPath}/view/admin/turma/listaTurmas.do?pag=<c:out value="${numPags}"/>" class="button last"><span><fmt:message key="ultimo"/><img
					src="${pageContext.request.contextPath}/view/images/arrow-stop-000-small.gif"
					height="9" width="12" alt="Last" /></span>
			</a>
			<div style="clear: both;"></div>
		</div>

</body>
</html>