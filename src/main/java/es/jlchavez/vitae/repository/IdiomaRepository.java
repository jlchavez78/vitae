package es.jlchavez.vitae.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import es.jlchavez.vitae.model.Idioma;

@RepositoryRestResource(path = "idiomas")
public interface IdiomaRepository extends CrudRepository<Idioma, Long> {

}
