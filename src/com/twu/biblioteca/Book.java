package com.twu.biblioteca;

public class Book {
    public String title = "The Lord of the Rings";
    public String author = "J.R.R Tolkien";
    public int yearPublished = 1954;

    //setters
    public void setBookTitle(String title){
        this.title = title;
    }
    public void setBookAuthor(String author){
        this.author = author;
    }
    public void setBookYearPublished(int yearPublished){
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



}
