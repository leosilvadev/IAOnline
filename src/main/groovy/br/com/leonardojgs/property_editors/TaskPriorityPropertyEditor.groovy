package br.com.leonardojgs.property_editors

import java.beans.PropertyEditorSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.leonardojgs.model.repositories.TaskPriorityRepository;

@Component
class TaskPriorityPropertyEditor extends PropertyEditorSupport {

	@Autowired private TaskPriorityRepository taskPriorityRepository;
	
	void setAsText(String text) {
		long id = Long.parseLong(text);
		setValue(taskPriorityRepository.findOne(id));
	}
	
}
