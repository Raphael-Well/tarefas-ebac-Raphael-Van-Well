/**
 * 
 */
package br.com.rvwell.dao;

import java.util.List;

import br.com.rvwell.domain.Produto;

/**
 * @Author Raphael Van Well
 */
public interface IProdutoDao {
	
public Produto cadastrar(Produto produto);
	
	public void excluir(Produto produto);

	public List<Produto> buscarTodos();

}
