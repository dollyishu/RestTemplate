package com.example.api.controller;

import com.example.api.entities.Book;
import com.example.api.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {
   // public static final Logger logger = LoggerFactory.getLogger(BookController.class);

    @Autowired
    private BookService bookService;
    private Book book;

    @PostMapping("/book")
    public Book createBook(@RequestBody Book book){
         return bookService.createBook(book);
        //return book;
    }

    @GetMapping("/book/{isbn}")
    public Book getBook(@PathVariable long isbn) {
        System.out.println(isbn);
        return bookService.getBook(isbn);
    }


    @GetMapping("/books")
    public List<Book> getBooks() {
        List<Book> bookList = new ArrayList<>();
        bookList = bookService.getBooks();
       // bookList.add(book);
        return bookList;
    }

   /* @PutMapping("/books")
    public Book updateBook(@RequestBody Book book) {
        return bookService.updateBook(book);
    }
*/
    @DeleteMapping("/book/{isbn}")
    public String deleteBook(@PathVariable long isbn) {
         bookService.deleteBook(isbn);
         return "the book has deleted successfully";

    }
}
