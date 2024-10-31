package org.example.structural.service;


import org.example.structural.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class LibraryFacade {

    private final BookService bookService;

    @Autowired
    public LibraryFacade(BookService bookService) {
        this.bookService = bookService;
    }

    public Book addBook(Book book) {
        return bookService.addBook(book);
    }

    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    public Book getBookById(Long id) {
        return bookService.getBookById(id);
    }

    public Book updateBook(Long id, Book updatedBook) {
        return bookService.updateBook(id, updatedBook);
    }

    public void deleteBook(Long id) {
        bookService.deleteBook(id);
    }
}

