package br.com.leonardojgs.services

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
class TaskLevelService {

	@Autowired def taskLevelRepository
	
	def findAll(){
		taskLevelRepository.findAll()
	}
	
}
