package es.jlchavez.vitae.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import es.jlchavez.vitae.model.Empresa;

@RepositoryRestResource(path = "empresas")
public interface EmpresaRepository extends CrudRepository<Empresa, Long> {

}
