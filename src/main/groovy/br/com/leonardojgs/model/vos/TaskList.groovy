package br.com.leonardojgs.model.vos

import groovy.transform.CompileStatic;
import groovy.transform.TypeChecked;
import br.com.leonardojgs.model.domains.Task;

@CompileStatic
@TypeChecked
class TaskList {

	List tasks = new ArrayList()
	
	def add(taskItem){
		tasks << taskItem
	}
	
	def addAll(persistedTasks){
		persistedTasks.each { Task task ->
			tasks << new TaskItem(id: task.id, name: task.name, description: task.description, status: task.status)
		}
	}
	
}
