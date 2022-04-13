package com.alex.bookapi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alex.bookapi.models.Book;
import com.alex.bookapi.services.BookService;

// text, xml, JSON
@RestController
public class BooksApi {


	private final BookService bookService;
    public BooksApi(BookService bookService){
        this.bookService = bookService;
    }
    @RequestMapping("/api/books")
    public List<Book> index() {
        return bookService.allBooks();
    }
    
    // Creates a book.
    @RequestMapping(value="/api/books", method=RequestMethod.POST)
    public Book create(@RequestParam(value="title") String title, 
    					@RequestParam(value="description") String description, 
    					@RequestParam(value="language") String language, 
    					@RequestParam(value="pages") Integer pages) {
        Book book = new Book(title, description, language, pages);
        return bookService.createBook(book);
    }
    
    // Gets (Retrieve) every book using ID.
    @RequestMapping("/api/books/{id}")
    public Book show(@PathVariable("id") Long id) {
        Book book = bookService.findBook(id);
        return book;
    }
    
    // Updates a book based on the API.
    @RequestMapping(value="/api/books/{id}", method=RequestMethod.PUT)
    public Book update(
    			@PathVariable("id") Long id,
    			@RequestParam(value="title") String title,
    			@RequestParam(value="description") String description,
    			@RequestParam(value="language") String language,
    			@RequestParam(value="pages") Integer pages) {
    	Book book = bookService.updateBook(id, title, description, language, pages);
    	return book;
    }
    
    // Deletes a book using ID.
    @RequestMapping(value="/api/books/{id}", method=RequestMethod.DELETE)
	public void destroy(@PathVariable("id") Long id) {
		bookService.deleteBook(id);
	}
}
