/**
 * 
 */
package br.com.rvwell.dao;

import java.util.List;

import br.com.rvwell.domain.Matricula;

/**
 * @Author Raphael Van Well
 */
public interface IMatriculaDao {
	
	public Matricula cadastrar(Matricula matricula);
	
	public void excluir(Matricula matricula);
	
	public List<Matricula> buscarTodos();

}
