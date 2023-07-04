/**
 * 
 */
package br.com.rvwell.dao.jpa;

import br.com.rvwell.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.rvwell.domain.jpa.ClienteJpa;

/**
 * @author Raphael Van Well
 *
 */
public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
