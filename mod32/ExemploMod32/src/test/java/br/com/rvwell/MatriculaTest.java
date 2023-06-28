/**
 * 
 */
package br.com.rvwell;

import static org.junit.Assert.assertNotNull;

import java.time.Instant;
import java.util.List;

import org.junit.After;
import org.junit.Test;

import br.com.rvwell.dao.IMatriculaDao;
import br.com.rvwell.dao.MatriculaDao;
import br.com.rvwell.domain.Matricula;

/**
 * @Author Raphael Van Well
 */
public class MatriculaTest {
	
	private IMatriculaDao matriculaDao;
	
	public MatriculaTest() {
		matriculaDao = new MatriculaDao();
	}
	
	@After
	public void end() {
		List<Matricula> list = matriculaDao.buscarTodos();
		list.forEach(mat -> matriculaDao.excluir(mat));
	}
	
	@Test
	public void cadastrar() {
		Matricula matricula = new Matricula();
		matricula.setCodigo("A1");
		matricula.setDataMatricula(Instant.now());
		matricula.setStatus("Ativa");
		matricula.setValor(2000d);
		matricula = matriculaDao.cadastrar(matricula);
		
		assertNotNull(matricula);
		assertNotNull(matricula.getId());
	}

}
