package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void shouldLogInIntoOwnAccountWhenInputCorrectUserAndPwd(){
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Book book = new Book("Romeo and Juliet", "Shakespeare", 1597);
        List<Book> listOfBooks = new ArrayList<Book>();
        listOfBooks.add(book);
        User user = new User("000-0001", "biblioteca0", "Gloria Steinem", "gloria@gmail.com", "938713445", listOfBooks);
        user.userLogIn(user);

        String expectedString = "You successfully logged in! Welcome back Gloria Steinem\n\nYou checked out this books: \nRomeo and Juliet\tShakespeare\t1597\n";

        assertThat(outContent.toString(), is(expectedString));
    }

}