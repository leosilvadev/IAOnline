package br.com.leonardojgs.model.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.leonardojgs.model.domains.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Serializable> {

}
