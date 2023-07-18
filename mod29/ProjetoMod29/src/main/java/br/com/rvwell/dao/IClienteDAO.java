/**
 * 
 */
package br.com.rvwell.dao;

import java.util.List;

import br.com.rvwell.domain.Cliente;

/**
 * @Author Raphael Van Well
 */
public interface IClienteDAO {
	
	public Integer cadastrar(Cliente cliente) throws Exception;

	public Cliente consultar(String codigo) throws Exception;

	public Integer excluir(Cliente cliente) throws Exception;
	
	public Integer atualizar(Cliente cliente) throws Exception;
	
	public List<Cliente> buscarTodos() throws Exception;
}
