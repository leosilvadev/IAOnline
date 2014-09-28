<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<!DOCTYPE html>
<div>
	<ul class="nav nav-pills nav-stacked">
		<li>
			<a href="users">
				<spring:message code="app.menu.users"/>
			</a>
		</li>
		<li>
			<a href="tasks">
				<spring:message code="app.menu.tasks"/>
			</a>
		</li>
	</ul>
</div>