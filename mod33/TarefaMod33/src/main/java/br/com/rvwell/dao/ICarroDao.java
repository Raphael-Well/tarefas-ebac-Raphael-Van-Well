/**
 * 
 */
package br.com.rvwell.dao;

import br.com.rvwell.domain.Acessorio;
import br.com.rvwell.domain.Carro;

/**
 * @Author Raphael Van Well
 */
public interface ICarroDao {
	
	Carro cadastrar(Carro carro);
	
	Carro buscarPorAcessorio(Acessorio acessorio);
	
	void excluir(Carro carro);
}
