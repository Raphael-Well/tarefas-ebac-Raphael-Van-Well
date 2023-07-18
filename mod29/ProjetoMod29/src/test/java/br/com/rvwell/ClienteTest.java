/**
 * 
 */
package br.com.rvwell;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import br.com.rvwell.dao.ClienteDAO;
import br.com.rvwell.domain.Cliente;

/**
 * @Author Raphael Van Well
 */
public class ClienteTest {

	@Test
	public void cadastrarTest() throws Exception {
		ClienteDAO dao = new ClienteDAO();
		
		Cliente cliente = new Cliente();
		cliente.setCodigo("01");
		cliente.setNome("Raphael Van Well");
		
		Integer qtd = dao.cadastrar(cliente);
		assertTrue(qtd == 1);
		
		Cliente clienteBD = dao.consultar(cliente.getCodigo());
		assertNotNull(clienteBD);
		assertNotNull(clienteBD.getId());
		assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
		assertEquals(cliente.getNome(), clienteBD.getNome());
		
		Integer qtdDel = dao.excluir(clienteBD);
		assertNotNull(qtdDel);
	}
	
	@Test
	public void excluirTest() throws Exception {
		ClienteDAO dao = new ClienteDAO();
		
		Cliente cliente = new Cliente();
		cliente.setCodigo("10");
		cliente.setNome("Raphael Van Well");
		Integer countCad = dao.cadastrar(cliente);
		assertTrue(countCad == 1);
		
		Cliente clienteBD = dao.consultar("10");
		assertNotNull(clienteBD);
		assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
		assertEquals(cliente.getNome(), clienteBD.getNome());
		
		Integer countDel = dao.excluir(clienteBD);
		assertTrue(countDel == 1);
	}
	
	@Test
	public void atualizarTest() throws Exception {
		ClienteDAO dao = new ClienteDAO();
		Cliente cliente = new Cliente();
		
		cliente.setCodigo("10");
		cliente.setNome("Raphael Van Well");
		Integer countCad = dao.cadastrar(cliente);
		assertTrue(countCad == 1);
		
		Cliente clienteBD = dao.consultar("10");
		assertNotNull(clienteBD);
		assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
		assertEquals(cliente.getNome(), clienteBD.getNome());
		
		clienteBD.setCodigo("20");
		clienteBD.setNome("Outro nome");
		Integer countUpdate = dao.atualizar(clienteBD);
		assertTrue(countUpdate == 1);
		
		Cliente clienteBD1 = dao.consultar("10");
		assertNull(clienteBD1);
		
		Cliente clienteBD2 = dao.consultar("20");
		assertNotNull(clienteBD2);
		assertEquals(clienteBD.getId(), clienteBD2.getId());
		assertEquals(clienteBD.getCodigo(), clienteBD2.getCodigo());
		assertEquals(clienteBD.getNome(), clienteBD2.getNome());
		
		List<Cliente> list = dao.buscarTodos();
		for (Cliente cli : list) {
			dao.excluir(cli);
		}
	}
	
	@Test
	public void buscarTodosTest() throws Exception {
		ClienteDAO dao = new ClienteDAO();
		
		Cliente cliente = new Cliente();
		cliente.setCodigo("10");
		cliente.setNome("Raphael Van Well");
		Integer countCad = dao.cadastrar(cliente);
		assertTrue(countCad == 1);
		
		Cliente clientes = new Cliente();
		clientes.setCodigo("20");
		clientes.setNome("Teste");
		Integer countCad2 = dao.cadastrar(clientes);
		assertTrue(countCad2 == 1);
		
		List<Cliente> list = dao.buscarTodos();
		assertNotNull(list);
		assertEquals(2, list.size());
		
		int countDel = 0;
		for (Cliente cli : list) {
			dao.excluir(cli);
			countDel++;
		}
		assertEquals(list.size(), countDel);
		
		list = dao.buscarTodos();
		assertEquals(list.size(), 0);
		
	}
}
