package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;


public class Library {

    public List<String> listOfBooks = new ArrayList<String>();


    //constructor
    public Library(List<String> listOfBooks) {
        this.listOfBooks = listOfBooks;
    }
    public Library(){
        this.listOfBooks = listOfBooks;
    }


    //method to Add Book
    public void addBook(String book1){
        listOfBooks.add(book1);
    }

    public void deleteBook(String book1){
        listOfBooks.remove(book1);

    }

    public void displayBookList(){

        for (String books : listOfBooks) System.out.println(books);

    }
}
