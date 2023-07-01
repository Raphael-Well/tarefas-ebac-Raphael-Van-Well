/**
 * 
 */
package br.com.rvwell;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import br.com.rvwell.dao.CarroDao;
import br.com.rvwell.dao.MarcaDao;
import br.com.rvwell.domain.Carro;
import br.com.rvwell.domain.Marca;

/**
 * @Author Raphael Van Well
 */
public class CarroTest {
		
	private CarroDao carroDao;
	private MarcaDao marcaDao;
	
	@Before
	public void setUp() {
	    carroDao = new CarroDao();
	    marcaDao = new MarcaDao();
	}
	
	
	@Test
	public void testCadastrar() {

	    Marca marca = new Marca();
	    marca.setCodigo("123");
	    marca.setNome("Marca Teste");
	

	    marcaDao.cadastrar(marca);
	

	    Carro carro = new Carro();
	    carro.setCodigo("456");
	    carro.setNome("Carro Teste");
	    carro.setMarca(marca);
	

	    carroDao.cadastrar(carro);
	

	    assertNotNull(carro.getId());
	}
}
