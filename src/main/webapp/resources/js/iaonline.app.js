var app = angular.module('IAOnline',['ngSanitize']);

function focus(){
	return {
		link: function(scope, element) {
			element[0].focus();
		}
	};
}

function sendPost(requestHTTP, requestURL, requestData, successCallback, errorCallback){
	requestHTTP({
		method  : 'POST',
		url     : requestURL,
		data    : requestData,
		headers : { 'Content-Type': 'application/x-www-form-urlencoded', 'Accept':'text/*;charset=utf-8' }
	
    }).success(
    	successCallback
    ).error(
    	errorCallback
    );
};

function sendGet(requestHTTP, requestURL, successCallback, errorCallback){
	requestHTTP({
		method  : 'GET',
		url     : requestURL,
		headers : { 'Content-Type': 'application/x-www-form-urlencoded', 'Accept':'application/json' }
	
    }).success(
    	successCallback
    ).error(
    	errorCallback
    );
}

function sendGetGetJson(requestHTTP, requestURL, successCallback, errorCallback){
	requestHTTP({
		method  : 'GET',
		url     : requestURL,
		headers : { 'Content-Type': 'application/json', 'Accept':'application/json' }
	
    }).success(
    	successCallback
    ).error(
    	errorCallback
    );
}

function sendDelete(requestHTTP, requestURL, successCallback, errorCallback){
	requestHTTP({
		method  : 'DELETE',
		url     : requestURL,
		headers : { 'Content-Type': 'application/x-www-form-urlencoded', 'Accept':'text/*;charset=utf-8' }
	
    }).success(
    	successCallback
    ).error(
    	errorCallback
    );
};