/**
 * 
 */
package br.com.rvwell.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import br.com.rvwell.domain.Matricula;

/**
 * @Author Raphael Van Well
 */
public class MatriculaDao implements IMatriculaDao {

	@Override
	public Matricula cadastrar(Matricula matricula) {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("ExemploJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(matricula);
		entityManager.getTransaction().commit();
		 
		entityManager.close();
		entityManagerFactory.close();
		
		
		return matricula;
	}

	@Override
	public void excluir(Matricula matricula) {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("ExemploJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		matricula = entityManager.merge(matricula);
		entityManager.remove(matricula);
		entityManager.getTransaction().commit();
		 
		entityManager.close();
		entityManagerFactory.close();
		
	}

	@Override
	public List<Matricula> buscarTodos() {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("ExemploJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Matricula> query = builder.createQuery(Matricula.class);
		Root<Matricula> root = query.from(Matricula.class);
		query.select(root);
		
		TypedQuery<Matricula> tpQuery = entityManager.createQuery(query);
		List<Matricula> list = tpQuery.getResultList();  
		
		entityManager.close();
		entityManagerFactory.close();
		return list;
	}

}
