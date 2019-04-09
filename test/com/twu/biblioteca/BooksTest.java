package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class BooksTest {

    @Test
    public void shouldDisplayABook() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        String expectedString = "The Lord of the Rings";

        Books book = new Books();
        book.booksAvailable();

        assertEquals(expectedString, outContent.toString());

    }



}
