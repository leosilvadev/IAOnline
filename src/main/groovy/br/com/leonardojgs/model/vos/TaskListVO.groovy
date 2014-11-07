package br.com.leonardojgs.model.vos

import groovy.transform.CompileStatic
import groovy.transform.TypeChecked
import br.com.leonardojgs.model.domains.Task
import br.com.leonardojgs.model.domains.TaskLevel
import br.com.leonardojgs.model.domains.TaskPriority;

@CompileStatic
@TypeChecked
class TaskListVO {

	List tasks = new ArrayList()

	def add(taskItem){
		tasks << taskItem
	}

	def addAll(persistedTasks){
		persistedTasks.each { Task task ->
			TaskPriority taskPriority = task.priority
			TaskLevel taskLevel = task.level
			tasks << new TaskVO(id: task.id, name: task.name, description: task.description, 
								status: task.status, priority: taskPriority.id, priorityLabel: taskPriority.priority,
								level: taskLevel.id, levelLabel: taskLevel.level)
		}
	}

}
