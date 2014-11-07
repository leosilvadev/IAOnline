package br.com.leonardojgs.model.vos

import groovy.transform.CompileStatic;
import groovy.transform.TypeChecked;

import java.util.Set;

import br.com.leonardojgs.model.domains.TaskComment;
import br.com.leonardojgs.model.domains.TaskLevel;
import br.com.leonardojgs.model.domains.TaskPriority;
import br.com.leonardojgs.model.domains.Task.TaskStatus;

@CompileStatic
@TypeChecked
class TaskItem {

	Long id
	String name
	String description
	TaskStatus status
	
}
