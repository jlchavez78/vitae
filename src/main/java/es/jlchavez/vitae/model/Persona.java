package es.jlchavez.vitae.model;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
public class Persona {

	@Id
	@SequenceGenerator(name = "SEQ_PERSONA_GENERATOR", sequenceName = "SEQ_PERSONA")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PERSONA_GENERATOR")
	private Long id;

	@NotNull
	private String nombre;

	@NotNull
	private String primerApellido;

	@NotNull
	private String segundoApellido;

	private String nif;

	private String telefono;

	private String movil;

	@NotNull
	private Date fechaNacimiento;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "persona")
	private Collection<Direccion> direcciones;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "persona")
	private Collection<Experiencia> experiencias;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "persona")
	private Collection<Empresa> empresas;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "persona")
	private Collection<Formacion> formaciones;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "persona")
	private Collection<ConocimientoTecnico> conocimientos;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "persona")
	private Collection<Idioma> idiomas;

}
