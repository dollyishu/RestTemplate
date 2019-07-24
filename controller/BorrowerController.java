package com.example.api.controller;

import com.example.api.entities.Book;
import com.example.api.entities.Borrower;
import com.example.api.service.BorrowerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class BorrowerController {
    //public static final Logger logger = LoggerFactory.getLogger(BorrowerController.class);

    @Autowired
    private BorrowerService borrowerService;
    private Borrower borrower;

    @GetMapping("borrower/{isbn}")
    public Borrower getBorrower(@PathVariable long isbn) {
        System.out.println(isbn);
        return borrowerService.getBorrower(isbn);
    }

    @PostMapping("borrowers")
    public Borrower createBorrower(@RequestBody Borrower borrower) {
        return borrowerService.createBorrower(borrower);
        //return borrower;
    }

    @GetMapping("borrowers")
    public List<Borrower> getBorrowers() {
        List<Borrower> borrowerList = new ArrayList<>();
        borrowerList = borrowerService.getBorrowers();
        return borrowerList;
    }

    /*@PutMapping("rent book/{isbn}")
    public String updateBorrower(@PathVariable long isbn) {
        borrowerService.updateBorrower(isbn);
        return "Updated";
    }
*/
    @DeleteMapping("borrower/{isbn}")
    public String deleteBorrower(@PathVariable long isbn) {
        borrowerService.deleteBorrower(isbn);
        return "borrower details are deleted";
    }
}