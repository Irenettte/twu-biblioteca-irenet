package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class BibliotecaAppTest {


    @Test
    public void shouldDisplayWelcomeMessageAndMenuOfOptionsAndListOfBooksWhenUserChoosesOption1() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        String expectedString = "Welcome to Biblioteca. You are one-stop-shop away from great book titles in Bangalore!\n<Biblioteca Menu Options>\n<1> List of Books\nType the option from the menu (e.g. 1 for Option 1): \nThe Lord of the Rings\tJ.R.R. Tolkien\t1954\nThe Metamorphosis\tFranz Kafka\t1915\n";

        BibliotecaApp app = new BibliotecaApp();
        app.main(null);

        assertThat(outContent.toString(), is(expectedString));
    }



}