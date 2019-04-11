package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;


public class Library {

    private List<Book> listOfBooksAvailable;
    private List<Book> listOfBooksCheckOut;
    private List<Movie> listOfMoviesAvailable;
    private List<Movie> listOfMoviesCheckOut;
    private List<User> listOfUsers;


    //constructor
    public Library(){
        this.listOfBooksAvailable = new ArrayList<Book>();
        this.listOfBooksCheckOut = new ArrayList<Book>();
        this.listOfMoviesAvailable = new ArrayList<Movie>();
        this.listOfMoviesCheckOut = new ArrayList<Movie>();
        this.listOfUsers = new ArrayList<User>();

    }

    //getters
    public List<Book> getListOfBooksAvailable() {
        return listOfBooksAvailable;
    }

    public List<Book> getListOfBooksCheckOut() {
        return listOfBooksCheckOut;
    }
    public List<Movie> getListOfMoviesAvailable() {
        return listOfMoviesAvailable;
    }

    public List<Movie> getListOfMoviesCheckOut() {
        return listOfMoviesCheckOut;
    }
    public List<User> getListOfUsers() {
        return listOfUsers;
    }


    //method for Book
    public void addBook(Book book1){
        listOfBooksAvailable.add(book1);
    }

    public void checkOutBook(Book book1){
        listOfBooksCheckOut.add(book1);
        listOfBooksAvailable.remove(book1);

    }
    public void returnBook (Book book){
        listOfBooksAvailable.add(book);
        listOfBooksCheckOut.remove(book);
    }

    public void displayBookList(){

        for (Book books : listOfBooksAvailable) System.out.println(books.displayTitleAuthorYear());

    }

    //method for Movie
    public void addMovie(Movie movie){
        listOfMoviesAvailable.add(movie);
    }
    public void checkOutMovie(Movie movie){
        listOfMoviesCheckOut.add(movie);
        listOfMoviesAvailable.remove(movie);
    }
    public void returnMovie(Movie movie){
        listOfMoviesAvailable.add(movie);
        listOfMoviesCheckOut.remove(movie);
    }

    public void displayMovieList(){
        for (Movie movie : listOfMoviesAvailable) System.out.println(movie.displayTitleDirectorYearRating());
    }
}
