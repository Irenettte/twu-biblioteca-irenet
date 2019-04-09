package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Books {
    String books;

    public void printOneBook() {
        String books = "The Lord of the Rings";

        System.out.print(books);
    }

    public List<String> listOfBooksAvailable(){

        List<String> listOfBooks = new ArrayList();

        listOfBooks.add("The Lord of the Rings");
        listOfBooks.add("Metamorphosis");
        listOfBooks.add("The Cat in the Hat");



        System.out.println(listOfBooks);

        return listOfBooks;

    }


}
