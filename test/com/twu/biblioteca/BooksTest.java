package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BooksTest {

    @Test
    public void shouldDisplayABook() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        String expectedString = "The Lord of the Rings";

        Books book = new Books();
        book.printOneBook();

        assertEquals(expectedString, outContent.toString());

    }

    @Test
    public void shouldDisplayAListOfBooks() {
        List<String> expectedList = new ArrayList();
        expectedList.add("The Lord of the Rings");
        expectedList.add("Metamorphosis");
        expectedList.add("The Cat in the Hat");

        Books book = new Books();
        List<String> listOfBooks = book.listOfBooksAvailable();

        assertThat(listOfBooks, is(expectedList));


    }



}
