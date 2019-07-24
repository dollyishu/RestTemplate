package com.example.api.repository;

import com.example.api.entities.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
    //long findByIsbn(long isbn);

   // void update(Book book);

   // long deleteByIsbn(long isbn);
}
