<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Usuários</title>
		<style type="text/css">
			@IMPORT url("resources/css/bootstrap.min.css");
		</style>
		<script type="text/javascript" src="resources/js/jquery-2.1.1.min.js"></script>
		<script type="text/javascript" src="resources/js/bootstrap.min.js"></script>
	</head>
	<body>
		<table>
			<thead>
				<tr>
					<td>Nome</td>
					<td>Login</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="systemUser" items="${systemUsers}">
					<tr>
						<td>${systemUser.name}</td>
						<td>${systemUser.username}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</body>
</html>