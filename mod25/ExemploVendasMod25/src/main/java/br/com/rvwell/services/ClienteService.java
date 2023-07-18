/**
 * 
 */
package br.com.rvwell.services;

import br.com.rvwell.dao.IClienteDAO;
import br.com.rvwell.domain.Cliente;
import br.com.rvwell.exceptions.TipoChaveNaoEncontradaException;
import br.com.rvwell.services.generic.GenericService;

/**
 * @author Raphael Van Well
 *
 */
public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {
	
	//private IClienteDAO clienteDAO;
	
	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
		//this.clienteDAO = clienteDAO;
	}


	@Override
	public Cliente buscarPorCPF(Long cpf) {
		return this.dao.consultar(cpf);
	}

//	

}
