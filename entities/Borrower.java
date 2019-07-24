package com.example.api.entities;

import javax.persistence.*;

@Entity
@Table(name = "borrower")
public class Borrower {

    @OneToOne
    @JoinColumn(name = "isbn")
    private Book book;

    @Id
    @Column(name = "isbn")
    private long isbn;
    @Column(name = "firstname")
    private String firstname;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "emailid")
    private String emailid;
    @Column(name = "noofbooks")
    private int noofbooks;

    public Borrower(long isbn, String firstname, String lastname, String emailid, int noofbooks) {
        //this.book = book;
        this.isbn = isbn;
        this.firstname = firstname;
        this.lastname = lastname;
        this.emailid = emailid;
        this.noofbooks = noofbooks;
    }

    public Borrower(){

    }
    /*public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }*/

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public int getNoofbooks() {
        return noofbooks;
    }

    public void setNoofbooks(int noofbooks) {
        this.noofbooks = noofbooks;
    }

    @Override
    public String toString() {
        return "Borrower{" +
                ", isbn=" + isbn +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", emailid='" + emailid + '\'' +
                ", noofbooks=" + noofbooks +
                '}';
    }
}
