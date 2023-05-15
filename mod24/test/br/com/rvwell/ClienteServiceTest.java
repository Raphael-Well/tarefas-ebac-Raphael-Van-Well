package br.com.rvwell;

import br.com.rvwell.dao.ClienteDao;
import br.com.rvwell.dao.ClienteDaoMock;
import br.com.rvwell.dao.IClienteDao;
import br.com.rvwell.service.ClienteService;
import org.junit.Assert;
import org.junit.Test;


public class ClienteServiceTest {

    @Test
    public void salvarTest() {
        IClienteDao mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarTest() {
        IClienteDao mockDao = new ClienteDao();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
}
