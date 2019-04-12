package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Library {

    private List<Book> listOfBooksAvailable;
    private List<Book> listOfBooksCheckOut;
    private List<Movie> listOfMoviesAvailable;
    private List<Movie> listOfMoviesCheckOut;
    private List<User> listOfUsers;
//    private User user;


    //constructor
    public Library(){
        this.listOfBooksAvailable = new ArrayList<Book>();
        this.listOfBooksCheckOut = new ArrayList<Book>();
        this.listOfMoviesAvailable = new ArrayList<Movie>();
        this.listOfMoviesCheckOut = new ArrayList<Movie>();
        this.listOfUsers = new ArrayList<User>();
//        this.user = user;

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

    //method Users
    public void addUser (User user){
        listOfUsers.add(user);
    }
    //user log in account
    public void userLogIn () {
        String userTxt = "User: ";
        String userPwd = "Password: ";
        Scanner scanUser = new Scanner(System.in);

        System.out.println(userTxt);
        String userInputNum = scanUser.nextLine();

        for (User user : listOfUsers) {

            String userNumber = user.getUserNumber();
            String pwd = user.getPwd();

            while (!userNumber.equals(userInputNum)) {
                System.out.println("Incorrect user number, please insert a valid one: ");
                userInputNum = scanUser.nextLine();
            }
            System.out.println(userPwd);
            String userPass = scanUser.nextLine();
            while (!pwd.equals(userPass)) {
                System.out.println("Incorrect user number, please insert a valid one: ");
                userPass = scanUser.nextLine();
            }
        }
//        System.out.println("You successfully logged in! Welcome back " + userFullName);
        System.out.println();
        System.out.println("You checked out these books: ");
//        for (Book book : listBooksCheckoutUser) { System.out.println(book.displayTitleAuthorYear());}


    }
    //Mock tests
    public void mockUserLogIn (User user0) {

        String userNum = "000-0001";
        String userPass = "biblioteca0";

        System.out.println("You successfully logged in! Welcome back " + user0.getUserFullName());
        System.out.println();
        System.out.println("You checked out this books: ");
        for (Book book : user0.getListBooksCheckoutUser()) { System.out.println(book.displayTitleAuthorYear());}

    }
}
