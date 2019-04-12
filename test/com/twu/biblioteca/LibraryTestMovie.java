package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class LibraryTestMovie {

    @Test
    public void shouldDisplayListOfMoviesAvailable() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Library library = new Library();
        Movie movie1 = new Movie("Dracula", "Francis Ford Coppola", 1993, "7.5");
        library.addMovie(movie1);
        String expectedString = "Dracula\tFrancis Ford Coppola\t1993\t7.5\n";

        library.displayMovieList();

        assertThat(outContent.toString(), is(expectedString));


    }

    @Test
    public void shouldNotShowInListOfAvailableMoviesTheCheckOutMovie() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Library library = new Library();
        Movie movie1 = new Movie("Dracula", "Francis Ford Coppola", 1993, "7.5");
        library.addMovie(movie1);
        library.checkOutMovie(movie1);
        String expectedString = "";

        library.displayMovieList();

        assertThat(outContent.toString(), is(expectedString));

    }

    @Test
    public void shouldShowInListOfAvailableMoviesTheReturnMovie() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Library library = new Library();
        Movie movie1 = new Movie("Dracula", "Francis Ford Coppola", 1993, "7.5");
        library.addMovie(movie1);
        library.checkOutMovie(movie1);
        library.returnMovie(movie1);
        String expectedString = "Dracula\tFrancis Ford Coppola\t1993\t7.5\n";

        library.displayMovieList();

        assertThat(outContent.toString(), is(expectedString));
    }

    //User TESTS
    @Test
    public void shouldLogInIntoOwnAccountWhenInputCorrectUserAndPwd(){
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Library library = new Library();
        Book book = new Book("Romeo and Juliet", "Shakespeare", 1597);
        List<Book> listOfBooks = new ArrayList<Book>();
        listOfBooks.add(book);
        User user = new User("000-0001", "biblioteca0", "Gloria Steinem", "gloria@gmail.com", "938713445", listOfBooks);
        library.mockUserLogIn(user);

        String expectedString = "You successfully logged in! Welcome back Gloria Steinem\n\nYou checked out this books: \nRomeo and Juliet\tShakespeare\t1597\n";

        assertThat(outContent.toString(), is(expectedString));
    }



}