package com.twu.biblioteca;

public class Book {
    private String title = "The Lord of the Rings";
    private String author = "J.R.R. Tolkien";
    private int yearPublished = 1954;

    //setters
    public void setTitleAuthorYear(String title, String author, int yearPublished){
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }


    //getters
    public String getBookTitle(){
        System.out.print(title);
        return title;
    }
    public String getBookAuthor(){
        return author;
    }
    public int getYearPublished(){
        return yearPublished;
    }

    public String displayTitleAuthorYear(){
        String book = String.format(title + "\t" + author + "\t" + yearPublished);
        System.out.println(book);
        return book;
    }



}
