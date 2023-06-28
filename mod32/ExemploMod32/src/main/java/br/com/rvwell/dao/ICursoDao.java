/**
 * 
 */
package br.com.rvwell.dao;

import java.util.List;

import br.com.rvwell.domain.Curso;

/**
 * @Author Raphael Van Well
 */
public interface ICursoDao {
	
	public Curso cadastrar(Curso curso);
	
	public void excluir(Curso curso);

	public List<Curso> buscarTodos();
}
