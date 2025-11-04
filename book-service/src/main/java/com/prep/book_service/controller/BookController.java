package com.prep.book_service.controller;

import com.prep.book_service.entity.Book;
import com.prep.book_service.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/books")
public class BookController {
    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable("id") long id) {
        return bookService.getBookById(id);
    }

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBookById(@PathVariable("id") long id) {
        bookService.deleteBook(id);
    }

    @PatchMapping("/{id}/quantity/{quantity}")
    public Book updateBookQuantity(@PathVariable("id") long id, @PathVariable("quantity") int quantity) {
        return bookService.updateBookquantity(id, quantity);
    }
}
