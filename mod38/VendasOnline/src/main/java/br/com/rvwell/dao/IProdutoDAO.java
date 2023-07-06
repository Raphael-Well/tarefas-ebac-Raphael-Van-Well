/**
 * 
 */
package br.com.rvwell.dao;

import java.util.List;

import br.com.rvwell.dao.generic.IGenericDAO;
import br.com.rvwell.domain.Produto;

/**
 * @author Raphael Van Well
 *
 */
public interface IProdutoDAO extends IGenericDAO<Produto, String>{

	List<Produto> filtrarProdutos(String query);

}
