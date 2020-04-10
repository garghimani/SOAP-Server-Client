package com.soap.books.bo;

import com.soap.books.dao.BooksDAO;
import com.soap.books.vo.Books;

public class BooksBO {
	
	BooksDAO bookDAO = new BooksDAO();

	public void createBooks(Books book) {
		bookDAO.createBooks(book);
	}

	public Books getBooks(int bookid) {
		Books book = bookDAO.getBooks(bookid);
		return book;
	}

	public void updateBooks(Books book) {
		bookDAO.updateBooks(book);
	}

	public void deleteBooks(int bookid) {
		bookDAO.deleteBooks(bookid);
	}

}
