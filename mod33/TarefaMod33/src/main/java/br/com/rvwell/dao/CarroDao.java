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
import br.com.rvwell.domain.Marca;

/**
 * @Author Raphael Van Well
 */
public class CarroDao implements ICarroDao {

	@Override
	public Carro cadastrar(Carro carro) {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("ExemploJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(carro);
		entityManager.getTransaction().commit();
		 
		entityManager.close();
		entityManagerFactory.close();
		return carro;
	}

	
	
	@Override
	public void excluir(Carro carro) {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("ExemploJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		carro = entityManager.merge(carro);
		entityManager.remove(carro);
		entityManager.getTransaction().commit();
		 
		entityManager.close();
		entityManagerFactory.close();
	}



	@Override
	public Carro buscarPorAcessorio(Acessorio acessorio) {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("ExemploJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT c FROM Carro c ");
		sb.append("INNER JOIN Acessorio a on c = a.acessorio ");
		sb.append("WHERE c = :carro");
		
		entityManager.getTransaction().begin();
		TypedQuery<Carro> query = 
				entityManager.createQuery(sb.toString(), Carro.class);
		query.setParameter("acessorio", acessorio);
		Carro carro = query.getSingleResult();    
		
		entityManager.close();
		entityManagerFactory.close();
		
		return carro;
	}

}
