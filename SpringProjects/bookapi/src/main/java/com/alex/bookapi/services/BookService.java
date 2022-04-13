package com.alex.bookapi.services;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.alex.bookapi.models.Book;
import com.alex.bookapi.repositories.BookRepository;

@Service
public class BookService {
    // adding the book repository as a dependency
    private final BookRepository bookRepository;
    
    // Constructor
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    // RETURN ALL the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // CREATES a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // FINDS, RETRIEVES a book by ID
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    
    // UPDATES A BOOK.
    // We need to put all the values that we would like to change again.
	public Book updateBook(Long id, 
			String title, 
			String description, 
			String language, 
			Integer pages) {
	// We create a variable updatedBook that will hold every book we would like to find by ID.
	// We use this because we are specifying a book.
	// Then we use updatedBook .SET to set new values to the book we are updating.
		Book updatedBook = this.findBook(id);
		updatedBook.setTitle(title);
		updatedBook.setDescription(description);
		updatedBook.setLanguage(language);
		updatedBook.setNumberOfPages(pages);
	// We return our variable and save because we are CREATING also a NEW UPDATED book
		return bookRepository.save(updatedBook);
	}
	
	public void deleteBook(Long id) {
		bookRepository.deleteById(id);
	}
}