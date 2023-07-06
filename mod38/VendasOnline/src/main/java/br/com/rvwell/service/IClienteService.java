/**
 * 
 */
package br.com.rvwell.service;

import java.util.List;

import br.com.rvwell.domain.Cliente;
import br.com.rvwell.exceptions.DAOException;
import br.com.rvwell.services.generic.IGenericService;

/**
 * @author Raphael Van Well
 *
 */
public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

	List<Cliente> filtrarClientes(String query);

}
