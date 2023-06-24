/**
 * 
 */
package br.com.rvwell.dao;

import br.com.rvwell.dao.generic.IGenericDAO;
import br.com.rvwell.domain.Venda;
import br.com.rvwell.exceptions.DAOException;
import br.com.rvwell.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author rodrigo.pires
 *
 */
public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
