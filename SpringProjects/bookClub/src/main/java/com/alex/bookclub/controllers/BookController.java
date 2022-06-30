package com.alex.bookclub.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alex.bookclub.models.Book;
import com.alex.bookclub.models.User;
import com.alex.bookclub.services.BookService;
import com.alex.bookclub.services.UserService;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;
	
	@Autowired 
	private UserService userService;
	
	
	// RENDER CREATE BOOK
	@GetMapping("/create")
	public String create(@ModelAttribute("book") Book book, HttpSession session, Model model) {
		Long userId = (Long) session.getAttribute("user_id");
		// Check if userID is null
		if (userId == null) {
			return "redirect:/";
		} else {
			User loggedUser = userService.findOne(userId);
			model.addAttribute("loggedUser", loggedUser);
			List<Book>allBooks = bookService.allBooks();
			model.addAttribute("allBooks", allBooks);
			return "create.jsp";		
		}
	}
	
	
	// CREATE BOOK FORM 
	@PostMapping("/create/book")
	public String createBook(@Valid @ModelAttribute("book") Book book,
			BindingResult result,
			Model model,
			HttpSession session) {
		Long userId = (Long) session.getAttribute("user_id");
		// Check if userID is null
		if (userId == null) {
			return "redirect:/";
		} else {
		if (result.hasErrors()) {
			List<Book>allBooks = bookService.allBooks();
			model.addAttribute("allBooks", allBooks);
			return "create.jsp";
		} else {
			bookService.createBook(book);
			return "redirect:/home";
		}
			
		}
		
	}
	
	
	// SHOW BOOK
	@RequestMapping("/books/{id}")
	public String showBook( @PathVariable("id") Long id, Model model,
			HttpSession session) {
		Long userId = (Long) session.getAttribute("user_id");
		// Check if userID is null
		if (userId == null) {
			return "redirect:/";	
		} else {
			User loggedUser = userService.findOne(userId);
			model.addAttribute("loggedUser", loggedUser);
			Book book = bookService.findBook(id);
			model.addAttribute("book", book);
			return "show.jsp";
		}
	}
	
	
	// RENDER EDIT
	@RequestMapping("/books/{id}/edit")
	public String edit(@PathVariable("id") Long id, Model model,
			HttpSession session) {
		Long userId = (Long) session.getAttribute("user_id");
		// Check if userID is null
		if (userId == null) {
			return "redirect:/";
		} else {
		Book book = bookService.findBook(id);
		model.addAttribute("book", book);
		return "edit.jsp";
		}
	}
	
	
	// BOOK EDIT UPDATE
	@PutMapping("/books/{id}")
	public String editbook(@Valid @ModelAttribute("book") Book book,
			BindingResult result,
			HttpSession session) {
		Long userId = (Long) session.getAttribute("user_id");
		// Check if userID is null
		if (userId == null) {
			return "redirect:/";
		} else {	
		if (result.hasErrors()) {
			return "edit.jsp";
		} else {
			bookService.updateBook(book);
			return "redirect:/home";
		}
	}
}
	// DELETEMAPPING HAS TO HAVE A FORM INSIDE SHOW PAGE
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id")Long id) {
		bookService.deleteBook(id);
		return "redirect:/home";
	}
	
	// GETMAPPING TO 
//	@GetMapping("/delete/{id}")
//	public String deleteGet(@PathVariable("id")Long id) {
//		bookService.deleteBook(id);
//		return "redirect:/home";
//	}
}

