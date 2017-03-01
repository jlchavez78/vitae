package es.jlchavez.vitae.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import es.jlchavez.vitae.model.ConocimientoTecnico;

@RepositoryRestResource(path = "conocimientosTecnicos")
public interface ConocimientoTecnicoRepository extends CrudRepository<ConocimientoTecnico, Long> {

}
