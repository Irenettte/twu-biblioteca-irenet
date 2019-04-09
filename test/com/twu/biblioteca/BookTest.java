package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class BookTest {

    @Test
    public void shouldGetBookTitle() {
        String expectedTitle = "The Lord of the Rings";
        Book book1 = new Book();
        String title = book1.getBookTitle();

        assertThat(title, is(expectedTitle));

    }
}