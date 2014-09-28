<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<table class="table table-condensed table-striped">
	<thead>
		<tr>
			<td><spring:message code="tasks.list.table.column.name" /></td>
			<td><spring:message code="tasks.list.table.column.description" />
			</td>
			<td><spring:message code="tasks.list.table.column.priority" /></td>
			<td><spring:message code="tasks.list.table.column.level" /></td>
			<td><spring:message code="tasks.list.table.column.reporter" /></td>
			<td><spring:message code="tasks.list.table.column.assignedto" />
			</td>
		</tr>
	</thead>
	<tbody>
		<c:if test="${empty tasks}">
			<tr id="row_nothing_found">
				<td colspan="6"><spring:message
						code="tasks.list.table.notaskfound" /></td>
			</tr>
		</c:if>
		<c:forEach var="task" items="${tasks}">
			<tr>
				<td>${task.name}</td>
				<td>${task.description}</td>
				<td>${task.taskPriority.name}</td>
				<td>${task.taskLevel.name}</td>
				<td>${task.reporterUser.name}</td>
				<td>${task.assignedUser.name}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>