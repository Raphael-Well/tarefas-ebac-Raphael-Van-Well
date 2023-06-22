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

import br.com.rvwell.dao.ProdutoDAO;
import br.com.rvwell.domain.Produto;

/**
 * @Author Raphael Van Well
 */
public class ProdutoTest {
	
	@Test
	public void cadastrarProduto() throws Exception {
		ProdutoDAO dao = new ProdutoDAO();
		Produto produto = new Produto();
		
		produto.setCodigo("02");
		produto.setNome("Notebook");
		
		Integer contCdt = dao.cadastrar(produto);
		assertTrue(contCdt == 1);
		
		Produto produtoBD = dao.consultar(produto.getCodigo());
		assertNotNull(produtoBD);
		assertNotNull(produtoBD.getId());
		assertEquals(produto.getCodigo(), produtoBD.getCodigo());
		assertEquals(produto.getNome(), produtoBD.getNome());
		
		Integer qtdDel = dao.excluir(produtoBD);
		assertNotNull(qtdDel);
	}
	
	@Test
	public void excluirTest() throws Exception {
		ProdutoDAO dao = new ProdutoDAO();
		
		Produto produto = new Produto();
		produto.setCodigo("10");
		produto.setNome("Caneta");
		Integer countCad = dao.cadastrar(produto);
		assertTrue(countCad == 1);
		
		Produto produtoBD = dao.consultar("10");
		assertNotNull(produtoBD);
		assertEquals(produto.getCodigo(), produtoBD.getCodigo());
		assertEquals(produto.getNome(), produtoBD.getNome());
		
		Integer countDel = dao.excluir(produtoBD);
		assertTrue(countDel == 1);
	}
	
	@Test
	public void atualizarTest() throws Exception {
		ProdutoDAO dao = new ProdutoDAO();
		Produto produto = new Produto();
		
		produto.setCodigo("10");
		produto.setNome("Caneta");
		Integer countCad = dao.cadastrar(produto);
		assertTrue(countCad == 1);
		
		Produto produtoBD = dao.consultar("10");
		assertNotNull(produtoBD);
		assertEquals(produto.getCodigo(), produtoBD.getCodigo());
		assertEquals(produto.getNome(), produtoBD.getNome());
		
		produtoBD.setCodigo("20");
		produtoBD.setNome("Outro nome");
		Integer countUpdate = dao.atualizar(produtoBD);
		assertTrue(countUpdate == 1);
		
		Produto produtoBD1 = dao.consultar("10");
		assertNull(produtoBD1);
		
		Produto produtoBD2 = dao.consultar("20");
		assertNotNull(produtoBD2);
		assertEquals(produtoBD.getId(), produtoBD2.getId());
		assertEquals(produtoBD.getCodigo(), produtoBD2.getCodigo());
		assertEquals(produtoBD.getNome(), produtoBD2.getNome());
		
		List<Produto> list = dao.buscarTodos();
		for (Produto prod : list) {
			dao.excluir(prod);
		}
	}
	
	@Test
	public void buscarTodosTest() throws Exception {
		ProdutoDAO dao = new ProdutoDAO();
		Produto produto = new Produto();
		
		produto.setCodigo("10");
		produto.setNome("Caneta");
		Integer countCad = dao.cadastrar(produto);
		assertTrue(countCad == 1);
		
		Produto produtos = new Produto();
		produtos.setCodigo("20");
		produtos.setNome("Teste");
		Integer countCad2 = dao.cadastrar(produtos);
		assertTrue(countCad2 == 1);
		
		List<Produto> list = dao.buscarTodos();
		assertNotNull(list);
		assertEquals(2, list.size());
		
		int countDel = 0;
		for (Produto prod : list) {
			dao.excluir(prod);
			countDel++;
		}
		assertEquals(list.size(), countDel);
		
		list = dao.buscarTodos();
		assertEquals(list.size(), 0);
		
	}

}
