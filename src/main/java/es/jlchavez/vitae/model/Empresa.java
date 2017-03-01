package es.jlchavez.vitae.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
public class Empresa {

	@Id
	@SequenceGenerator(name = "SEQ_EMPRESA_GENERATOR", sequenceName = "SEQ_EMPRESA")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_EMPRESA_GENERATOR")
	private Long id;

	@NotNull
	private String nombre;

	@ManyToOne
	private Persona persona;

}
