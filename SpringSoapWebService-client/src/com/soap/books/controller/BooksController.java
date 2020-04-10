package com.soap.books.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.soap.books.TestServiceProxy;
import com.soap.books.vo.Books;

@Controller
public class BooksController {
	
	@RequestMapping(value = "/entryAddBook.do", method=RequestMethod.GET)
	public String entryAddBookDetails(@ModelAttribute Books book) {
		System.out.println("entryAddBook Controller : entryAddBookDetails() : Start");
		
		System.out.println("entryAddBook Controller : entryAddBookDetails() : End");
		return "home";
	}
	
	//Create Books Details
		@RequestMapping("/processAddBook.do")
		public String processAddBookDetails(Model model,@ModelAttribute Books book) throws Exception {
			System.out.println("processAddBook : processAddBookDetails() : Start");
			System.out.println("Book Name : " + book.getBookName());
			//model.addAttribute("book", book);
			try {
				TestServiceProxy proxy = new TestServiceProxy();
				//Books bookVO = new Books();
				model.addAttribute("book", book);
				proxy.createBook(book);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("processAddBook : processAddBookDetails() : End");
			return "success";
		}
		
		//Get Book Details
		@RequestMapping("/processViewBook.do")
		public String processViewBookDetails(Model model,@ModelAttribute Books book) throws Exception {
			System.out.println("processViewBook : processViewBookDetails() : Start");
			System.out.println("Book Name  and Id : " + book.getBookName()+"  "+book.getBookid());
			try {
				TestServiceProxy proxy = new TestServiceProxy();				
				book = proxy.getBooks(book.getBookid());
				model.addAttribute("book", book);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("processViewBook : processViewBookDetails() : End");
			return "success";
		}
		
		 //Update Book Details
	    @RequestMapping("/entryUpdateBook.do")
		public String entryUpdateBookDetails(@ModelAttribute Books book, Model model) throws Exception {
			System.out.println("entryUpdateBook : processUpdateBookDetails() : Start");
			try {
				TestServiceProxy proxy = new TestServiceProxy();
				book = proxy.getBooks(book.getBookid());
				model.addAttribute("book", book);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("entryUpdateBook : processUpdateBookDetails() : End");
			return "updatebook";
		}
	    
	    @RequestMapping("/processUpdateBook.do")
		public String processUpdateBookDetails(@ModelAttribute Books book, Model model) throws Exception {
			System.out.println("processUpdateBook : processUpdateBookDetails() : Start");
			try {
				TestServiceProxy proxy = new TestServiceProxy();		
				proxy.updateBooks(book);
				book = proxy.getBooks(book.getBookid());
				model.addAttribute("book", book);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("processUpdateBook : processUpdateBookDetails() : End");
			return "success";
		}
	    
	  //Delete Book Details
	    @RequestMapping("/processDeleteBook.do")
	   	public String processDeleteBookDetails(@ModelAttribute Books book) throws Exception {
	   		System.out.println("processDeleteBook : processDeleteBookDetails() : Start");

	   		try {
	   			TestServiceProxy proxy = new TestServiceProxy();
	   			proxy.deleteBooks(book.getBookid());
	   		} catch (Exception e) {
	   			e.printStackTrace();
	   		}
	   		System.out.println("processDeleteBook : processDeleteBookDetails() : End");
	   		return "home";
	   	}	

}
