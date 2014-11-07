package br.com.leonardojgs.services

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.leonardojgs.model.domains.Task;
import br.com.leonardojgs.model.repositories.TaskRepository;

@Service
@Transactional
class TaskService {

	@Autowired def taskRepository
	
	def createNew(task){
		taskRepository.save(task)
	}
	
	def delete(id){
		Task task = taskRepository.findOne(id)
		taskRepository.delete(task)
	}
	
	List<Task> findAll(){
		taskRepository.findAll()
	}
	
}
