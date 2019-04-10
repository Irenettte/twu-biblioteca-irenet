package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {
        String welcomeMessage = "Welcome to Biblioteca. You are one-stop-shop away from great book titles in Bangalore!";
        List<String> books = new ArrayList();
        Book book1 = new Book();
        Book book2 = new Book();
        book2.setTitleAuthorYear("The Metamorphosis", "Franz Kafka", 1915);


        System.out.println(welcomeMessage);
        book1.displayTitleAuthorYear();
        book2.displayTitleAuthorYear();

    }
}
