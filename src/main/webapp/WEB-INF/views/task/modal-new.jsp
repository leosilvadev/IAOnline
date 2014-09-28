<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<div class="modal fade" id="modal-new-task" tabindex="-1" role="dialog" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">
					<span aria-hidden="true">&times;</span><span class="sr-only"></span>
				</button>
				<spring:message code="tasks.modalsave.title"/>
			</div>
			<div class="modal-body">
				<div class="alert alert-danger fade in" role="alert" ng-show="hasCreationMessages">
					<button type="button" class="close" ng-click="hideTaskCreationMessages()">
						<span aria-hidden="true">×</span><span class="sr-only"></span>
					</button>
					{{errorSaveTask}}
				</div>
				<form id="form-new-task">
					<div class="form-group">
						<label for="txt-name">
							<spring:message code="tasks.modalsave.name"/>
						</label>
						<input class="form-control" id="txt-name" ng-model="task.name">
					</div>
					
					<div class="form-group">
						<label for="txt-description">
							<spring:message code="tasks.modalsave.description"/>
						</label>
						<input class="form-control" id="txt-description" ng-model="task.description">
					</div>
					
					<div class="form-group">
						<label for="sel-priority">
							<spring:message code="tasks.modalsave.priority"/>
						</label>
						<select id="sel-priority" ng-model="task.priority" class="form-control">
							<option value="0">
								<spring:message code="tasks.modalsave.defaultpriority"/>
							</option>
							<c:forEach var="priority" items="${priorities}">
								<option value="${priority.id}">${priority.name}</option>
							</c:forEach>
						</select>
					</div>
					
					<div class="form-group">
						<label for="sel-level">
							<spring:message code="tasks.modalsave.levels"/>
						</label>
						<select id="sel-level" ng-model="task.level" class="form-control">
							<option value="0">
								<spring:message code="tasks.modalsave.defaultlevel"/>
							</option>
							<c:forEach var="level" items="${levels}">
								<option value="${level.id}">${level.name}</option>
							</c:forEach>
						</select>
					</div>
				</form>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">
					<spring:message code="tasks.modalsave.btn.close"/>
				</button>
				<button id="btn-create-task" type="button" class="btn btn-primary" ng-click="createTask()">
					<spring:message code="tasks.modalsave.btn.save"/>
				</button>
			</div>
		</div>
	</div>
</div>