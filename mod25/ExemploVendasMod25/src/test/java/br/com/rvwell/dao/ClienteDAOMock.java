/**
 * 
 */
package br.com.rvwell.dao;

import java.util.ArrayList;
import java.util.Collection;

import br.com.rvwell.domain.Cliente;
import br.com.rvwell.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author Raphael Van Well
 *
 */
public class ClienteDAOMock implements IClienteDAO {

	@Override
	public Boolean cadastrar(Cliente entity) throws TipoChaveNaoEncontradaException {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void excluir(Long valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterar(Cliente entity) throws TipoChaveNaoEncontradaException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cliente consultar(Long valor) {
		Cliente cliente = new Cliente();
		cliente.setCpf(valor);
		return cliente;
	}

	@Override
	public Collection<Cliente> buscarTodos() {
		Collection<Cliente> listaClientes = new ArrayList<>();

        // Criação dos objetos Cliente
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();

        // Adição dos clientes à lista
        listaClientes.add(cliente1);
        listaClientes.add(cliente2); 
		return listaClientes;
	}
}
