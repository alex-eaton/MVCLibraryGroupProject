package edu.dmacc.spring.libraryproject;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class BookDao {
	
	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("MVCLibraryGroupProject");
	
	public void insertBook(Book bookToAdd) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(bookToAdd);
		em.getTransaction().commit();
		em.close();
	}

	public List<Book> getAllBooks() {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		String q = "select u from Book u";
		TypedQuery<Book> typedQuery = em.createQuery(q, Book.class);
		List<Book> all = typedQuery.getResultList();
		return all;
	}
	
	public void deleteBook(Book booktoDelete) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Book> typedQuery = em.createQuery(
				"select li from Book li where li.id = :selectedId",
				Book.class);
		
		typedQuery.setParameter("selectedId", booktoDelete.getId()); 
		typedQuery.setMaxResults(1);
		Book result = typedQuery.getSingleResult();
		System.out.println("TEST - result: " + result);
		em.remove(result);
		em.getTransaction().commit();
		em.close();
	}
	
	public void editBook(Book toEdit) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin(); 
		em.merge(toEdit);
		em.getTransaction().commit();
		em.close();
	}
}
