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


        Controller control = new Controller();
        control.displayBibliotecaMenu();
        control.chooseOption();

        assertThat(outContent.toString(), is(expectedString));
    }

}