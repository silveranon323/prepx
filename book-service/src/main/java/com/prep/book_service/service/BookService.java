package com.prep.book_service.service;

import com.prep.book_service.entity.Book;

import java.util.List;

public interface BookService {
    Book addBook(Book book);
    Book getBookById(long id);
    List<Book> getAllBooks();
    void deleteBook(long id);
    Book updateBookquantity(long id,int quantity);
}
