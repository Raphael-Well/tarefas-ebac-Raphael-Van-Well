/**
 * 
 */
package br.com.rvwell;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.rvwell.dao.ClienteDAOMock;
import br.com.rvwell.dao.IClienteDAO;
import br.com.rvwell.domain.Cliente;
import br.com.rvwell.exceptions.TipoChaveNaoEncontradaException;
import br.com.rvwell.services.ClienteService;
import br.com.rvwell.services.IClienteService;

/**
 * @author Raphael Van Well
 *
 */
public class ClienteServiceTest {
	
	private IClienteService clienteService;
	
	private Cliente cliente;
	
	public ClienteServiceTest() {
		IClienteDAO dao = new ClienteDAOMock();
		clienteService = new ClienteService(dao);
	}
	
	@Before
	public void init() {
		cliente = new Cliente();
		cliente.setCpf(12345678910L);
		cliente.setNome("Raphael");
		cliente.setCidade("Palhoça");
		cliente.setEnd("End");
		cliente.setEstado("SC");
		cliente.setNumero(90);
		cliente.setTel(47999999999L);
		
	}
	
	@Test
	public void pesquisarCliente() {
		Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException {
		Boolean retorno = clienteService.cadastrar(cliente);
		
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirCliente() {
		clienteService.excluir(cliente.getCpf());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setNome("Raphael Well");
		clienteService.alterar(cliente);
		
		Assert.assertEquals("Raphael Well", cliente.getNome());
	}
}
