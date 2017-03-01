package es.jlchavez.vitae.model;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
public class Experiencia {

	@Id
	@SequenceGenerator(name = "SEQ_EXPERIENCIA_GENERATOR", sequenceName = "SEQ_EXPERIENCIA")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_EXPERIENCIA_GENERATOR")
	private Long id;

	@NotNull
	private String titulo;

	private Date fechaInicio;

	private Date fechaFin;

	@ManyToOne
	private Empresa empresa;

	private String cliente;

	@OneToMany
	private Collection<DetalleExperiencia> detalles;

	@ManyToOne
	private Persona persona;

}
