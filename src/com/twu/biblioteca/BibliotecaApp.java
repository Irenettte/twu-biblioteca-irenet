package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {
        String welcomeMessage = "Welcome to Biblioteca. You are one-stop-shop away from great book titles in Bangalore!";
        List<String> books = new ArrayList();
        books.add("The Lord of the Rings");
        books.add("The Metamorphosis");

        System.out.println(welcomeMessage);
        System.out.println(books);

    }
}
