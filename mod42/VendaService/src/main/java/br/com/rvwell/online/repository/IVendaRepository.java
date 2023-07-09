/**
 * 
 */
package br.com.rvwell.online.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.rvwell.online.domain.Venda;

/**
 * @author Raphael Van Well
 *
 */
@Repository
public interface IVendaRepository extends MongoRepository<Venda, String>{

	Optional<Venda> findByCodigo(String codigo);
}
