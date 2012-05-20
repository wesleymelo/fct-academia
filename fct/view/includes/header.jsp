<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>

<meta http-equiv="content-type" content="text/html; charset=utf-8" />
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

<!-- Initiate WYIWYG text area -->
<script type="text/javascript">
	$(function() {
		$('#wysiwyg').wysiwyg({
			controls : {
				separator01 : {
					visible : true
				},
				separator03 : {
					visible : true
				},
				separator04 : {
					visible : true
				},
				separator00 : {
					visible : true
				},
				separator07 : {
					visible : false
				},
				separator02 : {
					visible : false
				},
				separator08 : {
					visible : false
				},
				insertOrderedList : {
					visible : true
				},
				insertUnorderedList : {
					visible : true
				},
				undo : {
					visible : true
				},
				redo : {
					visible : true
				},
				justifyLeft : {
					visible : true
				},
				justifyCenter : {
					visible : true
				},
				justifyRight : {
					visible : true
				},
				justifyFull : {
					visible : true
				},
				subscript : {
					visible : true
				},
				superscript : {
					visible : true
				},
				underline : {
					visible : true
				},
				increaseFontSize : {
					visible : false
				},
				decreaseFontSize : {
					visible : false
				}
			}
		});
	});
</script>


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

</head>
<body>
	<!-- Header -->
	<div id="header">
		<!-- Header. Status part -->
		<div id="header-status">
			<div class="container_12">
				<div class="grid_8">&nbsp;</div>
				<div class="grid_4">
					<a
						href="${pageContext.request.contextPath}/view/admin/principal/logout.do"
						id="logout"><fmt:message key="bemvindo" />
						${sessionScope.acesso.pessoa.nome}, <fmt:message key="sair" /></a> <a
						href="mudaLingua.do?lingua=en&page=other"><img
						class="bandeira"
						src="${pageContext.request.contextPath}/view/images/en_us.png"
						alt="English" /></a> <a href="mudaLingua.do?lingua=pt&page=other"><img
						class="bandeira"
						src="${pageContext.request.contextPath}/view/images/pt_br.png"
						alt="Português" /></a>
				</div>

			</div>

			<div style="clear: both;"></div>
		</div>
		<!-- End #header-status -->

		<!-- Header. Main part -->
		<div id="header-main">
			<div class="container_12">
				<div class="grid_12">
					<div id="logo">
						<div id="logo_top">
							<ul id="nav">
								<li id="current"><a href="${pageContext.request.contextPath}/view/admin/principal/index.jsp">Painel de Controle</a></li>
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
						<li><a href="${pageContext.request.contextPath}/view/admin/aluno/listaAlunos.do" ><fmt:message key="alunos"/></a></li>
						<li><a href="${pageContext.request.contextPath}/view/admin/professor/listaProfessores.do"><fmt:message key="professores"/></a></li>
						<li><a href="${pageContext.request.contextPath}/view/admin/secretaria/listaSecretarias.do" ><fmt:message key="secretarias"/></a></li>
						<li><a href="${pageContext.request.contextPath}/view/admin/modalidade/listaModalidades.do"><fmt:message key="modalidades"/></a></li>
						<li><a href="${pageContext.request.contextPath}/view/admin/turma/listaTurmas.do"><fmt:message key="turmas"/></a></li>
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