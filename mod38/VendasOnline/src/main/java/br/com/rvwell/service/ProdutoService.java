/**
 * 
 */
package br.com.rvwell.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.rvwell.dao.IProdutoDAO;
import br.com.rvwell.domain.Produto;
import br.com.rvwell.services.generic.GenericService;

/**
 * @author Raphael Van Well
 *
 */
@Stateless
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {
	
	private IProdutoDAO produtoDao;

	@Inject
	public ProdutoService(IProdutoDAO produtoDao) {
		super(produtoDao);
		this.produtoDao = produtoDao;
	}

	@Override
	public List<Produto> filtrarProdutos(String query) {
		return produtoDao.filtrarProdutos(query);
	}

}
