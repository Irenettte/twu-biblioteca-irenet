package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {
        String welcomeMessage = "Welcome to Biblioteca. You are one-stop-shop away from great book titles in Bangalore!";
        Controller control = new Controller();

//        Book book1 = new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954);
//        Book book2 = new Book("The Metamorphosis", "Franz Kafka", 1915);


        System.out.println(welcomeMessage);
        control.displayBibliotecaMenu();



    }
}
