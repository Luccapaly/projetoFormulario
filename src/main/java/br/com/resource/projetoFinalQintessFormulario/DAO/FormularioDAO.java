package br.com.resource.projetoFinalQintessFormulario.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.resource.projetoFinalQintessFormulario.Database.*;

@Repository
public interface FormularioDAO extends CrudRepository<DatabaseFormulario, Integer> {

}