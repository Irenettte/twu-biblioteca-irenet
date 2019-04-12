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

    //user log in account
    public void userLogIn (User user0) {
        String userTxt = "User: ";
        String userPwd = "Password: ";
        String userNum = "000-0001";
        String userPass = "biblioteca0";
//        Scanner scanUser = new Scanner(System.in);

//        System.out.println(userTxt);
//        String userNum = scanUser.nextLine();

//        while (!userNumber.equals(userNum)){
//            System.out.println("Incorrect user number, please insert a valid one: ");
//            userNum = scanUser.nextLine();
//        }
//        System.out.println(userPwd);
//        String userPass = scanUser.nextLine();
//        while (!pwd.equals(userPass)){
//            System.out.println("Incorrect user number, please insert a valid one: ");
//            userPass = scanUser.nextLine();
//        }
        System.out.println("You successfully logged in! Welcome back " + userFullName);
        System.out.println();
        System.out.println("You checked out this books: ");
        for (Book book : listBooksCheckoutUser) { System.out.println(book.displayTitleAuthorYear());}


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
