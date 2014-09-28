package br.com.leonardojgs.services

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
class TaskService {

	@Autowired def taskRepository
	
	def createNew(task){
		taskRepository.save(task)
	}
	
	def findAll(){
		taskRepository.findAll()
	}
	
}
