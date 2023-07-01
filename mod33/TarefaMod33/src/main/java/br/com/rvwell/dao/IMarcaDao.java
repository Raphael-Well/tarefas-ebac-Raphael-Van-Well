/**
 * 
 */
package br.com.rvwell.dao;

import br.com.rvwell.domain.Carro;
import br.com.rvwell.domain.Marca;

/**
 * @Author Raphael Van Well
 */
public interface IMarcaDao {
	Marca cadastrar(Marca marca);
	
	Marca buscarPorCarro(Carro carro);
	
	void excluir(Marca marca);
}
