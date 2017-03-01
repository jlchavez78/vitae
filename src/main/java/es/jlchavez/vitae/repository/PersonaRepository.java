package es.jlchavez.vitae.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import es.jlchavez.vitae.model.Persona;

@RepositoryRestResource(path="personas")
public interface PersonaRepository extends CrudRepository<Persona, Long> {

}
