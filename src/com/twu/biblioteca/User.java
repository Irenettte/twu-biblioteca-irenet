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

    public User(String userNumber, String pwd, String userFullName, String userEmail, String userPhoneNumber, List<Book> listBooksCheckoutUser) {
        this.userNumber = userNumber;
        this.pwd = pwd;
        this.userFullName = userFullName;
        this.userEmail = userEmail;
        this.userPhoneNumber = userPhoneNumber;
        this.listBooksCheckoutUser = listBooksCheckoutUser;
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

    public void displayUserInfo() {

        System.out.println("Welcome user " + userNumber+ "\n" + userFullName + "\n" + userEmail + "\n" + userPhoneNumber);
    }
    public void userNumberInList (String user){

//        if (! userNumberInList(user)) {
//            System.out.println("Incorrect user number, please enter a correct one.");
//            System.out.println(userTxt);
//            user = scanUser.nextLine();
//        }
//        return userNumber.equals(user);

    }

}
