package com.twu.biblioteca;

public class Movie {
    private String title;
    private String director;
    private int year;
    private String rating;

    //constructor
    public Movie(String title, String director, int year, String rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String displayTitleDirectorYearRating() {
        String movie = title + "\t" + director + "\t" + year +"\t" + rating;
        return movie;

    }
}
