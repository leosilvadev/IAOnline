package br.com.leonardojgs.model.repositories;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.leonardojgs.model.domains.TaskPriority;

@Repository
public interface TaskPriorityRepository extends CrudRepository<TaskPriority, Serializable> {

}
