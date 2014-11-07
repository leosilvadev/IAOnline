<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<div class="modal fade" id="modal-remove-task" tabindex="-1" role="dialog" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">
					<span aria-hidden="true">&times;</span><span class="sr-only"></span>
				</button>
				<span class="glyphicon glyphicon-info-sign"></span>
				<spring:message code="tasks.modalremove.title"/>
			</div>
			<div class="modal-body">
				<spring:message code="tasks.modalremove.message"/>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">
					<span class="glyphicon glyphicon-remove"></span>
					<spring:message code="tasks.modalremove.btn.close"/>
				</button>
				<button id="btn-create-task" type="button" class="btn btn-primary" ng-click="remove();">
					<span class="glyphicon glyphicon-ok"></span>
					<spring:message code="tasks.modalremove.btn.confirm"/>
				</button>
			</div>
		</div>
	</div>
</div>