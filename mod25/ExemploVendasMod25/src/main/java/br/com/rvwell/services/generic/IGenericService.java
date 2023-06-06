/**
 * 
 */
package br.com.rvwell.services.generic;

import java.io.Serializable;
import java.util.Collection;

import br.com.rvwell.dao.Persistente;
import br.com.rvwell.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author Raphael Van Well
 *
 */
public interface IGenericService <T extends Persistente, E extends Serializable> {
	
    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException;

    public void excluir(E valor);

    public void alterar(T entity) throws TipoChaveNaoEncontradaException;

    public T consultar(E valor);

    public Collection<T> buscarTodos();

}
