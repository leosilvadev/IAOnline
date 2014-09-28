var app = angular.module('IAOnline',['ngSanitize']);

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