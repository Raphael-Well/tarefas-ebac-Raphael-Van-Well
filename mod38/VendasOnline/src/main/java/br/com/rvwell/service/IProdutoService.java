/**
 * 
 */
package br.com.rvwell.service;

import java.util.List;

import br.com.rvwell.domain.Produto;
import br.com.rvwell.services.generic.IGenericService;

/**
 * @author Raphael Van Well
 *
 */
public interface IProdutoService extends IGenericService<Produto, String> {

	List<Produto> filtrarProdutos(String query);

}
