app.controller('TaskController', function($scope, $http){
	
	$scope.listTasks = function(){
		var requestURL = 'tasks/refresh';
		var successCallback = function(response){
			$scope.tasks = response.tasks;
		};
		
		sendGet($http, requestURL, successCallback);
	};
	
	$scope.newTask = function(){
		$scope.hideTaskCreationMessages();
		$scope.task = {'priority':0, 'level':0};
		$('#modal-new-task').modal('show');
	};
	
	$scope.createTask = function(){
		var requestURL = 'tasks';
		var requestData = $.param($scope.task);
		var successCallback = function(data){
			$scope.successSaveTask = data;
			$('#modal-new-task').modal('hide');
			$scope.listTasks();
		};
		var errorCallback = function(data, status, headers, config){
			$scope.errorSaveTask = data;
		};
		sendPost($http, requestURL, requestData, successCallback, errorCallback);
	};
	
	$scope.hideTaskCreationMessages = function(){
		$scope.errorSaveTask = null;
	};

	$scope.confirmRemoveTask = function(id){
		$scope.removeId = id;
		$('#modal-remove-task').modal('show');
		$scope.listTasks();
	};

	$scope.removeTask = function(){
		var taskId = $scope.removeId;
		var requestURL = 'tasks/'+taskId;
		var successCallback = function(data){
			$('#modal-remove-task').modal('hide');
			$scope.listTasks();
		};
		var errorCallback = function(data, status, headers, config){
			alert("ERROR: "+data);
		};
		sendDelete($http, requestURL, successCallback, errorCallback);
	};
	
});