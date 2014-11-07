package br.com.leonardojgs.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.leonardojgs.model.vos.TaskList;
import br.com.leonardojgs.services.TaskService;

@RestController
@RequestMapping("/test")
public class TController {
	
	@Autowired private TaskService taskService;
	
	@RequestMapping(
			method=RequestMethod.GET, 
			value="/refresh"
	)
	public ResponseEntity<TaskList> listTasksTable(){
		TaskList taskList = new TaskList();
		taskList.addAll(taskService.findAll());
		return new ResponseEntity<TaskList>(taskList, HttpStatus.OK);
	}

}
