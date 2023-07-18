/**
 * 
 */
package br.com.rvwell;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.After;
import org.junit.Test;

import br.com.rvwell.dao.CursoDao;
import br.com.rvwell.dao.ICursoDao;
import br.com.rvwell.domain.Curso;

/**
 * @Author Raphael Van Well
 */
public class CursoTest {
	
	
	private ICursoDao cursoDao;
	
	public CursoTest() {
		cursoDao = new CursoDao();
	}
	
	@After
	public void end() {
		List<Curso> list = cursoDao.buscarTodos();
		list.forEach(curso -> cursoDao.excluir(curso));
	}

	@Test
	public void Cadastrar() {
		Curso curso = new Curso();
		curso.setCodigo("A1");
		curso.setDescricao("Curso Teste");
		curso.setNome("Curso de Java backend");
		curso = cursoDao.cadastrar(curso);
		
		assertNotNull(curso);
		assertNotNull(curso.getId());
	}
}
