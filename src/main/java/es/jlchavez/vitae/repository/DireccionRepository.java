package es.jlchavez.vitae.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import es.jlchavez.vitae.model.Direccion;

@RepositoryRestResource(path = "direcciones")
public interface DireccionRepository extends CrudRepository<Direccion, Long> {

}
