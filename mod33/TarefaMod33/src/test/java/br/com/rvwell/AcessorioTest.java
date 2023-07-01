/**
 * 
 */
package br.com.rvwell;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import br.com.rvwell.dao.AcessorioDao;
import br.com.rvwell.dao.CarroDao;
import br.com.rvwell.dao.MarcaDao;
import br.com.rvwell.domain.Acessorio;
import br.com.rvwell.domain.Carro;
import br.com.rvwell.domain.Marca;

/**
 * @Author Raphael Van Well
 */
public class AcessorioTest {
	
	private AcessorioDao acessorioDao;
    private CarroDao carroDao;
    private MarcaDao marcaDao;

    @Before
    public void setUp() {
        acessorioDao = new AcessorioDao();
        carroDao = new CarroDao();
        marcaDao = new MarcaDao();
    }

    @Test
    public void testCadastrar() {

    	Carro carro = new Carro();
        carro.setCodigo("456");
        carro.setNome("Carro Teste");
        
        Marca marca = new Marca();
        marca.setNome("Marca Teste");
        marca.setCodigo("561");
        marcaDao.cadastrar(marca);
        carro.setMarca(marca);

        carroDao.cadastrar(carro);

        Acessorio acessorio = new Acessorio();
        acessorio.setCodigo("789");
        acessorio.setNome("Acessorio Teste");
    
        
        acessorio.setCarros(new ArrayList<>());

        acessorio.getCarros().add(carro);

        acessorioDao.cadastrar(acessorio);

        assertNotNull(acessorio.getId());
    }
	

}
