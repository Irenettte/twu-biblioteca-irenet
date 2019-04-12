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
    public User userLogIn () {
        String userTxt = "User: ";
        String userPwd = "Password: ";
        Scanner scanUser = new Scanner(System.in);

        System.out.println(userTxt);
        String userInputNum = scanUser.nextLine();
        int userFound = 0;
        User user0 = null;
        for (User user : listOfUsers) {

            String userNumber = user.getUserNumber();

            if (userNumber.matches(userInputNum)) {
                user0 = user;
                userFound++;
                break;
            }
        }
        if (userFound == 0) {
            System.out.println("Incorrect user number, please insert a valid one: ");
            userLogIn();
        }
        String pwd = user0.getPwd();

        System.out.println(userPwd);
        String userPass = scanUser.nextLine();


        if (pwd.matches(userPass)) {
            System.out.println("You successfully logged in! Welcome back " + user0.getUserFullName());
            System.out.println();
            user0.displayUserInfo();
        } else{
            System.out.println("Incorrect password, please log in again: ");
            userLogIn();
        }
        return user0;

    }
    //Mock tests
    public User mockUserLogIn (User user0) {

        String userInputNum = "000-0001";
        String userPass = "biblioteca0";


        int userFound = 0;
        User user1 = null;
        for (User user : listOfUsers) {

            String userNumber = user.getUserNumber();

            if (userNumber.matches(userInputNum)) {
                user1 = user0;
                userFound++;
                break;
            }
        }
        if (userFound == 0) {
            System.out.println("Incorrect user number, please insert a valid one: ");
            userInputNum = "000-0001";
            userFound = 0;
            for (User user : listOfUsers) {

                String userNumber = user.getUserNumber();

                if (userNumber.matches(userInputNum)) {
                    user1 = user0;
                    userFound++;
                    break;
                }
            }
        }
        String pwd = user1.getPwd();

        if (pwd.matches(userPass)) {
            System.out.println("You successfully logged in! Welcome back " + user1.getUserFullName());
            System.out.println();
            user1.displayUserInfo();
//            System.out.println("You checked out these books: ");
//            for (Book book : user1.getListBooksCheckoutUser()) {
//                System.out.println(book.displayTitleAuthorYear());
//            }
        } else{
            System.out.println("Incorrect password, please log in again: ");
            userLogIn();
        }
        return user1;

    }
}
