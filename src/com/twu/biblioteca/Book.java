package com.twu.biblioteca;

public class Book {
    private String title;
    private String author;
    private int yearPublished;

    //constructor
    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

//    //getters
    public String getBookTitle(){
        return title;
    }
    public String getBookAuthor(){
        return author;
    }

    public String displayTitleAuthorYear(){
        String book = title + "\t" + author + "\t" + yearPublished;
        return book;
    }

}
