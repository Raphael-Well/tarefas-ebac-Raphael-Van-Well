/**
 * 
 */
package br.com.rvwell.dao.jpa;

import br.com.rvwell.dao.generic.jpa.IGenericJapDAO;
import br.com.rvwell.domain.jpa.Persistente;

/**
 * @author Raphael Van Well
 *
 */
public interface IClienteJpaDAO<T extends Persistente> extends IGenericJapDAO<T, Long>{

}
