package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class BibliotecaAppTest {

    @Test
    public void shouldDisplayWelcomeMessage() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        String expectedString = "Welcome to Biblioteca. You are one-stop-shop away from great book titles in Bangalore!\n";

        BibliotecaApp app = new BibliotecaApp();
        app.main(null);

        assertEquals(expectedString, outContent.toString());
    }
    @Test
    public void shouldDisplayWelcomeMessageAndBook() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        String expectedString = "Welcome to Biblioteca. You are one-stop-shop away from great book titles in Bangalore!\nThe Lord of the Rings\n";

        BibliotecaApp app = new BibliotecaApp();
        app.main(null);

        assertEquals(expectedString, outContent.toString());
    }
    @Test
    public void shouldDisplayWelcomeMessageAndListBooks() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        String expectedString = "Welcome to Biblioteca. You are one-stop-shop away from great book titles in Bangalore!\n[The Lord of the Rings, The Metamorphosis]\n";

        BibliotecaApp app = new BibliotecaApp();
        app.main(null);

        assertEquals(expectedString, outContent.toString());
    }


}