/**
 * 
 */
package br.com.rvwell.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.rvwell.dao.IClienteDAO;
import br.com.rvwell.domain.Cliente;
import br.com.rvwell.exceptions.DAOException;
import br.com.rvwell.exceptions.MaisDeUmRegistroException;
import br.com.rvwell.exceptions.TableException;
import br.com.rvwell.services.generic.GenericService;

/**
 * @author Raphael Van Well
 *
 */
@Stateless
public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {
	
	private IClienteDAO clienteDAO;
	
	@Inject
	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
		this.clienteDAO = clienteDAO;
	}

	@Override
	public Cliente buscarPorCPF(Long cpf) throws DAOException {
		try {
			return this.dao.consultar(cpf);
		} catch (MaisDeUmRegistroException | TableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Cliente> filtrarClientes(String query) {
		return clienteDAO.filtrarClientes(query);
	}

}
