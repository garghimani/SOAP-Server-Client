package com.soap.books.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.soap.books.util.HibernateUtil;
import com.soap.books.vo.Books;

public class BooksDAO {

	public void createBooks(Books book) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.getTransaction();
		tx.begin();
		session.save(book);
		tx.commit();
		session.close();

	}

	public Books getBooks(int bookid) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Books book = (Books) session.load(Books.class, new Integer(bookid));
		System.out.println(book);
		session.close();
		return book;
	}

	public void updateBooks(Books book) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.getTransaction();
		tx.begin();
		session.update(book);
		tx.commit();
		session.close();

	}

	public void deleteBooks(int bookid) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Books book = getBooks(bookid);
		Transaction tx = session.getTransaction();
		tx.begin();
		session.delete(book);
		tx.commit();
		session.close();

	}

}
