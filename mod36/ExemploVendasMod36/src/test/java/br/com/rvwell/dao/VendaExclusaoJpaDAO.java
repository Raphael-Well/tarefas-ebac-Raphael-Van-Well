/**
 * 
 */
package br.com.rvwell.dao;

import br.com.rvwell.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.rvwell.dao.jpa.IVendaJpaDAO;
import br.com.rvwell.domain.jpa.VendaJpa;
import br.com.rvwell.exceptions.DAOException;
import br.com.rvwell.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author Raphael Van Well
 *
 * Classe utilizada somente no teste para fazer a exclusão das vendas
 *
 */
public class VendaExclusaoJpaDAO extends GenericJpaDB1DAO<VendaJpa, Long> implements IVendaJpaDAO {

	public VendaExclusaoJpaDAO() {
		super(VendaJpa.class);
	}

	@Override
	public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public VendaJpa consultarComCollection(Long id) {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

}
