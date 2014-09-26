<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<div>
	<div class="panel panel-success">
		<div class="panel-heading">
			<spring:message code="users.list.table.tile"/>
		</div>
		<table class="table table-condensed table-striped">
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
	</div>
</div>