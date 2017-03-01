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
public class Direccion {

	@Id
	@SequenceGenerator(name = "SEQ_DIRECCION_GENERATOR", sequenceName = "SEQ_DIRECCION")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_DIRECCION_GENERATOR")
	private Long id;

	@NotNull
	private String calle;

	@NotNull
	private String numero;

	private String pisoPuerta;

	@NotNull
	private String codigoPostal;

	@NotNull
	private String poblacion;

	@NotNull
	private String provincia;

	@ManyToOne
	private Persona persona;

}
