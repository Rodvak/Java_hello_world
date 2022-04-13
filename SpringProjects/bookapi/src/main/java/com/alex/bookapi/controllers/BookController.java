package com.alex.bookapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alex.bookapi.models.Book;
import com.alex.bookapi.services.BookService;

@Controller
public class BookController {
	
	// Ask John what this does.
	@Autowired
	BookService bookService;
	
	// It shows a specific book.
	@GetMapping("/books/{id}")
	public String index(Model model, 
			@PathVariable("id") Long id) {
		Book book = bookService.findBook(id);
		model.addAttribute("book", book);
		return "index.jsp";
	}
	    
	@RequestMapping("/allbooks")
    public String allBooks(Model model) {
	     List<Book> books = bookService.allBooks();
	     model.addAttribute("books", books);
	     return "allBooks.jsp";
	}
}


