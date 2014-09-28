package br.com.leonardojgs.controllers;

import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.leonardojgs.model.domains.Task;
import br.com.leonardojgs.services.TaskLevelService;
import br.com.leonardojgs.services.TaskPriorityService;
import br.com.leonardojgs.services.TaskService;

@Controller
@RequestMapping("/tasks")
public class TaskController {

	@Autowired private TaskService taskService;
	@Autowired private MessageSource messageSource;
	@Autowired private TaskPriorityService taskPriorityService;
	@Autowired private TaskLevelService taskLevelService;

	@RequestMapping(method=RequestMethod.GET)
	public String list(Model model){
		model.addAttribute("tasks", taskService.findAll());
		model.addAttribute("priorities", taskPriorityService.findAll());
		model.addAttribute("levels", taskLevelService.findAll());
		return "tasks-list";
	}

	@RequestMapping(method=RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<String> save(
			@ModelAttribute @Valid Task task, BindingResult bindingResult, Locale locale){
		
		if(bindingResult.hasErrors()){
			String message = messageSource.getMessage(bindingResult.getFieldError().getDefaultMessage(), null, locale);
			return new ResponseEntity<String>(message, HttpStatus.BAD_REQUEST);
			
		}else{
			taskService.createNew(task);
			return new ResponseEntity<String>(HttpStatus.OK);
			
		}
		
		
	}
	
}
