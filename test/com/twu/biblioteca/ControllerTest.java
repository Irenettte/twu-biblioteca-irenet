package com.twu.biblioteca;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class ControllerTest {

    @Test
    public void shouldDisplayAllMenuOptionsAndWhenOption1DisplayListOfBooksAvailable() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        String expectedString = "<Biblioteca Menu Options>\n<1> List of Books\n<2> Check out a Book\n<3> Return a Book\n<4> List of Movies\n<5> Check out a Movie\n<6> Return a Movie\n<7> Quit Program\nThe Lord of the Rings\tJ.R.R. Tolkien\t1954\nThe Metamorphosis\tFranz Kafka\t1915\n";
        Library library = new Library();
        Book book1 = new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954);
        Book book2 = new Book("The Metamorphosis", "Franz Kafka", 1915);
        library.addBook(book1);
        library.addBook(book2);


        Controller control = new Controller(library);
        control.displayBibliotecaMenu();
        control.mockChooseOption("1", "Who cares");

        assertThat(outContent.toString(), is(expectedString));
    }
    @Test
    public void shouldDisplayAllMenuOptionsAndWhenInvalidOptionDisplayErrorMessage() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Library library = new Library();
        Book book1 = new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954);
        Book book2 = new Book("The Metamorphosis", "Franz Kafka", 1915);
        library.addBook(book1);
        library.addBook(book2);

        String invalidOption = "Please select a valid option!\n";
        String expectedString = "<Biblioteca Menu Options>\n<1> List of Books\n<2> Check out a Book\n<3> Return a Book\n<4> List of Movies\n<5> Check out a Movie\n<6> Return a Movie\n<7> Quit Program\n" + invalidOption;


        Controller control = new Controller(library);
        control.displayBibliotecaMenu();
        control.mockChooseOption("nine", "Whatever");

        assertThat(outContent.toString(), is(expectedString));
    }
    @Test
    public void shouldCheckOutBookAndReturnSuccessfulMessage(){
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        String expectedString = "Please input title or author of the book you want to checkout: \nThank you! Enjoy the book\n";

        Library library = new Library();

        Book book1 = new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954);
        Book book2 = new Book("The Metamorphosis", "Franz Kafka", 1915);
        Book book3 = new Book("The Cat in the Hat", "Dr. Seuss", 1957);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        Controller control = new Controller(library);
        control.mockChooseOption("2", "The Cat in the Hat");

        assertThat(outContent.toString(), is(expectedString));

    }
    @Test
    public void shouldCheckOutBookAndReturnUnsuccessfulMessage(){
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        String expectedString = "Please input title or author of the book you want to checkout: \nSorry, that book is not available\n";

        Library library = new Library();

        Book book1 = new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954);
        Book book2 = new Book("The Metamorphosis", "Franz Kafka", 1915);
        Book book3 = new Book("The Cat in the Hat", "Dr. Seuss", 1957);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        Controller control = new Controller(library);
        control.mockChooseOption("2", "Winnie the Pooh");

        assertThat(outContent.toString(), is(expectedString));

    }
    @Test
    public void shouldCheckOutBookAndDisplayListOfAvailableBooksWithoutTheBookCheckedOut(){
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        String expectedString = "Please input title or author of the book you want to checkout: \nThank you! Enjoy the book\nThe Lord of the Rings\tJ.R.R. Tolkien\t1954\nThe Metamorphosis\tFranz Kafka\t1915\n";

        Library library = new Library();

        Book book1 = new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954);
        Book book2 = new Book("The Metamorphosis", "Franz Kafka", 1915);
        Book book3 = new Book("The Cat in the Hat", "Dr. Seuss", 1957);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        Controller control = new Controller(library);
        control.mockChooseOption("2", "The Cat in the Hat");
        library.displayBookList();

        assertThat(outContent.toString(), is(expectedString));

    }
    @Test
    public void shouldReturnBookAndDisplayListOfAvailableBooksWithBookIncludedInEndOfList(){
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        String expectedString = "Please input title or author of the book you want to checkout: \nThank you for returning the book\nThe Lord of the Rings\tJ.R.R. Tolkien\t1954\nThe Cat in the Hat\tDr. Seuss\t1957\nThe Metamorphosis\tFranz Kafka\t1915\n";

        Library library = new Library();

        Book book1 = new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954);
        Book book2 = new Book("The Metamorphosis", "Franz Kafka", 1915);
        Book book3 = new Book("The Cat in the Hat", "Dr. Seuss", 1957);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.checkOutBook(book2);

        Controller control = new Controller(library);
        control.mockChooseOption("3", "The Metamorphosis");
        library.displayBookList();

        assertThat(outContent.toString(), is(expectedString));
    }


}