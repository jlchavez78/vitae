package es.jlchavez.vitae.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import es.jlchavez.vitae.model.DetalleExperiencia;

@RepositoryRestResource(path = "detallesExperiencia")
public interface DetalleExperienciaRepository extends CrudRepository<DetalleExperiencia, Long> {

}
