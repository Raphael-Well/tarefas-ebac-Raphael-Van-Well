/**
 * 
 */
package br.com.rvwell.dao;

import java.util.List;

import br.com.rvwell.dao.generic.IGenericDAO;
import br.com.rvwell.domain.Cliente;

/**
 * @author Raphael Van Well
 *
 */
public interface IClienteDAO extends IGenericDAO<Cliente, Long>{

	List<Cliente> filtrarClientes(String query);

}
