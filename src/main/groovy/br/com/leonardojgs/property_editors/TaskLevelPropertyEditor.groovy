package br.com.leonardojgs.property_editors

import java.beans.PropertyEditorSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.leonardojgs.model.repositories.TaskLevelRepository;

@Component
class TaskLevelPropertyEditor extends PropertyEditorSupport {
	
	@Autowired private TaskLevelRepository taskLevelRepository;
	
	void setAsText(String text) {
		long id = Long.parseLong(text);
		setValue(taskLevelRepository.findOne(id));
	}
}