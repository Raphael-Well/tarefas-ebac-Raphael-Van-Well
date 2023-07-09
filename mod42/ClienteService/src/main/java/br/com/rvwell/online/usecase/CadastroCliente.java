/**
 * 
 */
package br.com.rvwell.online.usecase;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rvwell.online.domain.Cliente;
import br.com.rvwell.online.repository.IClienteRepository;

/**
 * @author Raphael Van Well
 *
 */
@Service
public class CadastroCliente {
	
	private IClienteRepository clienteRepository;
	
	@Autowired
	public CadastroCliente(IClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	
	public Cliente cadastrar(@Valid Cliente cliente) {
		return this.clienteRepository.insert(cliente);
	}

	public Cliente atualizar(@Valid Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}

	public void remover(String id) {
		this.clienteRepository.deleteById(id);
	}

}
