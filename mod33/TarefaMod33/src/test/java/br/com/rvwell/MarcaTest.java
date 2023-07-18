/**
 * 
 */
package br.com.rvwell;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import br.com.rvwell.dao.AcessorioDao;
import br.com.rvwell.dao.CarroDao;
import br.com.rvwell.dao.IAcessorioDao;
import br.com.rvwell.dao.ICarroDao;
import br.com.rvwell.dao.IMarcaDao;
import br.com.rvwell.dao.MarcaDao;
import br.com.rvwell.domain.Acessorio;
import br.com.rvwell.domain.Carro;
import br.com.rvwell.domain.Marca;

/**
 * @Author Raphael Van Well
 */
public class MarcaTest {

	
	private MarcaDao marcaDao;

    @Before
    public void setUp() {
        marcaDao = new MarcaDao();
    }

    @Test
    public void testCadastrar() {
        Marca marca = new Marca();
        marca.setCodigo("123");
        marca.setNome("Marca Teste");

        marca = marcaDao.cadastrar(marca);

        assertNotNull(marca);
    }
}
