/**
 * 
 */
package br.com.rvwell.dao.generic.jpa;

import java.io.Serializable;

import br.com.rvwell.domain.jpa.Persistente;

/**
 * @author Raphael Van Well
 *
 */
public abstract class GenericJpaDB3DAO <T extends Persistente, E extends Serializable>
	extends GenericJpaDAO<T,E> {

	public GenericJpaDB3DAO(Class<T> persistenteClass) {
		super(persistenteClass, "Mysql1");
	}

}
