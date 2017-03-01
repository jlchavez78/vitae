package es.jlchavez.vitae.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
public class Formacion {

	@Id
	@SequenceGenerator(name = "SEQ_FORMACION_GENERATOR", sequenceName = "SEQ_FORMACION")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_FORMACION_GENERATOR")
	private Long id;

	@NotNull
	private String anyo;

	@NotNull
	private String centro;

	@NotNull
	private String titulo;

	private String mencion;

	@NotNull
	@ManyToOne(fetch = FetchType.LAZY)
	private Persona persona;

}
