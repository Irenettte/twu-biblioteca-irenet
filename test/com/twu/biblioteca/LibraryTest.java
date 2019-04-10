package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class LibraryTest {

    @Test
    public void shouldAddOneBookToList(){
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Library library = new Library();
        Book book1 = new Book("The Cat in the Hat", "Dr. Seuss", 1957);
        String expectedString = "The Cat in the Hat\tDr. Seuss\t1957\n";

        library.addBook(book1);
        library.displayBookList();

        assertThat(outContent.toString(), is(expectedString));

    }
    @Test
    public void shouldAddTwoBooksToList(){
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Library library = new Library();
        Book book1 = new Book("The Cat in the Hat", "Dr. Seuss", 1957);
        Book book2 = new Book("The Metamorphosis", "Franz Kafka", 1915);

        String expectedString = "The Cat in the Hat\tDr. Seuss\t1957\nThe Metamorphosis\tFranz Kafka\t1915\n";

        library.addBook(book1);
        library.addBook(book2);
        library.displayBookList();

        assertThat(outContent.toString(), is(expectedString));

    }
    @Test
    public void shouldRemoveBookFromList(){
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Library library = new Library();
        Book book1 = new Book("The Cat in the Hat", "Dr. Seuss", 1957);
        Book book2 = new Book("The Metamorphosis", "Franz Kafka", 1915);

        String expectedString = "The Metamorphosis\tFranz Kafka\t1915\n";

        library.addBook(book1);
        library.addBook(book2);
        library.deleteBook(book1);
        library.displayBookList();

        assertThat(outContent.toString(), is(expectedString));

    }


}