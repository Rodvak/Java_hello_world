package com.alex.bookclub.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alex.bookclub.models.Book;
import com.alex.bookclub.repositories.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	public BookService(BookRepository book) {
		this.bookRepository = book;
	}
	
	// FINDS ALL BOOKS
	public List<Book> allBooks() {
		return bookRepository.findAll();
	}
	
	
	// CREATES A BOOK
	public Book createBook(Book book) {
		return bookRepository.save(book);
	}
	
	
	// RETRIEVES A BOOK BY ID
	public Book findBook(Long id) {
		Optional<Book> optionalBook = bookRepository.findById(id);
		if (optionalBook.isPresent()) {
			return optionalBook.get();
		} else {
			return null;
		}
	}
	
		
	//UPDATES A BOOK
	public Book updateBook(Book book) {
		return bookRepository.save(book);
	}
	
	
	// DELETES A BOOOK
	public void deleteBook(Long id) {
		bookRepository.deleteById(id);
	}
	
}
