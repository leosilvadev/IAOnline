package br.com.leonardojgs.controllers

import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.leonardojgs.model.domains.Task;
import br.com.leonardojgs.model.domains.TaskLevel;
import br.com.leonardojgs.model.domains.TaskPriority;
import br.com.leonardojgs.model.domains.Task.TaskStatus;
import br.com.leonardojgs.model.vos.TaskListVO;
import br.com.leonardojgs.services.TaskLevelService;
import br.com.leonardojgs.services.TaskPriorityService;
import br.com.leonardojgs.services.TaskService;

@Controller
@RequestMapping("/tasks")
class TaskController {
	
	@Autowired def taskService;
	@Autowired def messageSource;
	@Autowired def taskPriorityService;
	@Autowired def taskLevelService;
	
	@Autowired def taskPriorityPropertyEditor
	@Autowired def taskLevelPropertyEditor
	
	@RequestMapping(method=RequestMethod.GET)
	def list(Model model){
		model.addAttribute "tasks", taskService.findAll()
		model.addAttribute "priorities", taskPriorityService.findAll()
		model.addAttribute "levels", taskLevelService.findAll()
		
		"tasks-list"
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/refresh")
	@ResponseBody
	ResponseEntity listTasksTable(){
		TaskListVO taskList = new TaskListVO();
		taskList.addAll(taskService.findAll());
		new ResponseEntity<TaskListVO>(taskList, HttpStatus.OK);
	}

	@RequestMapping(method=RequestMethod.POST)
	@ResponseBody
	ResponseEntity<String> save(@ModelAttribute @Valid Task task, BindingResult bindingResult, Locale locale){
		if(bindingResult.hasErrors()){
			String message = messageSource.getMessage bindingResult.getFieldError().getDefaultMessage(), null, locale
			return new ResponseEntity<String>(message, HttpStatus.BAD_REQUEST)
			
		}else{
			taskService.createNew task
			return new ResponseEntity<String>(HttpStatus.OK)
			
		}
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/{id}")
	@ResponseBody
	ResponseEntity<String> delete(@PathVariable Long id){
		try{
			taskService.delete id
			return new ResponseEntity<String>(HttpStatus.OK)
		
		}catch(Exception ex){
			return new ResponseEntity<String>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR)
		
		}
	}
		
	
	@InitBinder
	void initBinder(WebDataBinder binder){
		binder.registerCustomEditor TaskPriority.class, taskPriorityPropertyEditor
		binder.registerCustomEditor TaskLevel.class, taskLevelPropertyEditor
	}
	
}
