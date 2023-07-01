/**
 * 
 */
package br.com.rvwell.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.rvwell.domain.Carro;
import br.com.rvwell.domain.Marca;

/**
 * @Author Raphael Van Well
 */
public class MarcaDao implements IMarcaDao{

	@Override
	public Marca cadastrar(Marca marca) {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("ExemploJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(marca);
		entityManager.getTransaction().commit();
		 
		entityManager.close();
		entityManagerFactory.close();
		return marca;
	}

	@Override
	public Marca buscarPorCarro(Carro carro) {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("ExemploJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT m FROM Marca m ");
		sb.append("INNER JOIN Carro c on c = m.carro ");
		sb.append("WHERE c = :carro");
		
		entityManager.getTransaction().begin();
		TypedQuery<Marca> query = 
				entityManager.createQuery(sb.toString(), Marca.class);
		query.setParameter("carro", carro);
		Marca marca = query.getSingleResult();    
		
		entityManager.close();
		entityManagerFactory.close();
		
		return marca;
	}

	@Override
	public void excluir(Marca marca) {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("ExemploJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		marca = entityManager.merge(marca);
		entityManager.remove(marca);
		entityManager.getTransaction().commit();
		 
		entityManager.close();
		entityManagerFactory.close();
	}

}
