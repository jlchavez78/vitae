package es.jlchavez.vitae.model;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
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

	@OneToMany
	private Collection<Direccion> direcciones;

	@OneToMany
	private Collection<Experiencia> experiencias;

	@OneToMany
	private Collection<Empresa> empresas;

	@OneToMany
	private Collection<Formacion> formaciones;

	@OneToMany
	private Collection<ConocimientoTecnicos> conocimientos;

	@OneToMany
	private Collection<Idioma> idiomas;

}
