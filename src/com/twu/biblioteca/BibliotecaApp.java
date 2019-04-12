package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {
        String welcomeMessage = "Welcome to Biblioteca. You are one-stop-shop away from great book titles in Bangalore!";
        System.out.println(welcomeMessage);

        //SET UP
        Controller control = setUp();

        control.displayBibliotecaMenu();
        control.chooseOption();
    }

    private static Controller setUp() {
        Library library = new Library();

        Book book1 = new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954);
        Book book2 = new Book("The Metamorphosis", "Franz Kafka", 1915);
        Book book3 = new Book("The Cat in the Hat", "Dr. Seuss", 1957);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        Movie movie1 = new Movie("Les Invisibles", "Louis-Julien Petit", 2018, "6.8");
        Movie movie2 = new Movie("Dracula", "Francis Ford Coppola", 1993, "7.5");
        library.addMovie(movie1);
        library.addMovie(movie2);
        List<Book> listOfBooksUser0 = new ArrayList<Book>();
        List<Book> listOfBooksUser1 = new ArrayList<Book>();
        List<Book> listOfBooksUser2 = new ArrayList<Book>();

        listOfBooksUser0.add(book1);
        listOfBooksUser2.add(book3);


        User user0 = new User("000-0001", "biblioteca0", "Gloria Steinem", "gloria@gmail.com", "938713445", listOfBooksUser0);
        User user1 = new User("000-0002", "biblioteca1", "Margaret Hamilton", "margaret@gmail.com", "938713445", listOfBooksUser1);
        User user2 = new User("000-0003", "biblioteca2", "Dorcas Muthoni", "dorcas@gmail.com", "938713445", listOfBooksUser2);

        library.addUser(user0);
        library.addUser(user1);
        library.addUser(user2);

        Controller control = new Controller(library);

        return control;
    }
}
