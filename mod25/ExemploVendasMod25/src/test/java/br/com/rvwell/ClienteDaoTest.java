/**
 * 
 */
package br.com.rvwell;

import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.rvwell.dao.ClienteDAOMock;
import br.com.rvwell.dao.IClienteDAO;
import br.com.rvwell.domain.Cliente;
import br.com.rvwell.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author Raphael Van Well
 *
 */
public class ClienteDAOTest {
	private IClienteDAO clienteDao;
	
	private Cliente cliente;
	
	public ClienteDAOTest() {
		clienteDao = new ClienteDAOMock();
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
		Cliente clienteConsultado = clienteDao.consultar(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setCpf(12345678910L);
		Boolean retorno = clienteDao.cadastrar(cliente);
		Assert.assertTrue(retorno);
	}
	
	
	@Test
	public void excluirCliente() {
		clienteDao.excluir(cliente.getCpf());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setNome("Raphael Well");
		clienteDao.alterar(cliente);
		Assert.assertEquals("Raphael Well", cliente.getNome());
	}
	
	@Test
	public void buscarTodos() {
		Collection<Cliente> list = clienteDao.buscarTodos();
		Assert.assertTrue(list != null);
		Assert.assertTrue(list.size() == 2);
	}
}
