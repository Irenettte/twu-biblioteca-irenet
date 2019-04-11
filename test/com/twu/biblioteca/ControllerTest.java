package com.twu.biblioteca;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class ControllerTest {

    @Test
    public void shouldDisplayOptionBookListAndWhenOption1DisplayListOfBooksAvailable() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        String expectedString = "<Biblioteca Menu Options>\n<1> List of Books\nType the option from the menu (e.g. 1 for Option 1): \nThe Lord of the Rings\tJ.R.R. Tolkien\t1954\nThe Metamorphosis\tFranz Kafka\t1915\n";
        Library library = new Library();

        Controller control = new Controller(library);
        control.displayBibliotecaMenu();
        control.chooseOption();

        assertThat(outContent.toString(), is(expectedString));
    }
    @Test
    public void shouldDisplayOptionBookListAndWhenInvalidOptionDisplayErrorMessage() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Library library = new Library();

        String invalidOption = "Please select a valid option!\n";
        String expectedString = "<Biblioteca Menu Options>\n<1> List of Books\nType the option from the menu (e.g. 1 for Option 1): \n" + invalidOption;


        Controller control = new Controller(library);
        control.displayBibliotecaMenu();
        control.chooseOption();

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
        control.mockChooseOption("2");

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
        control.mockChooseOption("2");

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
        control.mockChooseOption("2");
        library.displayBookList();

        assertThat(outContent.toString(), is(expectedString));

    }


}