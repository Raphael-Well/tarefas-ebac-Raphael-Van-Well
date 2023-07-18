/**
 * 
 */
package br.com.rvwell.dao;

import br.com.rvwell.domain.Acessorio;
import br.com.rvwell.domain.Carro;
import br.com.rvwell.domain.Marca;

/**
 * @Author Raphael Van Well
 */
public interface IAcessorioDao {
	Acessorio cadastrar(Acessorio acessorio);
	
	Acessorio buscarPorCarro(Carro carro);
	
	void excluir(Acessorio acessorio);

}
