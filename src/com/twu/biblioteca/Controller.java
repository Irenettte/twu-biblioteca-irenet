package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {

    //dependencies here and in Constructor
    private Library library;

    public Controller(Library library) {
        this.library = library;
    }

    public void displayBibliotecaMenu(){

        List<String> options = new ArrayList();
        options.add("<Biblioteca Menu Options>");
        options.add("<1> List of Books");
        options.add("<2> Check out a Book");
        options.add("<3> Return a Book");
        options.add("<4> List of Movies");
        options.add("<5> Check out a Movie");
        options.add("<6> Return a Movie");
        options.add("<7> Quit Program");

        for (String optionNum : options) { System.out.println(optionNum);}

    }
    public void chooseOption() {
        String chooseOption = "Type the option from the menu (e.g. 1 for Option 1): ";
        Scanner scanUser = new Scanner(System.in);

        System.out.println(chooseOption);

        String option = scanUser.nextLine();
        if (option.matches("[1-7]")) {
            int optionUser = Integer.parseInt(option);

            switch (optionUser) {
                case 1:
                    library.displayBookList();
                    displayBibliotecaMenu();
                    chooseOption();
                    break;

                case 2:
                    userCheckOutBook();
                    break;

                case 3:
                    userReturnABook();
                    break;

                case 4:
                    library.displayMovieList();
                    displayBibliotecaMenu();
                    chooseOption();
                    break;

                case 5:
                    userCheckOutMovie();
                    break;

                case 6:
                    userReturnMovie();
                    break;

                case 7:
                    this.exitProgram();

            }
        } else {
            String invalidOption = "Please select a valid option!";

            System.out.println(invalidOption);
            chooseOption();
        }

    }

    public void exitProgram(){

        System.exit(0);

    }
    public void userCheckOutBook(){
        Scanner scanUser = new Scanner(System.in);
        User user = library.userLogIn();

        System.out.println("Please input title or author of the book you want to checkout: ");
        String userBookA = scanUser.nextLine();
        String userBook = userBookA.toLowerCase();
        int bookFound = 0;


        List<Book> booksAvailable = library.getListOfBooksAvailable();

        for (Book book : booksAvailable) {
            String bookTitle = book.getBookTitle();
            String bookAuthor = book.getBookAuthor();

            if (userBook.matches(bookTitle.toLowerCase()) || userBook.matches(bookAuthor)){
                bookFound ++;
                System.out.println("Thank you! Enjoy the book");
                user.addBookInListUser(book);
                library.checkOutBook(book);
                break;

            }

        }
        if (bookFound == 0) {
            System.out.println("Sorry, that book is not available");

        }
        displayBibliotecaMenu();
        chooseOption();

    }

    public void userReturnABook(){
        Scanner scanUser = new Scanner(System.in);
        User user = library.userLogIn();

        System.out.println("Please input title or author of the book you want to return: ");
        String userBookA = scanUser.nextLine();
        String userBook = userBookA.toLowerCase();
        int bookFound = 0;

        List<Book> booksInCheckOut = library.getListOfBooksCheckOut();

        for (Book book : booksInCheckOut) {
            String bookTitle = book.getBookTitle();
            String bookAuthor = book.getBookAuthor();

            if (userBook.matches(bookTitle.toLowerCase()) || userBook.matches(bookAuthor)) {
                bookFound++;
                library.returnBook(book);
                user.returnBookInListUser(book);
                System.out.println("Thank you for returning the book");
                break;
            }
        }
        if (bookFound == 0) {
            System.out.println("That is not a valid book to return");

        }
        displayBibliotecaMenu();
        chooseOption();

    }
    //  MOVIES
    public void userCheckOutMovie(){
        Scanner scanUser = new Scanner(System.in);

        System.out.println("Please input title of the movie you want to checkout: ");
        String userMovieA = scanUser.nextLine();
        String userMovie = userMovieA.toLowerCase();
        int movieFound = 0;


        List<Movie> moviesAvailable = library.getListOfMoviesAvailable();

        for (Movie movie : moviesAvailable) {
            String movieTitle = movie.getTitle();

            if (userMovie.matches(movieTitle.toLowerCase())){
                movieFound ++;
                System.out.println("Thank you! Enjoy the movie");
                library.checkOutMovie(movie);
                break;
            }

        }
        if (movieFound == 0) {
            System.out.println("Sorry, that movie is not available");

        }
        displayBibliotecaMenu();
        chooseOption();

    }
    public void userReturnMovie(){
        Scanner scanUser = new Scanner(System.in);

        System.out.println("Please input title of the movie you want to return: ");
        String userMovieA = scanUser.nextLine();
        String userMovie = userMovieA.toLowerCase();
        int movieFound = 0;

        List<Movie> moviesInCheckOut = library.getListOfMoviesCheckOut();

        for (Movie movie : moviesInCheckOut) {
            String movieTitle = movie.getTitle();

            if (userMovie.matches(movieTitle.toLowerCase())) {
                movieFound++;
                library.returnMovie(movie);
                System.out.println("Thank you for returning the movie");
                break;
            }
        }
        if (movieFound == 0) {
            System.out.println("That is not a valid movie to return");
        }
        displayBibliotecaMenu();
        chooseOption();

    }

    //just for testing purposes
    public void mockChooseOption(String option, String userBookA, User user) {

        if (option.matches("[1-4]")) {
            int optionUser = Integer.parseInt(option);
            if (optionUser == 1) {
                library.displayBookList();
//                chooseOption();
            }
            else if (optionUser == 2) {
                mockUserCheckOutBook(userBookA, user);
            }
            else if (optionUser == 3) {
                mockUserReturnBook(userBookA);

            }
            else if (optionUser == 4) {
                this.exitProgram();
            }

        } else {
            String invalidOption = "Please select a valid option!";

            System.out.println(invalidOption);
        }

    }
    public void mockUserCheckOutBook(String userBookA, User user){
        int bookFound = 0;
        library.mockUserLogIn(user);
        String userBook = userBookA.toLowerCase();
        List<Book> booksAvailable = library.getListOfBooksAvailable();

        for (Book book : booksAvailable) {
            String bookTitle = book.getBookTitle();
            String bookAuthor = book.getBookAuthor();

            if (userBook.matches(bookTitle.toLowerCase()) || userBook.matches(bookAuthor)){
                bookFound ++;
                user.addBookInListUser(book);
                System.out.println("Thank you! Enjoy the book");
                library.checkOutBook(book);
                break;
            }
        }
        if (bookFound == 0) {
            System.out.println("Sorry, that book is not available");
        }
        System.out.println("List of Available Books: ");
        library.displayBookList();
        System.out.println("List of Book(s) checked out by user " +user.getUserFullName() +": ");
        user.displayBooksCheckOutUser();

    }
    public void mockUserReturnBook(String userBookA){
        int bookFound = 0;

        System.out.println("Please input title or author of the book you want to checkout: ");
        String userBook = userBookA.toLowerCase();


        List<Book> booksInCheckOut = library.getListOfBooksCheckOut();

        for (Book book : booksInCheckOut) {
            String bookTitle = book.getBookTitle();
            String bookAuthor = book.getBookAuthor();

            if (userBook.matches(bookTitle.toLowerCase()) || userBook.matches(bookAuthor)){
                bookFound ++;
                System.out.println("Thank you for returning the book");
                library.returnBook(book);
                break;


            }

        }
        if (bookFound == 0) {
            System.out.println("That is not a valid book to return");
        }

    }


}
