package br.com.leonardojgs.model.domains

import javax.persistence.CascadeType;
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.ManyToOne
import javax.persistence.OneToMany
import javax.validation.constraints.NotNull

import org.hibernate.validator.constraints.NotEmpty

@Entity
class Task {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id
	
	@NotNull(message="task.name.notnull") @NotEmpty(message="task.name.notempty")
	String name
	
	@Column(length=2048)
	@NotNull(message="task.description.notnull") @NotEmpty(message="task.description.notempty")
	String description
	
	@NotNull @OneToMany(cascade=CascadeType.ALL, orphanRemoval=true, mappedBy="task")
	Set<TaskComment> comments = new HashSet<>()
	
	@NotNull(message="task.priority.notnull") @ManyToOne
	TaskPriority taskPriority
	
	@NotNull(message="task.level.notnull") @ManyToOne
	TaskLevel taskLevel
	
	@NotNull(message="task.status.notnull") @ManyToOne
	TaskStatus taskStatus
	
	@NotNull(message="task.reporter.notnull") @ManyToOne
	SystemUser reporterUser
	
	@ManyToOne
	SystemUser assignedUser
		
}
