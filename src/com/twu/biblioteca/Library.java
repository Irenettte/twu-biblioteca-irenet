package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;


public class Library {

    private List<Book> listOfBooks;

    //constructor
    public Library(List<Book> listOfBooks) {
        this.listOfBooks = listOfBooks;
    }
    public Library(){
        this.listOfBooks = new ArrayList<Book>();
    }

    //method to Add Book
    public void addBook(Book book1){
        listOfBooks.add(book1);
    }

    public void deleteBook(Book book1){
        listOfBooks.remove(book1);

    }

    public void displayBookList(){

        for (Book books : listOfBooks) System.out.println(books.displayTitleAuthorYear());

    }
}
