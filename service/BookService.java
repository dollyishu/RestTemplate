package com.example.api.service;

import com.example.api.entities.Book;
import com.example.api.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;
    private Book book;

    public Book createBook(Book book){
        return bookRepository.save(book);
    }

    public Book getBook(long isbn){
        Book book = bookRepository.findById(isbn).orElse(null);
        return book;
    }

    public List<Book> getBooks() {
        List<Book> bookList = new ArrayList<>();
        bookList = (List<Book>) bookRepository.findAll();
        return bookList;

    }

   /* public Book updateBook(Book book) {
        bookRepository.update(book);
        return book;
    }
*/

    public void deleteBook(long isbn){
         bookRepository.deleteById(isbn);
    }
}