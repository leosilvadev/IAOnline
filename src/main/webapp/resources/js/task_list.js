$(function(){
	
	$('#btn-create-task').click(function(){
		var task = $('#form-new-task').serialize();
		
		$.post("tasks", task)
		.done(function(page) {
			alert( "second success" );
		})
		.fail(function(response) {
			alert( response.status );
		});
	});
	
});