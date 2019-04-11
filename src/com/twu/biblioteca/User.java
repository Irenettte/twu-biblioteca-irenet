package com.twu.biblioteca;

import java.util.Scanner;

public class User {

    String userNumber;
    String pwd;
    String userFullName;
    String userEmail;
    String userPhoneNumber;

    public User(String userNumber, String pwd, String userFullName, String userEmail, String userPhoneNumber) {
        this.userNumber = userNumber;
        this.pwd = pwd;
        this.userFullName = userFullName;
        this.userEmail = userEmail;
        this.userPhoneNumber = userPhoneNumber;
    }

    //user log in account
    public void userLogIn () {
        String userTxt = "User: ";
        String userPwd = "Password: ";
        Scanner scanUser = new Scanner(System.in);

        System.out.println(userTxt);
        String user = scanUser.nextLine();
        userNumberInList(user);


        System.out.println(userPwd);
        String pwd = scanUser.nextLine();


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
