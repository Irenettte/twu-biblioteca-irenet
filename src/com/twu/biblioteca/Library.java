package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;


public class Library {

    private List<Book> listOfBooksAvailable;
    private List<Book> listOfBooksCheckOut;


    //constructor
    public Library(List<Book> listOfBooksAvailable) {
        this.listOfBooksAvailable = listOfBooksAvailable;
    }
    public Library(){
        this.listOfBooksAvailable = new ArrayList<Book>();
        this.listOfBooksCheckOut = new ArrayList<Book>();

    }

    //method to Add Book
    public void addBook(Book book1){
        listOfBooksAvailable.add(book1);
    }

    public void checkOutBook(Book book1){
        listOfBooksCheckOut.add(book1);
        listOfBooksAvailable.remove(book1);

    }
    public void returnBook (Book book){
        listOfBooksAvailable.add(book);
        listOfBooksCheckOut.remove(book);
    }

    public void displayBookList(){

        for (Book books : listOfBooksAvailable) System.out.println(books.displayTitleAuthorYear());

    }
}
