app.controller('TaskController', function($scope, $http){
	
	$scope.list = function(){
		var requestURL = 'tasks/refresh';
		var successCallback = function(response){
			$scope.tasks = response.tasks;
		};
		
		sendGet($http, requestURL, successCallback);
	};
	
	$scope.openNew = function(){
		$scope.hideTaskCreationMessages();
		$scope.task = {'priority':0, 'level':0};
		$('#modal-new-task').modal('show');
		focusOnName();
	};
	
	$scope.create = function(){
		var requestURL = 'tasks';
		var requestData = $.param($scope.task);
		var successCallback = function(data){
			$scope.successSave = data;
			$('#modal-new-task').modal('hide');
			$scope.list();
		};
		var errorCallback = function(data, status, headers, config){
			$scope.errorSave = data;
		};
		sendPost($http, requestURL, requestData, successCallback, errorCallback);
	};
	
	$scope.hideTaskCreationMessages = function(){
		$scope.errorSave = null;
	};
	
	$scope.selectToEdit = function(task){
		alert(JSON.stringify(task));
		$scope.task = task;
		$('#modal-new-task').modal('show');
	};

	$scope.selectToRemove = function(task){
		$scope.task = task;
		$('#modal-remove-task').modal('show');
		$scope.list();
	};

	$scope.remove = function(){
		var taskId = $scope.task.id;
		var requestURL = 'tasks/'+taskId;
		var successCallback = function(data){
			$('#modal-remove-task').modal('hide');
			$scope.list();
		};
		var errorCallback = function(data, status, headers, config){
			alert("ERROR: "+data);
		};
		sendDelete($http, requestURL, successCallback, errorCallback);
	};

	function focusOnName(){
		setTimeout(function(){
			$('#txt-name').focus();
		}, 1000);
	};
	
});