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

//    public Book() {
//        this.title = "The Lord of the Rings";
//        this.author = "J.R.R. Tolkien";
//        this.yearPublished = 1954;
//    }


//    //getters
    public String getBookTitle(){
        return title;
    }
    public String getBookAuthor(){
        return author;
    }
//    public int getYearPublished(){
//        return yearPublished;
//    }

    public String displayTitleAuthorYear(){
        String book = title + "\t" + author + "\t" + yearPublished;
//        System.out.println(book);
        return book;
    }



}
