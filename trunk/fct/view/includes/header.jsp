<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
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
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/view/css/reset.css"
	tppabs="http://www.xooom.pl/work/magicadmin/css/reset.css"
	media="screen" />

<!-- Fluid 960 Grid System - CSS framework -->
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/view/css/grid.css"
	tppabs="http://www.xooom.pl/work/magicadmin/css/grid.css"
	media="screen" />

<!-- IE Hacks for the Fluid 960 Grid System -->
<!--[if IE 6]><link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/view/css/ie6.css" tppabs="http://www.xooom.pl/work/magicadmin/css/ie6.css" media="screen" /><![endif]-->
<!--[if IE 7]><link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/view/css/ie.css" tppabs="http://www.xooom.pl/work/magicadmin/css/ie.css" media="screen" /><![endif]-->

<!-- Main stylesheet -->
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/view/css/styles.css"
	tppabs="http://www.xooom.pl/work/magicadmin/css/styles.css"
	media="screen" />

<!-- WYSIWYG editor stylesheet -->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/view/css/jquery.wysiwyg.css"
	tppabs="http://www.xooom.pl/work/magicadmin/css/jquery.wysiwyg.css"
	media="screen" />

<!-- Table sorter stylesheet -->
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/view/css/tablesorter.css"
	tppabs="http://www.xooom.pl/work/magicadmin/css/tablesorter.css"
	media="screen" />

<!-- Thickbox stylesheet -->
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/view/css/thickbox.css"
	tppabs="http://www.xooom.pl/work/magicadmin/css/thickbox.css"
	media="screen" />

<!-- Themes. Below are several color themes. Uncomment the line of your choice to switch to different color. All styles commented out means blue theme. -->
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}"/view/css/theme.css"
	tppabs="http://www.xooom.pl/work/magicadmin/css/theme-blue.css"
	media="screen" />
<!--<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/view/css/theme-red.css" media="screen" />-->
<!--<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/view/css/theme-yellow.css" media="screen" />-->
<!--<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/view/css/theme-green.css" media="screen" />-->
<!--<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/view/css/theme-graphite.css" media="screen" />-->

<!-- JQuery engine script-->
<script type="text/javascript" src="${pageContext.request.contextPath}"/view/js/jquery-1.3.2.min.js"
	tppabs="http://www.xooom.pl/work/magicadmin/js/jquery-1.3.2.min.js"></script>

<!-- JQuery WYSIWYG plugin script -->
<script type="text/javascript" src="${pageContext.request.contextPath}"/view/js/jquery.wysiwyg.js"
	tppabs="http://www.xooom.pl/work/magicadmin/js/jquery.wysiwyg.js"></script>

<!-- JQuery tablesorter plugin script-->
<script type="text/javascript" src="${pageContext.request.contextPath}"/view/js/jquery.tablesorter.min.js"
	tppabs="http://www.xooom.pl/work/magicadmin/js/jquery.tablesorter.min.js"></script>

<!-- JQuery pager plugin script for tablesorter tables -->
<script type="text/javascript"
	src="${pageContext.request.contextPath}"/view/js/jquery.tablesorter.pager.js"
	tppabs="http://www.xooom.pl/work/magicadmin/js/jquery.tablesorter.pager.js"></script>

<!-- JQuery password strength plugin script -->
<script type="text/javascript"
	src="${pageContext.request.contextPath}"/view/js/jquery.pstrength-min.1.2.js"
	tppabs="http://www.xooom.pl/work/magicadmin/js/jquery.pstrength-min.1.2.js"></script>

<!-- JQuery thickbox plugin script -->
<script type="text/javascript" src="${pageContext.request.contextPath}"/view/js/thickbox.js"
	tppabs="http://www.xooom.pl/work/magicadmin/js/thickbox.js"></script>

<!-- JQuery thickbox plugin script -->
<script type="text/javascript"
	src="${pageContext.request.contextPath}"/view/js/jquery.masked-input-plugin.js"></script>

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
						8: { 
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
				<div class="grid_8">&nbsp;</div>
				<div class="grid_4">
					<a href="" id="logout"> <fmt:message key="sair"></fmt:message> </a>
					<a href="mudaLingua.do?lingua=en"><img class="bandeira"
						src="${pageContext.request.contextPath}"/view/images/en_us.png" alt="English"/></a> <a
						href="mudaLingua.do?lingua=pt"><img class="bandeira"
						src="${pageContext.request.contextPath}"/view/images/pt_br.png" alt="Português"/></a>
				</div>

			</div>

			<div style="clear: both;"></div>
		</div>
		<!-- End #header-status -->