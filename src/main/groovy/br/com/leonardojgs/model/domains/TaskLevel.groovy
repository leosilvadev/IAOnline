package br.com.leonardojgs.model.domains

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.validation.constraints.NotNull

import org.hibernate.validator.constraints.NotEmpty

@Entity
class TaskLevel {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id
	
	@NotNull @NotEmpty
	String name
	
}
