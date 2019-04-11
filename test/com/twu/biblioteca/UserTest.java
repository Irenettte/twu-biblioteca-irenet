package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void shouldLogInIntoOwnAccountWhenInputCorrectUserAndPwd(){
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        String expectedString = "";

        assertThat(outContent.toString(), is(expectedString));
    }

}