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
abstract class Task {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id
	
	@NotNull @NotEmpty
	String name
	
	@Column(length=2048)
	@NotNull @NotEmpty
	String description
	
	@NotNull @OneToMany(cascade=CascadeType.ALL, orphanRemoval=true, mappedBy="task")
	Set<TaskComment> comments = new HashSet<>()
	
	@NotNull @ManyToOne
	TaskPriority taskPriority
	
	@NotNull @ManyToOne
	TaskLevel taskLevel
	
	@NotNull @ManyToOne
	TaskStatus taskStatus
	
	@NotNull @ManyToOne
	SystemUser reporterUser
	
	@NotNull @ManyToOne
	SystemUser assignedUser
	
}
