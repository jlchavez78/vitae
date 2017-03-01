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
public class DetalleExperiencia {

	@Id
	@SequenceGenerator(name = "SEQ_DETALLE_EXPERIENCIA_GENERATOR", sequenceName = "SEQ_DETALLE_EXPERIENCIA")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_DETALLE_EXPERIENCIA_GENERATOR")
	private Long id;

	@NotNull
	private String detalle;

	@NotNull
	@ManyToOne(fetch = FetchType.LAZY)
	private Experiencia experiencia;

}
