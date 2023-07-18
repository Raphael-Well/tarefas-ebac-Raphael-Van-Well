/**
 * 
 */
package br.com.rvwell;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.After;
import org.junit.Test;

import br.com.rvwell.dao.IProdutoDao;
import br.com.rvwell.dao.ProdutoDao;
import br.com.rvwell.domain.Produto;

/**
 * @Author Raphael Van Well
 */
public class ProdutoTest {
	
	private IProdutoDao produtoDao;
	
	public ProdutoTest() {
		produtoDao = new ProdutoDao();
	}
	
	@After
	public void end() {
		List<Produto> list = produtoDao.buscarTodos();
		list.forEach(prod -> produtoDao.excluir(prod));
	}
	
	@Test
	public void cadastro() {
		Produto produto = new Produto();
		produto.setCodigo("P1");
		produto.setNome("Caneta");
		produto.setQuantidade(5);
		produto = produtoDao.cadastrar(produto);
		
		assertNotNull(produto);
		assertNotNull(produto.getId());
	}
}
