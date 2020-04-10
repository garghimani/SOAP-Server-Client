package com.soap.books;

import com.soap.books.bo.BooksBO;
import com.soap.books.vo.Books;

public class TestService {

	BooksBO bookBO = new BooksBO();
	
	public void createBook(Books book) {
		bookBO.createBooks(book);
	}
	
	
	
	public Books getBooks(int bookid) {
		Books book = bookBO.getBooks(bookid);
		return book;
	}
	
	public void updateBooks(Books book) {
		bookBO.updateBooks(book);
	}
	
	public void deleteBooks(int bookid) {
		bookBO.deleteBooks(bookid);
	}

}
