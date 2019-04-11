package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

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

}