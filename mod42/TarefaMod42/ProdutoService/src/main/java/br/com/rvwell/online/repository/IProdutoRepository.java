/**
 * 
 */
package br.com.rvwell.online.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.rvwell.online.domain.Produto;
import br.com.rvwell.online.domain.Produto.Status;

/**
 * @author Raphael Van Well
 *
 */
@Repository
public interface IProdutoRepository extends MongoRepository<Produto, String>{

	Optional<Produto> findByCodigo(String codigo);
	
	Page<Produto> findAllByStatus(Pageable pageable, Status status);
}
