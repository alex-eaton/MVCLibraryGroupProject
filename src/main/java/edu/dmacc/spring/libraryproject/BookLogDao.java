package edu.dmacc.spring.libraryproject;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class BookLogDao {
	
	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("MVCLibraryGroupProject");
	
	public void checkout(BookLog bookToCheckout) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(bookToCheckout);
		em.getTransaction().commit();
		em.close();
	}

	public List<BookLog> getAllBookLogs() {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		String q = "select u from BookLog u";
		TypedQuery<BookLog> typedQuery = em.createQuery(q, BookLog.class);
		List<BookLog> all = typedQuery.getResultList();
		return all;
	}
}
