package es.jlchavez.vitae.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import es.jlchavez.vitae.model.Experiencia;

@RepositoryRestResource(path = "experiencias")
public interface ExperienciaRepository extends CrudRepository<Experiencia, Long> {

}
