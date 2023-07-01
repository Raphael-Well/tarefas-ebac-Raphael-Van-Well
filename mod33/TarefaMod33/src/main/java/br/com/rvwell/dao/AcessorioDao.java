/**
 * 
 */
package br.com.rvwell.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.rvwell.domain.Acessorio;
import br.com.rvwell.domain.Carro;

/**
 * @Author Raphael Van Well
 */
public class AcessorioDao implements IAcessorioDao {

	@Override
	public Acessorio cadastrar(Acessorio acessorio) {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("ExemploJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(acessorio);
		entityManager.getTransaction().commit();
		 
		entityManager.close();
		entityManagerFactory.close();
		return acessorio;
	}

	@Override
	public Acessorio buscarPorCarro(Carro carro) {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("ExemploJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT a FROM Acessorio a ");
		sb.append("INNER JOIN Carro c on a = a.carro ");
		sb.append("WHERE a = :carro");
		
		entityManager.getTransaction().begin();
		TypedQuery<Acessorio> query = 
				entityManager.createQuery(sb.toString(), Acessorio.class);
		query.setParameter("carro", carro);
		Acessorio acessorio = query.getSingleResult();    
		
		entityManager.close();
		entityManagerFactory.close();
		
		return acessorio;
	}

	@Override
	public void excluir(Acessorio acessorio) {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("ExemploJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		acessorio = entityManager.merge(acessorio);
		entityManager.remove(acessorio);
		entityManager.getTransaction().commit();
		 
		entityManager.close();
		entityManagerFactory.close();

	}

}
