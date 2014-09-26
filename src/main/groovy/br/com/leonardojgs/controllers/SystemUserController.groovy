package br.com.leonardojgs.controllers

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.com.leonardojgs.model.domains.SystemUser;
import br.com.leonardojgs.model.repositories.SystemUserRepository;

@RestController
@RequestMapping("/users")
class SystemUserController {

	@Autowired def systemUserRepository;
	
	@RequestMapping
	def list(){
		def view = new ModelAndView("users-list")
		view.addObject("systemUsers", systemUserRepository.findAll())
		view
	}
	
}
