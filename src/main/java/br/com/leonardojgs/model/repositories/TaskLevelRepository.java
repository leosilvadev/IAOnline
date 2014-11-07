package br.com.leonardojgs.model.repositories;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.leonardojgs.model.domains.TaskLevel;

@Repository
public interface TaskLevelRepository extends CrudRepository<TaskLevel, Serializable> {

}
