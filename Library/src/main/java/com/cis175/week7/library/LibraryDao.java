package com.cis175.week7.library;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class LibraryDao {

	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Library");

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
		String q = "select b from Book b";
		TypedQuery<Book> typedQuery = em.createQuery(q, Book.class);
		List<Book> all = typedQuery.getResultList();
		return all;
	}

	public void insertMag(Magazine magazine) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(magazine);
		em.getTransaction().commit();
		em.close();
	}

	public List<Magazine> getAllMags() {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		String q = "select m from Magazine m";
		TypedQuery<Magazine> typedQuery = em.createQuery(q, Magazine.class);
		List<Magazine> all = typedQuery.getResultList();
		return all;

	}


	public List<Book> getAllByGenre() {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
//		String q = "select b from Book b where b.genre = 'DIY'";
		String q = "select b from Book b, Magazine m where b.genre = m.genre";
		TypedQuery<Book> typedQuery = em.createQuery(q, Book.class);
		List<Book> all = typedQuery.getResultList();
		return all;
	}
	
//	public List<TitleAndGenre> getAllByGenre() {
//		EntityManager em = emfactory.createEntityManager();
//		em.getTransaction().begin();
//		// String q = "select b from Book b";
//		// String q = "select m.title, m.genre from Magazine m";
//		String q = "select b.title, m.title, b.genre from Book b, Magazine m where b.genre = m.genre";
//		TypedQuery<Object[]> typedQuery = em.createQuery(q, Object[].class);
//		List<Object[]> all2 = typedQuery.getResultList();
//		List<TitleAndGenre> tag = new ArrayList<TitleAndGenre>();
//		for (Object[] a : all2) {
//			tag.add(new TitleAndGenre((String) a[0], (String) a[1], (String) a[2]));
//		}
//		return tag;
//	}
}
