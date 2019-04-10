package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class BookTest {

    @Test
    public void shouldGetBookTitleAuthorYear() {
        String expectedString = "The Lord of the Rings\tJ.R.R. Tolkien\t1954";
        Book book1 = new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954);
        String bookFeatures = book1.displayTitleAuthorYear();

        assertThat(bookFeatures, is(expectedString));

    }
}