<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<table class="table table-condensed table-striped" data-ng-init="listTasks()">
	<thead>
		<tr>
			<td><spring:message code="tasks.list.table.column.name" /></td>
			<td><spring:message code="tasks.list.table.column.description" />
			</td>
			<td><spring:message code="tasks.list.table.column.priority" /></td>
			<td><spring:message code="tasks.list.table.column.level" /></td>
			<td><spring:message code="tasks.list.table.column.reporter" /></td>
			<td><spring:message code="tasks.list.table.column.assignedto" /></td>
			<td>Editar</td>
			<td>Remover</td>
		</tr>
	</thead>
	<tbody>
			<tr ng-repeat="task in tasks">
				<td>{{task.name}}</td>
				<td>{{task.description}}</td>
				<td>{{task.priority.priority}}</td>
				<td>{{task.level.level}}</td>
				<td>{{task.reporterUser.name}}</td>
				<td>{{task.assignedUser.name}}</td>
				<td>
					<a href="#" class="btn btn-default">
						<span class="glyphicon glyphicon-pencil"></span>
					</a>
				</td>
				<td>
					<a href="#" class="btn btn-danger" ng-click="confirmRemoveTask(task.id);">
						<span class="glyphicon glyphicon-trash"></span>
					</a>
				</td>
			</tr>
	</tbody>
</table>