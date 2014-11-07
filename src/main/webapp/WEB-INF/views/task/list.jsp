<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<style>
	@IMPORT url("resources/css/task_list.css");
</style>

<!DOCTYPE html>
<div ng-app="IAOnline" ng-controller="TaskController">
	
	<div class="alert alert-danger fade in" role="alert" ng-show="hasSuccessCreationMessages">
		<button type="button" class="close" ng-click="hideTaskCreationMessages()">
			<span aria-hidden="true">×</span><span class="sr-only"></span>
		</button>
		{{successSave}}
	</div>
	<div class="panel panel-default">
		<div class="panel-heading">
			<spring:message code="tasks.list.table.title"/>
		</div>
		<div id="div-tasks">
			<jsp:include page="table-list.jsp"/>
		</div>
		<div class="panel-footer">
			<a class="btn btn-primary" ng-click="openNew()">
				<span class="glyphicon glyphicon glyphicon-plus"></span>
				Cadastrar tarefa
			</a>
		</div>
	</div>
	
	<jsp:include page="modal-new.jsp" />
	<jsp:include page="modal-remove.jsp" />
</div>

<script type="text/javascript" src="resources/js/controllers/TaskController.js"></script>
