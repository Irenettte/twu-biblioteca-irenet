package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {

    private String userNumber;
    private String pwd;
    private String userFullName;
    private String userEmail;
    private String userPhoneNumber;
    private List<Book> listBooksCheckoutUser;


    public User(String userNumber, String pwd, String userFullName, String userEmail, String userPhoneNumber) {
        this.userNumber = userNumber;
        this.pwd = pwd;
        this.userFullName = userFullName;
        this.userEmail = userEmail;
        this.userPhoneNumber = userPhoneNumber;
        this.listBooksCheckoutUser = new ArrayList<Book>();
    }

    //getters

    public String getUserNumber() {
        return userNumber;
    }

    public String getPwd() {
        return pwd;
    }

    public String getUserFullName() {
        return userFullName;
    }

    public List<Book> getListBooksCheckoutUser() {
        return listBooksCheckoutUser;
    }
    public void displayBooksCheckOutUser(){
        for (Book book : listBooksCheckoutUser) System.out.println(book.displayTitleAuthorYear());
    }

    // add Books in list of books
    public void addBookInListUser(Book book){
        listBooksCheckoutUser.add(book);
    }
    public void returnBookInListUser(Book book){
        listBooksCheckoutUser.remove(book);
    }

    public void displayUserInfo() {

        System.out.println("Welcome user " + userNumber+ "\n" + userFullName + "\n" + userEmail + "\n" + userPhoneNumber);
    }

}
