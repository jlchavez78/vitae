package es.jlchavez.vitae.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import es.jlchavez.vitae.model.Formacion;

@RepositoryRestResource(path = "formaciones")
public interface FormacionRepository extends CrudRepository<Formacion, Long> {

}
