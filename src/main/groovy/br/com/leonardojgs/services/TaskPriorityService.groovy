package br.com.leonardojgs.services

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
class TaskPriorityService {

	@Autowired def taskPriorityRepository
	
	def findAll(){
		taskPriorityRepository.findAll()
	}
	
}
