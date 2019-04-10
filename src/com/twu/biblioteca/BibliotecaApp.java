package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {
        String welcomeMessage = "Welcome to Biblioteca. You are one-stop-shop away from great book titles in Bangalore!";
        System.out.println(welcomeMessage);

        //SET UP
        Library library = new Library();
        Book book1 = new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954);
        Book book2 = new Book("The Metamorphosis", "Franz Kafka", 1915);
        library.addBook(book1);
        library.addBook(book2);

        Controller control = new Controller(library);


        control.displayBibliotecaMenu();
        control.chooseOption();


    }

    private static void setUp() {

    }
}
