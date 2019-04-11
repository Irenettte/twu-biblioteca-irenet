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
        options.add("<4> Quit Program");

        for (String optionNum : options) { System.out.println(optionNum);}

    }
    public void chooseOption() {
        String chooseOption = "Type the option from the menu (e.g. 1 for Option 1): ";
        Scanner scanUser = new Scanner(System.in);

        System.out.println(chooseOption);

        String option = scanUser.nextLine();
        if (option.matches("[1-4]")) {
            int optionUser = Integer.parseInt(option);
            if (optionUser == 1) {
                library.displayBookList();
                chooseOption();
            }
            else if (optionUser == 2) {
                userCheckOutBook();
            }
            else if (optionUser == 3) {
                userReturnABook();

            }
            else if (optionUser == 4) {
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
                library.checkOutBook(book);
                break;


            }

        }
        if (bookFound == 0) {
            System.out.println("Sorry, that book is not available");

        }
        chooseOption();

    }

    public void userReturnABook(){
        Scanner scanUser = new Scanner(System.in);

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
                System.out.println("Thank you for returning the book");
                break;

            }
        }
        if (bookFound == 0) {
            System.out.println("That is not a valid book to return");

        }
        chooseOption();

    }
    //just for testing purposes
    public void mockChooseOption(String option) {

        if (option.matches("[1-4]")) {
            int optionUser = Integer.parseInt(option);
            if (optionUser == 1) {
                library.displayBookList();
                chooseOption();
            }
            else if (optionUser == 2) {
                mockUserCheckOutBook();
            }
            else if (optionUser == 3) {
                userReturnABook();

            }
            else if (optionUser == 4) {
                this.exitProgram();
            }

        } else {
            String invalidOption = "Please select a valid option!";

            System.out.println(invalidOption);
        }

    }
    public void mockUserCheckOutBook(){
        int bookFound = 0;

        System.out.println("Please input title or author of the book you want to checkout: ");

        String userBookA = "The Cat in the Hat";
        String userBook = userBookA.toLowerCase();


        List<Book> booksAvailable = library.getListOfBooksAvailable();

        for (Book book : booksAvailable) {
            String bookTitle = book.getBookTitle();
            String bookAuthor = book.getBookAuthor();

            if (userBook.matches(bookTitle.toLowerCase()) || userBook.matches(bookAuthor)){
                bookFound ++;
                System.out.println("Thank you! Enjoy the book");
                library.checkOutBook(book);
                break;


            }

        }
        if (bookFound == 0) {
            System.out.println("Sorry, that book is not available");
        }

    }
    public void mockUserReturnBook(){
        int bookFound = 0;

        System.out.println("Please input title or author of the book you want to checkout: ");

        String userBookA = "blabla";
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
