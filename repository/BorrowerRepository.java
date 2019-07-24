package com.example.api.repository;

import com.example.api.entities.Borrower;
import org.springframework.data.repository.CrudRepository;

public interface BorrowerRepository extends CrudRepository<Borrower, Long> {
    //long findByIsbn(long isbn);

    //void update(Borrower borrower);

    //long deleteByIsbn(long isbn);
}
