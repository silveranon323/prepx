package com.prep.book_service.service;

import com.prep.book_service.entity.Book;
import com.prep.book_service.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceimpl implements BookService {
    private BookRepository bookRepository;

    public void BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book getBookById(long id) {
        return bookRepository.findById(id).orElse(null);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public void deleteBook(long id) {
        bookRepository.deleteById(id);
    }

    @Override
    public Book updateBookquantity(long id, int quantity) {
        Book book=getBookById(id);
        if(book==null) {
            return null;
        }
        book.setQuantity(quantity);
        return bookRepository.save(book);
    }
}
