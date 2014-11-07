<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<!DOCTYPE html>
<html>
	<head>
		<title><spring:message code="app.offline.title"/></title>
   		<meta charset="utf-8" />
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<style type="text/css">
			@IMPORT url("resources/css/libs/bootstrap.min.css");
			@IMPORT url("resources/css/iaonline.css");
			@IMPORT url("resources/css/main_online.css");
		</style>
		<script type="text/javascript" src="resources/js/libs/jquery-2.1.1.min.js"></script>
		<script type="text/javascript" src="resources/js/libs/bootstrap.min.js"></script>
		<script type="text/javascript" src="resources/js/libs/angular/angular.min.js"></script>
		<script type="text/javascript" src="resources/js/libs/angular/angular-sanitize.min.js"></script>
		<script type="text/javascript" src="resources/js/iaonline.app.js"></script>
	</head>
	<body>
		<div class="container">
			<div id="main-header">
				<tiles:insertAttribute name="header"/>
			</div>
			
			<div id="main-principal">
				<div class="row">
					<div class="col-sm-2" style="padding-right: 5px;">
						<div id="main-menu">
							<tiles:insertAttribute name="menu"/>
						</div>
					</div>
					<div class="col-sm-10" style="padding-left: 5px;">
						<div id="main-content">
							<tiles:insertAttribute name="content"/>
						</div>
					</div>
				</div>
			</div>
			
			<div id="main-footer">
				<tiles:insertAttribute name="footer"/>
			</div>
		</div>
	</body>
</html>