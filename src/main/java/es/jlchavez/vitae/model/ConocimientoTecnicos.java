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
public class ConocimientoTecnicos {

	@Id
	@SequenceGenerator(name = "SEQ_CONOCIMIENTOS_GENERATOR", sequenceName = "SEQ_CONOCIMIENTOS")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CONOCIMIENTOS_GENERATOR")
	private Long id;

	@NotNull
	private String detalle;

	private Nivel nivel;

	@ManyToOne
	private Persona persona;

}
