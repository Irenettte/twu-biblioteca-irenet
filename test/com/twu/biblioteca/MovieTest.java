package com.twu.biblioteca;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MovieTest {

    @Test
    public void shouldGetMovieNameYearDirectorRating(){
        String expectedString = "Les Invisibles\tLouis-Julien Petit\t2018\t6.8";
        Movie movie = new Movie("Les Invisibles", "Louis-Julien Petit", 2018, "6.8");
        String movieFeatures = movie.displayTitleDirectorYearRating();

        assertThat(movieFeatures, is(expectedString));
    }

}