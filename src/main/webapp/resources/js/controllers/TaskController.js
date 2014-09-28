app.controller('TaskController', function($scope, $http){
	
	$scope.newTask = function(){
		$scope.task = {'priority':0, 'level':0};
		$scope.hasCreationMessages = false;
		$('#modal-new-task').modal('show');
	};
	
	$scope.createTask = function(){
		var requestURL = 'tasks';
		var requestData = $.param($scope.task);
		var successCallback = function(data){
			alert('success');
		};
		var errorCallback = function(data, status, headers, config){
			$scope.errorSaveTask = data;
    		$scope.hasCreationMessages = true;
		};
		sendPost($http, requestURL, requestData, successCallback, errorCallback);
	};
//	$scope.createTask = function(){
//		$http({
//			method  : 'POST',
//			url     : 'tasks',
//			data    : $.param($scope.task),
//			headers : { 'Content-Type': 'application/x-www-form-urlencoded', 'Accept':'text/*;charset=utf-8' }
//		
//	    }).success(function(data) {
//	    	
//	    	
//	    }).error(function(data, status, headers, config) {
//    		$scope.errorSaveTask = data;
//    		$scope.hasCreationMessages = true;
//	    });
//	};
	
	$scope.hideTaskCreationMessages = function(){
		$scope.hasCreationMessages = false;
	};
	
});