package com.example.api.service;

import com.example.api.entities.Book;
import com.example.api.entities.Borrower;
import com.example.api.repository.BookRepository;
import com.example.api.repository.BorrowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Service
public class BorrowerService {

    @Autowired
    private BorrowerRepository borrowerRepository;
    private Borrower borrower;

    public Borrower createBorrower(Borrower borrower){
         return borrowerRepository.save(borrower);
    }

    public Borrower getBorrower(long isbn){
        Borrower borrower = borrowerRepository.findById(isbn).orElse(null);
        return borrower;
    }

    public List<Borrower> getBorrowers() {
        List<Borrower> borrowerList = new ArrayList<>();
        borrowerList = (List<Borrower>) borrowerRepository.findAll();
        return borrowerList;
    }

  /*  public Borrower updateBorrower(long isbn){
        borrowerRepository.save(borrower);
        return borrower;
    }
*/
    public void deleteBorrower(long isbn){
        borrowerRepository.deleteById(isbn);
    }
}